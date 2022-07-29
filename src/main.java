import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int select,number=0,numberOne=0;
        Scanner input= new Scanner(System.in);
        String menu ="1 - Toplama İşlemi\n " +
                     "2 - Çıkarma İşlemi \n " +
                     "3 - Çarpma İşlemi \n " +
                     "4 - Bölme İşlemi \n " +
                     "5 - Üslü Sayı Alma işlemi \n " +
                     "6 - Mod Alma işlemi \n" +
                     "7 - Diktörgen Alan ve Çevre Hesabı \n" +
                     "8 - Faktöriyel İşlemi . \n" + "9 - Çıkış." ;

        do {
            System.out.println(menu);
            System.out.print("Yapmak İstediğiniz işlemi Seçiniz : ");
            select = input.nextInt();

            if (select != 9){
                if (select != 8){
                    System.out.print("1. Sayıyı Giriniz : ");
                    number=input.nextInt();
                    System.out.print("2. Sayıyı Giriniz : ");
                    numberOne=input.nextInt();
                }else {
                    System.out.print("1. Sayıyı Giriniz : ");
                    number=input.nextInt();
                }

            }

            switch (select){
                case 1:
                        toplamIslemi(number,numberOne);
                    break;
                case 2:
                        cikarmaIslemi(number,numberOne);
                    break;
                case 3:
                        caprmaIslemi(number,numberOne);
                    break;
                case 4:
                    if (numberOne !=0) {
                        bolmeIslemi(number, numberOne);
                    }else {
                        System.out.println("Geçersiz Değer! Sayılar 0'a Bölünemez.");
                    }

                    break;
                case 5:
                    usluSayiAlma(number,numberOne);
                    break;
                case 6:
                    modAlmaIslemi(number,numberOne);
                    break;
                case 7:
                    dikdortgenAlanCevre(number,numberOne);
                    break;
                case 8:
                    faktoriyel(number);
                    break;
                case 9:
                    System.out.println("Çıkış Yaptınız.Tekrar Görüşmek Üzere...");
                    break;
                default:
                    System.out.println("Hatalı Bir Seçim Yaptınız! Lütfen Tekrar Deneyin.");

            }

        }while (select != 9);


    }

    static void toplamIslemi(int a,int b){
        System.out.println("Seçtiğiniz işlem: Toplam işlemi ");
        System.out.println(a+" + "+ b +" = "+ (a+b));
    }
    static void cikarmaIslemi(int a,int b){
        System.out.println("Seçtiğiniz işlem: Çıkarma işlemi ");
        System.out.println(a+" - "+ b +" = "+ (a-b));
    }
    static void caprmaIslemi(int a,int b){
        System.out.println("Seçtiğiniz işlem: Çarpma işlemi ");
        System.out.println(a+" X "+ b +" = "+(a*b));
    }
    static void bolmeIslemi(int a,int b){
        System.out.println("Seçtiğiniz işlem: Bölme işlemi ");
        System.out.println(a +" Sayısının " +b+" Sayınına bölümü : "+ (a/b));
    }
    static void usluSayiAlma(int a,int b){
       int result = a,temp=b;
        while (b !=1){
           result *=a;
           b--;
       }
        System.out.println("Seçtiğiniz işlem: Üs Alma işlemi ");
        System.out.println(a+" Üzeri "+temp+" : "+result);
    }
    static void modAlmaIslemi(int a,int b){
        System.out.println("Seçtiğiniz işlem: Mod Alma işlemi ");
        System.out.println(a+" Sayisinin "+b+" Sayısından Kalanı : "+ (a%b));
    }
    static  void dikdortgenAlanCevre(int a, int b){
        int alan,cevre;
        alan=a*b;
        cevre=2*(a+b);
        System.out.println("Dikdörtgenin Çevresi : " + cevre);
        System.out.println("Dikdörtgenin Alanı : " + alan);

    }
    static  void faktoriyel(int a){
        int temp=a,tempMinus=(a-1);
        while (tempMinus !=1){
            temp *=tempMinus;
            tempMinus--;
        }
        System.out.println(a+"! = "+temp);
    }

}
