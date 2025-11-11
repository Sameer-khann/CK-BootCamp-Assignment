public class StaticCounter {
    static int counter = 0;

    StaticCounter() {
        counter++;
        System.out.println(counter + " objects have been created.");
    }


    public static void main(String[] args) {
        StaticCounter obj1 = new StaticCounter();
        StaticCounter obj2 = new StaticCounter();

        MathUtils.max(10, 23);
        MathUtils.min(10, 23);
        MathUtils.average(10, 23);

        Car carObj1 = new Car("Suziki");
        Car carObj2 = new Car("Range ROver", 22500000);

    }

}

class MathUtils {
    public static void max(int n1, int n2) {
        System.out.println("Max value is " + (n1 > n2 ? n1 : n2));
    }

    public static void min(int n1, int n2) {
        System.out.println("Min value is " + (n1 > n2 ? n2 : n1));
    }

    public static void average(int n1, int n2) {
        System.out.println("Average : " + (n1 + n2) / 2);

    }
}

class Book {
    String title;
    String auther;
    int price;

    Book(String title, String auther, int price) {
        this.title = title;
        this.auther = auther;
        this.price = price;
    }
}

class Car {
    String modelname;
    int price;

    Car(String modelname) {
        this.modelname = modelname;
    }

    Car(String modelname, int price) {
        this.modelname = modelname;
        this.price = price;
    }
}


