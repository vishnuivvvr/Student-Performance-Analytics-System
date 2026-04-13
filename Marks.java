public class Marks {
    private int catMarks;
    private int assignmentMarks;
    private int fatMarks;
    private int totalMarks;

    // Constructor
    public Marks(int catMarks, int assignmentMarks, int fatMarks) {
        setCatMarks(catMarks);
        setAssignmentMarks(assignmentMarks);
        setFatMarks(fatMarks);
        calculateTotal();
    }

    // Setters with validation
    public void setCatMarks(int catMarks) {
        if (validateMarks(catMarks)) {
            this.catMarks = catMarks;
        } else {
            throw new IllegalArgumentException("Invalid CAT marks");
        }
    }

    public void setAssignmentMarks(int assignmentMarks) {
        if (validateMarks(assignmentMarks)) {
            this.assignmentMarks = assignmentMarks;
        } else {
            throw new IllegalArgumentException("Invalid Assignment marks");
        }
    }

    public void setFatMarks(int fatMarks) {
        if (validateMarks(fatMarks)) {
            this.fatMarks = fatMarks;
        } else {
            throw new IllegalArgumentException("Invalid FAT marks");
        }
    }

    // Calculation of total marks
    private void calculateTotal() {
        this.totalMarks = catMarks + assignmentMarks + fatMarks;
    }

    // Getter for total marks
    public int getTotalMarks() {
        return totalMarks;
    }

    // Validation method
    private boolean validateMarks(int marks) {
        return marks >= 0 && marks <= 100; // Assuming marks are out of 100
    }

    // Method to display marks
    public void displayMarks() {
        System.out.println("CAT Marks: " + catMarks);
        System.out.println("Assignment Marks: " + assignmentMarks);
        System.out.println("FAT Marks: " + fatMarks);
        System.out.println("Total Marks: " + totalMarks);
    }
}