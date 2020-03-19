package com.adarsh.mykids.Retro.Model;

import java.util.List;

public class ViewChildModel {

    /**
     * status : success
     * Vaccination_Details : [{"parent_id":"7","child_id":"6","child_name":"hj","dob":"3/3/2020","gender":"Girl","age":"1","birth":"04-03-20","six_week":"15-04-20","ten_week":"13-05-20","fourteen_week":"10-06-20","six_month":"03-09-20","nine_month":"03-12-20","twelve_month":"04-03-21","fifteen_month":"04-06-21","eighteen_month":"03-09-21","two_year":"04-03-22","four_year":"03-03-24","five_year":"04-03-25","eight_year":"03-03-28","ten_year":"04-03-30"}]
     */

    private String status;
    private List<VaccinationDetailsBean> Vaccination_Details;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<VaccinationDetailsBean> getVaccination_Details() {
        return Vaccination_Details;
    }

    public void setVaccination_Details(List<VaccinationDetailsBean> Vaccination_Details) {
        this.Vaccination_Details = Vaccination_Details;
    }

    public static class VaccinationDetailsBean {
        /**
         * parent_id : 7
         * child_id : 6
         * child_name : hj
         * dob : 3/3/2020
         * gender : Girl
         * age : 1
         * birth : 04-03-20
         * six_week : 15-04-20
         * ten_week : 13-05-20
         * fourteen_week : 10-06-20
         * six_month : 03-09-20
         * nine_month : 03-12-20
         * twelve_month : 04-03-21
         * fifteen_month : 04-06-21
         * eighteen_month : 03-09-21
         * two_year : 04-03-22
         * four_year : 03-03-24
         * five_year : 04-03-25
         * eight_year : 03-03-28
         * ten_year : 04-03-30
         */

        private String parent_id;
        private String child_id;
        private String child_name;
        private String dob;
        private String gender;
        private String age;
        private String birth;
        private String six_week;
        private String ten_week;
        private String fourteen_week;
        private String six_month;
        private String nine_month;
        private String twelve_month;
        private String fifteen_month;
        private String eighteen_month;
        private String two_year;
        private String four_year;
        private String five_year;
        private String eight_year;
        private String ten_year;

        public String getParent_id() {
            return parent_id;
        }

        public void setParent_id(String parent_id) {
            this.parent_id = parent_id;
        }

        public String getChild_id() {
            return child_id;
        }

        public void setChild_id(String child_id) {
            this.child_id = child_id;
        }

        public String getChild_name() {
            return child_name;
        }

        public void setChild_name(String child_name) {
            this.child_name = child_name;
        }

        public String getDob() {
            return dob;
        }

        public void setDob(String dob) {
            this.dob = dob;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getBirth() {
            return birth;
        }

        public void setBirth(String birth) {
            this.birth = birth;
        }

        public String getSix_week() {
            return six_week;
        }

        public void setSix_week(String six_week) {
            this.six_week = six_week;
        }

        public String getTen_week() {
            return ten_week;
        }

        public void setTen_week(String ten_week) {
            this.ten_week = ten_week;
        }

        public String getFourteen_week() {
            return fourteen_week;
        }

        public void setFourteen_week(String fourteen_week) {
            this.fourteen_week = fourteen_week;
        }

        public String getSix_month() {
            return six_month;
        }

        public void setSix_month(String six_month) {
            this.six_month = six_month;
        }

        public String getNine_month() {
            return nine_month;
        }

        public void setNine_month(String nine_month) {
            this.nine_month = nine_month;
        }

        public String getTwelve_month() {
            return twelve_month;
        }

        public void setTwelve_month(String twelve_month) {
            this.twelve_month = twelve_month;
        }

        public String getFifteen_month() {
            return fifteen_month;
        }

        public void setFifteen_month(String fifteen_month) {
            this.fifteen_month = fifteen_month;
        }

        public String getEighteen_month() {
            return eighteen_month;
        }

        public void setEighteen_month(String eighteen_month) {
            this.eighteen_month = eighteen_month;
        }

        public String getTwo_year() {
            return two_year;
        }

        public void setTwo_year(String two_year) {
            this.two_year = two_year;
        }

        public String getFour_year() {
            return four_year;
        }

        public void setFour_year(String four_year) {
            this.four_year = four_year;
        }

        public String getFive_year() {
            return five_year;
        }

        public void setFive_year(String five_year) {
            this.five_year = five_year;
        }

        public String getEight_year() {
            return eight_year;
        }

        public void setEight_year(String eight_year) {
            this.eight_year = eight_year;
        }

        public String getTen_year() {
            return ten_year;
        }

        public void setTen_year(String ten_year) {
            this.ten_year = ten_year;
        }
    }
}
