package salar.webhuskeapp.Controller;

import salar.webhuskeapp.Controller.Entity.Person;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.*;

public class AppStart implements ServletContextListener {
    private static Map<String, Person> personMap;
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //ServletContextListener.super.contextInitialized(sce);

        List<Person> personList = new ArrayList<>();
        Person person = new Person("Salar", "1234", "bamse, is, pude");
        Person person1 = new Person("Klaes", "1234", "kniv, gaffel, grill");
        Person person2 = new Person("Jytte", "1234", "øl, pløkker, telt");
        Person person3 = new Person("Anna", "1234", "vodka, pistol, ost");
        personList.add(person);
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        personMap = new TreeMap<>();

        for (Person element : personList) {
            personMap.put(element.getNavn(), element);

        }

        //sce.getServletContext().setAttribute("personer", personMap);


    }

    public static Map<String, Person> getPersonMap() {
        return personMap;
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContextListener.super.contextDestroyed(sce);
    }
}
