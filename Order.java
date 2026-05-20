class Order {

    
    public String productName;
    private double unitPrice;
    private int quantity;

  
    public Order(String name, double unitPrice, int quantity) throws Exception {

        if (unitPrice <= 0) {
            throw new Exception("Unit price must be greater than zero.");
        }

        if (quantity <= 0) {
            throw new Exception("Quantity must be greater than zero.");
        }

        this.productName = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    
    public void setUnitPrice(double price) throws Exception {

        if (price <= 0) {
            throw new Exception("Unit price must be greater than zero.");
        }

        this.unitPrice = price;
    }

    
    public void setQuantity(int qty) throws Exception {

        if (qty <= 0) {
            throw new Exception("Quantity must be greater than zero.");
        }

        this.quantity = qty;
    }

    
    public double calculateTotal() {
        return unitPrice * quantity;
    }

    
    @Override
    public String toString() {

        return productName + " - "
                + quantity + " pcs x "
                + unitPrice + " = "
                + calculateTotal();
    }
}
