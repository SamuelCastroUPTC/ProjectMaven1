package co.edu.uptc;

import co.edu.uptc.models.Person;
import co.edu.uptc.views.btnCenter;
import co.edu.uptc.views.frame;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        frame frame = new frame();
        btnCenter btnCenter = new btnCenter();
    }

}