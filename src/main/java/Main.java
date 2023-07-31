import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.TesseractException;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.io.File;

public class Main {
    public static void main(String[] args) {

      /*  try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(new MyBot());
            telegramBotsApi.registerBot(new DirectionsHandlers());
            telegramBotsApi.registerBot(new RaeHandlers());
            telegramBotsApi.registerBot(new WeatherHandlers());
            telegramBotsApi.registerBot(new TransifexHandlers());
            telegramBotsApi.registerBot(new FilesHandlers());
        }
        catch (TelegramApiException e) {
            e.printStackTrace();
        }*/



      // Tesseract tesseract = new Tesseract();
      //  try {
            // Imposto il percorso dei dati linguistici (es. per l'italiano)
            //tesseract.setDatapath("C:\\Users\\ricca\\Downloads\\Tess4J-3.4.8-src\\Tess4J\\tessdata");

            // Carica l'immagine contenente il testo da riconoscere
           //File imageFile = new File("C:\\Users\\ricca\\OneDrive\\Desktop\\Tesi\\immagine");

            // Esegui l'OCR sull'immagine
           // String extractedText = tesseract.doOCR(imageFile);
           // System.out.println("Testo estratto: " + extractedText);
            /*String text = tesseract.doOCR(new File("C:\\Users\\ricca\\OneDrive\\Desktop\\Tesi\\immagine.png"));
            System.out.println("Output: " + text);
        } catch (TesseractException e) {
            System.err.println("Errore durante l'OCR: " + e.getMessage());
        }*/

            File imageFile = new File("C:\\Users\\ricca\\OneDrive\\Desktop\\Tesi\\immagine.png");
            ITesseract instance = new Tesseract();
            instance.setDatapath("C:\\Users\\ricca\\IdeaProjects\\Tesi\\src\\main\\tessdata");
            try {
                String result = instance.doOCR(imageFile);
                System.out.println(result);
            } catch (TesseractException e) {
                System.err.println(e.getMessage());
            }
    }
}

