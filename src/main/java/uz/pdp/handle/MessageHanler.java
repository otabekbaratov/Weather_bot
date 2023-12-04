package uz.pdp.handle;

import lombok.SneakyThrows;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import uz.pdp.resoursec.weather.WeatherBot;
import uz.pdp.service.BotService;
public class MessageHanler {
    public static void handle(Message message, BotService bot) {
        if (message.isCommand()){
            CommandHanler.handle(message,bot);
        }
        if (message.hasText()){
            rewiewWeather(bot,message);
        }
    }
    @SneakyThrows
    private static void rewiewWeather(BotService bot, Message message) {
        try {
            String humidity = WeatherBot.humidity(message.getText());
            bot.execute(new SendMessage(message.getChatId().toString(),
                    humidity));
        }
        catch (Exception e){
            bot.execute(new SendMessage(message.getChatId().toString(),"bunday joy yuq"));
        }
    }
}
