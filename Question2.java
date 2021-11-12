import java.util.Scanner;
class q2{
    public static void main(String[]args){
        System.out.println("Word Game");
        System.out.println("Enter your name: ");
        Scanner put = new Scanner(System.in);
        String name = put.next();
        System.out.println("How old are you?");
        int age = put.nextInt();
        System.out.println("What city were you born?: ");
        put.nextLine();
        String city = put.nextLine();
        System.out.println("Which collage did you finish?");
        String collage = put.nextLine();
        System.out.println("What is your proffession?");
        String proffession = put.nextLine();
        System.out.println("What is your favorite animal?");
        String animal= put.nextLine();
        System.out.println("What is your petname name?");
        String petname= put.nextLine();
        System.out.println(" There once was a person named "  +name+ "who lived in city " +city+ "at the age of " +age+ " went to collage at "+collage+ "." +name+ " graduated and work as " +proffession+ " then " +name+ "adopted an " +animal+ " named " +petname+  " they both lived ever after! " );
    







    }
}