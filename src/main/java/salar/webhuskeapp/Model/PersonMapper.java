package salar.webhuskeapp.Model;

import salar.webhuskeapp.Controller.AppStart;
import salar.webhuskeapp.Controller.Entity.Person;

import java.util.Map;

public class PersonMapper {


    protected static Map<String, Person> getAllPersons() {
        return AppStart.getPersonMap();
    }
}
