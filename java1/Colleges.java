class College {

    
    private String collegeName;
    private int totalStudents;

    
    public College(String collegeName, int totalStudents) {
        this.collegeName = collegeName;
        this.totalStudents = totalStudents;
    }

    
    public String getCollegeName() {
        return collegeName;
    }

    
    public int getTotalStudents() {
        return totalStudents;
    }
}


public class Colleges{
    public static void main(String[] args) {
        College college = new College("ABC Engineering College", 1500);

        System.out.println("College Name: " + college.getCollegeName());
        System.out.println("Total Students: " + college.getTotalStudents());
    }
}