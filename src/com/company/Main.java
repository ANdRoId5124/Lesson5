package com.company;

public class Main {

    public static void main(String[] args) {

        String chest[][] = new String[8][8];
        for(int i = 0; i < chest.length; i++){
            System.out.println("");
            for(int j = 0; j < chest.length; j++){
                if((j + i) % 2 == 0){
                    System.out.print("W ");
                }else System.out.print("B ");
            }
        }

    }
}

