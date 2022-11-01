package net.deco.decomod.item;

import net.deco.decomod.DecoMod;
import net.deco.decomod.item.custom.FireSwordItem;
import net.deco.decomod.item.custom.ModArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DecoMod.MOD_ID);

    public static final RegistryObject<Item> HELLSTONE_RAW = ITEMS.register("hellstone_raw",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOD_TAB)));
    public static final RegistryObject<Item> HELLSTONE_INGOT = ITEMS.register("hellstone_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOD_TAB)));

    public static final RegistryObject<Item> CUCUMBER = ITEMS.register("cucumber",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOD_TAB).food(ModFoods.CUCUMBER)));

    public static final RegistryObject<Item> HELLSTONE_SWORD = ITEMS.register("hellstone_sword",
            () -> new FireSwordItem(ModTiers.HELLSTONE, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_TAB).fireResistant()));
    public static final RegistryObject<Item> HELLSTONE_PICKAXE = ITEMS.register("hellstone_pickaxe",
            () -> new PickaxeItem(ModTiers.HELLSTONE, 1, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_TAB).fireResistant()));
    public static final RegistryObject<Item> HELLSTONE_AXE = ITEMS.register("hellstone_axe",
            () -> new AxeItem(ModTiers.HELLSTONE, 4, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_TAB).fireResistant()));

    public static final RegistryObject<Item> HELLSTONE_HELMET = ITEMS.register("hellstone_helmet",
            () -> new ModArmorItem(ModArmorMaterials.HELLSTONE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_TAB)));
    public static final RegistryObject<Item> HELLSTONE_CHESTPLATE = ITEMS.register("hellstone_chestplate",
            () -> new ArmorItem(ModArmorMaterials.HELLSTONE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_TAB)));
    public static final RegistryObject<Item> HELLSTONE_LEGGING = ITEMS.register("hellstone_leggings",
            () -> new ArmorItem(ModArmorMaterials.HELLSTONE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_TAB)));
    public static final RegistryObject<Item> HELLSTONE_BOOTS = ITEMS.register("hellstone_boots",
            () -> new ArmorItem(ModArmorMaterials.HELLSTONE, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
