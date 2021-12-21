package Zoo;

public abstract class Animal {
    private int age;
    private Gender gender;
    private String[] eats;
    private Health health;
    private int lifeExpectancy;

    public int getAge() {
        return age;

    }

    public Gender getGender() {
        return gender;
    }

    public Health getHealth() {
        return health;
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
    public abstract  void  treat();
    public abstract boolean aMonthPasses();
}
