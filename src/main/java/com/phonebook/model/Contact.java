package com.phonebook.model;

public class Contact {
    private String name;
    private String lastName;
    private String phone;
    private String email;
    private String address;
    private String desc;

//    public Contact(String name, String lastName, String phone, String email, String address, String desc) {
//        this.name = name;
//        this.lastName = lastName;
//        this.phone = phone;
//        this.email = email;
//        this.address = address;
//        this.desc = desc;
//    }

    public Contact setName(String name) {
        this.name = name;
        return this;
    }

    public Contact setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Contact setPhone(String phone) {
        this.phone = phone;
        return this;

    }

    public Contact setEmail(String email) {

        this.email = email;
        return this;
    }

    public Contact setAddress(String address) {
        this.address = address;
        return this;
    }

    public Contact setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
