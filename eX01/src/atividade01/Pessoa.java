package atividade01;

public class Pessoa {
    private String name;

    private String birthDate;

    private int age;

    public Pessoa (String namePerson) {
        this.name = namePerson;
    }

    public Pessoa (String namePerson, String birthDatePerson) {
        this.name = namePerson;
        this.birthDate = birthDatePerson;
    }

    public Pessoa (String namePerson, String birthDatePerson, int agePerson) {
        this.name = namePerson;
        this.birthDate = birthDatePerson;
        this.age = agePerson;
    }

    public String getName() {
        return this.name;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String namePerson) {
        this.name = namePerson;
    }

    public void setBirthDate(String birthDatePerson) {
        this.birthDate = birthDatePerson;
    }

    public void setAge(int agePerson) {
        this.age = agePerson;
    }

}
