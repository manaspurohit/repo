class Cat {
    int age;

    Cat(int age) {
        this.age = age;
    }

    Cat() {
        this.age = 6;
    }

    void birthday() {
        this.age = this.age + 1;
    }
}
