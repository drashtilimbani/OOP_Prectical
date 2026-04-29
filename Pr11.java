class College {
    String collegeName;

    // Constructor to initialize college name
    College(String collegeName) {
        this.collegeName = collegeName;
    }

    // Inner class
    class Admission {
        String studentName;
        String course;

        // Method to accept student details
        void acceptDetails(String studentName, String course) {
            this.studentName = studentName;
            this.course = course;
        }

        // Method to display student details
        void displayDetails() {
            System.out.println("College Name: " + collegeName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }
}

// Main class
public class pr11 {
    public static void main(String[] args) {

        // Create object of outer class
        College college = new College("ABC College");

        // Create object of inner class
        College.Admission admission = college.new Admission();

        // Accept and display details
        admission.acceptDetails("Rahul Sharma", "Computer Engineering");
        admission.displayDetails();
    }
}
