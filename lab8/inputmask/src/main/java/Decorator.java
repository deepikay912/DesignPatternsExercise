package inputmask.src.main.java;

public class Decorator implements IDisplayComponent,IKeyEventHandler {
    private IDisplayComponent component;

    public Decorator(IDisplayComponent c) {
        component = c;
    }

    public String display() {
        return component.display();
    }
    
    public void addSubComponent( IDisplayComponent c ) {
    }
    
     public  void key(String var1, int var2) {
          
        }
        
    public void setNext(IKeyEventHandler var1) {
    }
}