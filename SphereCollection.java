//******************************************************************************************
//SphereCollection.java		 	Author: Harrison Fox 
//
//Implements a class to represent a collection of spheres. Please see Sphere class  
//description for additional information.
//******************************************************************************************

import java.util.*;
// import java.text.DecimalFormat;

public class SphereCollection
{
	private Sphere[] collection;
	private int count;

	//******************************************************************************************
	//Constructor, creates an initially empty collection of spheres.
	//******************************************************************************************
	public SphereCollection (){
		collection = new Sphere[5];
		count = 0;
	}

	//******************************************************************************************
	//Adds a sphere to the collection and increases the size if necessary.
	//******************************************************************************************
	public void addSphere (){
		double diameter;
		Scanner scan = new Scanner (System.in);

		if (count == collection.length)
			increaseSize();

			Sphere a = new Sphere();
			System.out.println("Please enter the positive integer value for the diameter of your sphere.");
			diameter = scan.nextDouble();
			a.setDiameter(diameter);
			a.calcVolume();
			a.calcSurfaceArea();
			System.out.println("Your sphere: " + a);

			collection[count] = a;
			count++;		
	}

	//******************************************************************************************
	//Returns a report describing the collection of shperes.
	//******************************************************************************************
	public String toString(){

		String report = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
		report += "Number of Spheres created: " + count + "\n\n";
		report += "Here is your collection of Spheres:\n\n";

		for (int sphereNum = 0; sphereNum < count; sphereNum++){
			report += "Sphere " + (sphereNum + 1) + ": ";
			report += collection[sphereNum] + "\n";
		}

		return report;
		
	}

	//******************************************************************************************
	//Increase the size of the array, copy the collection to a larger temporary array and then 
	//assigns that array to the existing array creating a larger total array.
	//******************************************************************************************
	private void increaseSize ()
	{
		Sphere[] temp = new Sphere[collection.length * 2];

		for (int sphereIndex = 0; sphereIndex < collection.length; sphereIndex++){
			temp[sphereIndex] = collection[sphereIndex];
		}

		collection = temp;
			
	}

}
