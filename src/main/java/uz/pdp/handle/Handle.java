package uz.pdp.handle;

import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import uz.pdp.service.BotService;

public class Handle {
    public static void handle(Update update, BotService bot) {
        if (update.hasMessage()){
            final Message message = update.getMessage();
            MessageHanler.handle(message,bot);
        } else if (update.hasCallbackQuery()) {
            CallbackHandler.handle(update.getCallbackQuery(),bot);
        }
    }
}
