package OOP.src;

public class Main {
    public static void main(String... args) {

        Coffee coffee = new WhiteChocMocha();
        System.out.println(coffee.getDescription());

        coffee = new Whip(new ChocoChip(new WhiteChocMocha()));

        System.out.println(coffee.getDescription());


    }
}