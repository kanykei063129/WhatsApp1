import classes.Person;
import classes.WhatsappUser;
import enums.Countri;
import enums.Gender;
import enums.WhatsappStatus;
import service.PersonService;
import service.impl.PersonServiceImpl;
import service.impl.WhatsappServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> peoples = new ArrayList<>();
        List<WhatsappUser> whatsappUsers = new ArrayList<>();
        PersonServiceImpl personService = new PersonServiceImpl();
        WhatsappServiceImpl whatsappService = new WhatsappServiceImpl();
        while (true) {
            System.out.println("""
            PRESS 1 CREATE PASSPORT
            PRESS 2 GET ALL PASPORT
            "PRESS 3 CREATE WHATSAPP ACCOUNT
            PRESS 4 GET ALL WHATSAPP ACCOUNT
            PRESS 5 GET WHATSAPP PROFIL
            PRESS 6 GET PERSON FIRST NAME
            PRESS 7 GET MASSEGE
            """);
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    System.out.print("ID : ");
                    int id = scanner.nextInt();
                    String n1 = scanner.nextLine();
                    System.out.print("FIRST NAME : ");
                    String firstName = scanner.nextLine();
                    System.out.print("LAST NAME : ");
                    String lastName = scanner.nextLine();
                    System.out.print("DATE OF BIRTH-(XXXX-XX-XX) : ");
                    String dateOfBirt = scanner.nextLine();
                    System.out.println(personService.greate(new Person(id, firstName, lastName, dateOfBirt, Countri.KYRGYZSTAN, Gender.FEMALE)));
                    break;
                case 2:
                    System.out.println(personService.getPerson());
                    break;
                case 3:
                    System.out.print("ID : ");
                    int id2 = scanner.nextInt();
                    String n11 = scanner.nextLine();
                    System.out.print("UZER NAME : ");
                    String whatsappName = scanner.nextLine();
                    System.out.print("PHONE NUMBER :1 ");
                    int phoneNumber = scanner.nextInt();
                    System.out.print("PASWORD : ");
                    String password = scanner.nextLine();
                    System.out.println(whatsappService.greateWhatsappAccount(new WhatsappUser(id2,
                            phoneNumber, whatsappName, WhatsappStatus.НЕ_МОГУ_ГОВОРИТЬ_ТОЛЬКО_WHATSAPP,password,"Default message",peoples)));
                    break;
                case 4:
                    System.out.println(whatsappService.getWhatsappUser());
                    break;
                case 5:
                    String nnn = scanner.nextLine();
                    System.out.print("PASSWORD : ");
                    String password2 = scanner.nextLine();
                    System.out.println(whatsappService.getProfil(password2, whatsappService.getWhatsappUser()));
                    break;
                case 6:
                    String nm = scanner.nextLine();
                    System.out.print("FIRST NAME : ");
                    String firstName2 = scanner.nextLine();
                    System.out.println(personService.getPersonFirsName(firstName2, personService.getPerson()));
                    break;
                case 7:
                    String nn5 = scanner.nextLine();
                    System.out.print("PASSWORD : ");
                    String password4 = scanner.nextLine();
                    System.out.print("UZER NAME : ");
                    String uz = scanner.nextLine();
                    System.out.print("MASSEGE : ");
                    String massege = scanner.nextLine();
                    System.out.println(whatsappService.getMAssege(password4, uz, massege, whatsappService.getWhatsappUser(), whatsappService.getWhatsappUser()));
            }
        }
    }
}