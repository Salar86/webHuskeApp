package salar.webhuskeapp.Controller.Entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {
    String navn;
    String kode;
    List<String> stringArrayList = new ArrayList<>();

    public Person(String navn, String kode, String s) {
        this.navn = navn;
        this.kode = kode;
        String [] strings = s.split(",");
        this.stringArrayList = new ArrayList<>(Arrays.asList(strings));
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public List<String> getStringArrayList() {
        return stringArrayList;
    }

    public void setStringArrayList(List<String> stringArrayList) {
        this.stringArrayList = stringArrayList;
    }
}
