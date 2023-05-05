import Products.BottleOfWater;
import Products.HotDrink;
import Products.Product;
import VendingMachines.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        
        Product name1 = new Product("Вкусняшка1", 15);
        // System.out.println(name1);
        // name1.setPrice(16);
        // System.out.println(name1);

        VendingMachine itemMachine = new VendingMachine(300);

        itemMachine.addProduct(name1);
        itemMachine.addProduct(new Product("Чипсы", 60.0));
        itemMachine.addProduct(new Product("Масло", 50.0));
        itemMachine.addProduct(new Product("Хлеб", 40.0));
        itemMachine.addProduct(new Product("Снек", 20.0));
        itemMachine.addProduct(new BottleOfWater("Cola", 90, 500));
        itemMachine.addProduct(new BottleOfWater("Cок", 50, 900));
        itemMachine.addProduct(new HotDrink("Кофе", 100, 60, 80));
        itemMachine.addProduct(new HotDrink("Чай", 30, 150, 80));

        for (Product prod: itemMachine.getProdAll()) {
            System.out.println(prod);
        }
        


    
    }
}
