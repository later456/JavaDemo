package cn.JavaLearningCode.day01.demo07;

public class NewPhone01 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();
        phone.send();
        phone.show();
        System.out.println("===============");
        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.send();
        newPhone.show();
    }
}
