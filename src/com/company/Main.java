package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int VND ,USD, rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("nhap vao gia tri USD");
        USD = scanner.nextInt();
        VND = USD *rate ;
        System.out.printf("so VND tuong ung la"+VND);
    }
}
