package dev.d4nilpzz.goldenDandelion.mixins;

import dev.d4nilpzz.goldenDandelion.registry.ModAttachments;
import net.minecraft.world.entity.AgeableMob;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AgeableMob.class)
public class AgeableMobMixin {
    @Inject(method = "aiStep", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/AgeableMob;getAge()I"), cancellable = true)
    private void goldendandelion$aiStep(CallbackInfo ci) {
        if (((AgeableMob) (Object) this).getData(ModAttachments.GOLDEN_EFFECT)) {
            ci.cancel();
        }
    }
}
