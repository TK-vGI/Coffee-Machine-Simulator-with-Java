package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        Machine machine = new Machine(400, 540, 120, 9, 550);
        Scanner scanner = new Scanner(System.in);
        String action;
        do {
            System.out.println();
            System.out.println("Write action (buy, fill, take, clean, remaining, exit):");
            action = scanner.nextLine();

            switch (action) {
                case "buy": {
                    if (machine.getCleaningCounter() < 10) {
                        machine.actionBuy();
                    }else {
                        System.out.println("I need cleaning!");
                    }
                    break;
                }
                case "fill": {
                    machine.actionFill();
                    break;
                }
                case "take": {
                    machine.actionTake();
                    break;
                }
                case "clean": {
                    machine.actionClean();
                    break;
                }
                case "remaining": {
                    machine.actionRemaining();
                    break;
                }
            }
        } while (!"exit".equals(action));

        scanner.close();
    }
}