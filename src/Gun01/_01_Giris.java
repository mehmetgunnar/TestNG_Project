package Gun01;

import org.testng.annotations.Test;

public class _01_Giris {

    //Eğer test metodlarına sıralama verilmezse alfabetik sırasına göre çalışır.

    @Test(priority = 1)  //annotationlar
    void webSitesiniAc(){
        System.out.println("Driver tanımlandı ve web sitesi açıldı");
    }
    @Test(priority = 2)
    void loginTestIsleminiYap(){
        System.out.println("Login test işlemleri yapıldı");
        // yeşil tik, hatalı assertion yok demektir.
    }
    @Test(priority = 3)
    void driveriKapat(){
        System.out.println("Driver kapatıldı ve çıkıldı");
    }
}
