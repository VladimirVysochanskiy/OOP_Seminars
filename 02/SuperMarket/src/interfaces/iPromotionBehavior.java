package interfaces;

/**
 * Интерфейс акций
 */
public interface iPromotionBehavior {
    
    /**
     * Запрос актуального количества участников акции
     */
    int getCount();

    /**
     * Добавление нового участника акции
     */
    void addClient();
}
