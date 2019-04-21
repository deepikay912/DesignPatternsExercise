package FP.src;

import java.util.function.*;
import java.util.stream.*;
@SuppressWarnings("unchecked")

class CoffeeMaker {

    private final Function<Coffee,Coffee> addons;
    private CoffeeMaker(Function<Coffee,Coffee>... addons1) {
        this.addons= Stream.of(addons1).reduce(coffee -> coffee, (currentaddon,next) ->currentaddon.andThen(next) );
    }

    public static Coffee orderCoffee(Coffee coffee,Function<Coffee,Coffee>... addons1 ) {
        return new CoffeeMaker(addons1).addons.apply(coffee);
    }
}