package Classes;

import Interfaces.iActorBehaviour;

/**
 * Класс представляет услугу по налоговому аудиту магазина, который реализует
 * интерфейс iActorBehaviuor.
 */
public class TaxService implements iActorBehaviour {
    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;

    /**
     * Конструктор класса аудитор по умолчанию устанавливает имя "Налоговый аудит".
     */
    public TaxService() {
        this.name = "Налоговый аудит";
    }

    /**
     * Метод для получения имени, того кто производит налоговый аудит.
     *
     * @return возврат получения имени, того кто производит налоговый аудит.
     */

    public String getName() {
        return name;
    }

    /**
     * Метод для проверки возможности аудитора делать заказы.
     *
     * @return возвращает true, если аудитор может делать заказы, в противном случае - false.
     */
    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    /**
     * Метод, который проверяет, может ли аудитор принимать заказы.
     *
     * @return true, если аудитор может принимать заказы, в противном случае - false.
     */
    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    /**
     * Метод который проверяет, возможность аудитора делать заказы.
     *
     * @param makeOrder true, если аудитор может делать заказы, в противном случае - false.
     */
    @Override
    public void setMakeOrder(boolean makeOrder) {
        isMakeOrder = makeOrder;
    }

    /**
     * Устанавливает возможность аудитор принимать заказы.
     *
     * @param pickUpOrder true, если аудитор может принимать заказы, false в противном случае.
     */
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        isTakeOrder = pickUpOrder;
    }

    /**
     * Метод, который получает объект Actor, связанный с аудитором.
     *
     * @return возвращает Объект Actor, связанный с аудитором.
     */
    @Override
    public Actor getActor() {
        return new OrdinaryClient(name);
    }
}