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

        //Task 3 / Method Index
        System.out.println(ANSI_GREEN + "Задание № 3 - " + ANSI_RESET + ANSI_PURPLE + "Method Index" + ANSI_RESET);

        String fulleName = "Иванов Семён Семёнович";
        int simbol = fulleName.indexOf("ё");
        if (simbol == -1) {
        } else {
            fulleName = fulleName.replace('ё', 'е');
        }
        System.out.println(ANSI_YELLOW + "Данные ФИО сотрудника — " + fulleName + ANSI_RESET);

        //Task 3 / Method Contains
        System.out.println(ANSI_GREEN + "Задание № 3 - " + ANSI_RESET + ANSI_PURPLE + "Method Contains" + ANSI_RESET);

        String fulleName2 = "Иванов Семён Семёнович";
        if (fulleName2.contains("ё")) {
            fulleName2 = fulleName2.replace('ё', 'е');
        }
        System.out.println(ANSI_YELLOW + "Данные ФИО сотрудника — " + fulleName2 + ANSI_RESET);

        //Task 3 / Method Split
        System.out.println(ANSI_GREEN + "Задание № 3 - " + ANSI_RESET + ANSI_PURPLE + "Method Split" + ANSI_RESET);

        String fulleName3 = "Иванов Семён Семёнович";
        for (String name : fulleName3.split(" ", 1)) {
            fulleName3 = fulleName3.replace('ё', 'е');
        }
        System.out.println(ANSI_YELLOW + "Данные ФИО сотрудника — " + fulleName3 + ANSI_RESET);

    }
}