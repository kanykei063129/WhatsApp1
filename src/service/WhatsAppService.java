package service;

import classes.Person;
import classes.WhatsappUser;

import java.util.List;

public interface WhatsAppService {
    String greateWhatsappAccount( WhatsappUser whatsappUsers,List<Person>people);
    List<WhatsappUser>getWhatsappUser();
    WhatsappUser getProfil(String pasword,List<WhatsappUser>whatsappUsers);
    String getMAssege(String password,String name,String massege,List<WhatsappUser>users,List<WhatsappUser>users2);
    void allStatus();
    List<WhatsappUser> yourProfile();


    String changeStatus();
  //  String changeImage();
    String addContact();
    void delete_WhatsApp();
}
