package com.adarsh.mykids.Retro.Model;

public class ParentLoginModel {

    /**
     * status : Success
     * User_data : {"id":"1","name":"Adarsh","email":"adarshnair.sics@gmail.com","phone":"8592945273","password":"123456"}
     */

    private String status;
    private UserDataBean User_data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UserDataBean getUser_data() {
        return User_data;
    }

    public void setUser_data(UserDataBean User_data) {
        this.User_data = User_data;
    }

    public static class UserDataBean {
        /**
         * id : 1
         * name : Adarsh
         * email : adarshnair.sics@gmail.com
         * phone : 8592945273
         * password : 123456
         */

        private String id;
        private String name;
        private String email;
        private String phone;
        private String password;

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

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}
