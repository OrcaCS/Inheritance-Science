/**
 * SeniorPhys class, extends JuniorScience. Grade calculator for physics course.
 * 
 * @author Stephanie Hu
 * @version 0.03 - April 2025
 */
public class SeniorPhys extends JuniorScience {
    /** Grade in biology. */
    protected int bioGrade;

    /** Predicted difference between junior science physics unit grade and physics course. */
    protected int predictionDifference = 0;

    /** Constructor for perfect grades. */
    protected SeniorPhys() {
        super(100); // default science grade is 100
        this.bioGrade = 100;
    }

    /** Constructor for chosen junior science grade and default 100 for physics grade. */
    public SeniorPhys(int grade) {
        super(grade);
        this.bioGrade = 100;
    }

    /** Gets physics grade. */
    protected int getPhysGrade() {
        return bioGrade;
    }

    /** Gets prediction difference. */
    protected int getPrediction() {
        return predictionDifference;
    }

    /** Sets physics grade. */
    protected void setPhysGrade(int bioGrade) {
        this.bioGrade = bioGrade;
    }

    /** Sets prediction difference. */
    protected void setPrediction(int predictionDifference) {
        this.predictionDifference = predictionDifference;
    }

    /** Predicts physics course grade using physics midterm marks. */
    protected int predictedPhysGradeMidterm() { // projected/predicted phys grade from midterm
        return this.bioGrade + this.predictionDifference;
    }

    /** Predicts physics course grade using junior science physics unit grade. */
    protected double predictedPhysGrade() { // projected/predicted phys grade from junior science
        double weightedPhysGrade = super.calculateWeightedPhysGrade(grade, weightPercentPhys);
        double actualPhysGrade = super.calculateActualPhysGrade(weightedPhysGrade, weightPercentPhys);
        return actualPhysGrade + predictionDifference;
    }
}
