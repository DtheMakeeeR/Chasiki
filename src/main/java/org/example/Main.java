package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int dot1 = -1, dot2 = -1, dot3 = -1 , dot4 = -1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите точки");
        if (scan.hasNextInt()){
            dot1 = scan.nextInt();
            if (!((dot1 >= 0) && (dot1 <= 12))) return;
        }
        else {
            System.out.println("Введите корректное число");
            return;
        }
        if (scan.hasNextInt()){
            dot2 = scan.nextInt();
            if (!((dot2 >= 0) && (dot2 <= 12))) return;
        }
        else {
            System.out.println("Введите корректное число");
            return;
        }if (scan.hasNextInt()){
            dot3 = scan.nextInt();
            if (!((dot3 >= 0) && (dot3 <= 12))) return;
        }
        else {
            System.out.println("Введите корректное число");
            return;
        }if (scan.hasNextInt()){
            dot4 = scan.nextInt();
            if (!((dot4 >= 0) && (dot4 <= 12))) return;
        }
        else {
            System.out.println("Введите корректное число");
            return;
        }
        int tmp;
        if (dot1 < dot2){
            tmp = dot2;
            dot2 = dot1;
            dot1 = tmp;
        }
        if (dot3 < dot4){
            tmp = dot4;
            dot4 = dot3;
            dot3 = tmp;
        }
        if (((dot4 <= dot1) && (dot4>=dot2)) ^ ((dot3 >= dot2) && (dot3 <= dot1))){
            System.out.println("Пересекаются");
        }
        else {
            System.out.println("Не пересекаются");
        }
    }
}