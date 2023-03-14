package salar.webhuskeapp.Controller.Entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {
    private String navn;
    private String kode;
    List<String> stringArrayList = new ArrayList<>();

    public Person(String navn, String kode, String s) {
        this.navn = navn;
        this.kode = kode;
        String [] strings = s.split(",");
        this.stringArrayList = new ArrayList<>(Arrays.asList(strings));
    }
    public Person(String navn, String kode, List<String> stringArrayList) {
        this.navn = navn;
        this.kode = kode;
        this.stringArrayList = new ArrayList<>(stringArrayList);
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
