import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class MyBot extends TelegramLongPollingBot {

 /*il metodo onUpdateReceived(Update update) serve per maneggiare i messaggi, comandi dal bot, così se qualcuno
 scriverà qualcosa sul bot noi possiamo intercettare il messaggio/richiesta in quel metodo
  */
    @Override
    public void onUpdateReceived(Update update){
        System.out.println(update.getMessage().getText());
        System.out.println(update.getMessage().getFrom().getFirstName()); //per testare la connessione tra il codice
        // e il bot e ottenere il nome di chi sta scrivendo al bot

    }
    @Override
    public String getBotUsername(){

        return "pdf_Translatebot";
    }

    @Override
    public String getBotToken(){

        return "6618676928:AAGwjEy2ljA-rlLlgyVZ1yid-ByzVqyrfB0";
    }

}
