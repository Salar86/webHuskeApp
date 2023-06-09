package salar.webhuskeapp.Model;

import salar.webhuskeapp.Controller.Entity.Person;

import java.util.Map;

public class Facade {
    public static Map<String, Person> getAllPersons() {
       return PersonMapper.getAllPersons();
    }

    public static Person getPerson(String navn) {
        return PersonMapper.getPerson(navn);
    }
}
