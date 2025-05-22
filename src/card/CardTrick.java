/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Random rand = new Random();
        Card[] magicHand = new Card[7];
     
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
             c.setValue(rand.nextInt(13) + 1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;
            System.out.println(c.getSuit() +" "+ c.getValue());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        
//         Ask the user for a card
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter a card value (1-13): ");
         int userValue = scanner.nextInt();
         scanner.nextLine(); 
         System.out.print("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=clubs,3=spades): ");
         String userSuit = scanner.nextLine();
         Card userCard = new Card();
         userCard.setSuit(userSuit);
         userCard.setValue(userValue);
        
        // and search magicHand here
        
         boolean found = false;
           for (Card c : magicHand) {
            if (c.getValue() == userCard.getValue() && c.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                found = true;
                break;
            }
        }
        //Then report the result here
         if(found){
            System.out.println("Congratulations, Your Card was found in the magic hand.");
        }else{
            System.out.println("Sorry, your card is not in the magic hand.");
        }
        // add one luckcard hard code 2,clubs
        Card luckyCard = new Card();
      luckyCard.setValue(2);
      luckyCard.setSuit("Clubs");
    }
    
}
