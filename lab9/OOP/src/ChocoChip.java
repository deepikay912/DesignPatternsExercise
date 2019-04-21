package OOP.src;

class ChocoChip extends CoffeeDecorator {
    ChocoChip(Coffee coffee) {
        super(coffee);
    }

    String getDescription() {
        return coffee.getDescription() + ", with Choco Chip";
    }

    int getPrice() {
        return coffee.getPrice() + 2 ;
    }
}