public class AnomalyDetector{
    public boolean isAnomalous(Transaction transaction){
        return transaction.getAmount() > 1000;
    }
}