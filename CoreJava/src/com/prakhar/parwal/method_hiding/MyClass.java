package com.prakhar.parwal.method_hiding;

public class MyClass {
	
    public static void main(String... q) {
        Derived.print(); 
    }
}

class Base {
	
    public static void print() {
        System.out.println("Base");
    }
}

class Derived extends Base {
	
    public static void print() {
        System.out.println("Derived");
    }    
}