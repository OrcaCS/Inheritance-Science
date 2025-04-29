/**
 * SeniorBio class, extends JuniorScience. Grade calculator for biology course.
 * 
 * @author Stephanie Hu
 * @version 0.03 - April 2025
 */
public class SeniorBio extends JuniorScience {
    /** Grade in biology. */
    protected int bioGrade;

    /** Predicted difference between junior biology grade and biology course. */
    protected int predictionDifference = 0;

    /** Default constructor. */
    protected SeniorBio() {
        super(100); // default science grade is 100
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
        double weightedBioGrade = super.calculateWeightedBioGrade(grade, weightPercentBio);
        double actualBioGrade = super.calculateActualBioGrade(weightedBioGrade, weightPercentBio);
        return actualBioGrade + predictionDifference;
    }
}
