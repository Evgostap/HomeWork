package geekbrains.homework_5;

public class Main {

    static persArray[] person = new persArray[5];

    public static void main(String[] args) {

  /*  Worker worker1 = new Worker("John", "Director", "john@mail.ru", 25555, 25000, 30);
    worker1.printInfo(); */

    person[0] = new persArray("John", "Manager", "john@mail.ru", 25555, 24000, 26);
    person[1] = new persArray("Ivan", "Manager", "ivan@mail.ru", 40000, 28000, 31);
    person[2] = new persArray("Denis", "Manager", "denis@mail.ru", 35050, 27000, 33);
    person[3] = new persArray("Slava", "Manager", "slava@mail.ru", 18189, 26000, 29);
    person[4] = new persArray("Elisey", "Manager", "elisey@mail.ru", 77777, 24000, 25);

    for (int i = 0; i < 5; i++){
        if(person[i].age > 27){
            System.out.println(person[i]);
        }
       }
    }
}
