package net.zappfire.additive_complement.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.zappfire.additive_complement.AdditiveComplement;


public class ItemRegistry {
    public static final Item TEMP = registerItem("temp",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(AdditiveComplement.MODID, name), item);
    }

    public static void registerItems() {
        AdditiveComplement.LOGGER.debug("Registering Items for " + AdditiveComplement.MODID);
    }
}
