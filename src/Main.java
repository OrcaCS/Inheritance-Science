public class Main {
    public static void main(String[] args) throws Exception {
        SeniorBio sr = new SeniorBio(70);

        // sr.setWeightPercentBio(50);
        // sr.setPrediction(10);

        // System.out.println("\nPredicted: " + sr.predictedBioGrade());


        // System.out.println("\nexam grade needed: " + sr.examGradeNeeded(91, 30, 93));
        System.out.println("\nfinal grade: " + sr.finalGrade(100, 30, 98));
    }
}
