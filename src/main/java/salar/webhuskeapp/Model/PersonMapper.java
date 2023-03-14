package salar.webhuskeapp.Model;

import salar.webhuskeapp.Controller.AppStart;
import salar.webhuskeapp.Controller.Entity.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PersonMapper {

    private static Map<String, Person> personMap = AppStart.getPersonMap();


    protected static Map<String, Person> getAllPersons() {
        return personMap;
    }

    public static Person createPerson (Person person) {
        if (person == null) {
            return null;
        }
        List<String> stringList = new ArrayList<>(person.getStringArrayList());

        return new Person(person.getNavn(), person.getKode(), stringList);
    }

    public static Person getPerson(String navn) {

       return createPerson(personMap.getOrDefault(navn, null));
    }
}
