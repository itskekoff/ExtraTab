package ru.itskekoff.extratab.forge;

import ru.itskekoff.extratab.ExtraTab;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExtraTab.MOD_ID)
public class ExtraTabForge {
    public ExtraTabForge() {
        ExtraTab.init();
    }
}