package Example;

//Вычислить расстояние , проходимое светом,
//используя переменные типа lonq

public class light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long second;
        long distance;

        // приблизительная скорость света, миль в секунду
        lightspeed = 186000;

        days = 1000; // указать количество дней

        second = days *24 *60 *60; //преобразовать в секунды

        distance = lightspeed * second; // вычислить расстояние

        System.out.print("За дней " + days);
        System.out.println(" Дней свет пройдет около ");
        System.out.println(distance + " Миль");

    }
}
