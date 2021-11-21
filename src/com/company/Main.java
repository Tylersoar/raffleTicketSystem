package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static int ticketNumber = 0;
    private static String namelist2 = ("");

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

        List<String> userName = new ArrayList<>();
        Collections.addAll(userName,"");
        userName.add(name);

        List<String> nameList = new ArrayList<>();
        Collections.addAll(nameList, "Tyler", "John", "Lucas");
        nameList.add(generateName());
        System.out.println(nameList);

        if (userName.get(0).equals(nameList.get(0)) || userName.get(0).equals(nameList.get(1)) ||  userName.get(0).equals(nameList.get(2)) || userName.get(0).equals(nameList.get(3))){
            System.out.println("Good Luck!");
        } else if (!userName.get(0).equals(nameList.get(0)) || !userName.get(0).equals(nameList.get(1)) || !userName.get(0).equals(nameList.get(2)) || !userName.get(0).equals(nameList.get(3))) {
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
                raffleNumber.add(generateTicket());
                System.out.println(raffleNumber);

                if (userRaffle == 563 || userRaffle == 431 || userRaffle == 191 || userRaffle == generateTicket()) {
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
        namelist2 = (Reader.readLine());



        System.out.println("Thank you, " + namelist2 + ":" );
        for (int i = 0; i < ticketAmount; i++) {
            ticketNumber = random.nextInt(999-1)+1;
            System.out.println("Here is your ticket number: " + ticketNumber);
        }
    }
    private static int generateTicket(){
        return ticketNumber;
    }
    private static String generateName(){
        return namelist2;
    }
}
