package kallista;
public class Person {
    private String fullName;
    private int age;

    public Person(String fullName,int age){
        this.fullName=fullName;
        this.age=age;
    }

    @Override

    public String toString() {
        return "Person: " +'\n'
                + "ФИО = " + fullName
                + ", Возраст = " + age;
    }

}
