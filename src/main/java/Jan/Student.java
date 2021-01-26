package Jan;

public class Student {
    private String studentName="";

    private int studentId;

    private boolean isRegistered;

    public Student(String studentName, int studentId, boolean isRegistered) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.isRegistered = isRegistered;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public void setRegistered(boolean registered) {
        isRegistered = registered;
    }
}
