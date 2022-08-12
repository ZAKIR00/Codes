public  abstract class Animal {
    private int age;
    private Gender gender;
    private String[] eats;
    private Health health;
    private int lifeExpectancy;

    public Animal(int age, Gender gender, String[] eats, Health health, int lifeExpectancy) {
        this.age = age;
        this.gender = gender;
        this.eats = eats;
        this.health = health;
        this.lifeExpectancy = lifeExpectancy;
    }


    public Gender getGender() {
        return gender;
    }

    public String[] getEats() {
        return eats;
    }


    public int getLifeExpectancy() {
        return lifeExpectancy;
    }

    public boolean canEat(String food) {

        for (String eatenFood : this.eats) {
            if (eatenFood.equalsIgnoreCase(food)) {
                return true;

            }
        }
        return false;
    }
public abstract void eat();
 public abstract void treat();
 public abstract boolean aMonthsPasses();

}


