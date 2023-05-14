
import classes.Market;
import classes.OrdinaryClient;
import classes.PromoClient;
import classes.SpecialClient;
import classes.SuperPromotion;

public class App {
    public static void main(String[] args) throws Exception {
        Market market = new Market();
        SuperPromotion promo25 = new SuperPromotion("-25% for alimentary", 5);
        SuperPromotion promo3as2 = new SuperPromotion("Take 3 pay for 2", 2);
        System.out.println(promo25);
        System.out.println(promo3as2);
        System.out.println("Total participants in promo: " + PromoClient.getTotalParticipants() + "\n");
        OrdinaryClient client1 = new OrdinaryClient("Boris");
        OrdinaryClient client2 = new OrdinaryClient("Dasha");
        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        SpecialClient client3 = new SpecialClient("Maria", 1001);
        market.acceptToMarket(client3);
        market.update();

        PromoClient client4 = new PromoClient("Alex", promo25 );
        PromoClient client5 = new PromoClient("Maxim", promo25);
        PromoClient client6 = new PromoClient("Svetlana", promo3as2);
        PromoClient client7 = new PromoClient("Natalia", promo3as2);
        PromoClient client8 = new PromoClient("Dima", promo3as2);
                
        System.out.println(promo25);
        System.out.println(promo3as2);
        System.out.println("Total participants in promo: " + PromoClient.getTotalParticipants() + "\n");
        
        
        // System.out.println(client7.clientInfo());
        // System.out.println(client8.clientInfo());

        OrdinaryClient client9 = new OrdinaryClient("Michele");
        market.acceptToMarket(client9);
        client9.returnOfGoods();
        market.acceptToMarket(client1);
        client1.returnOfGoods();
        market.acceptToMarket(client3);
        client3.returnOfGoods();
        market.update();

    
    }
}
