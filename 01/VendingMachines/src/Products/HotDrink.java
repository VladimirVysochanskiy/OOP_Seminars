package Products;

public class HotDrink extends BottleOfWater {
    private int temp;

    public HotDrink(String name, double price, int volume, int temp) {
        super(name, price, volume);
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
    
    @Override
    public String toString() {
        return "(Продукт: " + super.getName() + ", Объём: " 
                            + super.getVolume() + "мл,  Температура: " + temp 
                            + " град., Цена: " + super.getPrice() + ")";
    }

    
}
