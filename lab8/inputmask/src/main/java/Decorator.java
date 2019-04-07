package inputmask.src.main.java;

public class Decorator implements IDisplayComponent {
    private IDisplayComponent component;

    public Decorator(IDisplayComponent c) {
        component = c;
    }

    public String display() {
        return component.display();
    }
    
    public void addSubComponent( IDisplayComponent c ) {
    }
}