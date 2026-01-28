package dev.d4nilpzz.goldenDandelion;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.phys.BlockHitResult;

public class GoldenDandelionBlock extends FlowerBlock {

    public GoldenDandelionBlock(Holder<MobEffect> effect, float seconds, Properties properties) {
        super(effect, seconds, properties);
        BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_YELLOW)
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS)
                .offsetType(BlockBehaviour.OffsetType.XZ)
                .noOcclusion();
    }

    @Override
    protected ItemInteractionResult useItemOn(ItemStack p_316304_, BlockState p_316362_, Level p_316459_, BlockPos p_316366_, Player p_316132_, InteractionHand p_316595_, BlockHitResult p_316140_) {
        return super.useItemOn(p_316304_, p_316362_, p_316459_, p_316366_, p_316132_, p_316595_, p_316140_);
    }
}
