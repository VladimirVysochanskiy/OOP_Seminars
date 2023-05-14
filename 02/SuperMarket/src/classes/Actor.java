package classes;

import interfaces.iActorBehavior;
import interfaces.iReturnOrder;

 /**
  * Базовый клиент
  */
public abstract class Actor implements iActorBehavior, iReturnOrder {
   
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    protected boolean isReturnGoods;

    /**
     * Конструктор Базовый клиент
     * @param name Имя клиента
     */
    public Actor(String name) {
        this.name = name;
    }

    /**
     *  Запрос имени клиента    
     */
    public abstract String getName(); 

   

    
    
    
}
