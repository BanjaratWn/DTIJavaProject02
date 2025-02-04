package workshop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaProject01 {
    public static void main(String[] args) {
        int menu;
        double widths, longs, bases, highs, radius, totalSq, totalTri, totalCir;

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("     Shape Area Program     ");
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("1.Square Area");
        System.out.println("2.Triangle Area");
        System.out.println("3.Circle Area");
        System.out.println("++++++++++++++++++++++++++++");
        System.out.print("Select menu : ");
        menu = sc.nextInt();

        switch (menu){
            case 1 :
                System.out.println("++++++++++++++++++++++++++++");
                System.out.print("Input widths : ");
                widths = sc.nextDouble();
                System.out.print("Input longs : ");
                longs = sc.nextDouble();
                totalSq = widths * longs;
                System.out.println("Area of Square is : " + df.format(totalSq));
                break;
            case 2 :
                System.out.println("++++++++++++++++++++++++++++");
                System.out.print("Input bases : ");
                bases = sc.nextDouble();
                System.out.print("Input highs : ");
                highs = sc.nextDouble();
                totalTri = bases * highs;
                System.out.println("Area of Triangle is : " + df.format(totalTri));
                break;
            case 3 :
                System.out.println("++++++++++++++++++++++++++++");
                System.out.print("Input radius : ");
                radius = sc.nextDouble();
                totalCir = Math.PI * Math.pow(radius,2);
                System.out.println("Area of Square is : " + df.format(totalCir));
                break;
            default:
                System.out.println("Thank you...");
        }
        System.out.println("++++++++++++++++++++++++++++");
    }
}
