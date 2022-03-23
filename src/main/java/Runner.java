import characters.enemies.Enemy;
import characters.enemies.Ogre;
import characters.players.*;
import weapons.Club;

import java.util.Objects;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Player player;
        Enemy enemy;
        Ogre ogre;

        ogre = new Ogre("Jimmy", 15, 10, 10);

        Scanner nameScanner = new Scanner(System.in);
        Scanner playClassScanner = new Scanner(System.in);
        Scanner playSubClassScanner = new Scanner(System.in);
        Scanner yesNoScanner = new Scanner(System.in);

        System.out.println("Enter your name.");
        String userName = nameScanner.nextLine();
        System.out.println("Enter your player class: Fighter, Mage or Cleric");
        String playerClass = playSubClassScanner.nextLine();
        String fighterClass = "";
        if(Objects.equals(playerClass, "Fighter")){
            System.out.println("Enter fighter class: Barbarian, Knight, Dwarf");
           fighterClass = playSubClassScanner.nextLine();
        } else if (Objects.equals(playerClass, "Mage")){
            System.out.println("Enter mage class: Wizard or Warlock");
            fighterClass = playSubClassScanner.nextLine();
        } else {
            System.out.println("Please type Cleric to confirm");
            fighterClass = playSubClassScanner.nextLine();
        }


        Club club = new Club();
        if(fighterClass.equals("Knight")) {
            player = new Knight(userName, 100, 100, 100, club);
        }
        else if(fighterClass.equals("Barbarian")) {
            player = new Barbarian(userName, 100, 100, 100, club);
        }
        else {
            player = new Dwarf(userName, 100, 100, 100, club);
        }



            System.out.println("Greetings traveller. I will be your guide on your quest. Welcome to THE GRINDERRRR!!!");
            System.out.println("Welcome " + player.getName() + " the " + fighterClass + ". Your starting health is " + player.getHealthBar());
            System.out.println("You have encountered an ogre! His health is " + ogre.getHealthBar());
            while (ogre.getHealthBar() > 0) {
            System.out.println("Attack the ogre? Y/N");
            String yesNo = yesNoScanner.nextLine();
                if (yesNo.equals("Y")) {
                    club.attack(ogre);
                    System.out.println("Hit! The ogre's health is now " + ogre.getHealthBar());

                } else if (yesNo.equals("N")){
                    club.attack(player);
                    System.out.println("The ogre hit you! Your health is " + player.getHealthBar());
                }
                ogre.dies();
            }




        }

    }
