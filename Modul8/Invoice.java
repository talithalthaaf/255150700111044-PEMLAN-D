package Modul8;

public class Invoice implements Payable {
    private String productName;
    private int quantity;
    private int pricePerItem;

    public Invoice(String productName, int quantity, int pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    @Override
    public int getPayableAmount() {
        return quantity * pricePerItem;
    }

    public void tampilkanDetail() {
        System.out.println(productName + " x" + quantity + " @Rp" + pricePerItem + " = Rp" + getPayableAmount());
    }
}
