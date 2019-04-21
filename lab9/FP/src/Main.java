package FP.src;

@SuppressWarnings("unchecked")

public class Main {
    public static void main(String[] args) {
        final Coffee basicCoffee = new Coffee() {
            public String getDescription() {
                return "Coffee.java";
            }
        };
                Coffee orderedCoffee = null;

                orderedCoffee = CoffeeMaker.orderCoffee(basicCoffee, coffee  -> coffee);

                System.out.println("basic coffee" + orderedCoffee.getDescription() + orderedCoffee.getPrice());

                orderedCoffee = CoffeeMaker.orderCoffee(basicCoffee, coffee -> { return new Coffee() {
                    public String getDescription() {
                        return coffee.getDescription() +", Choco Chip";
                    }

                    public int getPrice() {
                        return coffee.getPrice() + 2;
                    }
                 };
                });

        System.out.println("choco chip coffee" + orderedCoffee.getDescription() + orderedCoffee.getPrice());

                orderedCoffee = CoffeeMaker.orderCoffee(basicCoffee, coffee -> {
                    return new Coffee() {
                        public String getDescription() {
                            return coffee.getDescription() +", White Choc Mocha";
                        }
                        public int getPrice() {
                            return coffee.getPrice() + 6;
                        }
                    };
                }, coffee -> {

                        return new Coffee() {
                            public String getDescription() {
                                return coffee.getDescription() +", Hot Chocolate";
                            }
                            public int getPrice() {
                                return coffee.getPrice() + 5;
                            }
                        };
                }
            );

                    System.out.println("white choc mocha coffee" + orderedCoffee.getDescription() + orderedCoffee.getPrice());
            }
        }
    

