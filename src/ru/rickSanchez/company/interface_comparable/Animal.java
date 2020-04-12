package ru.rickSanchez.company.interface_comparable;

public class Animal implements Comparable{
    String breed;
    int weight;
    int speed;
    int price;

    public Animal(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    public String toString() {
        return this.breed + " " + this.weight + " " + this.speed + " " + this.price;
    }

    @Override
    public int compareTo(Object o) {
        int tmp = this.speed - ((Animal)o).speed;

        if(tmp == 0){
            return this.price - ((Animal)o).price;
        } else {
            return tmp;
        }
    }
}
