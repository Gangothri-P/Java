
class University {

    String universityName = "ABC University";

    // Static nested class
    static class Department {
        String departmentName;

        Department(String departmentName) {
            this.departmentName = departmentName;
        }

        void displayDepartment() {
            System.out.println("Department: " + departmentName);
        }
    }

    // Non-static inner class
    class Faculty {
        String facultyName;
        String designation;

        Faculty(String facultyName, String designation) {
            this.facultyName = facultyName;
            this.designation = designation;
        }

        void displayFaculty() {
            System.out.println("Faculty Name: " + facultyName);
            System.out.println("Designation: " + designation);
            System.out.println("University: " + universityName);
        }
    }

    // Outer class method
    void displayUniversity() {
        System.out.println("University Name: " + universityName);
    }

    public static void main(String[] args) {

        // Creating University object
        University university = new University();

        // Creating static nested class object
        Department department =
            new University.Department("Computer Science");

        // Creating non-static inner class object
        Faculty faculty =
            university.new Faculty("Ananya", "Professor");

        // Displaying details
        university.displayUniversity();
        department.displayDepartment();
        faculty.displayFaculty();
    }
}
