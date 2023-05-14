package classes;

/**
 * ВИП клиент
 */
public class SpecialClient extends Actor {
    private int idVIP;

    /**
     * Конструктор ВИП клиента
     * @param name Имя клиента
     * @param ID   Идентификационный номер
     */
    public SpecialClient(String name, int ID) {
        super(name);
        this.idVIP = ID;
    }

    /**
     * Запрос имени клиента
     */
    @Override
    public String getName() {
        return super.name;
    }

    /**
     * Запрос Идентификационного номера ВИП клиента
     */
    public int getIdVIP() {
        return idVIP;
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
     * Запрос наименования клиента
     */
    @Override
    public Actor getActor() {
        return this;
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

}
