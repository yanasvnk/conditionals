public class Main {
    public static void main(String[] args) {
        //Задача 1
        int age = 50;
        if (age >= 18) {
            System.out.println("Поздравляем Вас с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, подождите ещё немного");
        }
        //Задача 2
        int person = 26;
        if (person >= 7) {
            System.out.println("Ребёнок ходит в школу");
        }
        if (person >= 18) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (person >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        //Задача 3
        int seat = 103;
        if (seat >= 61) {
            System.out.println("В вагоне есть стоячее место");
        }
        if (seat >= 102) {
            System.out.println("В вагоне нет мест");
        } else {
            System.out.println("В вагоне есть сидячее место");

        }
        //Задача 4
        int age1 = 8;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад");
        }
        if (age1 >= 7 && age1 <= 18) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу");
        }
        if (age1 > 18 && age1 < 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в университет");
        }
        else {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить на работу");
        }
    }
}