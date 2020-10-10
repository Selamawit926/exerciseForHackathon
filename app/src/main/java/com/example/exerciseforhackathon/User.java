//package com.example.exerciseforhackathon;
//
//import android.os.Parcel;
//import android.os.Parcelable;
//
//import java.util.List;
//
//public class User implements Parcelable {
//
//    private String user_id;
//    private String userName;
//    private String age;
//    private String phone;
//    private String blood_type;
//    private List<Donation> donationList;
//
//    public User(String user_id, String userName, String age, String phone, String bloodType) {
//        this.user_id = user_id;
//        this.userName = userName;
//        this.age = age;
//        this.phone = phone;
//        this.blood_type = bloodType;
//    }
//
//    public User(){
//        getCurrentUser();
//    }
//
//    public User(Parcel in){
//        user_id = in.readString();
//        userName = in.readString();
//        age = in.readString();
//        phone = in.readString();
//        blood_type = in.readString();
//    }
//
//
//    public static final Creator<User> CREATOR = new Creator<User>() {
//        @Override
//        public User createFromParcel(Parcel in) {
//            return new User(in);
//        }
//
//        @Override
//        public User[] newArray(int size) {
//            return new User[size];
//        }
//    };
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getUser_id() {
//        return user_id;
//    }
//
//    public void setUser_id(String user_id) {
//        this.user_id = user_id;
//    }
//
//    public String getAge() {
//        return age;
//    }
//
//    public void setAge(String age) {
//        this.age = age;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public String getBlood_type() {
//        return blood_type;
//    }
//
//    public void setBlood_type(String blood_type) {
//        this.blood_type = blood_type;
//    }
//
//    public List<Donation> getDonationList() {
//        return donationList;
//    }
//
//    public void setDonationList(List<Donation> donationList) {
//        this.donationList = donationList;
//    }
//
//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    @Override
//    public void writeToParcel(Parcel parcel, int i) {
//        parcel.writeString(user_id);
//        parcel.writeString(userName);
//        parcel.writeString(age);
//        parcel.writeString(phone);
//        parcel.writeString(blood_type);
//
//    }
//
//    public User getCurrentUser(){
//        return new User("user-01", "abenezer", "20", "0946414257", "O+");
//    }
//
//}
