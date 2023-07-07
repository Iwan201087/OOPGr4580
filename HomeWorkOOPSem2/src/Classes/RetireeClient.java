package Classes;
/**
 * Класс, необходимый  для описания клиента - пенсионера.
 */
public class RetireeClient extends Actor {
    public RetireeClient(String name, int retireeID) {
        super(name + " - пенсионер");
    }
    /**
     * Метод позволяющий получить имя  клиента - пенсионера.
     *
     * @return возвращает имя  клиента - пенсионера
     */
    @Override
    public String getName() {
        return super.name;
    }
    /**
     * Метод позволяющий проверить возможность заказа  клиентом-пенсионером.
     *
     * @return возвращает true, если обычный клиент может делать заказы, в противном случае -false */
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
    /**
     * Метод позволяющий проверить возможность создания заказа клиентом-пенсионером.
     *
     * @return возвращает true, если обычный клиент может создавать заказы, в противном случае - false
     */
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }
    /**
     * Метод позволяющий проверить возможность создания заказа для  клиента-пенсионера.
     *
     * @param takeOrder возвращает true если клиент может делать заказы, в противном случае -  false */
    public void setTakeOrder(boolean makeOder) {
        super.isMakeOrder = makeOder;
    }
     /**
     * Метод позволяющий проверить возможность возврата заказа для обычного клиента.
     *
     * @param makeOrder возвращает true если клиент может создавать возвраты заказа, в противном случае -  false */
     
    public void setMakeOrder(boolean pikUpOrder) {
        super.isTakeOrder = pikUpOrder;
    }
     /**
     * Метод позволяющий получить объект  клиента-пенсионера.
     *
     * @return возвращает объект обычного клиента -пенсионера
     */
    public Actor getActor() {
        return this;
    }
    // Описание логики возврата заказа клиентом
    @Override
    public void setMakeReturnOrder(boolean makeReturnOrder) {

        throw new UnsupportedOperationException("Unimplemented method 'setMakeReturnOrder'");
    }

    @Override
    public void setMakePaid(boolean makePaid) {

        throw new UnsupportedOperationException("Unimplemented method 'setMakePaid'");
    }

    @Override
    public boolean isMakeReturnOrder() {

        throw new UnsupportedOperationException("Unimplemented method 'isMakeReturnOrder'");
    }

    @Override
    public boolean isMakePaid() {

        throw new UnsupportedOperationException("Unimplemented method 'isMakePaid'");
    }
}