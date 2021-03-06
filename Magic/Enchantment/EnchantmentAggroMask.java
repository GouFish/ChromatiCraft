/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2017
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ChromatiCraft.Magic.Enchantment;

import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import Reika.ChromatiCraft.Auxiliary.ProgressionManager.ProgressStage;
import Reika.ChromatiCraft.Base.ChromaticEnchantment;


public class EnchantmentAggroMask extends ChromaticEnchantment {

	public EnchantmentAggroMask(int id) {
		super(id, EnumEnchantmentType.weapon);
	}

	@Override
	public int getMaxLevel() {
		return 2;
	}

	@Override
	public boolean canApply(ItemStack is) {
		return EnumEnchantmentType.weapon.canEnchantItem(is.getItem()) || EnumEnchantmentType.bow.canEnchantItem(is.getItem());
	}

	public static boolean hidePigmanSpreadDamage(int level) {
		return level >= 1;
	}

	public static boolean hideDirectDamage(int level) {
		return level >= 2;
	}

	@Override
	public boolean isVisibleToPlayer(EntityPlayer ep) {
		return ProgressStage.KILLMOB.isPlayerAtStage(ep);
	}

}
