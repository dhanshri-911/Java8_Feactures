package com.bridgelabz;

import java.util.ArrayList;
import java.util.function.Consumer;

/*
 * Lambda Expression is an Java 8 feature.
 * Because of lambda expression code reduced.
 * Because of lambda Expression in java Enabled functional programming.
 * lambda Expression reduce the code size.
 * function from the lambda we can handle just like object.
 */
public class LambdaExpression {
        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            numbers.add(5);
            numbers.add(9);
            numbers.add(8);
            numbers.add(1);
            Consumer<Integer> method = (n) -> { System.out.println(n); };
            numbers.forEach( method );
        }
    }

