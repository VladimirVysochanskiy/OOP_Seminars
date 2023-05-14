package interfaces;

import classes.Actor;

/**
 * Интерфейс для клиента
 */
public interface iActorBehavior {
    /**
     * Установка метки активного заказа
     * @param makeOrder Булевое значение true или false
     */
    void setMakeOrder(boolean makeOrder);
    
    /**
     * Установка метки полученного заказа
     * @param pickUpOrder Булевое значение true или false
     */
    void setTakeOrder(boolean pickUpOrder);

    /**
     * Запрос метки активного заказа
     */
    boolean isMakeOrder();

    /**
     * Запрос метки полученного заказа
     */
    boolean isTakeOrder();

    /**
     * Запрос метки возврата товара
     */
    boolean isReturnGoods();

    /**
     * Запрос наименования клиента
     */
    Actor getActor();
}
