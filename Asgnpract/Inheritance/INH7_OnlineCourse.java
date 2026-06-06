package Asgnpract.Inheritance;

class Course {
    String courseName;
    int duration; // in hours

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void showCourseInfo() {
        System.out.println("Course Name : " + courseName);
        System.out.println("Duration    : " + duration + " hours");
    }
}

public class INH7_OnlineCourse extends Course {
    String platform;

    INH7_OnlineCourse(String courseName, int duration, String platform) {
        super(courseName, duration);
        this.platform = platform;
    }

    void showFullCourseInfo() {
        showCourseInfo();
        System.out.println("Platform    : " + platform);
    }

    public static void main(String[] args) {
        INH7_OnlineCourse oc = new INH7_OnlineCourse("Java Programming", 40, "Udemy");
        oc.showFullCourseInfo();
    }
}
