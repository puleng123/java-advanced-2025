package Chapter7.Inheritance;

import Chapter7.Student;

public class StudentRunner {
    public static void main(String[] args) {
        Chapter7.Student st = new Student("123456","Kelvin","Smith","Python");
        st.displayDetails();

        PartTimeStudent objSt = new PartTimeStudent("Caroline","Peters", "2222333","Java",true);
        objSt.displayDetails();

    }
}
