package com.practice;

public class pizza {
    private int num_Ingre;
    private String[] ingre;

    public pizza(int num_Ingre,String[] ingre) {
        this.num_Ingre = num_Ingre;
        this.ingre = ingre;
    }

    public String[] getIngre() {
        return ingre;
    }
    public int getNum_Ingre() {
        return num_Ingre;
    }
}
