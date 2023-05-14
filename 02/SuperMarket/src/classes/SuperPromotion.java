package classes;

import interfaces.iPromotionBehavior;

/**
 * Акция
 */
public class SuperPromotion implements iPromotionBehavior {
    protected String name;
    protected int maxNumOfParticipants;
    private int count = 0;

    /**
     * Конструктор акций
     * @param name Наименование акции
     * @param maxNumOfParticipants Максимальное количество участников
     */
    public SuperPromotion(String name, int maxNumOfParticipants) {
        this.name = name;
        this.maxNumOfParticipants = maxNumOfParticipants;
    }
    
    /**
     * Запрос наименования акции
     */
    public String getName() {
        return name;
    }

    /**
     * Запрос максимального количества участников
     */
    public int getMaxNumOfParticipants() {
        return maxNumOfParticipants;
    }

    /**
     * Изменение максимального количества участников
     */
    public void setMaxNumOfParticipants(int maxNumOfParticipants) {
        this.maxNumOfParticipants = maxNumOfParticipants;
    }

    /**
     * Запрос актуального количества участников акции
     */
    @Override
    public int getCount() {
        return count;
    }

    /**
     * Вывод информации об акции
     */
    @Override
    public String toString() {
        return "\nPromotion: " + getName()
                + "\nMax number of participants: " + getMaxNumOfParticipants()
                + "\nActual number of participants: " + count + "\n";
    }

    /**
     * Добавление нового участника акции
     */
    @Override
    public void addClient() {
        count++;
    }
}
