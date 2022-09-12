package com.bridgelabz;



/*An Interface that contains exactly one abstract method is known as functional interface.
It can have any number of default, static methods but can contain only one abstract method.
It can also declare methods of object class.
Functional Interface is also known as Single Abstract Method Interfaces or SAM Interfaces.*/
@FunctionalInterface

    interface Square {
        int calculate(int x);
    }

    class Test {
        public static void main(String args[])
        {
            int a = 5;

            // lambda expression to define the calculate method
            Square s = (int x) -> x * x;

            // parameter passed and return type must be
            // same as defined in the prototype
            int ans = s.calculate(a);
            System.out.println(ans);
        }
    }

