package com.vincent;

public class Main {

    public static void main(String[] args) {
	// write your code here
        runner();
    }

    public static void runner(){
        int totalLoopsInSecondFor = 0;
        for(int i = 0; i < 2; i++){
            System.out.println("ONE");
            for(int j = 0; j< 5; j++){
                totalLoopsInSecondFor +=j;
                System.out.println("TWO");
            }
        }

        System.out.println(totalLoopsInSecondFor);

    }
}
