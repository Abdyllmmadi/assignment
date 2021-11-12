import java.util.Scanner;
class q4{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number of Gallons");
    int gallons = input.nextInt();
     System.out.print("Enter number of miles per Gallons ");
    int miles = input.nextInt();
     System.out.print("please enter price");
    int price = input.nextInt();
    int distance = (gallons * miles);
    int cost = (250/gallons);
    System.out.println("The car travel with the gas in miles:" + distance);
    System.out.println("The cost of travelling car is:" + cost);
    }
    
    
}