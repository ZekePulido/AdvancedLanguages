public class class12 {
    public static class Student {
        protected String name;
        protected int year;

        public Student() {
            System.out.println("Call the parent class");
        }

        public String getStudent() {
            System.out.println("Call getStudent in the parent class");
            return "Name: " + name + ", Year: " + year;
        }
    }

    public static class HighSchool extends Student {
        public HighSchool(String _name, int _year) {
            super();
            System.out.println("Call the HighSchool constructor");
            name = _name;
            year = _year;
        }
    }

    public static class University extends Student {
        private String major;

        public University(String _name, int _year, String _major) {
            super();
            System.out.println("Call University constructor");
            name = _name;
            year = _year;
            major = _major;
        }

        public String getMajor() {
            return major;
        }
    }

    public static void main(String[] args) {
        String studentInfo;
        HighSchool h = new HighSchool("A", 13);
        University u = new University("B", 3, "Business");

        studentInfo = h.getStudent();
        System.out.println("Student info = " + studentInfo);
        studentInfo = u.getStudent();
        System.out.println("Student info = " + studentInfo + ", Major: " + u.getMajor());
    }
}
