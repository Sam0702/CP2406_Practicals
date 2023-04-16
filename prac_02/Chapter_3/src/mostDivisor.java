public class mostDivisor {

    public static void main(String[] args) {

        int n;
        int maxDivisor;
        int numWithMax;

        maxDivisor = 1;
        numWithMax = 1;

        for (n = 2; n<=10000; n++) {
            int d;
            int divisorCount = 0;

            for (d = 1; d <= n; d++){
                if (n % d == 0){
                    divisorCount++;
                }

                if (divisorCount > maxDivisor){
                    maxDivisor = divisorCount;
                    numWithMax = n;
                }
            }
        }
        System.out.println("Among the integer between 1 and 10000,");
        System.out.println("The maximum number of divisor is " + maxDivisor);
        System.out.println("A number with " + maxDivisor + " divisor is " + numWithMax);
    }

}
