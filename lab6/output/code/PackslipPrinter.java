import java.util.List;
import java.util.Map;

public class PackslipPrinter implements Printer {

    public void print(Map<String, List<String>> items) {

        for (String item : items.get("top")) {
            System.out.println(item);

        }

        for (String item : items.get("middle")) {
            System.out.println("-> |" + item);

        }for (String item : items.get("bottom")) {
            System.out.println("{{{{" +item + "}}}}");

        }


    }

}
