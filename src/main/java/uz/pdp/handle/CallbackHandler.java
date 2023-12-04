package uz.pdp.handle;

import lombok.SneakyThrows;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import uz.pdp.resoursec.weather.WeatherBot;
import uz.pdp.service.BotService;
import static uz.pdp.handle.CommandHanler.handleOfStart;

public class CallbackHandler {
    @SneakyThrows
    public static void handle(CallbackQuery callbackQuery, BotService bot) {
        switch (callbackQuery.getData()) {
            case "xorij" -> foriegn(bot, callbackQuery);
            case "uzbek" -> uzbekRegion(bot, callbackQuery);

            case "toshkent" -> repeatWeather(bot,callbackQuery);
            case "samarqand" -> repeatWeather(bot,callbackQuery);
            case "buxoro" -> repeatWeather(bot,callbackQuery);
            case "sirdaryo" -> repeatWeather(bot,callbackQuery);
            case "jizzax" -> repeatWeather(bot,callbackQuery);
            case "navoiy" -> repeatWeather(bot,callbackQuery);
            case "namangan" -> repeatWeather(bot,callbackQuery);
            case "farg'ona" -> repeatWeather(bot,callbackQuery);
            case "andijon" -> repeatWeather(bot,callbackQuery);
            case "qashqadaryo" -> repeatWeather(bot,callbackQuery);
            case "termiz" -> repeatWeather(bot,callbackQuery);
            case "xiva" -> repeatWeather(bot,callbackQuery);
            case "qoraqalpog'iston" -> repeatWeather(bot,callbackQuery);
            case "boshqa" -> panelBoshqa(bot,callbackQuery);
            case "viloyatdanBack" ->handleOfStart(callbackQuery.getMessage(), bot);
        }
    }
    @SneakyThrows
    private static void panelBoshqa(BotService bot, CallbackQuery callbackQuery) {
        bot.execute(new SendMessage(callbackQuery.getMessage().getChatId().toString(),
                "Bilmoqchi bo'lgan joyning nomini kiriting : "));
    }
    @SneakyThrows
    private static void foriegn(BotService bot, CallbackQuery callbackQuery) {
        bot.execute( new SendMessage(callbackQuery.getMessage().getChatId().toString(),
                "Bilmoqchi bo'lgan joyning nomini kiriting : "));
    }
    @SneakyThrows
    private static void uzbekRegion(BotService bot, CallbackQuery callbackQuery) {
        SendMessage sendMessage = new SendMessage(
               callbackQuery.getMessage().getChatId().toString(), "Viloyatlarni tanlang : ");
        sendMessage.setReplyMarkup(ButtonUtils.REGION);
        bot.execute(sendMessage);
    }
    //ob - havoni olib beruvchi method
    @SneakyThrows
    private static void repeatWeather(BotService bot, CallbackQuery callbackQuery)  {
        try {
        String humidity = WeatherBot.humidity(callbackQuery.getData());
        SendMessage sendMessage = new SendMessage(callbackQuery.getMessage().getChatId().toString(),
                humidity);
        bot.execute(sendMessage);
        }
        catch (Exception e){
            SendMessage sendMessage = new SendMessage(callbackQuery.getMessage().getChatId().toString(),"bunday joy yuq");
            bot.execute(sendMessage);
        }
    }
}
