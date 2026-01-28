package dev.d4nilpzz.goldenDandelion.registry;

import dev.d4nilpzz.goldenDandelion.GoldenDandelion;
import dev.d4nilpzz.goldenDandelion.item.GoldenDandelionItem;
import net.minecraft.world.item.BlockItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(GoldenDandelion.MODID);

    public static final DeferredItem<BlockItem> GOLDEN_DANDELION = ITEMS.registerItem("golden_dandelion", (properties) ->
            new GoldenDandelionItem(ModBlocks.GOLDEN_DANDELION.get(), properties));
}
