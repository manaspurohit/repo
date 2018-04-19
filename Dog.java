class Dog {
    String name;
    int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Dog() {
        this.name = "poop";
    }

    int addNumToAge(int num) {
        return age + num;
    }
}
