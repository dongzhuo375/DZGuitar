package com.github.dongzhuo375.DZGuitar;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DZGuitarMod implements ModInitializer {
	public static final Item BASIC_DZ_GUITAR =  new Item(new Item.Settings().group(DZGuitarMod.GUITAR_GROUP).maxCount(1));
	public static final Item ZYH2_DZ_GUITAR =  new Item(new Item.Settings().group(DZGuitarMod.GUITAR_GROUP).maxCount(1));
	public static final Item ZYH3_DZ_GUITAR =  new Item(new Item.Settings().group(DZGuitarMod.GUITAR_GROUP).maxCount(1));
	public static final Item A_DZ_GUITAR =  new Item(new Item.Settings().group(DZGuitarMod.GUITAR_GROUP).maxCount(1));
	public static final Item B_DZ_GUITAR =  new Item(new Item.Settings().group(DZGuitarMod.GUITAR_GROUP).maxCount(1));
	public static final Item C_DZ_GUITAR =  new Item(new Item.Settings().group(DZGuitarMod.GUITAR_GROUP).maxCount(1));
	public static final Item D_DZ_GUITAR =  new Item(new Item.Settings().group(DZGuitarMod.GUITAR_GROUP).maxCount(1));
	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("dzguitar", "basic_dz_guitar"), BASIC_DZ_GUITAR);
		Registry.register(Registry.ITEM, new Identifier("dzguitar", "zyh2_dz_guitar"), ZYH2_DZ_GUITAR);
		Registry.register(Registry.ITEM, new Identifier("dzguitar", "zyh3_dz_guitar"), ZYH3_DZ_GUITAR);
		Registry.register(Registry.ITEM, new Identifier("dzguitar", "a_dz_guitar"), A_DZ_GUITAR);
		Registry.register(Registry.ITEM, new Identifier("dzguitar", "b_dz_guitar"), B_DZ_GUITAR);
		Registry.register(Registry.ITEM, new Identifier("dzguitar", "c_dz_guitar"), C_DZ_GUITAR);
		Registry.register(Registry.ITEM, new Identifier("dzguitar", "d_dz_guitar"), D_DZ_GUITAR);
		GuitarKey.register();
	}
	public static final ItemGroup GUITAR_GROUP = FabricItemGroupBuilder.create(
			new Identifier("dzguitar", "all"))
			.icon(() -> new ItemStack(BASIC_DZ_GUITAR))
			.appendItems(stacks ->
			{
				stacks.add(new ItemStack(BASIC_DZ_GUITAR));
				stacks.add(new ItemStack(ZYH2_DZ_GUITAR));
				stacks.add(new ItemStack(ZYH3_DZ_GUITAR));
				stacks.add(new ItemStack(A_DZ_GUITAR));
				stacks.add(new ItemStack(B_DZ_GUITAR));
				stacks.add(new ItemStack(C_DZ_GUITAR));
				stacks.add(new ItemStack(D_DZ_GUITAR));
			})
			.build();
}
