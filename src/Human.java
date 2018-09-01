public class Human {
    private String name;
    private boolean gender;
    private int age;
    Apple apple = new Apple();
    public Human(String name, boolean gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void say() {
        System.out.println("words");
    }

    public void eat() {
        apple.weight--;
        if (apple.weight == 0) {
            System.out.println("da a het");

        }
    }

    public void sleep() {
        System.out.println("zzzZZZ");
    }


}
