package service.impl;

import classes.Person;
import classes.WhatsappUser;
import enums.WhatsappStatus;
import service.WhatsAppService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;

public class WhatsappServiceImpl implements WhatsAppService {
    List<WhatsappUser> whatsappUsers = new ArrayList<>();

    @Override
    public String greateWhatsappAccount(WhatsappUser whatsappUzer, List<Person> people) {
        if (whatsappUzer.getId() != 0) {
            this.whatsappUsers.add(whatsappUzer);
            return "УСПЕШНО!!!";
        } else {
            return "АКАУНТ НЕ СОЗДАН!!!";
        }


    }

    @Override
    public List<WhatsappUser> getWhatsappUser() {
        return this.whatsappUsers;
    }

    @Override
    public WhatsappUser getProfil(String pasword, List<WhatsappUser> whatsappUsers) {
        for (WhatsappUser whatsappUser : whatsappUsers) {
            if (whatsappUser.getPassword().equals(pasword)) {
                return whatsappUser;
            }
        }
        return null;
    }

    @Override
    public String getMAssege(String password, String name, String massege, List<WhatsappUser> users, List<WhatsappUser> users2) {
        for (WhatsappUser user : users) {
            for (WhatsappUser whatsappUser : users2) {
                if (user.getPassword().equals(password)) {
                    if (whatsappUser.getUzerName().equals(name)) {
                        ArrayList<String> mas = new ArrayList<>();
                        mas.add(massege);
                        whatsappUser.setMassege(mas);
                        return "СОБШЕННИЕ ОТПРАВЛЕННО!!";
                    }
                }
            }
        }
        return null;
    }

    @Override
    public void allStatus() {

    }

    @Override
    public List<WhatsappUser> yourProfile() {
        out.print("Write your password: ");
        String password = new Scanner(System.in).nextLine();
        for (WhatsappUser w : whatsappUsers) {
            if (w.getPassword().equals(password)) {
                return whatsappUsers;
            }
        }
        return null;
    }

    @Override
    public String changeStatus() {
        out.print("Write your whatsApp password: ");
        String password = new Scanner(System.in).next();
        for (WhatsappUser whatsApp : this.whatsappUsers) {
            if (whatsApp.getPassword().equals(password)) {
                out.println("Your current status is " + whatsApp.getWhatsappStatus());
                out.print("Write new status: ");
                WhatsappStatus status1 = WhatsappStatus.valueOf(new Scanner(System.in).next());
                whatsApp.getWhatsappStatus();
                return "Your profile is successfully changed!";
            }
        }
        return "No such whatsApp users!";

    }

//    @Override
//    public String changeImage() {
//        out.print("Write your whatsApp password: ");
//        String password = new Scanner(System.in).next();
//        for (WhatsappUser whatsappUser : this.whatsappUsers) {
//            if (whatsappUser.getPassword().equals(password)) {
//                out.println("Your current image is " + whatsappUser.getImage());
//                out.print("Write new image: ");
//                String status1 = new Scanner(System.in).nextLine();
//                whatsappUser.setImage(status1);
//                return "Your profile is successfully changed!";
//            }
//        }
//        return "No such whatsApp users!";

    @Override
    public String addContact() {
        out.print("Write the password: ");
        String password = new Scanner(System.in).next();
        out.print("Write the phone number: ");
        int phoneNumber = new Scanner(System.in).nextInt();
        for (WhatsappUser whatsappUser : whatsappUsers) {
            if (whatsappUser.getPassword().equals(password)) {
                for (WhatsappUser w : whatsappUsers) {
                    if (w.getPhoneNumber() == (phoneNumber)) {
                        w.getContacts().put(String.valueOf(w.getPhoneNumber()), w.getUzerName());
                        return "Person is successfully added!";
                    }
                }
            }
            return "Wrong password!";
        }
        return null;
    }

    @Override
    public void delete_WhatsApp() {
        Scanner scanner = new Scanner(System.in);
        out.println("Write the user name: ");
        for (WhatsappUser w : whatsappUsers) {
            String name = scanner.nextLine();
            if (w.getUzerName().equalsIgnoreCase(name)) {
                this.whatsappUsers.remove(w);
                out.println("WhatsApp has been deleted successfully!");
                break;
            } else {
                out.println("There is no such WhatsApp!!!");
            }
        }
    }
}
