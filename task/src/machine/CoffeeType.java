package machine;

public enum CoffeeType {
    ESPRESSO ("1", 250,0 , 16,  4),
    LATTE ("2", 350,75 , 20, 7),
    CAPPUCCINO ("3", 200,100 , 12, 6);

    private final int waterC;
    private final int milkC;
    private final int beansC;
    private final int costC;
    private final String numC;

    CoffeeType(String number, int water, int milk, int beans, int cost) {
        this.numC = number;
        this.waterC = water;
        this.milkC = milk;
        this.beansC = beans;
        this.costC = cost;
    }

    public int getWaterC() {
        return waterC;
    }

    public int getMilkC() {
        return milkC;
    }

    public int getBeansC() {
        return beansC;
    }

    public int getCostC() {
        return costC;
    }
}
