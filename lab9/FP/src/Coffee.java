package FP.src;

interface Coffee {
    String getDescription();
    default int getPrice() {
        return 4;
    }
}