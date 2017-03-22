package rps.controller;

import rps.model.RPSModel;
import java.util.Scanner;

//Rock, paper, scissors. Rock over scissors, scissors over paper, paper over rock.

public class RPSController 
{
	public void start()
	{
		System.out.println("Welcome to my Rock - Paper - Scissors Application!");
		System.out.println("You are to choose one of the following: ");
		System.out.println("Rock, Paper, Scissors");
		System.out.println("The scoring is as follows: ");
		System.out.println("Rock smashes Scissors, Scissors cuts Paper, and Paper covers Rock.");
		System.out.println("If identical components are selected, the scoring will result in a tie.");
		System.out.println("When you are finished, the computer will display your record of wins/ties/losses.");
		System.out.println("Good luck and have fun!");
		System.out.println("Enter your choice below the line.");
		System.out.println("---------------------------------------------------------------------------------");
		
		String answer = keyboardInput.nextLine();
		
		if(answer.equalsIgnoreCase("Rock"))
		{
			
		}
	}
}
