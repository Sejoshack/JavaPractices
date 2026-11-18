class FibonacciClass {
    private int[] F = new int[100];
    private int currentNumbersHeld = 0;
    public static final int maxNumbers = 100;

    public int getCurrentNumbersHeld() {
        return currentNumbersHeld;
    }

    public void generateSequence(int N) {
        if (N > maxNumbers) N = maxNumbers;

        F[0] = 1;
        F[1] = 1;
        currentNumbersHeld = N;

        for (int i = 2; i < N; i++) {
            F[i] = F[i-1] + F[i-2];
        }
    }

    public void displaySequence() {
        for (int i = 0; i < currentNumbersHeld; i++) {
            System.out.print(F[i] + " ");
        }
        System.out.println();
    }
}
