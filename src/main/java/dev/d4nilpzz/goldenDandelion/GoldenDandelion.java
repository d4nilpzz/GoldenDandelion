package dev.d4nilpzz.goldenDandelion;

import com.mojang.logging.LogUtils;
import dev.d4nilpzz.goldenDandelion.item.GoldenDandelionItem;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;

@Mod(GoldenDandelion.MODID)
public class GoldenDandelion {

    public static final String MODID = "golden_dandelion";
    private static final Logger LOGGER = LogUtils.getLogger();

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<Block> GOLDEN_DANDELION =
            BLOCKS.register("golden_dandelion", () ->
                    new FlowerBlock(MobEffects.LUCK, 5, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission()
                            .instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).noOcclusion())
            );

    public static final DeferredItem<BlockItem> GOLDEN_DANDELION_ITEM = ITEMS.registerItem("golden_dandelion", (properties) -> 
            new GoldenDandelionItem(GOLDEN_DANDELION.get(), properties));

    public GoldenDandelion(IEventBus modEventBus, ModContainer modContainer) {
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);

        modEventBus.addListener(this::addCreative);
        modEventBus.addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Golden Dandelion loaded");
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(GOLDEN_DANDELION_ITEM);
        }
    }
}
