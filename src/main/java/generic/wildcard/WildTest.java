package generic.wildcard;

import generic.wildcard.child.Dog;
import generic.wildcard.child.SmallDog;
import generic.wildcard.parent.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liumf
 * @date 10:30 2022/4/7
 * @className WildTest
 * @description
 */
public class WildTest {


    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        List<Dog> dogs =new ArrayList<>();
        List<SmallDog> smallDogs = new ArrayList<>();

        // 正确
        showAnimal(dogs);
        // 正确
        showAnimal(animals);
        // 错误实例
        // showAnimal(smallDogs);

    }


    private static void showAnimal(List<? super Dog> list){

        for (Object o : list) {
            System.out.println(o);
        }

    }



    private static void printAnimal(List<? extends Dog> list){
        for (Dog dog : list) {
            System.out.println(dog);
        }
    }


}
