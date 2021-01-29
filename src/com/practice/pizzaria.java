package com.practice;

import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;

class sortByNoIngre implements Comparator<pizza>{

    @Override
    public int compare(pizza o1, pizza o2) {
        return o1.getNum_Ingre() - o2.getNum_Ingre();
    }
}

class writeOutput {
    public writeOutput(String str) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("output/a_example"));
            writer.write(str);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class searchInPizzaList{
    public int search(List<pizza> pizza, String[] str) {
        ListIterator<pizza> li = pizza.listIterator();
        while(li.hasNext()){
            if(Arrays.equals(li.next().getIngre(),str)){
                return li.nextIndex();
            }
        }
        return 0;
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
        int no_Teams = T3 + T2 + T4;

        List<pizza> pizza = new ArrayList<pizza>();

        while(sc.hasNextLine()){
            String[] pi = sc.nextLine().split(" ");
            pizza.add(new pizza(parseInt(pi[0]), Arrays.copyOfRange(pi,1,parseInt(pi[0])+1)));
        }

        String str  = "3";
        str += "\n";

        ArrayList<String[]> p = pizzaFor2PeopleTeam(pizza);
        str += "2 ";
        for (String[] ar: p) {
            str += new searchInPizzaList().search(pizza,ar);
            str += " ";
        }
        new writeOutput(str);
    }

    public static ArrayList<String[]> pizzaFor2PeopleTeam(List<pizza> pizza){

        Collections.sort(pizza,new sortByNoIngre());
        ListIterator<pizza> li = pizza.listIterator();

        ArrayList<String[]> p = new ArrayList<String[]>();
        ArrayList<String> ingre = new ArrayList<String>();

        do{
            String[] ingreList = li.next().getIngre();
            ingre.addAll(Arrays.asList(ingreList));
            p.add(ingreList);
        }
        while(li.hasNext() && p.size() < 2);

        return p;
    }

    public static ArrayList<String[]> pizzaFor3PeopleTeam(List<pizza> pizza){

        Collections.sort(pizza,new sortByNoIngre());
        ListIterator<pizza> li = pizza.listIterator();

        ArrayList<String[]> p = new ArrayList<String[]>();
        ArrayList<String> ingre = new ArrayList<String>();

        do{
            String[] ingreList = li.next().getIngre();
            ingre.addAll(Arrays.asList(ingreList));
            p.add(ingreList);
        }
        while(li.hasNext() && p.size() < 2);

        return p;
    }

    public static ArrayList<String[]> pizzaFor4PeopleTeam(List<pizza> pizza){

        Collections.sort(pizza,new sortByNoIngre());
        ListIterator<pizza> li = pizza.listIterator();

        ArrayList<String[]> p = new ArrayList<String[]>();
        ArrayList<String> ingre = new ArrayList<String>();

        do{
            String[] ingreList = li.next().getIngre();
            ingre.addAll(Arrays.asList(ingreList));
            p.add(ingreList);
        }
        while(li.hasNext() && p.size() < 2);

        return p;
    }
}
