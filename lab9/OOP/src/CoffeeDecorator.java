package OOP.src;

abstract class CoffeeDecorator extends  Coffee {
    protected Coffee coffee;

    CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    abstract String getDescription();

}