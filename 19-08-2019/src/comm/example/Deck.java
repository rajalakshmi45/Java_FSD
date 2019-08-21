package comm.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Deck {
	private static List<Card> protoDeck= new ArrayList<Card>();
    
	static{
		
		
		for(Suit s : Suit.values()) {
			
			for(Rank r : Rank.values()) {
				protoDeck.add(new Card(s,r));
			}
		  
		}
		Collections.shuffle(protoDeck);
		
	}
	public static void main(String[] args) {
	   ListIterator<Card> iterator = protoDeck.listIterator();
	   Scanner scn=new Scanner(System.in);
	   System.out.println("Enter the number of hands");
	   int a = scn.nextInt();
	   System.out.println("Enter the cards per hand");
	   int b=scn.nextInt();
	   for(int i = 0; i < a; i++) {
		   System.out.println("Player "+(i+1));
		   for(int j = 0; j < b; j++) {
			   System.out.println(iterator.next());
		   }
	   }
	   
	   
	   
	   
		
	}
}
