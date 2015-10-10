//******************************************************************************************
//Sphere.java		 	Author: Harrison Fox 
//
//Implements a class to represent a sphere's diameter and calculate the volume and surface
//area of the sphere.
//******************************************************************************************
import java.util.*;
import java.text.DecimalFormat;

public class Sphere
{
	private double diameter;
	private double radius;
	private double surfaceArea;
	private double volume;
	final double pi = Math.PI;

	public Sphere(){
		diameter = 1;

	}

	public double setDiameter(double num1){
		diameter = num1;
		return diameter;
	}

	public double getDiameter(){
		return diameter;
	}

	public double calcRadius(){
		radius = (diameter/2);
		return radius;
	}

	public double getRadius(){
		return radius;
	}

	public double calcSurfaceArea(){
		radius = calcRadius();
		surfaceArea = (4 * pi * (Math.pow(radius, 2)));
		return surfaceArea;
	}

	public double getSurfaceArea(){
		return surfaceArea;
	}

	public double calcVolume(){
		radius = calcRadius();
		volume = ((4/3) * pi * (Math.pow(radius, 3)));
		return volume;
	}

	public double getVolume(){
		return volume;
	}

	public String toString(){
		DecimalFormat fmt = new DecimalFormat ("0.####");
		return "Diameter: " + fmt.format(diameter) + "  Radius: " + fmt.format(radius) + "  Surface Area: " + fmt.format(surfaceArea) + "  Volume: " + fmt.format(volume) + "\n";
	}
}


