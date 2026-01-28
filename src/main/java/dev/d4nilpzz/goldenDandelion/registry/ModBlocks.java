package dev.d4nilpzz.goldenDandelion.registry;

import dev.d4nilpzz.goldenDandelion.GoldenDandelion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(GoldenDandelion.MODID);

    public static final DeferredBlock<Block> GOLDEN_DANDELION =
            BLOCKS.register("golden_dandelion", () ->
                    new FlowerBlock(MobEffects.LUCK, 5, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission()
                            .instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).noOcclusion())
            );
}
