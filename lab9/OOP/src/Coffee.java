package OOP.src;

abstract class Coffee  {
    protected String description;
    abstract int getPrice();
    String getDescription() {
        return  this.description;
    }

}