import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class Main {
    public static void main(String[] args) {
        tack1();
        tack2();
        tack3();
    }

    public static void tack1 () {
        System.out.println("Задача 1");
        String lastName = " Ivanov";
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String fullName = lastName +" "+firstName+" "+ middleName;
        System.out.println("ФИО сотрудника —" +fullName);
    }
    public static void tack2() {
        System.out.println("Задача 2");
        String fullName = " Ivanov ";
        fullName = fullName + " Ivan ";
        fullName = fullName + " Ivanovich";
        System.out.println("Данные ФИО сотрудника для заполнения отчета —"+ fullName.toUpperCase ());
    }

    public static void tack3 () {
        System.out.println("Задача 3");
        String fullName = " Иванов ";
        fullName = fullName + " Семён ";
        fullName = fullName + " Семёнович";
        String E = fullName.replace('ё','е');
        System.out.println("Данные ФИО сотрудника —"+E);
    }
}