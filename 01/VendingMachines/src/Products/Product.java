package Products;

public class Product {
    private String name;
    private double price;

    /**
     * Конструктор нового продукта:
     * @param name - Наименование продукта
     * @param price - Стоимость продукта
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;       
    }

    public Product(String name) {
        this.name = name;
        this.price = 0;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalStateException(String.format("Цена указана некорректно!", price));
            }
        this.price = price;
    }

  
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {       
        return "(Продукт: " + name + ", Цена: " + price + ")";
    }
    
}
