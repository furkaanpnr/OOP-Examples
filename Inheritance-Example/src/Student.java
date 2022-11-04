public class Student extends Person{
    private int studentNum;
    public Student(String name, String surname, int age, int studentNum){
        super(name, surname, age); //calls the parent constructor
        this.studentNum = studentNum;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }
}
