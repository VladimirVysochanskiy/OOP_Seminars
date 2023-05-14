package classes;

/**
 * Акционный клиент
 */
public class PromoClient extends Actor {
    private SuperPromotion promotion;
    private int promoID;
    private static int counter = 0;

    /**
     * Конструктор акционного клиента
     * @param name Имя клиента
     * @param promotion Акция, в которой участвует клиент
     */
    public PromoClient(String name, SuperPromotion promotion) {
        super(name);
        if (promotion.getCount() < promotion.getMaxNumOfParticipants()) {
            this.promotion = promotion;
            promotion.addClient();
            this.promoID = promotion.getCount() + 1;
            counter++;
        }else{
            System.out.println("\nДостигнуто максимальное количество участников. \nКлиент " + name 
                                + " не может принять участие в акции " + "\"" + promotion.getName() + "\"");
        }
    }

    /**
     * Запрос имени клиента
     */
    @Override
    public String getName() {
        return super.name;
    }

    /**
     * Запрос метки активного заказа
     */
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }
    
    /**
     * Запрос метки полученного заказа
     */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }    
    
    /**
     * Запрос метки возврата товара
     */
    @Override
    public boolean isReturnGoods() {
        return super.isReturnGoods;
    }
    
    
    /**
     * Установка метки активного заказа
     * @param makeOrder Булевое значение true или false
     */
    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }
    
    /**
     * Установка метки полученного заказа
     * @param pickUpOrder Булевое значение true или false
     */
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder;
    }
    
    /**
     * Установка метки возврата товара
     * @param returned Булевое значение true или false
     */
    @Override
    public void setReturnGoods(boolean returned) {
        super.isReturnGoods = returned;
    }

    /**
     * Запрос имени акции, в которой участвует клиент
     */
    public String getPromotion() {
        return promotion.getName();
    }
    
    /**
     * Запрос общего количества клиентов принявших участие в разных акциях
     * @return Счетчик всех акционных клиентов
     */
    public static int getTotalParticipants() {
        return counter;
    }
    
    /**
     * Вывод информации об акционном клиенте
     */
    public String clientInfo() {
        if (promotion == null) {
            return "PromoClient [name=" + super.name + ", promotion= NO, promoID= NO ]";
            
        }
        return "PromoClient [name=" + super.name + ", promotion=" + promotion.getName() + ", promoID=" + promoID + "]";
    }
    
    /**
     * Операция возврата товара
     */
    @Override
    public void returnOfGoods() {
        System.out.println(getActor().getName() + "клиент вернул товар в магазин.");
        setReturnGoods(true);
        paymentReturn();        
    }
    
    /**
     * Операция возврата оплаты клиенту
     */
    @Override
    public void paymentReturn() {
        System.out.println(getActor().getName() + "клиент получил деньги за возвращенный товар.");
    }
    
    /**
     * Запрос наименования клиента
     */
    @Override
    public Actor getActor() {
        return this;
    }
}
