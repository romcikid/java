package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Array a_1 = new Array_1();
        System.out.println(a_1.Add(34));
        System.out.println(a_1.Add(3));
        System.out.println(a_1.Add(-8));
        System.out.println(a_1.Add(334));
        System.out.println(a_1.Add(666));
        System.out.println(a_1.Get(3));
        System.out.println("");
        Array a_2 = new Array_2();
        System.out.println(a_2.Add(34));
        System.out.println(a_2.Add(3));
        System.out.println(a_2.Add(-8));
        System.out.println(a_2.Add(334));
        System.out.println(a_2.Add(666));
        System.out.println(a_2.Get(4));
    }
}
