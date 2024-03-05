package exercise_easy;

public class Exercise010_easy1 {// class start
    public void displayWord (){

        double investimentValue = Double.parseDouble(JOptionPane.showInputDialog("Type the amount invested"));
        double taxFees = 0.12;
        int investimentTime = 10;
        double taxFeesTotal = 0.0;

        for (int i = 1; i <= investimentTime; i++) {
            taxFeesTotal  = taxFeesTotal  + taxFees;
        }
        double valorTotal = (investimentValue * taxFeesTotal) + investimentValue;

        System.out.println("Value Invested: " + investimentValue);
        System.out.println("Accumulated interest rate: " + (taxFees * 100) + "%");
        System.out.println("Amount: " + totalValue);

    }

} //class end
