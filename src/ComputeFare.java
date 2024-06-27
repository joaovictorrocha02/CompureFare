import java.util.Scanner;
public class ComputeFare {

    public static void main(String args[]) {
        System.out.print("Digite sua idade: \n");
        Scanner keyboard = new Scanner(System.in);
        int age = keyboard.nextInt();
        double fare;
        
        if (age <= 11) { 
            fare = 2;
        } else if (age > 11 && age < 65) { 
            fare = 5;
        } else {
            fare = 3;
        }
        System.out.println("Sua tarifa é $" + fare);
        
        //Se a idade for menor que 11, a tarifa será $2.00
        /*Se a idade for maior que 11 e menor que 65,
        a tarifa será de $5.00
        */ 
        //para as demais idades, a tarifa será de $3.00
   
}
}
