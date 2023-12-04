package uz.pdp.handle;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.List;

public class ButtonUtils {
    public static final ReplyKeyboard START_MARKUP = InlineKeyboardMarkup.builder()
            .keyboardRow(List.of(InlineKeyboardButton.builder().text("Dunyo shaharlari \uD83C\uDF0F").callbackData("xorij").build()))
            .keyboardRow(List.of(InlineKeyboardButton.builder().text("O'zbekiston shaharlari \uD83C\uDDFA\uD83C\uDDFF").callbackData("uzbek").build()))
            .build();
    public static final ReplyKeyboard REGION = InlineKeyboardMarkup.builder().
            keyboardRow(
                    List.of(InlineKeyboardButton.builder().text("Toshkent").callbackData("toshkent")
                            .build(), InlineKeyboardButton.builder().text("Samarqand").callbackData("samarqand").build()
                    ,InlineKeyboardButton.builder().text("Buxoro").callbackData("buxoro").build())
            ).
    keyboardRow(
            List.of(InlineKeyboardButton.builder().text("Namangan").callbackData("namangan")
                            .build(), InlineKeyboardButton.builder().text("Farg'ona").callbackData("farg'ona").build()
                    ,InlineKeyboardButton.builder().text("Andijon").callbackData("andijon").build())
            ).keyboardRow(
            List.of(InlineKeyboardButton.builder().text("Sirdaryo").callbackData("sirdaryo")
                            .build(), InlineKeyboardButton.builder().text("JIzzax").callbackData("jizzax").build()
                    ,InlineKeyboardButton.builder().text("Navoiy").callbackData("navoiy").build())
            ).keyboardRow(
            List.of(InlineKeyboardButton.builder().text("Qashqadaryo").callbackData("qashqadaryo")
                            .build(), InlineKeyboardButton.builder().text("Termiz").callbackData("termiz").build()
                    ,InlineKeyboardButton.builder().text("Xiva").callbackData("xiva").build())
            ).keyboardRow(
                    List.of(InlineKeyboardButton.builder().text("Qoraqalpog'iston").callbackData("qoraqalpog'iston").build()
            ,InlineKeyboardButton.builder().text("Boshqa shaharlar").callbackData("boshqa").build(),
                    InlineKeyboardButton.builder().text("◀\uFE0F").callbackData("viloyatdanBack").build()))
           .build();
}