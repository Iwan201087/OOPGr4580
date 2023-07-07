package Interfaces;

import Classes.Actor;

/**
 * Интерфейс необходимый для описания возврата товара.
 */
public interface iReturnOrder {

    /**
     * Устанавливает флаг, который указывает на возможность осуществления возврата заказа.
     *
     * @param makeReturnOrder возвращает Флаг наличия возможности возврата заказа.
     */
    void setMakeReturnOrder(boolean makeReturnOrder);

    /**
     * Устанавливает флаг, который указывает  на возможность вернуть оплату за  заказ.
     *
     * @param makePaid возвращает Флаг наличия возможности вернуть оплату за заказ.
     */
    void setMakePaid(boolean makePaid);

    /**
     * Метод который проверяет, может ли заказ быть возвращен.
     *
     * @return возвращает true, если заказ может быть возвращен, в противном случае false.
     */
    boolean isMakeReturnOrder();

    /**
     * Метод который проверяет, был ли заказ оплачен ранее.
     *
     * @return возвращает true, если заказ был оплачен, в противном случае возвращает  false.
     */
    boolean isMakePaid();

    /**
     * Возвращает экземпляр класса Actor, связанного с данным сценарием поведения.
     *
     * @return возвращает экземпляр класса Actor.
     */
    Actor getActor();
}