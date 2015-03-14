package nyc.c4q.RosmaryFC;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);

        String left = "left";
        String right = "right";
        String straight = "straight";

        System.out.println("You are lost in a dungeon, due to falling in a hole in the forest, you must find a  way out." +
                " But beware, there are monsters lurking in the dark.\n");
        System.out.println("Where am I?... I must have fallen through that hole up there. Let me find a way out of here");

        System.out.println("Left or Right?");
        String answer1 = keyboard.next();
// bug here where it skips over whole while loop when i type the right answer the first time. only happens when I add other while loops in code
        while (! answer1.equalsIgnoreCase(left) && ! answer1.equalsIgnoreCase(right)) {
            System.out.println("Left or Right?");
            answer1 = keyboard.next();
        }
            if (answer1.equalsIgnoreCase(left)) {//go left
                System.out.println("You follow  the passage walls to the end where it only leads you right....to a DEAD END.");
                System.out.println("GAME OVER");
                return;
            } else if (answer1.equalsIgnoreCase(right)) {// go right
                System.out.println("You follow the passage walls to the end where it only leads you left... ... ...\n " +
                        "You hear faint growling in the distance...but continue moving forward until you must make another left.\n \n" +
                        "The passage splits in two, one was goes straight, the other goes left. ");
            }


        System.out.println("Straight or Left?");
        String answer2 = keyboard.next();

        while (! answer2.equalsIgnoreCase(straight) && ! answer2.equalsIgnoreCase(left)) {
            System.out.println("Straight or Left?");
            answer2 = keyboard.next();
        }
            if (answer2.equalsIgnoreCase(straight)) {//go straight
                System.out.println("You follow the passage straight. The distant growling grows nearer. The passage leads to a wall that takes you " +
                        "left. As you continue walking another passageway appears to your left. You're not sure whether to continue straight or go left.");

                System.out.println("Straight or Left?");
                String answer21 = keyboard.next();
                {
                  while (! answer21.equalsIgnoreCase(straight) && ! answer21.equalsIgnoreCase(left)) {
                      System.out.println("Straight or Left?");
                      answer21 = keyboard.next();
                  }
                        if (answer21.equalsIgnoreCase(straight)) {// go straight
                            System.out.println("You decide to continue walking straight. A dim light can be seen at the end of the passage way.\n" +
                                    "You start running towards the light. As you get closer you realize it is an exit, You are free!!!");
                            return;
                        } else if (answer21.equalsIgnoreCase(left)) {// go left
                            System.out.println("you decide to go left. the growling becomes louder, but now you realize that" +
                                    " it is coming from behind you! You start walking faster reaching a corner.\n You turn left quickly reaching another" +
                                    "corner. \n You have no where to go, and the growls are behind you!.... ");
                            System.out.println("GAME OVER");
                            return;
                        }
                }
            } else if (answer2.equalsIgnoreCase(left)) {//go left
                System.out.println("You go to the passage leading left, as you continue walking \n the distant growling can no longer be heard." +
                        "you feel safe for now. \n The passage leads to two more passages. One to your left and one to your right.");
                System.out.println("Left or Right?");
                String answer22 = keyboard.next();
                {
                    while (! answer22.equalsIgnoreCase(straight) && ! answer22.equalsIgnoreCase(left)) {
                        System.out.println("Straight or Left?");
                        answer22 = keyboard.next();
                    }
                    if (answer22.equalsIgnoreCase(left)) {//go left
                        System.out.println("You decide to go left. you walk until you reach a corner which leads you right. You follow it until you \n" +
                                "reach a another corner. You continue on when suddenly you fall into a snake pit!\n The pit is so deep that you can't reach the top.." +
                                "You then realize. You are doomed.");
                        System.out.println("GAME OVER");
                        return;
                    } else if (answer22.equalsIgnoreCase(right)) {//go right
                        System.out.println("You decide to go right. You walk until you reach a corner which leads you left. You don't walk much" +
                                "until you reach a wall in front of you. This wasn't the exit.");
                        System.out.println("GAME OVER");
                        return;
                    }
                }
            }
    }
}
