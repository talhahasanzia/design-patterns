package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Greeting greeting = new Greeting.Builder()
                .setGender(Gender.MALE)
                .setName("Talha")
                .build();

        System.out.println(greeting.greet());

    }
}
