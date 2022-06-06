public class Main {
    public static void main(String[] args) {

        Person[] person = new Person[4];
        person[0] = new Person ("Zhenya", 2, 3000, 100);
        person[1] = new Person ("Victor", 1, 3000, 150 );
        person[2] = new Person ("Lesha", 1, 1500, 75);
        person[3] = new Person("Vasya", 2, 4000, 125);
        Team team = new Team("Qwerty", person);

       Course course = new Course(1,4000,100);
       String result = course.doCourse(team);
       System.out.println(result);

    }
}