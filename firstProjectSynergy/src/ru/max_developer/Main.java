package ru.max_developer;

public class Main {

    public static void main(String[] args) {
        // В стране XYZ население равно 10 миллионов человек.
        // Рождаемость составляет 14 человек на 1000 человек,
        // смертность -8 человек.
        // Рассчитайте, какая численность населения будет через 10 лет,
        // принимая во внимание, что показатели рождаемости и смертности постоянны.
        int population = 10000000; // численность населения
        int born = 14; // рождаемость
        int death = 8; // смертность
        int dif = born - death;// прирост населения

        //проводим расчет численность в каждом году из 10 лет и в последствии суммируем
        for(int i = 1; i <= 10; i++){
                population += population * dif / 1000;
        }


        System.out.println(population);
    }
}
