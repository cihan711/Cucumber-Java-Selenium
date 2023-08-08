//package selenium_webdriver_javacourse;
//
//import org.junit.Assert;
//import org.junit.experimental.categories.Category;
//import org.junit.jupiter.api.Tag;
//import org.junit.jupiter.api.Test;
//
//
//
//public class fileUploadTest extends BaseTest {
//
//
//
//
//
//
//    @Test
//    public void doFileUpload() throws InterruptedException {
//
//        String fileName = "/Users/cihan/Desktop/Case_Study/A101_Test Otomasyon Java_First Case Catalog.pdf";
//        var pdfName = fileName.split("/");
//        var fl = homePage.gofileUploadPage();
//        fl.chooseFile(fileName);
////        Assert.assertEquals(fl.getResult(),"A101_Test Otomasyon Java_First Case Catalog.pdf");
//        Assert.assertEquals(fl.getResult(),pdfName[pdfName.length-1]);    //Yukarıdaki ifadenin Dinamik hali!
//
//    }
//
//
//
//
//}
