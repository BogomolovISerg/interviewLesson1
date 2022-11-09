package Lesson11;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("firstName: " + firstName+"\n");
        stringBuilder.append("lastName: " + lastName+"\n");
        stringBuilder.append("middleName: " + middleName+"\n");
        stringBuilder.append("country: " + country+"\n");
        stringBuilder.append("address: " + address+"\n");
        stringBuilder.append("phone: " + phone+"\n");
        stringBuilder.append("age: " + age+"\n");
        stringBuilder.append("gender: " + gender+"\n");
        return stringBuilder.toString();
    }
    public static class Builder {
        private Person newPerson;

        public Builder() {
            newPerson = new Person();
        }

        public Builder withfirstName(String firstName){
            newPerson.firstName = firstName;
            return this;
        }

        public Builder withlastName(String lastName){
            newPerson.lastName = lastName;
            return this;
        }
        public Builder withmiddleName(String middleName){
            newPerson.middleName = middleName;
            return this;
        }
        public Builder withcountry(String country){
            newPerson.country = country;
            return this;
        }
        public Builder withaddress(String address){
            newPerson.address = address;
            return this;
        }
        public Builder withphone(String phone){
            newPerson.phone = phone;
            return this;
        }
        public Builder withAge(int age){
            newPerson.age = age;
            return this;
        }
        public Builder withgender(String gender){
            newPerson.gender = gender;
            return this;
        }
        public Person build(){
            return newPerson;
        }

    }
}
