package com.company;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<Integer>();
        Random ranNum = new Random();
        int ranNumber;

        //Initialize elements of an array
        for (int i = 0; i < 10; i++) {
            ranNumber = ranNum.nextInt(50);//creates a random number between 1 and 100
            numList.add(ranNumber);
        }
        System.out.println(numList);
        System.out.print("Value to find: ");
        int choose = value.nextInt();
        int count =0;

        for (int i = 0; i < numList.size(); i++) {
            if(numList.get(i)==choose){
                count = count+1;
                  }

        }
        if (count>0){
            System.out.println(choose + " is in the ArrayList " + count +" times");

        }
    }


}




