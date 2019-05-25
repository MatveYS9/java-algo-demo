/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.algodemo;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class AlgoDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*byte b1 = 127;
        byte b2 = -128;
        short sh1 = 10000;
        int i = 1000000000;
        long l = 10000000000L;
        
        float f1 = 100.99F;
        double d1 = 10000000.99F;
        
        boolean bool1 = true;
        bool1 = false;
        
        char ch = 'A';*/
        
        //System.out.println(ch);
        //System.out.println((short)ch);
        
        /*int n = 0;
        n = n + 1;
        n += 1;
        n++;*/
        //n =+ 1;
        
        //System.out.println(n);
        
        /*for (int j = 0; j < 10; j++) {
            //scope
            // System.out.println(j);
        }*/
        
        /*int limit = (short)ch + 26;
        while ((short)ch < limit) {            
            System.out.println(ch++);
        }*/
        
        /*int limit = (short)ch + 26;
        while ((short)ch < limit) {            
            System.out.println(++ch);
        }*/
        
        /*int limit = (short)ch;
        int currentChar = (short)ch + 26;
        while (currentChar > limit) {            
            System.out.println((char)--currentChar);
        }*/
        
        /*while (true) {            
            System.out.println("H");
        }*/
        
        /*System.out.println("Choose an action:");
        System.out.println("1. +");
        System.out.println("2. -");
        
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();*/
        
        //System.out.println("result = " + result);
        
        /*System.out.println("Input first number: ");
        int x = sc.nextInt();
        System.out.println("Input second number: ");
        int y = sc.nextInt();
        
        if (result == 1) {
            System.out.println("x + y = " + (x + y));
        } else if (result == 2) {
            System.out.println("x - y = " + (x - y));
        }*/
        
        //Step 1
        /*for (int i = 0; i < 10; i++) {
            //System.out.println("Row");
            for (int j = 0; j < 10; j++) {
                System.out.print("Winx ");
            }
            System.out.println();
        }*/
        
        //Step 2
        /*for (int i = 1; i < 11; i++) {
            //System.out.println("Row");
            for (int j = 1; j < 11; j++) {
                // System.out.print(i * j);
                System.out.printf("%5d", i * j);
            }
            System.out.println();
        }*/
        
        //Step 3
        //Цикл - печатает строки
        for (int i = 0; i < 11; i++) {
            //System.out.println("Row");
            //Цикл - печатает значения в каждой строке
            for (int j = 0; j < 11; j++) {
                // System.out.print(i * j);
                //Проверяем, что номер строки = 0
                if (i == 0) {
                    //Выводим номер столбца
                    System.out.printf("%5d", j);
                //иначе
                } else {
                    //Выводим перемножение номера столбца на номер строки
                    System.out.printf("%5d", i * j);
                }
                //Задание: добавить третью ветвь логики,
                //чтобы в первой колонке печатались номера строк
            }
            //После вывода каждой строки переходим на одну ниже
            System.out.println();
        }
    }
}
