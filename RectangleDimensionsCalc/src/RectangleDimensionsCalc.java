/*
Mosammad Kabir
CUS 1115
2/11/2021
Professor DeBello

In eclipse, create a new java project called RectangleDemo1
Create a class with the same name
Create 2 double variables for length and width
Create the kb object to accept input from the keyboard
Ask the user to enter in the double values for length and width
Create formula for area
create formula for perimeter
Output the dimensions for length and width
Output the area
Output the perimeteer
 */

import java.util.Scanner;
public class RectangleDimensionsCalc {
    public static void main(String[] args)
    {
        double length, width;
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter a double value for the length:");
        length=kb.nextDouble();
        System.out.print("Enter a double value for the width:");
        width=kb.nextDouble();
        double area=length*width;
        double perimeter=2*length+2*width;

        System.out.println("Dimensions for the rectangle are :\nlength\t "+length+"\twidth\t"+width);

        System.out.println("Area is "+area);
        System.out.println("Perimeter is "+perimeter);
    }
}

/*
 * Enter a double value for the length:2
Enter a double value for the width:2
Dimensions for the rectangle are :
length	 2.0	width	2.0
Area is 4.0
Perimeter is 8.0
*/