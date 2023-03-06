package ss10_list.bai_tap.bai_tap_them_1.model;

public class Teacher extends Person{
    private String professional;
    public Teacher(){

    }
    public Teacher(int id, String name, String dateOfBirth, Boolean gender, String professional){
        super(id, name, dateOfBirth, gender);
        this.professional = professional;
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional;
    }
}
