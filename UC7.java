package com.snakeandladder;

import java.util.Random;

public class UC7 {

	public static final int No_Play = 1;
	public static final int Snake = 2;
	public static final int Ladder = 3;

	public static void main(String[] args) {
		
		int Player_No = 2;
		int position1 = 0;
		int position2 = 0; 
		int MinDie=1; 
		int MaxDie=6;
		int Count =0;
		Random rand = new Random();
		
		System.out.println("Welcome to Snake & Ladder");
		System.out.println(" No. of players: " + Player_No);
		System.out.println(" Initial Position of player 1: " + position1);
		System.out.println(" Initial Position of player 2: " + position2);
		
		while(position1!=100 || position2!=100) {
			
			
			int die1 = (int) Math.floor(Math.random()*(MaxDie-MinDie+1)+MinDie);
			System.out.println(" The value of the die for player 1: " + die1);
			Count ++;
			
			
					int option = rand.nextInt(3) + 1;
					
					switch(option) {
					case No_Play: {
						System.out.println("Player1: NO PLAY"); 
						break; }
					case Snake: {
						position1=position1-die1;
						if(position1<0) {
							position1 = 0;
						}
						System.out.println("SNAKE - Move back by "+die1+" steps.");
						System.out.println("Final position of player 1:" +position1);
						break; }
					case Ladder: {
							position1=position1+die1;
							if(position1<0) {
								position1 = 0;
							}
							System.out.println("LADDER! Move ahead by "+die1+" steps.");
							System.out.println("Final position of player 1 :" +position1 );
							break;
					}
					}
				if(position1>100) {
					position1 -= die1;
					System.out.println("The Dice number is greater than 100. Go back to previous position. Final position :" +position1);
				}
				if(position1==100) {
					System.out.println("Congratulations. Player 1 Wins!");
					break;
				}
				
				
				int die2 = (int) Math.floor(Math.random()*(MaxDie-MinDie+1)+MinDie);
				System.out.println(" The value of the die for player 2: " + die2);
				Count ++;
				
				
						option = rand.nextInt(3) + 1;
						
						switch(option) {
						case No_Play: {
							System.out.println("Player 2: NO PLAY"); 
							break; }
						case Snake: {
							position2=position2-die2;
							if(position2<0) {
								position2 = 0;
							}
							System.out.println("SNAKE - Move back by "+die2+" steps.");
							System.out.println("Final position of player 2:" +position2);
							break; }
						case Ladder: {
								position2=position2+die2;
								if(position2<0) {
									position2 = 0;
								}
								System.out.println("LADDER! Move ahead by "+die2+" steps.");
								System.out.println("Final position of player 2 :" +position2 );
								break;
						}
						}
					if(position2>100) {
						position2 -= die2;
						System.out.println("The Dice number is greater than 100. Go back to previous position. Final position :" +position2);
					}
					
					if(position2==100) {
						System.out.println("Congratulations. Player 2 Wins!");
						break;
					}
				
			}
		System.out.println("The dice was rolled "+Count+" times.");
	}
}
	


