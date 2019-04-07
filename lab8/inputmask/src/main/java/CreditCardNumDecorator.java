package inputmask.src.main.java;

public class CreditCardNumDecorator extends Decorator {
    private String creditCardNum;

    public CreditCardNumDecorator(IDisplayComponent c) {
        super(c);
    }
    public String display(IDisplayComponent c) {
        creditCardNum = super.display();
        return decorate(creditCardNum);
    }

    private String decorate(String creditCardNum){

        int len = creditCardNum.length();
        if(len < 4)
            return creditCardNum;
        else if(len < 8)
            return creditCardNum.substring(0,4)+" "+creditCardNum.substring(4,len);
        else if(len < 12)
            return creditCardNum.substring(0,4)+" "+creditCardNum.substring(4,8)+ " " + creditCardNum.substring(8,len);
            
        else if(len < 16) 
            return  creditCardNum.substring(0,4)+" "+creditCardNum.substring(4,8)+ " " + creditCardNum.substring(8,12) + " "
                    + creditCardNum.substring(12,len) ;
        else 
            return creditCardNum.substring(0,4)+" "+creditCardNum.substring(4,8)+ " " + creditCardNum.substring(8,12) + " "
                    + creditCardNum.substring(12,16) + "  ";
       

    }
}