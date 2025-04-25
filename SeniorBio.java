public class SeniorBio extends JuniorScience {
    protected int bioGrade;
    protected int predictionDifference = 0;

    protected SeniorBio() {
        super(100);
        this.bioGrade = 100;
    }

    public SeniorBio(int grade) {
        super(grade);
        this.bioGrade = 100;
    }

    protected int getBioGrade() {
        return bioGrade;
    }

    protected int getPrediction() {
        return predictionDifference;
    }

    protected void setBioGrade(int bioGrade) {
        this.bioGrade = bioGrade;
    }

    protected void setPrediction(int predictionDifference) {
        this.predictionDifference = predictionDifference;
    }

    protected int predictedBioGradeMidterm() { // projected/predicted bio grade from junior science
        return this.bioGrade + this.predictionDifference;
    }

    protected double predictedBioGrade() { // projected/predicted bio grade from junior science
        double weightedBioGrade = super.calculateWeightedBioGrade(this.grade, this.weightPercentBio);
        double actualBioGrade = super.calculateActualBioGrade(weightedBioGrade, this.weightPercentBio);
        return actualBioGrade + this.predictionDifference;
    }
}
