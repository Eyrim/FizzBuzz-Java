package fizzbuzz;

public enum Rules {
    FIZZ(new int[] {3}),
    BUZZ(new int[] {5}),
    FIZZBUZZ(new int[] {3, 5});

    public boolean check(int i) {
        boolean isDiv = false;

        for (int num : this.divBy) {
            if (i % num == 0) {
                isDiv = true;
            } else {
                return false;
            }
        }

        return isDiv;
    }

    private Rules(int[] divBy) {
        this.divBy = divBy;
    }
    private int[] divBy;
}
