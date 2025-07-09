public class test1 {

    public static void sayHello() {
        System.out.println("Hello from a static method! hehe");
    }

    public void sayHi() {
        System.out.println("Hi from a non-static method!");
    }

    public static void main(String[] args) {

        test1.sayHello();


        test1 greetObj = new test1();
        greetObj.sayHi();
    }
}