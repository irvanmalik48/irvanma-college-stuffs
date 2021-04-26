public class GettersAndReturnValues extends ClassesAndObjects {

  public static void main(String[] args) {
    Person person1 = new Person();
    person1.name = "Irvan Malik";
    person1.age = 17;
    person1.semester = 1;

    Person person2 = new Person();
    person2.name = "Annisa Mafiro";
    person2.age = 17;
    person2.semester = 1;

    int umm = person1.calculateNext();
    int ano = person2.calculateNext();

    person1.speak();
    person1.calculate();
    System.out.println(umm);
    person2.speak();
    person2.calculate();
    System.out.println(ano);
  }
}
