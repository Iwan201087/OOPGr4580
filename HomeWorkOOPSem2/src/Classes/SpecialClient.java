package Classes;
/**
 * Класс, необходимый  для описания специального клиента.
 */
public class SpecialClient extends Actor {
    public SpecialClient(String name, Integer id) {
        super(name);
    }
    /**
     * Метод позволяющий получить имя специального клиента.
     *
     * @return возвращает имя специального клиента
     */
    @Override
    public String getName() {
        return super.name;
    }
    /**
     * Метод позволяющий проверить возможность заказа специальным клиентом.
     *
     * @return возвращает true, если  клиент может делать заказы, в противном случае -false */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
    /**
     * Метод позволяющий проверить возможность создания заказа специальным клиентом.
     *
     * @return возвращает true, если  клиент может создавать заказы, в противном случае - false
     */
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }
    /**
     * Метод позволяющий проверить возможность заказа для специального клиента.
     *
     * @param takeOrder возвращает true если клиент может делать заказы, в противном случае -  false */
    @Override
    public void setTakeOrder(boolean takeOrder) {
        super.isTakeOrder = takeOrder;
    }
    /**
     * Метод позволяющий проверить возможность возврата заказа для специального клиента.
     *
     * @param makeOrder возвращает true если клиент может создавать возвраты заказа, в противном случае -  false */
    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }
    /**
     * Метод позволяющий получить объект специального клиента.
     *
     * @return возвращает объект специального клиента
     */
    @Override
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