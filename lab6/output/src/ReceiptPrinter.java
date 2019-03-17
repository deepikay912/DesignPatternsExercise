import java.util.List;
import java.util.Map;

public class ReceiptPrinter implements Printer {

    public void print(Map<String, List<String>> items) {

        for (String item : items.get("bottom")) {
            System.out.println("{{{{" +item + "}}}}");


        }

        for (String item : items.get("top")) {
            System.out.println(item);


        }

        for (String item : items.get("middle")) {
            System.out.println("-> |" + item);

        }

        System.out.println(" price       6.5");

        System.out.println("Tax         0.89");

        System.out.println("total         7.63");






    }

}