//******************************************************************************************
//MultiSphere.java		 	Author: Harrison Fox 
//
//Implements a main method to create and update multiple sphere objects that allow a user to 
//set and update a sphere's diameter & calculate the volume and surface area of the sphere.
//******************************************************************************************

import java.util.*;

public class MultiSphere
{
	public static void main (String[] args)
	{
		int done;
		Scanner scan = new Scanner (System.in);

		SphereCollection spheres = new SphereCollection ();
		
		System.out.println("Welcome to MultiSphere would you like to create a Sphere?");
		System.out.println("Please enter 1 for \"Yes\" and 0 for \"No\"");
		done = scan.nextInt();
		

		while(done > 0)
		{
			spheres.addSphere();

			System.out.println("Would you like to create another Sphere?");
			System.out.println("Please enter 1 for \"Yes\" and 0 for \"No\"");
			done = scan.nextInt();

		}

		System.out.println(spheres);

		System.out.println("Thank you for using MultiSphere!" + "\n");

	}
}
