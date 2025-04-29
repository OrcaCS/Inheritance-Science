/**
 * SeniorChem class, extends JuniorScience. Grade calculator for chemistry course.
 * 
 * @author Stephanie Hu
 * @version 0.03 - April 2025
 */
public class SeniorChem extends JuniorScience {
    /** Grade in chemistry. */
    protected int chemGrade;

    /** Predicted difference between junior science chemistry unit grade and chemistry course. */
    protected int predictionDifference = 0;

    /** Constructor for perfect grades. */
    protected SeniorChem() {
        super(100); // default science grade is 100
        this.chemGrade = 100;
    }

    /** Constructor for chosen junior science grade and default 100 for chemistry grade. */
    public SeniorChem(int grade) {
        super(grade);
        this.chemGrade = 100;
    }

    /** Gets chemistry grade. */
    protected int getChemGrade() {
        return chemGrade;
    }

    /** Gets prediction difference. */
    protected int getPrediction() {
        return predictionDifference;
    }

    /** Sets chemistry grade. */
    protected void setChemGrade(int chemGrade) {
        this.chemGrade = chemGrade;
    }

    /** Sets prediction difference. */
    protected void setPrediction(int predictionDifference) {
        this.predictionDifference = predictionDifference;
    }

    /** Predicts chemistry course grade using chemistry midterm marks. */
    protected int predictedChemGradeMidterm() { // projected/predicted chem grade from midterm
        return this.chemGrade + this.predictionDifference;
    }

    /** Predicts chemistry course grade using junior science chemistry unit grade. */
    protected double predictedChemGrade() { // projected/predicted chem grade from junior science
        double actualChemGrade = super.calculateActualChemGrade();
        return actualChemGrade + predictionDifference;
    }

    /** Calculates the chemistry exam grade required for a final grade goal. */
    protected double examGradeNeeded(int chemGrade, double examWeightPercent, int finalGoal) {
        double classWeightPercent = 100 - examWeightPercent;
        double weightedChemGrade = chemGrade * (classWeightPercent / 100);
        return (finalGoal - weightedChemGrade) / (examWeightPercent / 100);
    }

    /** Calculates the final chemistry grade using the grade before exam and hypothetical exam grade. */
    protected double finalGrade(int chemGrade, double examWeightPercent, double examGrade) {
        double classWeightPercent = 100 - examWeightPercent;
        double weightedChemGrade = chemGrade * (classWeightPercent / 100);
        double weightedExamGrade = examGrade * (examWeightPercent / 100);
        return weightedChemGrade + weightedExamGrade;
    }
}