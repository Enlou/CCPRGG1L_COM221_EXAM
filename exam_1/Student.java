public class student {
    // Attributes
    String Surname;
    String FirstName;
    String MiddleInitial;
    String DateOfBirth;
    int StudentNumber;
    String StudentEmailAddress;
    Boolean IAmAwesome;
    
    // Method
    public void SayMyStudentNumber() {
        System.out.println("Hello! my Student Number is " + StudentNumber + ".");
    }

    // Method
    public void SayMyEmailAddress() {
        System.out.println("My Student Email Address is " + StudentEmailAddress + ".");
    }

    // Method
    public void AmIAwesome() { 
        if (IAmAwesome) {
            System.out.println("Erik is very awesome!");
        }   else {
            System.out.println("Erik is not awesome at all.");}
        }

    // Constructor
    public student(String Sname, String Fname, String MI, String Bday, int Snum, String SEmAd, Boolean Awesome) {
        Surname = Sname;
        FirstName = Fname;
        MiddleInitial = MI;
        DateOfBirth = Bday;
        StudentNumber = Snum;
        StudentEmailAddress = SEmAd;
        IAmAwesome = Awesome;
    }
}
