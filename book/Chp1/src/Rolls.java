public class Rolls {

    public static void main(String[] args) {
        int T = 100000;
        int SIDES = 6;
        Counter[] rolls = new Counter[SIDES+1];
        for (int i = 1; i <= SIDES; i++) {
            rolls[i] = new Counter(i + "'s");
        }
        for (int i = 0; i < T; i++) {
            int res = StdRandom.uniform(1,SIDES+1);
            rolls[res].increment();
        }
        for (int i = 1; i <= SIDES; i++) {
            System.out.println(rolls[i]);
        }
    }

}
