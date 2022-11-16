package games.twinhead.morecarpets.datagen;

import games.twinhead.morecarpets.block.CarpetTypes;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class LangDatagen extends FabricLanguageProvider {
    protected LangDatagen(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        for (CarpetTypes carpet: CarpetTypes.values()) {
            translationBuilder.add(carpet.getBlock(), formatName(carpet.toString()));
        }
    }

    public String formatName(String name){
        String[] parts = name.split("_");
        StringBuilder stringBuilder = new StringBuilder();
        for (String s: parts) {
            if(!s.contains("block"))
                stringBuilder.append(s.substring(0, 1).toUpperCase()).append(s.substring(1).toLowerCase()).append(" ");
        }
        return stringBuilder.substring(0, stringBuilder.length()-1);
    }
}
