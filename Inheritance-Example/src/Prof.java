public class Prof extends Person{
    private String degree;

    public Prof(String name, String surname, int age, String degree){
        super(name, surname, age); //calls the parent constructor
        this.degree = degree;
    }
    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
