package basic.training;

import java.util.Date;

class TrainingDatabase {
    private String membershipNumber;
    private String name;
    private String addressNumber;
    private String address;
    private String gender;

    public TrainingDatabase(String membershipNumber, String name, String addressNumber, String address, String gender) {
        this.membershipNumber = membershipNumber;
        this.name = name;
        this.addressNumber = addressNumber;
        this.address = address;
        this.gender = gender;
    }

    public String getMembershipNumber() {
        return membershipNumber;
    }

    public void setMembershipNumber(String membershipNumber) {
        this.membershipNumber = membershipNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(String addressNumber) {
        this.addressNumber = addressNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "TrainingDatabase{" +
                "membershipNumber=" + membershipNumber +
                ", name='" + name + '\'' +
                ", addressNumber='" + addressNumber + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
