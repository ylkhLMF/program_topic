package generic.wildcard.parent;

/**
 * @author liumf
 * @date 10:28 2022/4/7
 * @className Animal
 * @description 顶层父类
 */
public class Animal {


    private String animalName;
    private Integer animalAge;

    public Animal(String animalName, Integer animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public Integer getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(Integer animalAge) {
        this.animalAge = animalAge;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", animalAge=" + animalAge +
                '}';
    }
}
