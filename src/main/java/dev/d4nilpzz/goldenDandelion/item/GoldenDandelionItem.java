package dev.d4nilpzz.goldenDandelion.item;

import dev.d4nilpzz.goldenDandelion.registry.ModAttachments;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

public class GoldenDandelionItem extends BlockItem {
    public GoldenDandelionItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    public @NotNull InteractionResult interactLivingEntity(@NotNull ItemStack stack, @NotNull Player player, @NotNull LivingEntity interactionTarget, @NotNull InteractionHand usedHand) {
        if (interactionTarget.isBaby() && interactionTarget instanceof Animal animal) {
            animal.setData(ModAttachments.GOLDEN_EFFECT, true);
            stack.shrink(1);
            return InteractionResult.SUCCESS;
        }
        
        return InteractionResult.FAIL;
    }
}
