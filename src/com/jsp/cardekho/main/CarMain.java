package com.jsp.cardekho.main;

import java.util.Scanner;

import com.jsp.cardekho.operations.CarOperation;

public class CarMain
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		CarOperation carOperation = new CarOperation();
		System.out.println("\n==============Welcome to Car Collection==============\n");
		
		boolean condition = true;
		while (condition) {
			System.out.println("\nPlease choose your options...");
			System.out.println("\nEnter 1 to Add Car Details!");
			System.out.println("\nEnter 2 to Remove Car Details!");
			System.out.println("\nEnter 3 to Update Car Details!");
			System.out.println("\nEnter 4 to Search Car Details!");
			System.out.println("Enter 5 for Exit\n");
			
			int choice = scanner.nextInt();
			
			switch (choice)
			{
			case 1:
			{
				carOperation.addCar(scanner);
				break;
			}
			case 2:
			{
				carOperation.removeCar(scanner);
				break;
			}
			case 3:
			{
				carOperation.updateCar(scanner);
				break;
			}
			case 4:
			{
				carOperation.searchCar(scanner);
				break;
			}
			case 5:
			{
				condition = false;
				System.out.println("Thank you for visiting...");
				break;
			}
			default:
				System.out.println("Enter correct Options!");
				
			}
		}
		
	}

}
