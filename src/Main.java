public class Main {
    public static void main(String[] args) {
        int ClientOs = 0;
        int clientDeviceYear = 2015;
//IOS
        if (ClientOs == 0) {
            if(clientDeviceYear >= 2015)
            {
                System.out.println("«Установите версию приложения для iOS по ссылке»..");
            }
            else System.out.println("«Установите облегченную версию приложения для iOS по ссылке»..");
        }
//Андройд
        if (ClientOs == 1) {
            if(clientDeviceYear >= 2015)
            {
                System.out.println("«Установите версию приложения для Android по ссылке»..");
            }
            else System.out.println("«Установите облегченную версию приложения для iOS по ссылке»..");
        }
    }
}