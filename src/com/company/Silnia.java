package com.company;

import java.util.Scanner;

public class Silnia {

    public Silnia() {
    }

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    public long obliczSilnie(){
        int s =1;
        for (int i = 1; i<=n; i++){
            s=s*i;
        }
        return s;
    }
}
