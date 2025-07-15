package com.ohgiraffers.practice.problem;

public class problem3 {
    public static void main(String[] args) {
        double kr = 80.5;
        double mat = 50.6;
        double en = 70.8;

        double sum = kr + mat + en;
        double average = sum / 3;

        int result1 = (int) sum;
        int result2 = (int) average;

        System.out.println(result1);
        System.out.println(result2);


    }
}
