import java.util.Random;

public class TestScores {

    private int test1Scores[];
    private Random randomScore;

    public TestScores() {
        test1Scores = new int[10];
        randomScore = new Random();
        for (int i = 0; i < 10; i++) {
            test1Scores[i] = randomScore.nextInt(50) + 50;
        }
    }

    public String toString() {
        String output = "(";
        for (int i = 0; i < 10; i++) {
            output += test1Scores[i] + ", ";
        }
        return output + ")";
    }

    public static void main(String[] args) {
        TestScores t = new TestScores();
        System.out.println(t);
    }
};