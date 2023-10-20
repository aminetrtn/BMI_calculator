import java.util.Scanner;

public class bmi_calculator {
    public static void main(String[] args) {
float weight,height,ibm;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello.Enter your weight in kilogram !");
        weight = sc.nextFloat();
        System.out.println("Hello.Enter your height in meter !");
        height = sc.nextFloat();
        ibm= (float) (weight/Math.pow(2,height));
        if (ibm<16) {System.out.println("starvation !"); }
        else if ((ibm>16)&&(ibm<16.99)) {System.out.println("emaciation !"); }
        else if ((ibm>18.50) && (ibm<22.99)) {System.out.println("normal low range !"); }
        else if (ibm>17 && ibm<18.49) {System.out.println("underweight !"); }
        else if ((ibm>23.50) && (ibm<24.99)) {System.out.println("normal, high range !"); }
        else if ((ibm>25.50) && (ibm<27.49)) {System.out.println(" overweight, low range !"); }
        else if ((ibm>27.50) && (ibm<29.99)) {System.out.println("overweight, high range !"); }
        else if ((ibm>30) && (ibm<34.9)) {System.out.println("1st degree obesity !"); }
        else if ((ibm>35) && (ibm<39.99)) {System.out.println("– 2nd degree obesity !"); }
        else if (ibm>=40)  {System.out.println("3rd degree obesity !"); }
    }
}
