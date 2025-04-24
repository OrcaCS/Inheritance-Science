public JuniorScience {
    protected int grade;
    protected String biology;
    protected String chemistry;
    protected String physics;
    protected int gradeBio;
    protected int gradeChem;
    protected int gradePhys;
    protected double weightPercentBio;
    protected double weightPercentChem;
    protected double weightPercentPhys;

    protected juniorScience(grade) {
        this.grade = grade;
    }

    protected int getGrade {
        return grade;
    }

    protected int setGrade {
        this.grade = grade;
    }

    protected calculateBioPercent(int grade, int gradeBio, double weightPercentBio) {
        // something about how much of one's science grade was carried by bio unit
        double weightDecimalBio = weightPercentBio / 100;
        return gradeBio * weightDecimalBio / grade * 100;
    }

    protected calculateBioGrade(int grade, double weightPercentBio) {
        // calculates weighted bio unit grade from overall grade and bio weight
        return grade * weightPercentBio / 100;
    }

    protected calculateChemPercent(int grade, int gradeChem, double weightPercentChem) {
        double weightDecimalChem = weightPercentChem / 100;
        return gradeChem * weightDecimalChem / grade * 100;
    }

    protected calculateChemGrade(int grade, double weightPercentChem) {
        return grade * weightPercentChem / 100;
    }

    protected calculatePhysPercent(int grade, int gradePhys, double weightPercentPhys) {
        double weightDecimalPhys = weightPercentPhys / 100;
        return gradePhys * weightDecimalPhys / grade * 100;
    }

    protected calculatePhysGrade(int grade, double weightPercentPhys) {
        return grade * weightPercentPhys / 100;
    }
}
