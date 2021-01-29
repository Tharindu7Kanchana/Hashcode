package com.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static java.lang.Integer.parseInt;

class sortByNoIngre implements Comparator<pizza>{

    @Override
    public int compare(pizza o1, pizza o2) {
        return o1.getNum_Ingre() - o2.getNum_Ingre();
    }
}

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

        List<pizza> pizza = new ArrayList();

        while(sc.hasNextLine()){
            String[] pi = sc.nextLine().split(" ");
            pizza.add(new pizza(parseInt(pi[0]), Arrays.copyOfRange(pi,1,parseInt(pi[0])+1)));
        }
        Collections.sort(pizza,new sortByNoIngre());

    }
}

