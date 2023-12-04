package uz.pdp.service;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import uz.pdp.handle.Handle;
import static uz.pdp.service.BotUnit.*;
public class BotService extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        Handle.handle(update,this);
    }
    @Override
    public String getBotUsername() {
        return BOT_NAME;
    }
    public BotService() {
        super(BOT_TOKEN);
    }
}
