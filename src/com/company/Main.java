package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        menu();
        purchaseTickets();

    }

    private static void menu() {
        try {
            while (true) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Would you like to check or purchase a raffle ticket (check/purchased):");
                String option = (bufferedReader.readLine());
                switch (option) {
                    case "check":
                        checkName();
                        checkNumber();
                        break;
                }
                switch (option) {
                    case "purchase":
                        purchaseTickets();
                        break;
                }
            }
            }catch (Exception e) {
            System.out.println("Error in main menu method");
        }
    }



    private static void checkName() throws IOException {
        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your name");
        String name = (Reader.readLine());

        List<String> nameList = new ArrayList<>();
        Collections.addAll(nameList, "Tyler", "John", "Lucas");

        if (name.equalsIgnoreCase("Tyler") || name.equalsIgnoreCase("John") || name.equalsIgnoreCase("Lucas")) {
            System.out.println("Good Luck!");
        } else if (name != nameList.get(0)) {
            System.out.println("Sorry your not name isn't on the list");
        }
    }


    private static void checkNumber()  {
        while (true) {
            try {
                BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("please enter your raffle number");
                Integer userRaffle = Integer.parseInt(Reader.readLine());

                List<Integer> raffleNumber = new ArrayList<>();
                Collections.addAll(raffleNumber, 563, 431, 191);

                if (userRaffle == 563 || userRaffle == 431 || userRaffle == 191) {
                    System.out.println("you have a valid ticket");
                    break;
                } else if (userRaffle != 563 || userRaffle != 431 || userRaffle != 191) {
                    System.out.println("Unfortunately it isn't your lucky day");
                    break;
                }
            } catch (Exception e) {
                System.out.println("enter numbers only");
            }
        }
    }

    private static void purchaseTickets() throws IOException {
        Random random = new Random();

        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("How many tickets would you like?: ");
        Integer ticketAmount = Integer.parseInt(Reader.readLine());
        double price = ticketAmount * 9.50;
        System.out.println("your total will be: £" + price);

        System.out.println("What is your name: ");
        String namelist2 = (Reader.readLine());

        List <String> ticketNames = new ArrayList<>();
        Collections.addAll(ticketNames,"");
        ticketNames.add(namelist2);

        System.out.println(namelist2);

        int ticketNumber = random.nextInt(999-1)+1;
        System.out.println("Here is your ticket number: " + ticketNumber);




    }
}
