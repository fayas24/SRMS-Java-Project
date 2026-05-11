package project;

class Person {

    private String name;
    private int age;

    public Person() {
        name = "unassigned";
        age = 0;
    }

    //overloaing
    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }

    //setter and getter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age;
    }

}
