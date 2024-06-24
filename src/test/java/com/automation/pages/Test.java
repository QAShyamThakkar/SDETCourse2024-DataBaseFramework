package com.automation.pages;

public class Test {

    public static void main(String[] args) {

        String q = "8453285201 (TRN) - Transfer from Account (486130967)\t";

        System.out.println(q.substring(0,9));

        System.out.println(q.split("-")[0].replace(" (TRN) ",""));


    }
}
