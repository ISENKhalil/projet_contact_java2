package Controler;

import bdd.Entities.Contact;
import org.junit.Test;

import java.io.File;
import java.time.LocalDate;

import static org.junit.Assert.*;

public class vcardTest {

    @Test
    public void generate() {
        Contact contact = new Contact(1, "SNOW", "John", "le batard", "0105112233", null, LocalDate.of(1852, 10, 3), null, null,"Winterfell appartement 240, Westeros");
        vcard vcardJo = new vcard(contact);
        vcardJo.generate();
        File file = new File("vcard/" + contact.getFirstname() + "_" + contact.getLastname() + ".vcf");
        assertTrue(file.exists());
    }

    @Test
    public void importation() {
    }
}