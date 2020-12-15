
/**
 * Adventure Game project.
 *
 * @author (Sienna)
 * @version (1.1)
 */

import java.util.Scanner;

public class Adventure_GameV2
{
    static void clear()
    {
        System.out.print('\u000C');
    }
    static void programEnd()
    {
        System.out.println("Thank you for playing!");
    }
    static void typeOptions()
    {
        System.out.println("(Type \"1\" or \"2\")");
    }
    static void dataDisplay()
    {
        System.out.println("When you are playing, would you like to display all previous game data?");
        System.out.println("Selecting \"false\" will make the screen appear cleaner. (Type \"true\" or \"false\")");
        System.out.print("Display all data?: ");
    }
    static void yourName()
    {
        System.out.println("Before we get started, please enter your name.");
        System.out.print("username: ");
    }
    static void friendName()
    {
        System.out.println("Please enter the name of a friend.");
        System.out.print("friend: ");
    }
    
    public static void main(String[] args)
    {
        Scanner user_input = new Scanner(System.in);
        String username;
        String friend;
        String replayAnswer;
        boolean replay = true;
        boolean clear = false;
        int option;
        int weapon;
        int shield;
        
        do 
        {
            System.out.print('\u000C');
            
            System.out.println("Hello! Welcome to Beast Hunting!");
            System.out.println(" ");
            yourName();
            username = user_input.next();
            System.out.println(" ");
            System.out.println("Please enter the name of a friend.");
            System.out.print("friend: ");
            friend = user_input.next();
            System.out.println(" ");
            System.out.println("Hello, " + username + "!");
            System.out.println(" ");
            dataDisplay();
            clear = user_input.nextBoolean();
            System.out.println(" ");
            System.out.println("Are you ready to begin? (type \"yes\" when you are ready.)");
            user_input.next();
        
            clear();
            
            System.out.println("Saturday, November 14. 11:37 AM.");
            System.out.println("You walk outside your home and find your mom trimming the hedges.");
            System.out.println(" ");
            System.out.println("Mom: Good morning, " + username + "! Your friend, " + friend + ", was looking for you, why don't you go find them?");
            System.out.println(" ");
            System.out.print("Look for " + friend + "? ");
            typeOptions();
            System.out.println("1. Look for " + friend + ".");
            System.out.println("2. Stay at home.");
            System.out.print("Option chosen: ");
            option = user_input.nextInt();
            if (!clear)
            {
                clear();
            }
            if (option == 1)
            {
                System.out.println(" ");
                System.out.println("You decide to look for " + friend + ".");
                System.out.println("You think to yourself, \"Trouble always seems to follow " + friend + ". Maybe I should bring a weapon with me.\"");
                System.out.println(" ");
                System.out.println("What weapon do you bring? (Type \"1,\" \"2,\" or \"3\")");
                System.out.println("1. Sword");
                System.out.println("2. Pistol");
                System.out.println("3. Nothing, you are too cool for weapons.");
                System.out.print("Option chosen: ");
                weapon = user_input.nextInt();
                System.out.println(" ");
                if (!clear)
                {
                    clear();
                }
                if (weapon == 1) //sword
                {
                    System.out.print("You bring a sword with you. ");
                }
                else if (weapon == 2) //pistol
                {
                    System.out.print("You bring a pistol with you. ");
                }
                else if (weapon == 3) //nothing
                {
                    System.out.print("You do not bring a weapon. ");
                }
                System.out.println("You are now prepared to find your friend.");
                System.out.println(" ");
                System.out.print("Where will you search for your friend? ");
                typeOptions();
                System.out.println("1. Look for " + friend + " at their house.");
                System.out.println("2. Look for " + friend + " at the treehouse.");
                System.out.print("Option chosen: ");
                option = user_input.nextInt();
                System.out.println(" ");
                if (!clear)
                {
                    clear();
                }
                if (option == 1) //look at house
                {
                    System.out.println("You decide to look for " + friend + " at their house. You walk");
                    System.out.println("five houses down the street to the familiar red brick building.");
                    System.out.println(" ");
                    System.out.println(friend + "'s mom: Hello " + username + ". Can I help you?");
                    System.out.println(" ");
                    System.out.println("You: I am looking for " + friend + ". Do you know where they are?");
                    System.out.println(" ");
                    System.out.println(friend + "'s mom: I believe they said they were heading to your old tree house.");
                    System.out.println(" ");
                    System.out.println("You: Great. Thank you.");
                    System.out.println(" ");
                    System.out.println("You return home and head in the direction of the tree house,");
                    System.out.println("following the path behind your house into the woods. The ");
                    System.out.println("familiar red strings attached to the trees lead you to ");
                    System.out.println("the hideout " + friend + " built for the two of you.");
                    System.out.println(" ");
                }
                else if (option == 2) //look at treehouse
                {
                    System.out.println("You decide to look for " + friend + " at the tree house. You ");
                    System.out.println("follow the path behind you house into the woods. The ");
                    System.out.println("familiar red strings attached to the trees lead you to ");
                    System.out.println("the hideout " + friend + " built for the two of you.");
                    System.out.println(" ");
                }
                System.out.println(friend + " sees you and starts to jump. In one hand they have a baseball bat, in the other a slip of paper.");
                System.out.println(friend + ": " + username + "! " + username + "! " + username + "! Look at this!");
                System.out.println(" ");
                System.out.println(friend + " shows you a wanted poster. It warns of a dangerous duo of half-ogres.");
                System.out.println(" ");
                System.out.println(friend + ": See? Plus this morning I noticed my sword is missing from the base of the ");
                System.out.println("tree house AND large footprints leading further into the woods. Maybe it's them! ");
                System.out.println("Let's find them, we can become the town heroes!");
                System.out.println(" ");
                System.out.print("Do you help " + friend + " search for the ogres? ");
                typeOptions();
                System.out.println("1. Help your friend search for ogres.");
                System.out.println("2. Leave the ogre hunting to your friend.");
                System.out.print("Option chosen: ");
                option = user_input.nextInt();
                System.out.println(" ");
                if (!clear)
                {
                    clear();
                }
                if (option == 1) //search for goblins
                {
                    System.out.println("You decide to help your friend search for the ogres.");
                    System.out.println("The footprints grow fainter and fainter the further you travel into the woods, until they completely disappear at a fork in the road.");
                    System.out.println("Attached to a post are two signs pointing to either path. To the left, Cedar Cave. To the right, Birch Pond.");
                    System.out.print("Towards what landmark do you head? ");
                    typeOptions();
                    System.out.println("1. Cedar Cave");
                    System.out.println("2. Birch Pond");
                    System.out.print("Option chosen: ");
                    option = user_input.nextInt();
                    System.out.println(" ");
                    shield = 2;
                    if (!clear)
                    {
                        clear();
                    }
                    if (option == 2) //birch pond
                    {
                        System.out.println("You and " + friend + " turn right towards Birch Pond.");
                        System.out.println("At the pond, you and " + friend + " search for the ogres.");
                        System.out.println(" ");
                        System.out.println("You find no ogres, but come across a shield.");
                        System.out.print("Will you take the shield? ");
                        typeOptions();
                        System.out.println("1. Take the shield.");
                        System.out.println("2. Leave the shield.");
                        System.out.println("Option chosen: ");
                        shield = user_input.nextInt();
                        System.out.println(" ");
                        if (!clear)
                        {
                            clear();
                        }
                        if (shield == 1) //take shield
                        {
                            System.out.print("You take the shield with you ");
                        }
                        else if (shield == 2) //leave shield
                        {
                            System.out.print("You leave the shield at Birch Pond ");
                        }
                        System.out.println("and walk back towards the post.");
                        
                    }
                    System.out.println("You and " + friend + " turn left towards Cedar Cave.");
                    System.out.println(" ");
                    System.out.println("Nothing seems out of the ordinary as you walk to the cave.");
                    System.out.println("Far into Cedar Cave is a barred entrance to an old abandoned mineshaft.");
                    System.out.println("As you approach you notice the bars are crooked, and the key to the entrance has been tossed behind the bars.");
                    System.out.println("You hear noises, but are unsure which direction they come from.");
                    System.out.println(" ");
                    System.out.print("Will you get past the bars and enter the abandoned mineshaft? ");
                    typeOptions();
                    System.out.println("1. yes");
                    System.out.println("2. no");
                    System.out.print("Option chosen: ");
                    option = user_input.nextInt();
                    System.out.println(" ");
                    if (!clear)
                    {
                        clear();
                    }
                    if (option == 1) //enter the mineshaft
                    {
                        System.out.println("You decide to enter the abandoned mineshaft.");
                        System.out.println("You look to your left towards " + friend + ". Their eyes show nervousness and excitement. You can tell they want to enter, too.");
                        System.out.println("You are barely able to squeeze through the crooked bars. You follow " + friend + " deeper into the mineshaft.");
                        System.out.println("A strange noise calls your attention.");
                    }
                    else if (option == 2) //turn around
                    {
                        System.out.println("You decide not to enter the abandoned mineshaft.");
                    }
                    System.out.println("You and " + friend + " turn around and see two large silhouettes behind you.");
                    System.out.println("Two ogres, one with what looks like " + friend + "'s sword in its hand.");
                    System.out.println(friend + ": So that's where the noise was coming, huh?");
                    System.out.println(" ");
                    System.out.print("Do you run past the goblin, or stay to fight? ");
                    typeOptions();
                    System.out.println("1. Run past the ogres.");
                    System.out.println("2. Stay to fight.");
                    System.out.println("Option chosen: ");
                    option = user_input.nextInt();
                    System.out.println(" ");
                    if (!clear)
                    {
                        clear();
                    }
                    if (option == 1) //run
                    {
                        System.out.println("You and " + friend + " try to run past the ogres.");
                        System.out.println("The armed beast swings " + friend + "'s sword at you.");
                        switch (shield) //shield yes
                        {
                            case 1:
                            System.out.println("You block the attack with the shield and continue running.");
                            System.out.println(friend + " also makes it out of the cave and runs with you towards town.");
                            System.out.println("When you arrive in town, you alert the authorities that the ogres are hiding in Cedar Cave.");
                            System.out.println("You are thanked for your service, then continue on with your day.");
                            break;
                        
                            case 2:
                            System.out.println("The sword strikes you and you fall to the ground.");
                            System.out.println("You lose consciousness and never get back up.");
                            System.out.println(" ");
                            System.out.println("Congrats, " + username + "! You were killed!");
                            break;
                        }
                    }
                    else if (option == 2) //fight
                    {
                        System.out.println("You and " + friend + " decide to fight the ogres.");
                        if (weapon == 1) //sword
                        {
                            System.out.println("With sword in hand, you charge towards the ogres.");
                            System.out.println(friend + " follows you, holding a baseball bat.");
                            System.out.print("You stand in front of the ogre. It swings at you");
                            switch (shield)
                            {
                                case 1:
                                System.out.println(", but you block it with your shield.");
                                System.out.println("You swing at the ogre's head with all your strength, and the ogre falls to the ground.");
                                System.out.println("You look to the side and see " + friend + " defeated their opponent as well.");
                                break;
                            
                                case 2:
                                System.out.println(" and strikes your left side");
                                System.out.println("You swing with your right arm but the pain in your side distracts you from your full power.");
                                System.out.println("You begin to lose a lot of blood and fall to the floor.");
                                System.out.println(friend + " knocked out the second ogre, and comes to save you from your opponent.");
                                System.out.println(friend + " swings their baseball bat and strikes the ogre from behind.");
                                break;
                            }
                            System.out.println(friend + " reclaims their sword and heads towards town to alert the location of the fallen two ogres.");
                            System.out.println(" ");
                            System.out.print("Congrats, " + username + "! You helped " + friend + " find and defeat the ogres");
                            switch (shield)
                            {
                                case 1:
                                System.out.println("!");
                                break;
                            
                                case 2:
                                System.out.println(", but ended up dying in the process.");
                                System.out.println("A small memorial is built for you to honor your efforts to defeat the ogres.");
                                break;
                            }
                        }
                        else if (weapon == 2) //pistol
                        {
                            System.out.println("You point your pistol towards one ogre and kill it.");
                            System.out.println("You swiftly turn towards the second, and pull the trigger.");
                            System.out.println("Both ogres lay motionless on the floor.");
                            System.out.println(friend + " reclaims their sword and the two of you make your way back to town to alert the location of the fallen ogres.");
                            System.out.println(" ");
                            System.out.println("Congrats, " + username + "! You are now known as the town hero for defeating the ogres!");
                        }
                        else if (weapon == 3) //nothing
                        {
                            System.out.println("You brought no weapon with you today, so you are practically useless during this fight.");
                            switch (shield)
                            {
                                case 1:
                                System.out.println("You pass the shield to " + friend + " and watch the fight from a safe distance.");
                                System.out.println(friend + " and the ogres take turns swinging at each other, " + friend + "blocking the ogre's hits each time.");
                                System.out.println("After a long struggle, " + friend + " strikes down the two beasts.");
                                System.out.println(friend + " reclaims their sword and the two of you make your way back to town to turn in the two ogres.");
                                System.out.println(" ");
                                System.out.println("Congrats, " + username + "! Your friend is now know as the town hero for defeating the ogres! Meanwhile, no one remembers your name.");
                                break;
                           
                                case 2:
                                System.out.println("You watch the fight from a safe distance.");
                                System.out.println("For an hour, " + friend + " dodges and weaves and steals attacks every now and then.");
                                System.out.println("You see your friend grow tired, and intervene. You grasp the bat and take it from " + friend + "'s hands.");
                                System.out.println("With all your strength, you swing down on the first ogre's head, then the second. Both fall to the floor.");
                                System.out.println(friend + " reclaims their sword and the two of you make your way back to town to alert the location of the fallen ogres.");
                                System.out.println(" ");
                                System.out.println("Congrats, " + username + "! The two of you are now known as \"" + username + " and " + friend + ", the town heroes!\"");
                                break;
                            }
                        }
                    }
                }
                else if (option == 2) //return home
                {
                    System.out.println("You return home and leave the ogre hunting to your friend.");
                    System.out.println("The following day, news spreads that " + friend + "was found dead near the entrance of Cedar Cave.");
                    System.out.println("You are very sad, but not surprised, as " + friend + " was never the smartest person in the room.");
                }
            }
            else if (option == 2)
            {
                System.out.println("You are not a very good friend, are you?");
                System.out.println("Play again for a different outcome!");
            }
            System.out.println(" ");
            System.out.println("Would you like to play again? (Type \"yes\" or \"no\")");
            replayAnswer = user_input.next();
            if (replayAnswer.equals("No") || replayAnswer.equals("no"))
            {
                replay = false;
            }
        } while (replay);
        System.out.println(" ");
        programEnd();
    }
}
