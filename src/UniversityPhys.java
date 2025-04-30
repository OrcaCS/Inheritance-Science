/**
 * UniversityPhys class, extends SeniorPhys. Grade calculator and general minimum high school grades for university physics.
 * 
 * @author Stephanie Hu
 * @version 0.04 - April 2025
 */
public class UniversityPhys extends SeniorPhys {

    /** Constructor for perfect grades. */
    protected UniversityPhys() {
        super();
    }

    /** Prints pass or fail for senior physics (SPH4U) and university physics eligibility. */
    protected void universityPhysicsEligibility() {
        if (physGrade >= 50) {
            System.out.println("You passed SPH4U. Please check the other course requirements for your university of choice.");
        } else {
            System.out.println("Your failed SPH4U. You are not eligible to take university physics.");
        }
    }

    /** Prints requirements for University of Toronto. */
    protected void uOfTRequirements() {
        System.out.println("Minimum Grade 12 English: 70%");
        System.out.println("Minimum Grade 12 average: 75%");
    }

    /** Prints requirements for University of Toronto physics program. */
    protected void uOfTPhysicsRequirements() {
        System.out.println("Six U/M courses, including:\nAdvanced Functions (MHF4U),\nCalculus & Vectors (MCV4U),\nEnglish (ENG4U), Physics (SPH4U)");
    }

    /** Prints requirements for University of Waterloo physics program. */
    protected void uWaterlooPhysicsRequirements() {
        System.out.println("Six U/M courses, including:\nEnglish (ENG4U), minimum 70%;\nAdvanced Functions, minimum 70%;\nCalculus & Vectors, minimum 70%;\nTwo of Biology, Chemistry, Earth and Space Science, Mathematics of Data Management, or Physics");
    }
}
