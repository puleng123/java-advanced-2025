package Chapter7.Inheritance;
public class Student {
    private String stNumber;
    private String firstname;
    private String lastname;
    private String major;

    public Student(){
        this.stNumber = "00000";
        this.firstname = "No name";
        this.lastname = "No lastname";
        this.major = "Nothing";
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getStNumber() {
        return stNumber;
    }

    public void setStNumber(String stNumber) {
        this.stNumber = stNumber;
    }

    public Student(String stNum, String firstname, String lastname, String major){
        setFirstname(firstname);
        setLastname(lastname);
        setMajor(major);
        setStNumber(stNum);
    }

    public void displayDetails(){
        System.out.println("Student: " + getFirstname() + " " + getLastname() + " (" + getStNumber()+ ")");
        System.out.println("Major: " + getMajor());
    }
}
 