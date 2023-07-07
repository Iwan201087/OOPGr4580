package Classes;
/**
 * Класс, необходимый  для описания обычного клиента.
 */
public class OrdinaryClient extends Actor {
    public OrdinaryClient(String name) {
        super(name);
    }
    /**
     * Метод позволяющий получить имя обычного клиента.
     *
     * @return возвращает имя обычного клиента
     */
    @Override
    public String getName() {
        return super.name;
    }
    /**
     * Метод позволяющий проверить возможность заказа обычным клиентом.
     *
     * @return возвращает true, если обычный клиент может делать заказы, в противном случае -false */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
    /**
     * Метод позволяющий проверить возможность создания заказа обычным клиентом.
     *
     * @return возвращает true, если обычный клиент может создавать заказы, в противном случае - false
     */
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }
    /**
     * Метод позволяющий проверить возможность заказа для обычного клиента.
     *
     * @param takeOrder возвращает true если клиент может делать заказы, в противном случае -  false */
    public void setTakeOrder(boolean takeOrder) {
        super.isTakeOrder = takeOrder;
    }
    /**
     * Метод позволяющий проверить возможность возврата заказа для обычного клиента.
     *
     * @param makeOrder возвращает true если клиент может создавать возвраты заказа, в противном случае -  false */
     
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }
    /**
     * Метод позволяющий получить объект оычного клиента.
     *
     * @return возвращает объект обычного клиента
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