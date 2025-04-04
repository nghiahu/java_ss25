package baitap.Bai2;

public class AnimalFactory {
    public static Animal getAnimal(String type) {
        if (type.equalsIgnoreCase("CAT")) {
            return new Cat();
        }else if(type.equalsIgnoreCase("DOG")){
            return new Dog();
        }
        return null;
    }
}
