public class Exemple_11_1_ArrayNotes {
    public static void main(String[] args) {

        float[] scores = {7.5f, 5.0f, 8.5f, 6.0f, 4.0f};
        float sumClassScore = 0f;

        for (int i = 0; i < scores.length; i++) {
            sumClassScore = sumClassScore + scores[i];
        }

        System.out.println("Media clase: " + sumClassScore/scores.length);
    }
}
