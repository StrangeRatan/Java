import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        
    
        double  input1;
        double  input2;
        Scanner scan=new Scanner(System.in);
        boolean i=true;

        while(i){
        System.out.println("..................Calculater.....................");
        System.out.println("1 : Addition(+) ");
        System.out.println("2 : Substraction(-) ");
        System.out.println("3 : Multiplication(*) " );
        System.out.println("4 : Divided(/)");
        System.out.println("5 : Exit");
        System.out.println("Chose the option 1 or 2 or 3 or 4 or 5");
        
        int chose=scan.nextInt();

        switch (chose) {
            case 1: 
                    System.out.println("Enter First Number");
                    input1=scan.nextInt();
                    System.out.println("Enter The Second Number");
                    input2=scan.nextInt();
                    System.out.println("Sum of two number  is :"+(input1+input2));    

                
                break;
            case 2: 
                    System.out.println("Enter First Number");
                    input1=scan.nextInt();
                    System.out.println("Enter The Second Number");
                    input2=scan.nextInt();
                    System.out.println("Subtraction of two number  is :"+(input1-input2));    

                
                break;  
            case 3: 
                    System.out.println("Enter First Number");
                    input1=scan.nextInt();
                    System.out.println("Enter The Second Number");
                    input2=scan.nextInt();
                    System.out.println("Multiplication of two number  is :"+(input1*input2));    

                
                break; 
            case 4: 
                    System.out.println("Enter First Number");
                    input1=scan.nextInt();
                    System.out.println("Enter The Second Number");
                    input2=scan.nextInt();
                    System.out.println("Division of two number  is :"+(input1/input2));    

                
                break;           
            case 5:  
                  i=false;   
                break;   
        
            default:
               System.out.println("Please Chose righ option ");
        }; 
    
        
     
        }
    }
    
}
