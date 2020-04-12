package ru.rickSanchez.company.foreach;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Sphynx", 4000);
        Animal dog = new Animal("Malamute", 3900);
        Animal bird = new Animal("Crow", 2000);

        Animal[] zoo = {cat, dog, bird};
        for(Animal tmp : zoo) {
            //tmp.price = tmp.price + 1000; //возможно изменение полей объекта
            tmp = new Animal("Lion", 200000); // нелязя поменять объекты в массиве
        }

        for(Animal tmp : zoo) {
            System.out.println(tmp.breed + " " + tmp.price);
        }
    }
}
