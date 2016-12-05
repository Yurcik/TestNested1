package com.brainacad.oop.test1;


import java.util.Arrays;

public class MyPhoneBook {




    public  void printPhoneBook(){
        for(PhoneNumber phoneNumber : contacts){
            System.out.println(phoneNumber);
        }
    }


    public PhoneNumber[] contacts;
    {
        contacts = new PhoneNumber[0];
    }


    public void addPhoneNumber(String name, String number){
        contacts = Arrays.copyOf(contacts, contacts.length + 1);
        contacts[contacts.length - 1] = new PhoneNumber(name, number);

    }




    private static  class PhoneNumber{

        private String name;
        private String phone;

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }



        public PhoneNumber(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        @Override
        public String toString() {
            return "PhoneNumber{" +
                    "name='" + name + '\'' +
                    ", phone='" + phone + '\'' +
                    '}';
        }

    }
}
