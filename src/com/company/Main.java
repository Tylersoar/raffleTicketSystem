package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        try {
            while (true) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Would you like to check or purchase a raffle ticket");
                String option = (bufferedReader.readLine());
                switch (option){
                    case "checkTicket":
                        checkTicket();
                }
            }
        }catch (Exception e){
            System.out.println("Error in mainmenu method");
        }
    }
    private static void checkTicket(){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Please enter your name");
       // String name = (bufferedReader.readLine());

        System.out.println("please enter your raffle number");
        int userRaffle = Integer.parseInt(bufferedReader.readLine());

       // List <String> nameList = new ArrayList<>();
       // Collections.addAll(nameList"Tyler", "John","Lucas");

        List <Integer> raffleNumber = new ArrayList<>();
        Collections.addAll(raffleNumber, 563,431,191);

        for (int i = 0; i < raffleNumber.size(); i++) {
            raffleNumber.get(i);
        if (raffleNumber.equals(userRaffle));
            System.out.println("you have a valid ticket");

        }
    }
}