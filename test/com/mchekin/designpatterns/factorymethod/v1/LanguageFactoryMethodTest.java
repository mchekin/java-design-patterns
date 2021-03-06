package com.mchekin.designpatterns.factorymethod.v1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LanguageFactoryMethodTest {
    @Test
    public void getGreetings() {
        LanguageFactory languageFactory = new LanguageFactory();

        Language luxembourgish = languageFactory.getLanguage("Luxembourgish");
        Language french = languageFactory.getLanguage("French");
        Language german = languageFactory.getLanguage("German");

        assertEquals("Moien!", luxembourgish.greeting());
        assertEquals("Salut!", french.greeting());
        assertEquals("Hallo!", german.greeting());
    }

    @Test
    public void throwExceptionOnTryingToGetUnknownLanguage() {
        Throwable throwable = assertThrows(RuntimeException.class, () -> new LanguageFactory().getLanguage("Gibberish"));

        assertEquals("Unknown language Gibberish.", throwable.getMessage());
    }
}