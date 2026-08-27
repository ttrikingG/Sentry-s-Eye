public class Main {

    public static void main(String[] args) {

        Transaction transaction = new Transaction(
            1,
            150.00,
            "Compra no supermercado"
        );

        AnomalyDetector detector = new AnomalyDetector();

        boolean anomalous = detector.isAnomalous(transaction);

        System.out.println("ID: " + transaction.getId());
        System.out.println("Valor: " + transaction.getAmount());
        System.out.println("Descrição: " + transaction.getDescription());
        System.out.println("Anomalia Detectada: " + anomalous);

        if(anomalous){
            System.out.println("Anomalia Detectada!");
        }else{
            System.out.println("Transação normal.");
        }

    }

}