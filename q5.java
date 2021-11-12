import java.util.Scanner;
class q5{
    public static void main(String[]args){
        Scanner kk = new Scanner(System.in);
        System.out.print("Enter number of eggs: ");
        int eggs = kk.nextInt();
        int gross = (eggs / 144);
        int dozen = (eggs % 144)/ 12;
        int extraeggs = (eggs % 12);
        System.out.print("Your number of eggs is gross: " + gross+ "dozen " + dozen + "extra eggs" + extraeggs);
        
        
        
        

    }
}