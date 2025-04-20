package com.example.converter;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount in USD:");
        double usd = scanner.nextDouble();
        double inr = Converter.convertToINR(usd);
        System.out.printf("Converted currency: %.2f USD = %.2f INR\n", usd, inr);
        scanner.close();
    }
}
