import java.util.Scanner;
class q6{
    public static void main(String[]args){
    System.out.println("Performance level of an Employee");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter  performance level:");
    int performance = sc.nextInt();
     System.out.print("Enter base salary:");
    int z = sc.nextInt();
    double salary = (z* 0.03); 
    if (performance >= 90){
        
          System.out.println("salary is " + salary);
    }
    else{
          System.out.println("salary is "+ z);
 
    }
    
    }
}    

