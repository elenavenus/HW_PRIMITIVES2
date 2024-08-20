//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int startBalance = 400;//Баланс начальный
        int appendSum = 1100;//Сумма пополнения
        int bonusSum = 0;   //Кол-во начисляемых бонус
        if (appendSum > 1000) {//Если сумма пополнения больше 1000
            bonusSum = appendSum / 100;//Кол-во начисляемых бонусов = сумма пополнения делить на 100 рублей
        }
        int resultBalance = startBalance + appendSum + bonusSum;//результат после пополнения
        System.out.println("Итоговый баланс = " + resultBalance + " Кол-во бонусов = " + bonusSum);
    }
}