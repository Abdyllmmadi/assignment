import java.util.Scanner;
public class q8{
    public static void main(String[]args){
        Scanner nn = new Scanner(System.in);
        System.out.print("Enter  number of minutes: ");
        int minutes = nn.nextInt();

        int years = (minutes / 525600);
        int days = (minutes % 525600) / 1440;
        System.out.println(minutes + "minutes is approximately " + years + "yearss and " + days + " days");
    }
}