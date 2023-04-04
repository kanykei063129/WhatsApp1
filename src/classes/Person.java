package classes;

import enums.Countri;
import enums.Gender;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private Countri countri;
    private Gender gender;

    public Person(int id, String firstName, String lastName, String dateOfBirth, Countri countri, Gender gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.countri = countri;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Countri getCountri() {
        return countri;
    }

    public void setCountri(Countri countri) {
        this.countri = countri;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "\n<<<<<<<< PERSON PASPORT >>>>>>>>" +
                "\nID : " + id +
                "\nFIRST NAME : " + firstName +
                "\nLAST NAME : " + lastName +
                "\nDATE OF BIRTH : " + dateOfBirth +
                "\nCOUNTRI : " + countri +
                "\nGENDER : " + gender +
                "\n*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*";

    }
}
