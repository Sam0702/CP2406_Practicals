public class SnakeEyes {
    public static void main(String[] args) {
        int dice1, dice2;
        int countRolls;

        countRolls = 0;

        do {
            dice1 = (int)(Math.random()*6) +1;
            dice2 = (int) (Math.random()*6) +1;
            countRolls++;
        } while (dice1 != 1 || dice2 !=1);
        System.out.println("It took " + countRolls + " rolls to get the snake eyes");
    }
}
