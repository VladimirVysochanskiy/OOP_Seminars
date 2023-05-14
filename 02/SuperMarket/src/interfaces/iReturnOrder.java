package interfaces;

/**
 * Интерфейс возвратов товара
 */
public interface iReturnOrder {

    /**
     * Установка метки возврата товара
     * @param returned Булевое значение true или false
     */
    void setReturnGoods(boolean returned);

    /**
     * Запрос метки возврата товара
     */
    boolean isReturnGoods();

    /**
     * Операция возврата товара
     */
    void returnOfGoods();

    /**
     * Операция возврата оплаты клиенту
     */
    void paymentReturn();
}
