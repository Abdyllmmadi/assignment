import java.util.Scanner;
class q7{
    public static void main(String[]args){
        int x,y, z,hcf,lcm;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstnumber = input.nextInt();
        System.out.print("Enter second number: ");
        int secondnumber = input.nextInt();
        x = firstnumber;
        y = secondnumber;
        while(y!=0){
            z = y;
            y = x% y;
            x = z;          
        }
        hcf =x;
        lcm =(firstnumber * secondnumber)/hcf;
        System.out.println("the hcf is:"+hcf);
        System.out.print("the lcm is:"+lcm);
        
    }
}