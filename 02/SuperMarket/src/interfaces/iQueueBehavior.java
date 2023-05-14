package interfaces;

/**
 * Интерфейс очереди
 */
public interface iQueueBehavior {

    /**
     * Постановка клиента в очередь
     * @param actor Наименование клиента
     */
    void takeInQueue(iActorBehavior actor);

    /**
     * Завершение обслуживания (добавление обслуженных клиентов в список на удаление из очереди )
     */
    void releaseFromQueue();

    /**
     * Установка отметок об активных заказах для клиентов в очереди.
     */
    void takeOrder();

    /**
     * Проставление отметок о получении заказа клиентам в очереди
     */
    void giveOrder();    
}
