package Lesson11;

public class App {
    public static void main(String[] args) {
        Person myPerson = new Person.Builder()
                .withfirstName("Пафнутий")
                .withlastName("Чебышев")
                .withmiddleName("Львович")
                .withcountry("Российская империя")
                .withaddress("Акатово, Боровский уезд, Калужская губерния, Российская империя")
                .withphone("ABC-4567")
                .withAge(73)
                .withgender("м")
                .build();

        System.out.println(myPerson.toString());
    }
}
