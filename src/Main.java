public class Main {
    public static void main(String[] args) {
        int ticketAmount = 175; // Переменная для хранения стоимости билета
        int bonusConst = 20;    // Переменная для хранения количества рублей для одной бонусной милли

        int passengersBonus = ticketAmount/bonusConst; // Рассчитываем количество бонусных миль
        System.out.println("Вам начислено "+ passengersBonus+ " бонусных миль"); //  Ответ сохраняем в новую переменную
                                                                                 // и выводим на экран

    }
}
