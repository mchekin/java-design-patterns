package com.mchekin.designpatterns.factorymethod;

public class LanguageFactory {
    public Language getLanguage(String language) {
        return switch (language) {
            case "Luxembourgish" -> new Luxembourgish();
            case "German" -> new German();
            case "French" -> new French();
            default -> throw new RuntimeException(String.format("Unknown language %s.", language));
        };
    }
}
