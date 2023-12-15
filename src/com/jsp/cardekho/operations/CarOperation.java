package com.jsp.cardekho.operations;

import java.util.ArrayList;
import java.util.Scanner;

public class CarOperation
{
	ArrayList<Car> arrayList = new ArrayList<Car>();
	Car car = new Car();
	
	public void addCar(Scanner scanner)
	{
		System.out.println("Enter car id");
		car.setId(scanner.nextInt());
		
		System.out.println("Enter car name");
		car.setName(scanner.next());
		
		System.out.println("Enter car brand");
		car.setBrand(scanner.next());
		
		System.out.println("Enter car price");
		car.setPrice(scanner.nextDouble());
		
		arrayList.add(car);
		System.out.println("Car details added successfully....");
		System.out.println(arrayList+ "\n");
	}
	public void removeCar(Scanner scanner)
	{
		System.out.println("Enter the car id you want to delete.");
		boolean remove = false;
		while (!remove) {
			System.out.println("please enter id");
			int removeId = scanner.nextInt();
			boolean found = false;
			for (Car cars : arrayList) {
				if (removeId == cars.getId()) {
					arrayList.remove(cars);
					System.out.println("Your car details of id "+cars.getId()+ "has been removed.\n");
					found=true;
					remove=true;
					break;
					
				}
				
			}
			if (!found) {
				System.out.println("Please enter correct id\n");
				
			}
			
		}
	}
	public void updateCar(Scanner scanner)
	{
		System.out.println("Enter old car id to edit/update the car");
		boolean update = false;
		while (!update)
		{
			int oldCarid = scanner.nextInt();
			boolean found = false;
		  for (Car cars2 : arrayList) {
			if (cars2.getId()==oldCarid) {
				System.out.println("Please enter new car id");
				int updateId = scanner.nextInt();
				car.setId(updateId);
				System.out.println("please enter new car name");
				String updateName = scanner.next();
				car.setName(updateName);
				System.out.println("please enter new car brand");
				String updateBrand = scanner.next();
				car.setBrand(updateBrand);
				System.out.println("please enter new car price");
				double updatePrice = scanner.nextDouble();
				car.setPrice(updatePrice);
				arrayList.add(car);
				System.out.println("Your car details is updated sucessfully!...\n");
				found = true;
				update = true;
				break;	
				
				
			}
			
		}
		if (!update) {
			System.out.println("Please enter correct old id.");
			
		}
	}
}

 public void searchCar(Scanner scanner)
 {
	 System.out.println("Hey! come to see your car collection");
	 boolean found = false;
	 while (!found) {
		 System.out.println("Enter your car id you want to search");
		 boolean search = false;
		 int searchId = scanner.nextInt();
		 
		 for (Car cars3 : arrayList) {
			 if (cars3.getId() == searchId) {
				 System.out.println(cars3);
				 search = true;
				 found = true;
				 break;	
			}	
		}
		 if (!search) {
			System.out.println("Please enter correct car id");
		}
	}
 }
 }

