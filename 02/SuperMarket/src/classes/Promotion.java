package classes;

public class Promotion {
    protected String name;
    protected int numOfParticipants;

    public Promotion(String name, int numOfParticipants) {
        this.name = name;
        this.numOfParticipants = numOfParticipants;
    }
    
    public String getName() {
        return name;
    }
    
    public int getNumOfParticipants() {
        return numOfParticipants;
    }
    
    public void setNumOfParticipants(int numOfParticipants) {
        this.numOfParticipants = numOfParticipants;
    }
    
    @Override
    public String toString() {
        return "Promotion [name=" + name + ", numOfParticipants=" + numOfParticipants + "]";
    }
}
