package task_11.task_11_2.service;

import java.util.Locale;

public enum Languare {
    ENG(new Locale("en", "UK")),
    RUS(new Locale("ru", "RU")),
    UA(new Locale("uk", "UA"));

    private Locale locale;
    private Languare(Locale locale) {
        this.locale = locale;
    }

    public Locale getLocale() {
        return locale;
    }
}
