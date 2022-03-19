package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int yaricap;
        double pi=3.1,alan,cevre;
        Scanner inp=new Scanner(System.in);

        System.out.print("yaricap:");
        yaricap= inp.nextInt();

        alan=pi*yaricap*yaricap;
        cevre=2*pi*yaricap;

        System.out.print("alan:"+alan);
        System.out.print("\ncevre:"+cevre);
    }
}
