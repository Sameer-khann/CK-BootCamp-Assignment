class Student {
    String name;
    int Sub_1_marks;
    int Sub_2_marks;
    int Sub_3_marks;

    Student(String name, int Sub_1_marks, int Sub_2_marks, int Sub_3_marks) {
        this.name = name;
        this.Sub_1_marks = Sub_1_marks;
        this.Sub_2_marks = Sub_2_marks;
        this.Sub_3_marks = Sub_3_marks;
    }

    public void total() {
        int total = Sub_1_marks + Sub_2_marks + Sub_3_marks;
        System.out.println("Total marks : " + total);
    }

    public void avg() {
        System.out.println("Average marks : " + (Sub_1_marks + Sub_2_marks + Sub_3_marks) / 3);
    }
}

public class Task3 {
    public static void main(String[] args) {
        Student obj1 = new Student("Samir", 78, 79, 81);
        obj1.total();
        obj1.avg();
    }
}

class BankAccount {
    String accountNumber;
    String holderName;
    int balance;

    BankAccount(String accountNumber, String holderName, int balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
}
