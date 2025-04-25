/**
* Description of JuniorScience
*
* @author Stephanie Hu
* @version 0.02 - April 2025
*/
public class JuniorScience {
    /** Grade in junior science courses. */
    protected int grade;

    /** Grade out of 100 in biology unit. */
    protected int gradeBio;

    /** Grade out of 100 in chemistry unit. */
    protected int gradeChem;

    /** Grade out of 100 in physics unit. */
    protected int gradePhys;

    /** Biology unit weight percentage. */
    protected double weightPercentBio;

    /** Chemistry unit weight percentage. */
    protected double weightPercentChem;

    /** Physics unit weight percentage. */
    protected double weightPercentPhys;

    /** Biology unit weight in decimal. */
    double weightDecimalBio = weightPercentBio / 100;

    /** Chemistry unit weight in decimal. */
    double weightDecimalChem = weightPercentChem / 100;

    /** Physics unit weight in decimal. */
    double weightDecimalPhys = weightPercentPhys / 100;

    /** Constructor to input science grade.
     * 
     * @param grade This is the science grade.
     */
    protected JuniorScience(int grade) {
        this.grade = grade;
    }

    /** Gets grade. */
    protected int getGrade() {
        return grade;
    }

    /** Sets grade.
     * 
     * @param grade This is the science grade.
     */
    protected void setGrade(int grade) {
        this.grade = grade;
    }

    /** Sets biology unit weighted percentage.
     * 
     * @param weightPercentBio This is the biology unit weight percentage.
     */
    protected void setWeightPercentBio(double weightPercentBio) {
        this.weightPercentBio = weightPercentBio;
    }

    /** Gets biology unit weighted percentage. */
    protected double getWeightPercentBio() {
        return weightPercentBio;
    }

    /** Sets chemistry unit weighted percentage.
     * 
     * @param weightPercentChem This is the chemistry unit weight percentage.
     */
    protected void setWeightPercentChem(double weightPercentChem) {
        this.weightPercentChem = weightPercentChem;
    }

    /** Gets chemistry unit weighted percentage. */
    protected double getWeightPercentChem() {
        return weightPercentChem;
    }

    /** Sets physics unit weighted percentage.
     * 
     * @param weightPercentPhys This is the physics unit weight percentage.
     */
    protected void setWeightPercentPhys(double weightPercentPhys) {
        this.weightPercentPhys = weightPercentPhys;
    }

    /** Gets physics unit weighted percentage. */
    protected double getWeightPercentPhys() {
        return weightPercentPhys;
    }

    /** Calculates the percentage amount of biology grade in one's science grade.
     * 
     * @param grade This is the science grade.
     * @param gradeBio This is the grade out of 100 in biology unit.
     * @param weightPercentBio This is the biology unit weight percentage.
     * @return This method returns the percentage of biology grade in one's science grade.
     */
    protected double calculateBioPercent(int grade, int gradeBio, double weightPercentBio) {
        // something about how much of one's science grade was carried by bio unit
        return gradeBio * weightDecimalBio / grade * 100;
    }

    /** Calculates one's biology grade out of their science grade.
     * 
     * @param grade
     * @param weightPercentBio
     * @return
     */
    protected double calculateWeightedBioGrade(int grade, double weightPercentBio) {
        // calculates weighted bio unit grade from overall grade and bio weight
        return grade * weightPercentBio / 100;
    }

    /** Calculates one's biology grade out of 100 (the maximum).
     * 
     * @param weightedBioGrade
     * @param weightPercentBio
     * @return
     */
    protected double calculateActualBioGrade(double weightedBioGrade, double weightPercentBio) {
        // calculates bio grade out of 100 (out of bio unit)
        return weightedBioGrade / weightDecimalBio;
    }

    protected double calculateChemPercent(int grade, int gradeChem, double weightPercentChem) {
        return gradeChem * weightDecimalChem / grade * 100;
    }

    protected double calculateWeightedChemGrade(int grade, double weightPercentChem) {
        return grade * weightPercentChem / 100;
    }

    protected double calculateActualChemGrade(double weightedChemGrade, double weightPercentChem) {
        return weightedChemGrade / weightDecimalChem;
    }

    protected double calculatePhysPercent(int grade, int gradePhys, double weightPercentPhys) {
        return gradePhys * weightDecimalPhys / grade * 100;
    }

    protected double calculateWeightedPhysGrade(int grade, double weightPercentPhys) {
        return grade * weightPercentPhys / 100;
    }

    protected double calculateActualPhysGrade(double weightedPhysGrade, double weightPercentPhys) {
        return weightedPhysGrade / weightDecimalPhys;
    }
}
