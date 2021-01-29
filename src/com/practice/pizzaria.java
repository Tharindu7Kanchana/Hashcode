package com.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class pizzaria {
    public static void main(String[] args) {
        // pass the path to the file as a parameter
        File file =
                new File("input/a_example");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String[] arr = sc.nextLine().split(" ");
        int M = parseInt(arr[0]);
        int T2 = parseInt(arr[1]);
        int T3 = parseInt(arr[2]);
        int T4 = parseInt(arr[3]);
        List pizza = new ArrayList();
        while(sc.hasNextLine()){
            pizza.add(sc.nextLine());
        }
    }
}
