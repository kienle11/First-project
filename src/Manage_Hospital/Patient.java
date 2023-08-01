package Manage_Hospital;

import java.time.LocalDate;

public class Patient extends Person{
    private String note ;
    private LocalDate dayMoveIn;


    public Patient(String name, int age, String note, LocalDate dayMoveIn) {
        super(name, age, auId);
        this.note = note;
        this.dayMoveIn = dayMoveIn;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "note=" + note +
                ", dayMoveIn=" + dayMoveIn +
                ", name='" + name + '\'' +
                ", age=" + age +
                " id"+ auId+
                '}';
    }
}
