package inputmask.src.main.java;

public class CreditCardCVCDecorator extends Decorator {
    private String cvc;
    
    
   public CreditCardCVCDecorator(IDisplayComponent c) {
      super(c);
    }

    public String display() {
        cvc = super.display();
        return decorate(cvc);
    }

    private String decorate(String cvc){
        return cvc;

    }
}