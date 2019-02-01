package homeWork1;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class QuadraticEquation {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		String name = JOptionPane.showInputDialog(
				"Enter your name.");
		
		System.out.println(name +"'s Quadratic Equation");
		 
		System.out.println();
		System.out.println("Enter values for a, b, and C: ");

		double a = kb.nextDouble();
		double b = kb.nextDouble();
		double c = kb.nextDouble();
		double equation = (Math.pow(b, 2)) - 4 * a* c;
		double answer1 = 0.0;
		double answer2 = 0.0;
		if(a == 0)
		{
			System.out.println("Not a quadratic equation ");
			System.exit(0);

		}
		else if(equation <  0)
		{
			System.out.println("Imaginary solution");
			System.exit(0);
		}
		else
		{
			answer1 = ((-b) + Math.sqrt(equation))/(2 * a);
			answer2 = ((-b) - Math.sqrt(equation))/(2 * a);
		}
		System.out.println("X1 = " +((int)(answer1*100))/100.0);
		System.out.println("X2 = " +((int)(answer2*100))/100.0);

		System.out.println("Thank you for using");

	}

}
