import java.util.Scanner;


public class test {
    public static void main(String[] args) {

         // Y = ax + b
        // delta = b * b - 4ac;

        // delta < 0 : Phuong trinh vo nghiem
        // delta == 0: phuong trinh co nghiem kep x1 = x2 = -b/2a;
        // delta > 0: Phuong trinh co nghiem x1 = (- b - sqrt(delta) )/ 2;   x2 = (- b + sqrt(delta) )/ 2


        
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();
        
        double delta;
        delta =  (b * b - 4 * a * c);

        double X1 = (- b - Math.sqrt(delta) ) / 2;
        double X2 = (- b + Math.sqrt(delta) ) / 2;

        if( delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if( delta == 0) {
            System.out.println("Phuong trinh co nghiem kep: X1 = X2 = "+(-b/(2*a)));
        } else {
            System.out.println("Phuong trinh co 2 nghiem phan biet: x1 = " +X1+ "x2 = " + X2 );
        }
        

    }
}