/**
 * SeniorBio class, extends JuniorScience. Grade calculator for biology course.
 * 
 * @author Stephanie Hu
 * @version 0.03 - April 2025
 */
public class SeniorBio extends JuniorScience {
    /** Grade in biology. */
    protected int bioGrade;

    /** Predicted difference between junior science biology unit grade and biology course. */
    protected int predictionDifference = 0;

    /** Constructor for perfect grades. */
    protected SeniorBio() {
        super(100); // default science grade is 100
        this.bioGrade = 100;
    }

    /** Constructor for chosen junior science grade and default 100 for biology grade. */
    public SeniorBio(int grade) {
        super(grade);
        this.bioGrade = 100;
    }

    /** Gets biology grade. */
    protected int getBioGrade() {
        return bioGrade;
    }

    /** Gets prediction difference. */
    protected int getPrediction() {
        return predictionDifference;
    }

    /** Sets biology grade. */
    protected void setBioGrade(int bioGrade) {
        this.bioGrade = bioGrade;
    }

    /** Sets prediction difference. */
    protected void setPrediction(int predictionDifference) {
        this.predictionDifference = predictionDifference;
    }

    /** Predicts biology course grade using biology midterm marks. */
    protected int predictedBioGradeMidterm() { // projected/predicted bio grade from midterm
        return this.bioGrade + this.predictionDifference;
    }

    /** Predicts biology course grade using junior science biology unit grade. */
    protected double predictedBioGrade() { // projected/predicted bio grade from junior science
        double actualBioGrade = super.calculateActualBioGrade();
        return actualBioGrade + predictionDifference;
    }

    /** Calculates the biology exam grade required for a final grade goal. */
    protected double examGradeNeeded(int bioGrade, double examWeightPercent, int finalGoal) {
        double classWeightPercent = 100 - examWeightPercent;
        double weightedBioGrade = bioGrade * (classWeightPercent / 100);
        return (finalGoal - weightedBioGrade) / (examWeightPercent / 100);
    }

    /** Calculates the final biology grade using the grade before exam and hypothetical exam grade. */
    protected double finalGrade(int bioGrade, double examWeightPercent, double examGrade) {
        double classWeightPercent = 100 - examWeightPercent;
        double weightedBioGrade = bioGrade * (classWeightPercent / 100);
        double weightedExamGrade = examGrade * (examWeightPercent / 100);
        return weightedBioGrade + weightedExamGrade;
    }
}