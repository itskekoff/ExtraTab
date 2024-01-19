package ru.itskekoff.extratab.mixin;

import net.minecraft.client.gui.components.PlayerTabOverlay;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.List;

@Mixin(PlayerTabOverlay.class)
public class MixinPlayerTabOverlayGui {
    @Redirect(method = "render",
            at = @At(value = "INVOKE", target = "Ljava/util/List;subList(II)Ljava/util/List;"))
    private List<?> subListProxy(List<?> list, int fromIndex, int toIndex) {
        return list.subList(fromIndex, list.size());
    }
}
