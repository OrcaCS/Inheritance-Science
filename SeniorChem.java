/**
 * SeniorChem class, extends JuniorScience. Grade calculator for chemistry course.
 * 
 * @author Stephanie Hu
 * @version 0.03 - April 2025
 */
public class SeniorChem extends JuniorScience {
    /** Grade in chemistry. */
    protected int bioGrade;

    /** Predicted difference between junior science chemistry unit grade and chemistry course. */
    protected int predictionDifference = 0;

    /** Constructor for perfect grades. */
    protected SeniorChem() {
        super(100); // default science grade is 100
        this.bioGrade = 100;
    }

    /** Constructor for chosen junior science grade and default 100 for chemistry grade. */
    public SeniorChem(int grade) {
        super(grade);
        this.bioGrade = 100;
    }

    /** Gets chemistry grade. */
    protected int getChemGrade() {
        return bioGrade;
    }

    /** Gets prediction difference. */
    protected int getPrediction() {
        return predictionDifference;
    }

    /** Sets chemistry grade. */
    protected void setChemGrade(int bioGrade) {
        this.bioGrade = bioGrade;
    }

    /** Sets prediction difference. */
    protected void setPrediction(int predictionDifference) {
        this.predictionDifference = predictionDifference;
    }

    /** Predicts chemistry course grade using chemistry midterm marks. */
    protected int predictedChemGradeMidterm() { // projected/predicted chem grade from midterm
        return this.bioGrade + this.predictionDifference;
    }

    /** Predicts chemistry course grade using junior science chemistry unit grade. */
    protected double predictedChemGrade() { // projected/predicted chem grade from junior science
        double weightedChemGrade = super.calculateWeightedChemGrade(grade, weightPercentChem);
        double actualChemGrade = super.calculateActualChemGrade(weightedChemGrade, weightPercentChem);
        return actualChemGrade + predictionDifference;
    }
}
