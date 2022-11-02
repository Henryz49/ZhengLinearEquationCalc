import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
public class LinearEquationRunner {
public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    //Inputs and variables
    System.out.println("Welcome! \n Enter Coordinate 1: ");
    String coord1 = input.nextLine();
    System.out.println("Enter Coordinate 2: ");
    String coord2 = input.nextLine();
    int comma1 = coord1.indexOf(",");
    int comma2 = coord2.indexOf(",");
    int x1 = Integer.parseInt(coord1.substring(1, comma1));
    int x2 = Integer.parseInt(coord2.substring(1, comma2));
    int y1 = Integer.parseInt(coord1.substring(comma1 + 2, coord1.length() - 1));
    int y2 = Integer.parseInt(coord2.substring(comma2 + 2, coord2.length() - 1));
    if (x1 == x2){
        System.out.println("The line is vertical, therefore x = " + x1);
        return;
    }
    //method running
    LinearEquation equation = new LinearEquation(x1, x2, y1, y2);
    System.out.println(equation.lineInfo());



















}
}

