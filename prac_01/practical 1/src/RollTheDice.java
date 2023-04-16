public class RollTheDice {
    public static void main(String[] args) {
        int dice1;
        int dice2;
        int roll;

        dice1 = (int)(Math.random() * 6) ;
        dice2 = (int)(Math.random() * 6) ;
        roll = dice1 + dice2;

        System.out.println("The first Dice " + dice1);
        System.out.println("The second Dice " + dice2);
        System.out.println("Total roll " + roll);

    }
}
