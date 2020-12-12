package com.example.thecoffeehouse.Models;


    public class User {
        private String Name250;
        private String Password250;
        private String Phone250;

        public User() {
        }

        public User(String name250, String password250) {
            Name250 = name250;
            Password250 = password250;

        }

        public String getPhone() {
            return Phone250;
        }

        public void setPhone(String phone250) {
            Phone250 = phone250;
        }

        public String getName() {
            return Name250;
        }

        public void setName(String name250) {
            Name250 = name250;
        }

        public String getPassword() {
            return Password250;
        }

        public void setPassword(String password250) {
            Password250 = password250;
        }
    }

