import java.util.Scanner;
//VMA9 Muhammet Ali Velibeyoğlu
//Ödev
//Aynı projedeki ATM işlemlerini "Switch-Case" kullanarak yapınız.
public class ATMProjesiPratik {
    public static void main(String[] args) {
        String userName, passWord;
        int balance = 50000, right = 3, select, vSelect = 0;
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Kullanıcı adı giriniz: ");
            userName = input.nextLine();
            System.out.print("Şifre giriniz: ");
            passWord = input.nextLine();

            if (userName.equals("ali") && passWord.equals("patika123")) {
                System.out.println("Kodluyoruz Bankasına Hoşgeldiniz...");
                do {
                    System.out.println("""
                            Yapmak istediğiniz işlem seçiniz :\s
                            1-Para Yatırma
                            2-Para Çekme
                            3-Bakiye Sorgulama
                            4-Çıkış Yap""");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.println("Yatırmak istediğiniz tutar : ");
                            int price = input.nextInt();
                            balance += price;
                            System.out.print("Bakiyeniz " + balance);
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz tutar : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Yetersiz bakiye !");
                                break;
                            } else {
                                balance -= price;
                                System.out.println("Bakiyeniz : " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Mevcut Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("İyi günler. Yine bekleriz ...");
                            vSelect++;
                            break;
                        default:
                            System.out.println("Hatalı tuşlama yaptınız. ");
                    }
                } while (select != 4);
            } else {
                right--;
                System.out.println("Hatalı giriş yaptınız. Tekrar deneyiniz.");
                System.out.println("Kalan hakkınız : " + right);
                if (right == 0) {
                    System.out.print("Kartınız bloke oldu.");
                }
            }
        } while (right > 0 && vSelect != 1);
    }
}