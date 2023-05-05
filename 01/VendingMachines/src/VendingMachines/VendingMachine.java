package VendingMachines;

import Products.*;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private int volume;
    private List<Product> products;
    private List<String> workLog;
    
    public VendingMachine(int volume) {
        this.volume = volume;
        products = new ArrayList<Product>();
        workLog = new ArrayList<String>();
    }

    public void addProduct(Product prod) {
        products.add(prod);
    }

    public void addSales(String line) {
        workLog.add(line);
    }

    public Product getProdByName(String name)
    {
        for(Product prod: products)
        {
            if(prod.getName().contains(name))
            {
                return prod;
            }
        }
        return null;
    }

    public List<Product> getProdAll()
    {
        return products;
    }

    public void setNewPrice(String name, double newprice)
    {
        for(Product prod: products)
        {
            if(prod.getName().contains(name))
            {
                prod.setPrice(newprice);
            }
        }
    }

    public void printProdAll() {
        System.out.println();
        for (Product prod: products) {
            System.out.println(prod);
        }
        System.out.println();
    }
}
