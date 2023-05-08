package Products;

public class HotDrink extends Product {
    private int volume;
    private int temp;

    public HotDrink(String name, double price, int volume, int temp) {
        super(name, price);
        this.volume = volume;
        this.temp = temp;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
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
                            + volume + "мл,  Температура: " + temp 
                            + " град., Цена: " + super.getPrice() + ")";
    }

    
}
