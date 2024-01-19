package ru.itskekoff.extratab.fabric;

import ru.itskekoff.extratab.ExtraTab;
import net.fabricmc.api.ModInitializer;

public class ExtraTabFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ExtraTab.init();
    }
}