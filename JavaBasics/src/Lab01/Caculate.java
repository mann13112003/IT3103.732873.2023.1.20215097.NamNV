package Lab01;
import javax.swing.JOptionPane;
public class Caculate {
    public static void main(String[] args){

        String strNumber1,strNumber2;
        strNumber1 = JOptionPane.showInputDialog(null, "Please input the first number: ", 
        "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNumber2 = JOptionPane.showInputDialog(null, "Please input the second number: ", 
        "Input the second number", JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNumber1);
        double num2 = Double.parseDouble(strNumber2);

        double result;

        result = num1 + num2;
        System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, result);

        result = num1 - num2;
        System.out.printf( "%.2f - %.2f = %.2f\n", num1, num2, result);

        result = num1 * num2;
        System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, result);

        if(num2 == 0){
            System.out.println("error");
        }
        else{
            result = num1 / num2;
            System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, result);
        }
        System.exit(0);


    }
    
}
