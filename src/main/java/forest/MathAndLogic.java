package forest;

public class MathAndLogic {
    public static void main(String[] args) {

        int myNumber = 5;

        Integer myMark = 12;

        Float weight = 16.04F;

        Double income = 18.00088D;

        float price = 23.50F;

        calculate();
    }

    public static void calculate() {
        int myResult = 5 + 7;
        // System.out.println(myResult);

        int myRest = 88 - 77;

        int division = 28/13;
        //System.out.println(division);

        int myRemainder = 33 % 13;
        // System.out.println(myRemainder);

//        double myResult2 = Math.floor(28/13);
//        System.out.println(myResult2);

//        double myResult3 = Math.ceil(38/13);
//        System.out.println(myResult3);

//        double result4 = Math.pow(3, 2);
//        System.out.println(result4);

//          double result5 = Math.max(6, 77);
//          System.out.println(result5);
//
//          int result6 = Math.min(16, 19);
//          System.out.println(result6);

        double randomNumber = Math.random();
        //System.out.println(randomNumber);

        for(int i = 0; i < 3; i++) {
            int result = roll();
            System.out.println("Result of random roll: " + result);
        }

        double root = Math.sqrt(16);
        //System.out.println("Root of 16 is: " + root);


        int myBalance = 1000;

        boolean isAdult = true;

        // && - and || - or, ! - revert

        if (myBalance >= 100 && isAdult) {
            System.out.println("You can enter. Welcome.");
        } else {
            System.out.println("Sorry, not enough money.");
        }


        if (!isAdult) {
            System.out.println("You are a kid.");
        } else {
            System.out.println("You are adult.");
        }


        boolean isOurClient = false;
        boolean hasPremium = true;

        if (isOurClient && hasPremium) {
            System.out.println("Welcome to VIP zone");
        } else if (isOurClient && !hasPremium) {
            System.out.println("Welcome. But you cannot enter into VIP");
        } else if (!isOurClient) {
            System.out.println("You cannot enter");
        } else {
            System.out.println("Please, go away.");
        }
    }

    public static int roll() {
        int randomDiceRoll = 1 + (int)(Math.random() * ((6 - 1) + 1));
        return randomDiceRoll;
    }


}
