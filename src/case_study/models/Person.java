package case_study.models;

import java.io.Serializable;

public abstract class Person implements Serializable {
    private String id;
    private String name;
    private String birth;
    private String sex;
    private String citizenID;
    private String phone;
    private String email;

    public Person() {
    }

    public Person(String id, String name, String birth, String sex, String citizenID, String phone, String email) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.sex = sex;
        this.citizenID = citizenID;
        this.phone = phone;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCitizenID() {
        return citizenID;
    }

    public void setCitizenID(String citizenID) {
        this.citizenID = citizenID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", sex='" + sex + '\'' +
                ", citizenID='" + citizenID + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' + ", ";
    }
}
