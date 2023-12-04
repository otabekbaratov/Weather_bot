package uz.pdp.handle;

import lombok.SneakyThrows;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import uz.pdp.service.BotService;
public class CommandHanler {
    public static void handle(Message message, BotService bot) {
        switch (CommandEnum.of(message.getText())){
            case START-> handleOfStart(message ,bot);
            case HELP->handleOfHelp(message ,bot);
        }
    }
    @SneakyThrows
    public static void handleOfStart(Message message, BotService bot) {
        SendMessage sendMessage = new SendMessage(
                message.getChatId().toString(), "Quyidagilardan birini tanlang");
        sendMessage.setReplyMarkup(ButtonUtils.START_MARKUP);
        bot.execute(sendMessage);
    }
    @SneakyThrows
    private static void handleOfHelp(Message message, BotService bot) {
        bot.execute(new SendMessage(message.getChatId().toString(),
                "Iltimos fikr -takliflar bo'lsa adminga yozing!!\nYana bir bor Tashakkur!!!"));
    }
}
