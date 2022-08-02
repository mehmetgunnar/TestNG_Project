package Gun01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Assertions {

    // Yeşil tik -> testte hata yok
    // sarı çarpı -> testte hata var
    // beyaz -> test çalıştırılmadı, skip

    @Test
    void EqualOrnek(){
        String s1="Merhaba";
        String s2="İyi akşamlar";

        // Oluşan (actual), beklenen (expected), "hata başlığı"
        Assert.assertEquals(s1,s2,"Karşılaştırma sonucu");
    }

    @Test
    void NotEqualOrnek(){
        String s1="Merhaba";
        String s2="İyi akşamlar";

        // Oluşan (actual), beklenen (expected), "hata başlığı"
        Assert.assertNotEquals(s1,s2,"Karşılaştırma sonucu");
    }

    @Test
    void TrueOrnek(){
        int s1=55;
        int s2=555;

        // Oluşan (actual), beklenen (expected), "hata başlığı"
        Assert.assertTrue(s1==s2,"Karşılaştırma sonucu");
    }

    @Test
    void nullOrnek(){
        String s1=null;

        // Oluşan (actual), beklenen (expected), "hata başlığı"
        Assert.assertNull(s1,"Karşılaştırma sonucu");
    }

    @Test
    void direktFail(){
        Assert.fail();
    }
}
