package generic.wildcard;

import generic.wildcard.child.Dog;
import generic.wildcard.child.SmallDog;
import generic.wildcard.parent.Animal;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author liumf
 * @date 15:18 2022/4/7
 * @className WildcardLowerBound
 * @description
 */
public class WildcardLowerBound {


    public static void main(String[] args) {
        // 体现下限的思想,此处可以使用只能是本身或者本身的父类类型
        // 此处则只能为Dog本身和其父类Animal
        TreeSet<Dog> dogs = new TreeSet<>(new DogCompare2());
        TreeSet<Dog> animals = new TreeSet<>(new AnimalCompare1());
         // 错误使用,程序报错
        // TreeSet<Dog> animals = new TreeSet<>(new SmallDogCompare3());
        dogs.add(new Dog("x1", 15, "8号"));
        dogs.add(new Dog("x3", 14, "3号"));
        dogs.add(new Dog("x5", 9, "4号"));
        dogs.add(new Dog("x4", 26, "5号"));

        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }

}

class AnimalCompare1 implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getAnimalName().compareTo(o2.getAnimalName());
    }
}

class DogCompare2 implements Comparator<Dog> {

    @Override
    public int compare(Dog o1, Dog o2) {
        return o1.getAnimalAge() - o2.getAnimalAge();
    }
}

class SmallDogCompare3 implements Comparator<SmallDog> {

    @Override
    public int compare(SmallDog o1, SmallDog o2) {
        return o1.getSize().compareTo(o2.getSize());
    }
}