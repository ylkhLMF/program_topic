package generic.wildcard.child;

import generic.wildcard.parent.Animal;

/**
 * @author liumf
 * @date 10:28 2022/4/7
 * @className Dog
 * @description 中间层
 */
public class Dog extends Animal {

    private String size;

    @Override
    public String toString() {
        return "Dog{" +
                "size='" + size + '\'' +
                "} " + super.toString();
    }

    public Dog(String animalName, Integer animalAge, String size) {
        super(animalName, animalAge);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
