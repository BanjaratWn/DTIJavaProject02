package com.sau.flowcontrol;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.io.IOException;
import java.util.Scanner;

public class AreaProject02 {
    public static void main(String[] args) throws IOException{
        int choice;
        double widths, longs, bases, highs, radius, totalSq, totalTri, totalCir;

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        DecimalFormat df = new DecimalFormat("0.000");

        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("     Shape Area Program     ");
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("1.Square Area");
        System.out.println("2.Triangle Area");
        System.out.println("3.Circle Area");
        System.out.println("++++++++++++++++++++++++++++");
        System.out.print("Select menu : ");
        choice = Integer.parseInt(reader.readLine());

        if (choice == 1) {
            System.out.println("++++++++++++++++++++++++++++");
            System.out.print("Input widths : ");
            widths = Double.parseDouble(reader.readLine());
            System.out.print("Input longs : ");
            longs = Double.parseDouble(reader.readLine());
            totalSq = widths * longs;
            System.out.println("Area of Square is : " + df.format(totalSq));
        }else if (choice == 2) {
            System.out.println("++++++++++++++++++++++++++++");
            System.out.print("Input bases : ");
            bases = Double.parseDouble(reader.readLine());
            System.out.print("Input highs : ");
            highs = Double.parseDouble(reader.readLine());
            totalTri = bases * highs;
            System.out.println("Area of Triangle is : " + df.format(totalTri));
        }else if (choice == 3) {
            System.out.println("++++++++++++++++++++++++++++");
            System.out.print("Input radius : ");
            radius = Double.parseDouble(reader.readLine());
            totalCir = Math.PI * Math.pow(radius, 2);
            System.out.println("Area of Circle is : " + df.format(totalCir));
        }else {
                System.out.println("Thank you...");
        }
        System.out.println("++++++++++++++++++++++++++++");
    }
}
