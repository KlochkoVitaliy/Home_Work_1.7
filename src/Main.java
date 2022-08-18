public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {

        //Task 1
        System.out.println(ANSI_GREEN + "Задание № 1" + ANSI_RESET);

        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println(ANSI_RED + "ФИО сотрудника —" + fullName + ANSI_RESET);

        //Task 2
        System.out.println(ANSI_GREEN + "Задание № 2" + ANSI_RESET);

        String caseUp = fullName.toUpperCase();
        System.out.println(ANSI_BLUE + " Данные ФИО сотрудника для заполнения отчета — " + caseUp + ANSI_RESET);

        //Task 3
        System.out.println(ANSI_GREEN + "Задание № 3" + ANSI_RESET);

        String firstName2 = " Семён";
        String middleName2 = " Семёнович";
        String lastName2 = " Иванов";
        String fullName3 = lastName2 + " " + firstName2 + " " + middleName2;
        System.out.println(ANSI_YELLOW + "Данные ФИО сотрудника — " + fullName3.replace('ё', 'е') + ANSI_RESET);
    }
}