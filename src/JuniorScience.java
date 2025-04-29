/**
* Grade calculator for junior science courses with biology, chemistry, and physics.
*
* @author Stephanie Hu
* @version 0.03 - April 2025
*/
public class JuniorScience {
    /** Grade in junior science course. */
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

    /** Gets weighted percentage for biology unit. */
    protected double getWeightPercentBio() {
        return weightPercentBio;
    }

    /** Gets weighted percentage for chemistry unit. */
    protected double getWeightPercentChem() {
        return weightPercentChem;
    }

    /** Gets weighted percentage for physics unit. */
    protected double getWeightPercentPhys() {
        return weightPercentPhys;
    }

    /** Gets weighted percentage for the biology unit in decimal form. */
    protected double getWeightDecimalBio() {
        return weightPercentBio / 100;
    }

    /** Gets weighted percentage for the chemistry unit in decimal form. */
    protected double getWeightDecimalChem() {
        return weightPercentChem / 100;
    }

    /** Gets weighted percentage for the physics unit in decimal form. */
    protected double getWeightDecimalPhys() {
        return weightPercentPhys / 100;
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
     * @param weightPercentBio This is the weight percentage for the biology unit out of science.
     */
    protected void setWeightPercentBio(double weightPercentBio) {
        this.weightPercentBio = weightPercentBio;
    }

    /** Sets chemistry unit weighted percentage.
     * 
     * @param weightPercentChem This is the weight percentage for the chemistry unit out of science.
     */
    protected void setWeightPercentChem(double weightPercentChem) {
        this.weightPercentChem = weightPercentChem;
    }

    /** Sets physics unit weighted percentage.
     * 
     * @param weightPercent This is the weight percentage for the physics unit out of science.
     */
    protected void setWeightPercentPhys(double weightPercentPhys) {
        this.weightPercentPhys = weightPercentPhys;
    }

    /** Calculates the percentage amount of biology grade in one's science grade.
     * 
     * @param grade This is the science grade.
     * @param gradeBio This is the grade out of 100 in the biology unit.
     * @param weightPercent This is the unit weight percentage.
     * @return This method returns the percentage of biology grade in one's science grade.
     */
    protected double calculateBioPercent() {
        return gradeBio * getWeightDecimalBio() / grade * 100;
    } // something about how much of one's science grade was carried by bio unit

    /** Calculates one's biology grade out of their science grade.
     * 
     * @param grade This is the science grade.
     * @param weightPercent This is the unit weight percentage.
     * @return This method returns the weighted biology unit grade out of the science grade.
     */
    protected double calculateWeightedBioGrade() {
        return grade * getWeightDecimalBio();
    } // calculates weighted bio unit grade from overall grade and bio weight

    /** Calculates one's biology grade out of 100 (the maximum).
     * 
     * @param weightedBioGrade This is the biology unit weighted grade.
     * @param weightPercent This is the unit weight percentage.
     * @return This method returns the biology unit grade out of 100.
     */
    protected double calculateActualBioGrade() {
        return calculateWeightedBioGrade() / getWeightDecimalBio();
    } // calculates bio grade out of 100 (out of bio unit)

    /** Calculates the percentage amount of chemistry grade in one's science grade.
     * 
     * @param grade This is the science grade.
     * @param gradeBio This is the grade out of 100 in the chemistry unit.
     * @param weightPercent This is the unit weight percentage.
     * @return This method returns the percentage of chemistry grade in one's science grade.
     */
    protected double calculateChemPercent() {
        return gradeChem * getWeightDecimalChem() / grade * 100;
    }

    /** Calculates one's chemistry grade out of their science grade.
     * 
     * @param grade This is the science grade.
     * @param weightPercent This is the unit weight percentage.
     * @return This method returns the weighted chemistry unit grade out of the science grade.
     */
    protected double calculateWeightedChemGrade() {
        return grade * getWeightDecimalChem();
    }

    /** Calculates one's chemistry grade out of 100 (the maximum).
     * 
     * @param weightedChemGrade This is the chemistry unit weighted grade.
     * @param weightPercent This is the unit weight percentage.
     * @return This method returns the chemistry unit grade out of 100.
     */
    protected double calculateActualChemGrade() {
        return calculateWeightedChemGrade() / getWeightDecimalChem();
    }

    /** Calculates the percentage amount of physics grade in one's science grade.
     * 
     * @param grade This is the science grade.
     * @param gradePhys This is the grade out of 100 in the physics unit.
     * @param weightPercent This is the unit weight percentage.
     * @return This method returns the percentage of physics grade in one's science grade.
     */
    protected double calculatePhysPercent() {
        return gradePhys * getWeightDecimalPhys() / grade * 100;
    }

    /** Calculates one's physics grade out of their science grade.
     * 
     * @param grade This is the science grade.
     * @param weightPercent This is the unit weight percentage.
     * @return This method returns the weighted physics unit grade out of the science grade.
     */
    protected double calculateWeightedPhysGrade() {
        return grade * getWeightDecimalPhys();
    }

    /** Calculates one's physics grade out of 100 (the maximum).
     * 
     * @param weightedPhysGrade This is the physics unit weighted grade.
     * @param weightPercent This is the unit weight percentage.
     * @return This method returns the physics unit grade out of 100.
     */
    protected double calculateActualPhysGrade() {
        return calculateWeightedPhysGrade() / getWeightDecimalPhys();
    }
}