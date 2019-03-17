import java.util.*;

public class Client {
    public static void main(String[] args) {

        List<String> top = new ArrayList<String>(Arrays.asList("LETTUCE", "TOMATO"));
        List<String> bottom = new ArrayList<String>(Arrays.asList("BACON"));
        List<String> middle  = new ArrayList<String>(Arrays.asList("G ONION","JALA GRILLED"));

        Map<String,List<String>> order = new HashMap();

        order.put("top",top);
        order.put("bottom",bottom);
        order.put("middle",middle);

        PrinterContext printer = new PrinterContext();

        printer.setStrategy(new ReceiptPrinter());

        System.out.println(" Receipt slip  \n" );
        printer.print(order);



        printer.setStrategy(new PackslipPrinter());

        System.out.println("\n Package slip \n");
        printer.print(order);







    }
}
