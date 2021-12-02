package com.company;

import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {

        // Variable declarations
        int healthbar = 10;
        int milesToNimue = 30;
        String weapon = "";
        int gold = 10;
        Scanner scnr = new Scanner(System.in);

        // Context Dump
        System.out.println("Steamcrest is a magical kingdom that existed long before today.");
        System.out.println("Since the arrival of the terrible witch known as Nimue and her army of Cyclops and Goblins, the world has been trapped in everlasting calamities.");
        System.out.println("The citizens of Steamcrest seek refuge in various villages, however, they are frequently raided by Nimue's soldiers. She is at war with the humans to seize their land.");
        System.out.println("You are an elf from Steamcrest. You'll do everything you can to stay alive and defend your loved ones. It is not an easy road to your destiny.\n");

        // Fight or Run Quest #1 (Neela R)
        String questQuestion1 = "";
        do {
            System.out.println("Will you fight Nimue and her army, or will you run? ('f' for fight or 'r' for run)");
            questQuestion1 = scnr.nextLine();
        } while ((!questQuestion1.equals("f")) && (!questQuestion1.equals("r")));

        System.out.println();

        if (questQuestion1.equals("r")) { // if the user chooses to run
            System.out.println("You chose to run for your life.");
            System.out.println("You run towards a random direction, towards a different life. You end up at the grounds of the local mage college. You become enticed with the magecraft and enroll.\nYears pass and you become a master sorcerer, outliving some of your fellow peers and all-knowing from your travels. You live a fulfilled life and die as such.\n");
            System.exit(0);
        }

        if (questQuestion1.equals("f")) { // if the user chooses to fight
            System.out.println("You chose to fight Nimue and her army.");
            System.out.println("Your mission is to fight and kill Nimue to save Steamcrest. You will encounter cyclops and goblins. It is not an easy task but people are depending on you.");
            System.out.println("In order to fight and kill Nimue you have to remember a few things. You have a healthbar with 10 lives. You need at least 7 to fufill your mission. ");
            System.out.println("You are given 10 coins by some of the villagers. You will most likely need them later in your journey. Nimue's castle is about 30 miles away. A sword is essential to kil Nimue. She is a very powerful witch. The most important thing to remember is to be brave. Good luck on your journey!\n");

            // Fight or Run Quest #2 (3 Goblins) (Neela R)
            System.out.println("You walk 2 miles and encounter 3 of Nimue’s goblins. You notice that they have weapons and armor. You need to choose whether to fight or run. If you fight, you will loose health bars. However, if you defeat them, you could steal their weapons and armor.\n");

            String questQuestion2 = "";
            do {
                System.out.println("Will you fight the goblins or will you avoid them? ('f' for fight or 'a' to avoid)");
                questQuestion2 = scnr.nextLine();
            } while ((!questQuestion2.equals("f")) && (!questQuestion2.equals("a")));

            if (questQuestion2.equals("f")) { // if the user chooses to fight
                System.out.println("\nYou lose 3 health. You defeat all 3 goblins and steal one of their swords.");
                weapon = "sword";
                healthbar = healthbar - 3;
            } else {
                System.out.println("\nYou go around them to avoid a brawl.");
            }

            milesToNimue = milesToNimue - 2;
            System.out.println("You have " + healthbar + " health and Nimue is " + milesToNimue + " miles away.\n");

            // Fight or Run Quest #3 (Cyclops) (Omar M)
            System.out.println("You walk 2 miles and encounter a cyclops in your path. It seems to have a mushroom that can increase your health. ");
            System.out.println("You need to choose whether to fight or run. If you fight, you will loose health bars. However, if you defeat them, you could steal their weapons and armor.\n");

            String questQuestion3 = "";
            do {
                System.out.println("Will you fight the cyclops or will you avoid them? ('f' for fight or 'a' to avoid)");
                questQuestion3 = scnr.nextLine();
            } while ((!questQuestion3.equals("f")) && (!questQuestion3.equals("a")));

            boolean userMagicMushroom = false;
            if (questQuestion3.equals("f")) {
                System.out.println("\nYou lose 3 health. You defeat the cyclops and and take his magical mushroom.");
                userMagicMushroom = true;
                healthbar = healthbar - 3;
            } else {
                System.out.println("\nYou sneak around the cyclops narrowly avoiding his gaze.");
            }
            milesToNimue = milesToNimue - 4;
            System.out.println("You have " + healthbar + " health and Nimue is " + milesToNimue + " miles away.\n");

            // Fight or Run Quest #4 (Magic Sword) (Omar M)
            System.out.println("You encounter a magical sword entangled in poisonous shrubery.");
            String qq4 = "";

            do {
                System.out.println("Do you attempt to take the sword or leave it. ('t' to take 'l' to leave.)");
                qq4 = scnr.nextLine();
            } while ((!qq4.equals("t")) && (!qq4.equals("l")));
            if (qq4.equals("t")) {
                System.out.println("You grab the sword and pull with all your might. The poisonous plants inflict you with damage but you have freed the magical blade.");
                healthbar = healthbar - 5;
                weapon = "ivy sword";
            } else {
                System.out.println("You leave the item that may have been the edge you would have needed in the final battle but oh well.\n");
            }

            milesToNimue = milesToNimue - 4;
            System.out.println("You have " + healthbar + " health and Nimue is " + milesToNimue + " miles away.\n");

            // Fight or Run Quest #5 (Magical Items) (Gunther)
            boolean apple = false;
            System.out.print("\"Oh, you surprised me, good traveler! I'm but a simple merchant making her way in this terrible world. would you perhaps care to browse a few of my wares? I don't have much of a selection, but what I do have is more than you think...\"");
            System.out.println("\n\n\"Hmm, let me see, I know what might interest you at the moment! I currently offer three items: a sword, a mushroom, and an apple. \n\nCome now, don't look like that, they are truly worth your while. This sword, for example, is forged from the hardest steel available, and your enemies will surely feel it! The mushroom as well, will feed you as a hearty feast would. However, the apple is somewhat strange. I gathered a basket of them a while back, but they only heal those ill or close to death. As such, you can see why it's harder to let go of.\"");
            String shopItem = "";
            System.out.println("\n\"So, what draws your fancy?\"\n(enter either 'better sword' (a better sword than most, but it doesn't beat magic swords in the woods) for 5 gold, 'mushroom'  for 3 gold, or 'apple' for 7 gold. You may also enter 'leave' should you not desire any of these items).");
            shopItem = scnr.nextLine();
            switch (shopItem) {
                case "better sword":
                    System.out.println("\nYou pick the sword, hand the kindly woman the money and try not to think about how she got this kind of sword in the middle of nowhere.");
                    weapon = shopItem;
                    gold -= 5;
                    break;
                case "mushroom":
                    System.out.println("\nYou pick the mushroom, hand the kindly woman the money and wonder if the mushroom will lose its magical properties if you make stew of it.");
                    gold -= 3;
                    healthbar += 2;
                    System.out.println("\nYou now have " + healthbar + " health.");
                    break;
                case "apple":
                    System.out.println("\nYou pick the apple, hand the kindly woman the money and ruminate if the old adage about apples keeping away evil witches is actually true.");
                    gold -= 7;
                    apple = true;
                    break;
                default:
                    System.out.println("\nYou decided this 'simple merchant' has a few too many special items to actually be simple. You wisely run away from her.");
            }


            // Fight or Run Quest #6 (Villager) (Abdel A)
            System.out.println("You come across a small village.");
            char quest6 = 'x';

            while (quest6 != 'y' && quest6 != 'n') {
                System.out.println("Will you enter the village and approach the locals? ('y' for yes, 'n' for no)");
                quest6 = scnr.next().charAt(0);
            }

            if (quest6 == 'y') {
                System.out.println("\nYou speak with one of the villagers about your mission to reach Nimue's castle.");
                System.out.println("Because Nimue's warriors have been attacking this village, the villager offers you some food to help you with your mission.");
                System.out.println("You graciously accept their offering, knowing it may be your last meal for a while.");
                healthbar += 2;
            }
            if (quest6 == 'n') {
                System.out.println("\nYou continue your journey and go around the village");

            }
            milesToNimue = milesToNimue - 3;
            System.out.println("You have " + healthbar + " health and Nimue is " + milesToNimue + " miles away.\n");

            // Fight or Run Quest #7 (Health Berries) (Andrew Chapa)
            System.out.println("You come across bushes of purple berries.");
            System.out.println("You figure that a few berries could give you some health back, but if they're poisonous, they'll harm you." + "\nNote that your current health is: " + healthbar + "\n");
            Random randGen = new Random(); // New random number generator
            int randomResult = randGen.nextInt(2); // store random number between 0 and 1
            char qq7 = 'x';

            while (qq7 != 'y' && qq7 != 'n') {
                System.out.println("Will you eat the berries? ('y' for yes, 'n' for no)");
                qq7 = scnr.next().charAt(0); // store user's answer as qq7
            }

            if (qq7 == 'y') { // if yes, user randomly receives +2 health or -4 health.
                switch (randomResult) {
                    case 0:
                        healthbar += 2;
                        System.out.println("\nThe delicious berries gave you +2 health.");
                        break;
                    case 1:
                        healthbar -= 4;
                        System.out.println("\nThe poisonous berries gave you a terrible stomachache. You lost 4 health.");
                }
            }

            System.out.println("You now have " + healthbar + " health.\n"); // if no, no action occurs. User continues on. // Quest #7 end.


            // Quest #8 (Humans Want to Help) (Varun)
            int bare_handed = 0;
            int laser_vision = 0;

            // No decision-making
            System.out.println(milesToNimue + " miles from Nimue, you encounter a group of humans. The leader approaches you. Before you engage in conflicts he inquires if you are planning to fight Nimue gazing at your gear. You respond with yes. You join forces with the humans and head towards Nimue.\n");

            // Fight or Run Quest #9 (Stored Away Mushroom or Apple) (Andrew Chapa)
            if (apple || userMagicMushroom) {
                System.out.println("You encounter an abandoned shelter where you choose to rest for a minute.\n");
                if (apple) { // user must have less than 4 health to use the apple.
                    System.out.println("You remember you have an apple stored.");
                    char qq11 = 'x';
                    while (qq11 != 'c' && qq11 != 'n') {
                        System.out.println("Would you like to consume it now to double your health?" +
                                "\n('c' to consume, 'n' to do nothing)" +
                                "\nNote that your current health is: " + healthbar);
                        qq11 = scnr.next().charAt(0);
                    }
                    if (qq11 == 'c') {
                        if (healthbar < 4) {
                            healthbar *= 2;
                            apple = false;
                            System.out.println("New health: " + healthbar);
                        } else {
                            System.out.println("you didnt consume the apple cause ur dumb");
                        }
                    }
                } //case ends where user had an apple
                if (userMagicMushroom) {
                    System.out.println("You remember you have a magical mushroom stored.");
                    char qq11 = 'x';
                    while (qq11 != 'c' && qq11 != 'n') {
                        System.out.println("Would you like to consume it now for +5 health?" + "\n('c' to consume, 'n' to do nothing)" + "\nNote that your current health is: " + healthbar);
                        qq11 = scnr.next().charAt(0);
                    }
                    if (qq11 == 'c') {
                        healthbar += 5;
                        userMagicMushroom = false;
                        System.out.println("New health: " + healthbar);
                    }
                } //case ends where user had a mushroom
            } //part 9 ends
            System.out.println(); // user continues on.
            // if time permits: ask the user if they want to back down.

            // Quest #10 (Goblin and Cyclops Fight Near the Gate) (Gunther)
            System.out.println("\nOf all the fates that could befall a soldier in this cursed fortress, this is probably one of the worst. In front of you stands a cyclops surrounded by a few goblins. In an instant, those sneaky little pests have surrounded you and leave no way to escape. Oh well, perhaps it's just time to show off how awesome you are?");
            System.out.println("\nJust fight like you always have, there's a witch-queen after this.(enter 'fight'");
            String finalMobFight = "";
            finalMobFight = scnr.nextLine();
            switch (weapon) {
                case "ivy sword": //ivy sword condition
                    if (healthbar <= 0) {
                        System.out.println("\nyou have died, and the Witch thus continued her reign of terror. No more heroes for her.");
                        break;
                    }
                    System.out.println("\nIt's a good thing you had the ivy sword, hero. The goblins sneak in some stabs while the cyclops puts you on the defensive, but they never really stood a chance. You stride to the location of the Witch, confident in your power to end her reign; it's time to be a big shot.");
                    healthbar -= 1;
                    System.out.println("You now have " + healthbar + " remaining health.");
                    break;

                case "better sword": //better sword condition
                    healthbar -= 3;
                    if (healthbar <= 0) {
                        System.out.println("\nYou have died, and the Witch thus continued her reign of terror. No more heroes for her.");
                        break;
                    }
                    System.out.println("\nGetting that sword was a big help for this moment, but you still can't help but take a beating from the cyclops; the goblins took your focus away from the real threat, and you're paying for it. Whatever the case may be, you move to end this oppression once and for all.");
                    System.out.println("You now have " + healthbar + " remaining health.");
                    break;

                case "sword": //normal sword condition
                    healthbar -= 5;
                    if (healthbar <= 0) {
                        System.out.println("\nYou have died, and the Witch thus continued her reign of terror. No more heroes for her.");
                        break;
                    }
                    System.out.println("\nIt's better than nothing, but this sword is like a toothpick to the cyclops, and it takes you a good while before you give it a death by thousand cuts. Unfortunately, you probably have a broken bone somewhere since it took you so long. You press onward to the Witch herself");
                    System.out.println("You now have " + healthbar + " remaining health.");
                    break;
                default: //Barehanded fight condition
                    healthbar -= 7;
                    if (healthbar <= 0) {
                        System.out.print("\nYou have died, and the Witch thus continued her reign of terror. No more heroes for her.");
                        break;
                    }
                    System.out.println("You're not entirely sure how you survived. Blow after blow struck, and now your foes lay at your feet, only looking slightly worse than you feel. You hobble your way to where the witch was last seen. If nothing else, you're looking to give her a scare to remember you by.");
                    System.out.println("You now have " + healthbar + " remaining.");
            }
            // Quest #11 (Fight With Nimue) (Varun)
            System.out.println("After making your way across the quarters, you finally find Nimue's throne room. WIth one heavy push you open the doors and come face to face with Nimue. Your eyes brim with determination reflecting upon your journey up to this. Everything led to this moment, do you win?\n");

            // Condition 1 to win Nimue fight --> Have ivy sword
            if (weapon.equals("ivy sword")) {
                System.out.println("With one mighty swing of your ivy sword, you best Nimue! Your squad rejoices at the ease of not having to do anything. As time passes, the kingdom grows from the ashes of Nimue's empire and rises to be one of the most renowned, prosperous, and influential kingdoms in the nation. As for you, you decide to excel in something other than sword fighting to face another potential threat. You enroll in the local mage school and live a fulfilling life, being one of the most renowned warriors in the kingdom.\n");
            }

            // Condition 2 to win Nimue fight --> Have better sword and 5 health
            else if (weapon.equals("better sword") && healthbar >= 5) {
                System.out.println("With one mighty swing of your [BETTER_SWORD], you best Nimue! Your squad rejoices at the ease of not having to do anything. As time passes, the kingdom grows from the ashes of Nimue's empire and rises to be one of the most renowned, prosperous, and influential kingdoms in the nation. As for you, you decide to excel in something other than sword fighting to face another potential threat. You enroll in the local mage school and live a fulfilling life, being one of the most renowned warriors in the kingdom.\n");
            }

            // Condition 3 to win Nimue fight --> Have normal sword and 7 health
            else if (weapon.equals("sword") && healthbar >= 7) {
                System.out.println("With one mighty swing of your [BETTER_SWORD], you best Nimue! Your squad rejoices at the ease of not having to do anything. As time passes, the kingdom grows from the ashes of Nimue's empire and rises to be one of the most renowned, prosperous, and influential kingdoms in the nation. As for you, you decide to excel in something other than sword fighting to face another potential threat. You enroll in the local mage school and live a fulfilling life, being one of the most renowned warriors in the kingdom.\n");
            }

            // Condition 4 to win Nimue fight --> Gunther cheat version
            else if (weapon.equals("") && laser_vision == 1 && healthbar == 99) {
                System.out.println("So you've decided to cheat in the Nimue fight huh? You know she goes down in one hit even with a basic sword, you must have gotten hit a lot and I don't blame you since you arrived here barehanded and your first task was to get a sword. Anyways, as you approach Nimue you fire off powerful beams of laser vision and slowly start to disintegrate Nimue. Before she could plead for her life you decide to force her to increase your bare-handed stats to max with her magic. She complies, terrified. As you smirk upon the sudden increase in power, you bash Nimue's skull in and save the kingdom. Your squad is horrified at your fighting style and you are banished from Steamcrest. Serves you right, you cheater! \n");
            }

            // Condition 5 --> If none of above conditions met, you lost to Nimue :(
            else {
                System.out.println("Unfortunately, you have not progressed much since you started this game, and thus your party loses overwhelmingly to Nimue. Nimue laughs and she executes your party.");
                System.out.println("Game over.\n");
            }

        }
    }



}