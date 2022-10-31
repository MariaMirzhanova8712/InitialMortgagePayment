public class InitialMortgagePayment {

    public static void main(String args[]) {

        //изменяемая переменная.Тип данных long используется для удобства записи чисел с большим количеством нулей
        long priceOfApartment = 2000_000L;
        System.out.println("Стоимость квартиры составляет " + priceOfApartment + " рублей");

        //задаем % первоначального взноса
        float percentageOfInitialMortgagePayment = 10;
        System.out.println("Первоначальный взнос по ипотеке равен " + percentageOfInitialMortgagePayment + " % от стоимости квартиры");

        //расчитываем сумму первоначального взноса
        double amountOfInitialPayment = (priceOfApartment/100)*percentageOfInitialMortgagePayment;
        System.out.println("Cумма первоначального взноса по ипотеке равна " + amountOfInitialPayment + " рублей");

    }
}
