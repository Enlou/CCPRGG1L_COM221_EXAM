public class app {
    public static void main(String[] args) {

        // Creates a new object named "Me" from student class
        student Me = new student ("Wanawan", "Erik", "D", "12/22/2003", 2022103963, "wanawaned@students.national-u.edu.ph", false);
        // Calls the SayMyStudentNumber method
        Me.SayMyStudentNumber();
        // Calls the SayMyEmailAddress method
        Me.SayMyEmailAddress();
        // Calls the AmIAwesome method
        Me.AmIAwesome();
    }
}
