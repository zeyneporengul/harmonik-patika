package org.example;

public class Main {
    public static void main(String[] args) {
        double[] list = {1, 2, 3, 4, 5, 6};
        double sum = 0.0;
        for(int i = 0; i < list.length; i++){
            sum += (1/list[i]);
        }
        System.out.println(sum);
    }
}