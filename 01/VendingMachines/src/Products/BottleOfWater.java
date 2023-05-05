package Products;

public class BottleOfWater extends Product {
    
    private int volume;

    public BottleOfWater(String name, double price, int volume) {
        super(name, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    @Override
    public String toString() {
        return "(Продукт: " + super.getName() + ", Объём: " 
                            + volume + "мл, Цена: " + super.getPrice() + ")";
    }
}
