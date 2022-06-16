package entities;

public class ImportedProduct extends Product{
    public Double customsFee;

    public ImportedProduct() {

    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public double totalPrice(){
        return this.getPrice()+this.getCustomsFee();

    }

    @Override
    public String priceTag(){
        return getName()
                + " $ "
                + String.format("%.2f", totalPrice())
                + "( Custom fee: R$ "
                + String.format("%.2f", this.getCustomsFee())
                + " )";
    }

}
