package com.snakeandladder;

public class UC2 {

		public static void main(String[] args) {
			
			int Player_No = 1;
			int Position = 0;
			int MinDie=1; 
			int MaxDie=6;
			
			int die = (int) Math.floor(Math.random()*(MaxDie-MinDie+1)+MinDie);
			
			System.out.println("Welcome to Snake & Ladder");
			System.out.println(" No. of players: " + Player_No);
			System.out.println(" Initial Position: " + Position);
			System.out.println(" The value of the die: " + die);
			
		}
	}


