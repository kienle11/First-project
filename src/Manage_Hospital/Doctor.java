package Manage_Hospital;

public class Doctor extends Person{
    private String specialize;
    private double workOur;

    public Doctor(String name, int age, String specialize, double workOur) {
        super(name, age, auId);
        this.specialize = specialize;
        this.workOur = workOur;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "specialize='" + specialize + '\'' +
                ", workOur=" + workOur +
                ", name='" + name + '\'' +
                ", age=" + age +
                " id" + auId +
                '}';
    }
}
