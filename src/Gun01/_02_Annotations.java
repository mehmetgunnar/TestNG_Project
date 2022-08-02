package Gun01;

import org.testng.annotations.*;

public class _02_Annotations {
    /*
    @BeforeClass -> Her class çalışıyorken önce burası çalışır.
    @BeforeMetod -> Her metoddan(testten) önce çalışır.

        @Test  -> testelrin çalıştığı metod
        @Test  -> testelrin çalıştığı metod

    @AfterMetod -> Her metoddan(testten) sonra çalışır.
    @AfterClass -> Her class çalışıyorken sonra burası çalışır.
     */
    @BeforeClass
    void beforeClass(){
        System.out.println("Her class'tan önce çalışacak : Before Class");
    }
    @BeforeMethod
    void beforeMetod(){
        System.out.println("Her test metoddan önce çalışacak : Before Metod");
    }
    @Test
    void test1(){
        System.out.println("Test1 çalıştı");
    }
    @Test
    void test2(){
        System.out.println("Test2 çalıştı");
    }
    @AfterMethod
    void afterMetod(){
        System.out.println("Her test metoddan sonra çalışacak : After Metod");
    }
    @AfterClass
    void afterClass(){
        System.out.println("Her class'tan sonra çalışacak : After Class");
    }
}
