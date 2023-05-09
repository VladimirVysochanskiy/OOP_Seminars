package classes;

public class SpecialClient extends Actor {
    private int idVIP;

    public SpecialClient(String name, int ID) {
        super(name);
        this.idVIP = ID;
    }

    @Override
    public String getName() {
        return super.name;
    }

    public int getIdVIP() {
        return idVIP;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }
    
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }    
    
    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
        
    }
    
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder;
        
    }
    
    @Override
    public Actor getActor() {
        return this;
    }

    
    
}
