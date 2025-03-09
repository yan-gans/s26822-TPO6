package pl.edu.pja.tpo6.s26822tpo6;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String last_name;
    private String b_date;
    private String address;
    private String university;
    private String country;
    private String gender;
    private String blood_type;
    private String job;
    private String mbti;
    private String phoneNumber;
    public Person(String name, String last_name, String b_date, String address, String university, String country,String gender,String blood_type,String job,String mbti,String phoneNumber) {
        this.name = name;
        this.last_name = last_name;
        this.b_date = b_date;
        this.address = address;
        this.university = university;
        this.country = country;
        this.gender=gender;
        this.blood_type=blood_type;
        this.job=job;
        this.mbti=mbti;
        this.phoneNumber=phoneNumber;
    }
    public List<String> getAttributes()
    {
        List<String> list=new ArrayList<>();
        if(this.name!=null)list.add(this.name);
        if(this.last_name!=null)list.add(this.last_name);
        if(this.b_date!=null)list.add(this.b_date);
        if(this.address!=null)list.add(this.address);
        if(this.university!=null)list.add(this.university);
        if(this.country!=null)list.add(this.country);
        if(this.gender!=null)list.add(this.gender);
        if(this.blood_type!=null)list.add(this.blood_type);
        if(this.job!=null)list.add(this.job);
        if(this.mbti!=null)list.add(this.mbti);
        if(this.phoneNumber!=null)list.add(this.phoneNumber);
        return list;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBlood_type() {
        return blood_type;
    }

    public void setBlood_type(String blood_type) {
        this.blood_type = blood_type;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getMbti() {
        return mbti;
    }

    public void setMbti(String mbti) {
        this.mbti = mbti;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getB_date() {
        return b_date;
    }

    public void setB_date(String b_date) {
        this.b_date = b_date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
