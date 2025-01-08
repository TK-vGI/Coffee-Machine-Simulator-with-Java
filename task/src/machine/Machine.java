package machine;

import java.util.Scanner;

public class Machine {
    int water, milk, beans;
    int dispoCups;
    int money;
    int cleaningCounter = 0;

    public Machine(int water, int milk, int beans, int dispoCups, int money) {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.dispoCups = dispoCups;
        this.money = money;
    }    
    
    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getBeans() {
        return beans;
    }

    public void setBeans(int beans) {
        this.beans = beans;
    }

    public int getDispoCups() {
        return dispoCups;
    }

    public void setDispoCups(int dispoCups) {
        this.dispoCups = dispoCups;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getCleaningCounter() {
        return cleaningCounter;
    }

    public void setCleaningCounter(int cleaningCounter) {
        this.cleaningCounter = cleaningCounter;
    }

    public void actionBuy() {
        Scanner inputBuy = new Scanner(System.in);
        System.out.println();
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String input= inputBuy.next();

        switch (input) {
            case "1":{
                int waterC = CoffeeType.ESPRESSO.getWaterC();
                int beansC = CoffeeType.ESPRESSO.getBeansC();
                int costC = CoffeeType.ESPRESSO.getCostC();

                if (water >= waterC && beans >= beansC && dispoCups >=1) {
                    System.out.println("I have enough resources, making you a coffee!");
                    setWater(water - waterC);
                    setBeans(beans - beansC);
                    setDispoCups(dispoCups -1);
                    setMoney(money + costC);
                    setCleaningCounter(cleaningCounter + 1);
                } else {
                    String ingredient = water < waterC ? "water" : beans < beansC ? "coffee beans" : "disposable cups";
                    System.out.printf("Sorry, not enough %s!%n",ingredient);
                }
                break;
            }
            case "2": {
                int waterC = CoffeeType.LATTE.getWaterC();
                int milkC = CoffeeType.LATTE.getMilkC();
                int beansC = CoffeeType.LATTE.getBeansC();
                int costC = CoffeeType.LATTE.getCostC();

                if (water >= waterC && milk >= milkC && beans >= beansC && dispoCups >=1) {
                    System.out.println("I have enough resources, making you a coffee!");
                    setWater(water - waterC);
                    setMilk(milk - milkC);
                    setBeans(beans - beansC);
                    setDispoCups(dispoCups -1);
                    setMoney(money + costC);
                    setCleaningCounter(cleaningCounter + 1);
                } else {
                    String ingredient = water < waterC ? "water" : milk < milkC ? "milk" :
                            beans < beansC ? "coffee beans" : "disposable cups";
                    System.out.printf("Sorry, not enough %s!%n",ingredient);
                }
                break;
            }
            case "3": {
                int waterC = CoffeeType.CAPPUCCINO.getWaterC();
                int milkC = CoffeeType.CAPPUCCINO.getMilkC();
                int beansC = CoffeeType.CAPPUCCINO.getBeansC();
                int costC = CoffeeType.CAPPUCCINO.getCostC();

                if (water >= waterC && milk >= milkC && beans >= beansC && dispoCups >= 1) {
                    System.out.println("I have enough resources, making you a coffee!");
                    setWater(water - waterC);
                    setMilk(milk - milkC);
                    setBeans(beans - beansC);
                    setDispoCups(dispoCups -1);
                    setMoney(money + costC);
                    setCleaningCounter(cleaningCounter + 1);
                } else {
                    String ingredient = water < waterC ? "water" : milk < milkC ? "milk" :
                            beans < beansC ? "coffee beans" : "disposable cups";
                    System.out.printf("Sorry, not enough %s!%n",ingredient);
                }
                break;
            }
            case "back": {
                break;
            }
        }
    }

    public void actionFill() {
        Scanner inputFill = new Scanner(System.in);
        System.out.println();
        System.out.println("Write how many ml of water you want to add:");
        setWater(water + inputFill.nextInt());
        System.out.println("Write how many ml of milk you want to add:");
        setMilk(milk + inputFill.nextInt());
        System.out.println("Write how many grams of coffee beans you want to add:");
        setBeans(beans + inputFill.nextInt());
        System.out.println("Write how many disposable cups you want to add:");
        setDispoCups(dispoCups + inputFill.nextInt());

    }

    public void actionTake() {
        int amount = getMoney();
        System.out.println();
        System.out.printf("I gave you $%d%n",amount);
        setMoney(0);
    }

    public void actionClean() {
        System.out.println("I have been cleaned!");
        setCleaningCounter(0);
    }

    public void actionRemaining() {
        System.out.println();
        System.out.printf("The coffee machine has:%n" +
                "%d ml of water%n" +
                "%d ml of milk%n" +
                "%d g of coffee beans%n" +
                "%d disposable cups%n" +
                "$%d of money%n",getWater(),getMilk(),getBeans(),getDispoCups(),getMoney());
    }

}
