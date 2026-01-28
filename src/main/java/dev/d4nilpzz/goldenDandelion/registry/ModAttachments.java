package dev.d4nilpzz.goldenDandelion.registry;

import com.mojang.serialization.Codec;
import dev.d4nilpzz.goldenDandelion.GoldenDandelion;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModAttachments {
    public static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES = DeferredRegister.create(NeoForgeRegistries.ATTACHMENT_TYPES, GoldenDandelion.MODID);

    public static final DeferredHolder<AttachmentType<?>, AttachmentType<Boolean>> GOLDEN_EFFECT = ATTACHMENT_TYPES.register(
            "golden_effect", () -> AttachmentType.builder(() -> false).serialize(Codec.BOOL).build()
    );
}
