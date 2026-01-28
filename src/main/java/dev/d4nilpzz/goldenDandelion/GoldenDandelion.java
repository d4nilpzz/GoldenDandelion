package dev.d4nilpzz.goldenDandelion;

import com.mojang.logging.LogUtils;
import dev.d4nilpzz.goldenDandelion.registry.ModAttachments;
import dev.d4nilpzz.goldenDandelion.registry.ModBlocks;
import dev.d4nilpzz.goldenDandelion.registry.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import org.slf4j.Logger;

@Mod(GoldenDandelion.MODID)
public class GoldenDandelion {
    public static final String MODID = "golden_dandelion";
    private static final Logger LOGGER = LogUtils.getLogger();

    public GoldenDandelion(IEventBus modEventBus, ModContainer modContainer) {
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModAttachments.ATTACHMENT_TYPES.register(modEventBus);

        modEventBus.addListener(this::addCreative);
        LOGGER.info("Golden Dandelions loaded correctly.");
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.GOLDEN_DANDELION.get());
        }
    }
}
