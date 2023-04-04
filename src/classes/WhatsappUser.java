package classes;

import enums.WhatsappStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WhatsappUser {
    private int id;
    private int phoneNumber;
    private String uzerName;
    private WhatsappStatus whatsappStatus;
    private String password;
    private ArrayList<String> massege;
    private List<Person> people;
    private Map<String, String> contacts;

    public WhatsappUser() {
    }

    public WhatsappUser(int id, int phoneNumber, String uzerName, WhatsappStatus whatsappStatus,  String password, ArrayList<String> massege, List<Person> people) {
        for (Person person : people) {
            if (person.getId() == id) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.uzerName = uzerName;
        this.whatsappStatus = whatsappStatus;
        this.password = password;
        this.massege = massege;
        this.people = people;
        this.contacts = contacts;
            } else {

            }
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUzerName() {
        return uzerName;
    }

    public void setUzerName(String uzerName) {
        this.uzerName = uzerName;
    }

    public WhatsappStatus getWhatsappStatus() {
        return whatsappStatus;
    }

    public void setWhatsappStatus(WhatsappStatus whatsappStatus) {
        this.whatsappStatus = whatsappStatus;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<String> getMassege() {
        return massege;
    }

    public void setMassege(ArrayList<String> massege) {
        this.massege = massege;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public Map<String, String> getContacts() {
        return contacts;
    }

    public void setContacts(Map<String, String> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "\n<<<<<<< WHATSAPP ACCOUNT >>>>>>>>" +
                "\nID : " + id +
                "\nPHONE NUMBER : " + phoneNumber +
                "\nUZER NAME : " + uzerName +
                "\nWHATSAPP STATUS : " + whatsappStatus +
                "\nPASWORD : " + password +
                "\nMASSEGE : " + massege;
    }
}
