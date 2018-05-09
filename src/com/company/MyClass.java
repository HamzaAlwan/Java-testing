package com.company;

public class MyClass {
    public void printMsg(String msg){
// TODO: your code here
        System.out.println(msg);
    }
    public void guessMyNumber(int num){
        int rand = (int) Math.floor(Math.random() * 11);
        System.out.println(rand);
        if (num == rand){
            System.out.println("Congrats");
        } else {
            System.out.println("Guess again you idiot");
        }
    }
}
