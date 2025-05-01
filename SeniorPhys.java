/**
 * SeniorPhys class, extends JuniorScience. Grade calculator for physics course.
 * 
 * @author Stephanie Hu
 * @version 0.04 - April 2025
 */
public class SeniorPhys extends JuniorScience {
    /** Grade in physics. */
    protected int physGrade;

    /**
     * Predicted difference between junior science physics unit grade and physics
     * course.
     */
    protected int predictionDifference = 0;

    /** Constructor for perfect grades. */
    protected SeniorPhys() {
        super(100); // default science grade is 100
        this.physGrade = 100;
    }

    /**
     * Constructor for chosen junior science grade and default 100 for physics
     * grade.
     * 
     * @param grade This is the science grade.
     */
    public SeniorPhys(int grade) {
        super(grade);
        this.physGrade = 100;
    }

    /**
     * Constructor for chosen junior science grade and default 100 for physics
     * grade.
     * 
     * @param grade     This is the science grade.
     * @param physGrade This is the grade for physics.
     */
    public SeniorPhys(int grade, int physGrade) {
        super(grade);
        this.physGrade = physGrade;
    }

    /**
     * Gets physics grade.
     * 
     * @return This method returns the physics grade.
     */
    protected int getPhysGrade() {
        return physGrade;
    }

    /**
     * Gets prediction difference.
     * 
     * @return This method returns the predicted difference between junior
     *         science physics unit grade and physics course.
     */
    protected int getPrediction() {
        return predictionDifference;
    }

    /**
     * Sets physics grade.
     * 
     * @param physGrade This is the physics grade.
     */
    protected void setPhysGrade(int physGrade) {
        this.physGrade = physGrade;
    }

    /**
     * Sets prediction difference.
     * 
     * @param predictionDifference This is the predicted difference between junior
     *                             science physics unit grade and physics course.
     */
    protected void setPrediction(int predictionDifference) {
        this.predictionDifference = predictionDifference;
    }

    /**
     * Predicts physics course grade using physics midterm marks.
     * 
     * @return This is the predicted physics grade.
     */
    protected int predictedPhysGradeMidterm() { // projected/predicted phys grade from midterm
        return this.physGrade + this.predictionDifference;
    }

    /**
     * Predicts physics course grade using junior science physics unit grade.
     * 
     * @return This is the predicted physics grade.
     */
    protected double predictedPhysGrade() { // projected/predicted phys grade from junior science
        double actualPhysGrade = super.calculateActualPhysGrade();
        return actualPhysGrade + predictionDifference;
    }

    /**
     * Calculates the physics exam grade required for a final grade goal.
     * 
     * @param physGrade         This is the grade in physics.
     * @param examWeightPercent This is the weight of the exam in percent.
     * @param finalGoal         This is the user-inputted grade goal.
     * @return This method returns the exam grade needed to reach the grade goal.
     */
    protected double examGradeNeeded(int physGrade, double examWeightPercent, int finalGoal) {
        double classWeightPercent = 100 - examWeightPercent;
        double weightedPhysGrade = physGrade * (classWeightPercent / 100);
        return (finalGoal - weightedPhysGrade) / (examWeightPercent / 100);
    }

    /**
     * Calculates the final grade from grade before exam and theoretical exam grade.
     * 
     * @param physGrade         This is the grade in physics.
     * @param examWeightPercent This is the weight of the exam in percent.
     * @param examGrade         This is the exam grade.
     * @return This method returns the final grade.
     */
    protected double finalGrade(int physGrade, double examWeightPercent, double examGrade) {
        double classWeightPercent = 100 - examWeightPercent;
        double weightedPhysGrade = physGrade * (classWeightPercent / 100);
        double weightedExamGrade = examGrade * (examWeightPercent / 100);
        return weightedPhysGrade + weightedExamGrade;
    }
}
