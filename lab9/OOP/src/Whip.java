package OOP.src;

class Whip extends CoffeeDecorator {
    Whip(Coffee coffee) {
        super(coffee);
    }

    String getDescription() {
        return coffee.getDescription() + ", with Whip";
    }

    int getPrice() {
        return coffee.getPrice() + 1 ;
    }
}