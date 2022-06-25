package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

            int[] array = {15, 3, 45, -34, 25, 89, 56, -65, 11, 59, 98, -54, 98, 12, 65};

            for (int i = 0; i < array.length - 1; i++) {
                System.out.println(Arrays.toString(array));
            }
            // average;

            int sumAllNum = 0;
            int amountAllNum = 0;
            boolean found = false;

            for (int reader: array) {
                if (reader < 0  ) {

                    found = true;

                } else if(reader > 0 && found) {

                    sumAllNum += reader;
                    amountAllNum++;

                }


            }


            System.out.println("sum = " + sumAllNum + " " + "amount = " + amountAllNum );



        }

    }

