package org.example;

//ToDo: Write a method that will return the factorial of the input number

public class Task {
    public int factorial(int input) {
        if (input == 0 || input == 1) {
            return 1;
        } else {
            return input * factorial(input - 1);
        }
    }
}
