package inputmask.src.main.java;

public class CreditCardExpDecorator extends Decorator {
    private String exp;
    
      public CreditCardExpDecorator(IDisplayComponent c) {
       super(c);
    }

    public String display() {
        exp = super.display();
        return decorate(exp);
    }

    private String decorate(String exp){
        int len = exp.length();
        if(len < 2)
            return exp;
        else if(len < 4)
            return  exp.substring(0,2)+ "/" + exp.substring(2,len);
        else 
            return  exp.substring(0,2)+ "/" + exp.substring(2,4)+ "  ";

    }
}