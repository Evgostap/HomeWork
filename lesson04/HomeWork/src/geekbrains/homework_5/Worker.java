package geekbrains.homework_5;

public class Worker {

    private String name, position, mail;
    private int phone, salary, age;


    public Worker(String name, String position, String mail, int phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.mail = mail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void printInfo() {
        System.out.println("Меня зовут: " + name);
        System.out.println("Моя должность: " + position);
        System.out.println("Мой контактный mail: " + mail);
        System.out.println("Мой контактный телефон: " + phone);
        System.out.println("Моя зарплата: " + salary);
        System.out.println("Мне " + age + " лет");

    }
}
