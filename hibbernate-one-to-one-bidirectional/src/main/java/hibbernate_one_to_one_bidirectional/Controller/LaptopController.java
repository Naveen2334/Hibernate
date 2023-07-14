package hibbernate_one_to_one_bidirectional.Controller;

import java.util.Scanner;

import hibbernate_one_to_one_bidirectional.Service.LaptopService;
import hibbernate_one_to_one_bidirectional.dto.Laptop;

public class LaptopController {
public static void main(String[] args) {
	Laptop laptop = new Laptop();
	LaptopService laptopservice = new LaptopService();
	Scanner sc= new Scanner(System.in);
	while(true)
	{
		System.out.println("enter the choice");
		int ch = sc.nextInt();
				
			switch(ch) {
			case 1:{
				System.out.println("enter the lapid");
				int id = sc.nextInt();
				laptop.setLaptopId(id);
				System.out.println("enter the laptopname");
				String name = sc.next();
				laptop.setLaptopName(name);
				System.out.println("enter the lapcolor");
				String color = sc.next();
				laptop.setLaptopColor(color);
				// why we are calling Laptop
				laptopservice.saveLaptop(laptop);
			}break;
				
			
		}
	}
	
}
}
