package uz.pdp;

import lombok.SneakyThrows;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import uz.pdp.service.BotService;

/**
 * author = Otabek Baratov
 * since = 2023 dekabr
 */
public class App {
    @SneakyThrows
    public static void main(String[] args ) {
        TelegramBotsApi api = new TelegramBotsApi(DefaultBotSession.class);
        api.registerBot(new BotService());
    }
}
