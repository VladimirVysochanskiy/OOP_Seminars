
import classes.Market;
import classes.OrdinaryClient;
import classes.SpecialClient;
import classes.Promotion;

public class App {
    public static void main(String[] args) throws Exception {
        Market market = new Market();
        OrdinaryClient client1 = new OrdinaryClient("Boris");
        OrdinaryClient client2 = new OrdinaryClient("Dasha");
        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        SpecialClient client3 = new SpecialClient("Maria", 1001);
        market.acceptToMarket(client3);
        market.update();

        Promotion skidka25 = new Promotion("-25%", 3);
      

    
    }
}
