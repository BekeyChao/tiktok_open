package xyz.bekey;

import java.util.function.Consumer;

public class ErrNoHandleConfig {

    private Consumer<String> authorize30006Handle;

    public Consumer<String> getAuthorize30006Handle() {
        return authorize30006Handle;
    }

    public void setAuthorize30006Handle(Consumer<String> authorize30006Handle) {
        this.authorize30006Handle = authorize30006Handle;
    }
}
