import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//        System.out.println("You are in a land full of dragons. In front of you,");
//        System.out.println("you see two caves. In one cave, the dragon is friendly");
//        System.out.println("and will share his treasure with you. The other dragon");
//        System.out.println("is greedy and hungry and will eat you on sight.");
//        System.out.println("Which cave will you go into? (1 or 2)");
//        Scanner getInput = new Scanner(System.in);
//        String input1 = getInput.nextLine();
//        int input1ToInt = Integer.parseInt(input1);
//        if (input1ToInt == 1) {
//            System.out.println("You approach the cave...");
//            System.out.println("It is dark and spooky...");
//            System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
//            System.out.println("Gobbles you down in one bite!");
//        } else {
//            System.out.println("You share the treasure with the generous dragon!");
//        }
//    }
    public static void intro(){
        System.out.println(
                """
                You are in a world of dragons... Choose a cave to enter (1 or 2):
                """
        );
    }
    public static int getInput(){
        return new Scanner(System.in).nextInt();
    }
    public static void ending(int choice){
        if (choice == 1){
            System.out.println("The dragon eats you.");
        } else if (choice == 2){
            System.out.println("You got a bunch of treasure!");
        } else {
            return;
        }
    }
    public static void main(String[] args){
        intro();
        ending(getInput());
    }
}
