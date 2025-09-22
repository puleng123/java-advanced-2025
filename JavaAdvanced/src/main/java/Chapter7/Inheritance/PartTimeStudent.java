package Chapter7.Inheritance;

public class PartTimeStudent extends Student {

    private boolean isEmployed;

    public PartTimeStudent(String firstName, String lastName, String stNum, String major, boolean employed)
    {
        super(firstName,lastName,stNum,major);
        setEmployed(employed);
    }

    public boolean getIsEmployed() {
        return isEmployed;
    }

    public void setEmployed(boolean employed) {
        isEmployed = employed;
    }

    @Override
    public void displayDetails(){
        System.out.println("Student: " + getFirstname() + " " + getLastname() + " (" + getStNumber()+ ")");
        System.out.println("Major: " + getMajor() + "\n" + "Is Employed: " + getIsEmployed());
    }
}
