public class Transaction{

    private int id;
    private double amount;
    private String description;

    public Transaction(int id, double amount, String description){
        this.id = id;
        this.amount = amount;
        this.description = description;
    }

    public double getAmount(){
        return amount;
    }

    public int getId(){
        return id;
    }

    public String getDescription(){
        return description;
    }
}