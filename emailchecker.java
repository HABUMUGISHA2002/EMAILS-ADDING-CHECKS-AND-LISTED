import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class emailchecker {
    public static void main (String[]args){
        Set<String>email=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("\nunique emails checkers");
            System.out.println("1.add email here");
            System.out.println("2.check if emails is unique");
            System.out.println("3.show me list of all emails");
            System.out.println("4.exiting program");
            System.out.println("enter your choice");
            choice= sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                System.out.println("enter email for adding");
                String emailforadding=sc.nextLine();
                if(email.add(emailforadding)){
                    System.out.println(emailforadding +"adding email was successfully");
                }
                else{
                    System.out.println(emailforadding +"email was exist");
                }
                    
                    break;
                case 2:
                System.out.println("enter email for checking");
                String emailforchecking=sc.nextLine();
                if(email.contains(emailforchecking)){
                    System.out.println(emailforchecking +"email is exists");
                
                }
                else{
                    System.out.println(emailforchecking +"not found");
                }
                break;
                case 3:
                System.out.println("all emails are: "+ email);
                break;
                case 0:
                System.out.println("exiting program");
                break;

                            default:
                            System.out.println("invalid choice");
                    break;
            }
        }while (choice!=0);
        sc.close();
            
        

    }
    
}
