package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	  int kilo;
      double boy;

      Scanner inp=new Scanner(System.in);

      System.out.println("Lütfen Boyunuzu (metre cinsinden) Giriniz: ");
      boy=inp.nextDouble();
      System.out.println("Lütfen Kilonuzu Giriniz :");
      kilo=inp.nextInt();
      
      double olcum=kilo/(boy*boy);
      System.out.println("Kilo Boy indeksiniz :"+olcum);
    }
}
