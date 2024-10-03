
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Система расчета стоимости топлива");

        int fuelType = 95;
        int amount =50;

        double fuel92price = 60.2;
        double fuel95price = 63.55;

        double fuelPrice = 0;

        if (fuelType == 95) {
            fuelPrice = fuel95price;
        }

        else if (fuelType == 92) {
            fuelPrice = fuel92price;
        }
        else  {
            System.out.println("Нет такого бензана");
        }

        if (amount < 1) {
            System.out.println("Слишком малое колличество топлива");
            amount =0;
        }




        double totalPrice = amount * fuelPrice;

        System.out.println("Цена выбранного топлива " + fuelPrice + " руб");
        System.out.println("Стоимость оплаты " + totalPrice + " руб");
    }
}