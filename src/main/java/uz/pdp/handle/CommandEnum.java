package uz.pdp.handle;

import lombok.Getter;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
@Getter
public enum CommandEnum {
    START("/start"),
    HELP("/help");
    private final String value;
    CommandEnum(String value) {
        this.value = value;
    }
    private static final Map<String ,CommandEnum> MAP = Arrays.stream(CommandEnum.values())
            .collect(Collectors.toMap(CommandEnum ::getValue , commandEnum ->commandEnum));
    public static CommandEnum of(String command){
        CommandEnum commandEnum = MAP.get(command);
        if (commandEnum==null){
            throw new IllegalArgumentException("Not Supported this command");
        }
        return commandEnum;
    }
}
