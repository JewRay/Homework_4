import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //Задача 1

        System.out.println("Задача 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст человека");
        int age = sc.nextInt();

        if (age >= 18 ) {
            System.out.println("Если возраст человека равен " + age +
                    ", то он совершеннолетний");
        }else{
            System.out.println("Если возраст человека равен " + age +
                    ", то он не достиг совершеннолетия," +
                    "нужно немного подождать");
        }

        //Задача 2

        System.out.println("Задача 2");
        System.out.println("Введите температуру на улице");
        int temperature = sc.nextInt();

        if (temperature < 5 ){
            System.out.println("На улице холодно , нужно одеть шапку");
        }else{
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        //Задача 3

        System.out.println("Задача 3");
        System.out.println("Введите скорость транспорта");
        int speed = sc.nextInt();

        if (speed > 60){
            System.out.println("Если скорость "+speed+
                    " км/ч, то придется заплатить штраф");
        }else{
            System.out.println("Если скорость "+speed+
                    " км/ч, то можно ездить спокойно");
        }

        //Задача 4

        System.out.println("Задача 4");
        System.out.println("Введите возраст человека");
        int agePeople = sc.nextInt();

        if (agePeople >= 2 && agePeople <= 6){
            System.out.println("Если возраст человека равен "+agePeople+
                    ", то ему нужно ходить детский сад");
        }else if(agePeople >= 7 && agePeople <= 17){
            System.out.println("Если возраст человека равен "+agePeople+
                    ", то ему нужно ходить в школу");
        }else if(agePeople >= 18 && agePeople <=24){
            System.out.println("Если возраст человека равен "+agePeople+
                    ", то ему нужно ходить в университет");
        }else {
            System.out.println("Если возраст человека равен "+agePeople+
                    ", то ему нужно ходить на работу");
        }

        //Задача 5

        System.out.println("Задача 5");
        System.out.println("Введите возраст ребенка");
        int ageChild = sc.nextInt();
        if (ageChild < 5 ){
            System.out.println("Если возраст ребенка равен "+ageChild+
                    " ,то ему нельзя кататься на аттракционе");
        }else if(ageChild > 5 && ageChild < 14){
            System.out.println("Если возраст ребенка равен "+ageChild+
                    " ,то ему можно кататься на аттракционе в сопровождении взрослого");

        }else{
            System.out.println("Если возраст ребенка равен "+ageChild+
                    " ,то ему можно кататься на аттракционе");
        }

        //Задача 5 Извините, я решил не много запариться , можно фидбек?(это второй вариант)

        System.out.println("Задача 5.1");
        System.out.println("Введите возраст ребенка");
        int ageChildren = sc.nextInt();
        if (ageChildren < 5 ){
            System.out.println("Если возраст ребенка равен "+ageChildren+
                    " ,то ему нельзя кататься на аттракционе");
        }else if(ageChildren > 5 && ageChildren < 14){
            System.out.println("Если возраст ребенка равен "+ageChild+
                    " ,то ему можно кататься на аттракционе в сопровождении взрослого");
            System.out.println("Есть ли сопровождающий взрослый? 'Да/Нет' ");
            String maintainer = sc.next();

            if (maintainer.equalsIgnoreCase("Да")) {
                System.out.println("Если возраст ребенка равен "+ageChildren+
                        " ,то ему можно кататься на аттракционе , " +
                        "так как его сопровождает взрослый ");
            }else{
                System.out.println("Если возраст ребенка равен "+ageChildren+
                        " ,то ему нелься кататься на аттракционе ," +
                        "так как его не сопровождает взрослый");
            }
        }else{
            System.out.println("Если возраст ребенка равен "+ageChildren+
                    " ,то ему можно кататься на аттракционе");
        }


        //Задача 6

        System.out.println("Задача 6");
        int totalPlaceTraneCar = 102;
        int totalSeatPlace = 60;
        int totalStayPlace = totalPlaceTraneCar - totalSeatPlace;
        int freeSeatPlace;
        int freeStayPlace;

        System.out.println("Введите колличество занятых сидячих мест в вагоне");
        int occupiedSeatPlaceActually = sc.nextInt();
        System.out.println("Введите колличесво занятых стоячих мест в вагоне");
        int occupiedStayPlaceActually = sc.nextInt();

        if (occupiedSeatPlaceActually < totalSeatPlace ){
            freeSeatPlace = totalSeatPlace - occupiedSeatPlaceActually;
            System.out.println("В вагоне свободно "+freeSeatPlace+
                    " сидячих мест");
        }else{
            System.out.println("В вагоне сидячие места заняты");
        }
        if (occupiedStayPlaceActually < totalStayPlace){
            freeStayPlace = totalStayPlace - occupiedStayPlaceActually;
            System.out.println("В вагоне свободно "+freeStayPlace+
                    " стоячих мест");
        }else{
            System.out.println("В вагоне нет стоячих мест");
        }

        //Задача 7

        System.out.println("Задача 7");
        System.out.println("Введите первое число");
        int one = sc.nextInt();
        System.out.println("Введите второе число");
        int two = sc.nextInt();
        System.out.println("Введите третье число");
        int three = sc.nextInt();

        if (one > two && one > three){
            System.out.println(one+" наибольшее число из предложенных");
        }else if (two > one && two > three){
            System.out.println(two+" наибольшее число из предложенных");
        }else{
            System.out.println(three+" наибольшее число из предложенных");
        }
    }
}