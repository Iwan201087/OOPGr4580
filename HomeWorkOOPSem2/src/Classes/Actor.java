package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

/**
 * Абстрактный базовый класс для всех типов клиентов.
 * * @autor студент GB группы 4580 Иван Юдицкий
 * @version 1.0
 */
public abstract class Actor implements iActorBehaviour, iReturnOrder {

    /** Имя клиента */
    protected String name;

    /** Флаг, необходимый для указания возможности клиента принимать заказы */
    protected boolean isTakeOrder;

    /** Флаг, необходимый для указания возможности клиента осуществлять заказы */
    protected boolean isMakeOrder;

    /** Флаг, необходимый для указания возможности клиент осуществлять возврат заказов */
    protected boolean isMakeReturnOrder;

    /** Флаг, необходимый для указания возможности клиента вернуть оплату за заказ  */
    protected boolean isMakePaid;

    /**
     * Конструктор  - создание класса Клиент.
     * @param name Имя клиента.
     */
    public Actor(String name) {
        this.name = name;
    }

    /**
     * Абстрактный метод для получения имени Клиента.
     * @return возвращает Имя клиента.
     */
    abstract public String getName();
}