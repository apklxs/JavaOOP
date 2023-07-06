public class Cat extends Animal {

    public Cat(String color, String species, Integer legsCount) {
        super(color, species, legsCount);
        //TODO Auto-generated constructor stub
    }

private void FIndFood() {
        System.out.println("Cat found food ");
    }

public void FIndFood(int foodCount) {
        System.out.println("Cat found food, count = " + foodCount);
    }
}
