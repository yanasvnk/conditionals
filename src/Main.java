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
        int person = 2;
        if (person >= 7 && person < 18) {
            System.out.println("Ребёнок ходит в школу");
        } else if (person >= 18 && person < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else if (person >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        //Задача 3
        int seat = 50;
        if (seat >= 61 && seat < 102) {
            System.out.println("В вагоне есть стоячее место");
        } else if (seat >= 102) {
            System.out.println("В вагоне нет мест");
        } else {
            System.out.println("В вагоне есть сидячее место");

        }
        //Задача 4
        int age1 = 27;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад");
        } else if (age1 >= 7 && age1 <= 18) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу");
        } else if (age1 > 18 && age1 < 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в университет");
        } else if (age1 >= 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить на работу");
        }

        //Задача 5
        int child = 15;
        if (child < 5) {
            System.out.println("Не может кататься на аттракционе.");
        } else if (child > 5 && child < 14) {
            System.out.println("Может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else if (child >= 14) {
            System.out.println("Может кататься без сопровождения взрослого.");
        }

        //Задача 6
        int one = 4;
        int two = -5;
        int three = 101;
        if (one > two) {
            if (one >= three) {
                System.out.println("максимальное число - " + one);
            } else {
                System.out.println("максимальное число - " + three);
            }
        } else if (two > one) {
            if (two >= three) {
                System.out.println("максимальное число - " + two);
            } else {
                System.out.println("максимальное число - " + three);
            }
        } else {
            if (one > three) {
                System.out.println("максимальное число - " + one);
            } else if (three > one) {
                System.out.println("максимальное число - " + three);
            } else {
                System.out.println("Все 3 числа равны");
            }
        }
    }
}