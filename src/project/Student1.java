package project;

import java.util.*;

public class Student1 {
    // Define the Student class
    public static class Student {
        private String name;
        private int id;
        private List<Course> courses = new ArrayList<>();

        public Student(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public void addCourse(Course course) {
            courses.add(course);
            course.addStudent(this);
        }

        public void removeCourse(Course course) {
            courses.remove(course);
            course.removeStudent(this);
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public List<Course> getCourses() {
            return courses;
        }
    }

    // Define the Course class
    public static class Course {
        private String name;
        private String code;
        private List<Student> students = new ArrayList<>();
        private Map<Integer, Map<String, Grade>> grades = new HashMap<>();

        public Course(String name, String code) {
            this.name = name;
            this.code = code;
        }

        public void addStudent(Student student) {
            students.add(student);
            grades.put(student.getId(), new HashMap<>());
        }

        public void removeStudent(Student student) {
            students.remove(student);
            grades.remove(student.getId());
        }

        public void addGrade(Student student, String category, double score, double weight) {
            Map<String, Grade> studentGrades = grades.get(student.getId());
            studentGrades.put(category, new Grade(score, weight));
        }

        public double getGrade(Student student) {
            Map<String, Grade> studentGrades = grades.get(student.getId());
            double totalScore = 0.0;
            double totalWeight = 0.0;
            for (Grade grade : studentGrades.values()) {
                totalScore += grade.getScore() * grade.getWeight();
                totalWeight += grade.getWeight();
            }
            if (totalWeight == 0) {
                return 0.0;
            } else {
                return totalScore / totalWeight;
            }
        }

        public String getName() {
            return name;
        }

        public String getCode() {
            return code;
        }

        public List<Student> getStudents() {
            return students;
        }

        public Map<Integer, Map<String, Grade>> getGrades() {
            return grades;
        }
    }

    // Define the Grade class
    public static class Grade {
        private double score;
        private double weight;

        public Grade(double score, double weight) {
            this.score = score;
            this.weight = weight;
        }

        public double getScore() {
            return score;
        }

        public double getWeight() {
            return weight;
        }
    }

public class project_6 {

	public static void main(String[] args) {
		 // Create some students
		Scanner scan=new Scanner(System.in);
        Student alice = new Student("Alice", 1);
        Student bob = new Student("Bob", 2);
        Student charlie = new Student("Charlie", 3);

        // Create some courses
        Course math = new Course("Math", "MATH101");
        Course english = new Course("English", "ENG101");

        // Enroll students in courses
        alice.addCourse(math);
        alice.addCourse(english);
        bob.addCourse(math);
        charlie.addCourse(english);

        // Add grades for students in courses
        math.addGrade(alice, "Quiz", 80.0, 0.2);
        math.addGrade(bob, "Homework", 85.0, 0.5);
        math.addGrade(bob, "Quiz", 75.0, 0.2);
        english.addGrade(alice, "Essay", 85.0, 0.6);
        english.addGrade(charlie, "Essay", 90.0, 0.6);

        // Print out each student's grades for each course
        
        for (Student student : Arrays.asList(alice, bob, charlie)) {
            System.out.printf("%s (%d):\n", student.getName(), student.getId());
            for (Course course : student.getCourses()) {
                System.out.printf("  %s (%s):\n", course.getName(), course.getCode());
                Map<String, Grade> grades = course.getGrades().get(student.getId());
                for (Map.Entry<String, Grade> entry : grades.entrySet()) {
                    String category = entry.getKey();
                    Grade grade = entry.getValue();
                    System.out.printf("    %s: %.1f%% (%.1f%%)\n", category, grade.getScore(), grade.getWeight() * 100.0);
                }
                double overallGrade = course.getGrade(student);
                System.out.printf("    Overall grade: %.1f%%\n", overallGrade * 100.0);
            }
            System.out.println();
        }
    }
    }
	}


