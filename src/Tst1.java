import java.util.ArrayList;
        import java.util.List;

 public class Test{
 public static void main(String[]args) {
     List<Animal> List0fAnimal = new ArrayList<>();
     List0fAnimal.add(new Animal(1));
     List0fAnimal.add(new Animal(2));
     List<Dog> ListOfDogs = new ArrayList<>();
     ListOfDogs.add(new Dog());
     ListOfDogs.add(new Dog());
     test(List0fAnimal);
     test(ListOfDogs);
 }

 private static void test(List<?extends Animal> list){
 for (Animal animal : list){
 System.out.println(animal);
 animal.eat();
 }
 }
 }