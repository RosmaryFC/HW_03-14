package nyc.c4q.RosmaryFC;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);

        String intro = "You are lost in a dungeon, due to falling in a hole in the forest, you must find a  way out." +
                " But beware, there are monsters lurking in the dark.";
        String firstPerson = "Where am I?... I must have fallen through that hole up there. Let me find a way out of here";
        String left = "left";
        String right = "right";
        String straight = "straight";

        System.out.println(intro + "\n");
        System.out.println(firstPerson);
        System.out.println("Left or Right?");
        String answer1 = keyboard.next();

        if (answer1.equalsIgnoreCase(left)) {
            System.out.println("You follow  the passage walls to the end where it only leads you right....to a DEAD END.");
            System.out.println("GAME OVER");
            return;
        }else if (answer1.equalsIgnoreCase(right)) {
            System.out.println("You follow the passage walls to the end where it only leads you left...\n ...\n...\n " +
                    "You hear faint growling in the distance...but continue moving forward until you must make another left.\n \n" +
                    "The passage splits in two, one was goes straight, the other goes left. ");
        }//need to add not a valid answer, or keep asking the same question until user puts in right answer

        System.out.println("Straight or Left?");
        String answer2 = keyboard.next();
        if (answer2.equalsIgnoreCase(straight)) {
            System.out.println("You follow the passage straight. The distant growling grows nearer. The passage leads to a wall that takes you " +
                    "left. As you continue walking another passageway appears to your left. You're not sure whether to continue straight or go left.");
            System.out.println("Straight or Left?");
            String answer21 = keyboard.next();{
                if (answer21.equalsIgnoreCase(straight)){
                    System.out.println("You decide to continue walking straight. A dim light can be seen at the end of the passage way.\n" +
                            "You start running towards the light. As you get closer you realize it is an exit, You are free!!!");
                    return;
                } else if (answer21.equalsIgnoreCase(left)); {
                    System.out.println("you decide to go left. ");
                }
            }
        } else if (answer2.equalsIgnoreCase(left)) {
            System.out.println("You go to the passage leading left, as you continue walking the distant growling can no longer be heard." +
                    "you feel safe for now. The passage leads to two more passages. One to your left and one to your right.");
        }




    }
}