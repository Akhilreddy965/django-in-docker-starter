package com.example;

public class InsuranceProcessor {
    public static void main(String[] args) {
        if (args.length > 0) {
            String policyNumber = args[0];
            System.out.println("Processing Insurance Policy: " + policyNumber);
        } else {
            System.out.println("No policy number provided!");
        }
    }
}
