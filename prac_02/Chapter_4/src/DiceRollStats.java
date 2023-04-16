public class DiceRollStats {

    public static final int NUMBER_OF_EXPREMENTS = 10000;

    public static void main(String[] args) {
        double average;
        System.out.println("Total on Dice      Average Number of Rolls");
        System.out.println("--------------     ------------------------");
        for (int dice = 2; dice <= 12; dice++){
            average = getAverageRollCount(dice);
            System.out.printf("%10d%22.4f\n", dice, average);
        }
    }

    public static double getAverageRollCount (int roll){
        int rollCountThisExperiment;
        int rollTotal;
        double averageRollCount;
        rollTotal = 0;

        for (int i = 0; i < NUMBER_OF_EXPREMENTS; i++){
            rollCountThisExperiment = rollFor(roll);
            rollTotal += rollCountThisExperiment;
        }
        averageRollCount = ((double)rollTotal) / NUMBER_OF_EXPREMENTS;
        return averageRollCount;
    }

    public static int rollFor(int N){
        if (N < 2 || N > 12)
            throw new IllegalArgumentException("Impossible total for a pair of dice");
        int die1, die2;
        int roll;
        int rollCt;
        rollCt = 0;

        do {
            die1 = (int)(Math.random()*6) + 1;
            die2 = (int)(Math.random()*6) + 1;
            roll = die1 + die2;
            rollCt++;
        } while (roll != N);
        return rollCt;
    }
}
