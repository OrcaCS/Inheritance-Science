public class Main {
    public static void main(String[] args) throws Exception {
        SeniorBio sr = new SeniorBio(80);

        sr.setWeightPercentBio(33);
        sr.setPrediction(-20);

        System.out.println("Predicted: " + sr.predictedBioGrade());
    }
}
