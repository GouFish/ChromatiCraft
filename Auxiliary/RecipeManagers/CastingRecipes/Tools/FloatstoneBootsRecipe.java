/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2016
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.Tools;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import Reika.ChromatiCraft.Auxiliary.ChromaStacks;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipe.PylonRecipe;
import Reika.ChromatiCraft.Registry.CrystalElement;


public class FloatstoneBootsRecipe extends PylonRecipe {

	private final ItemStack special;

	public FloatstoneBootsRecipe(ItemStack out, ItemStack main, boolean specialArmor) {
		super(out, main);
		special = specialArmor ? main : null;

		this.addAuxItem(ChromaStacks.floatstone, -4, 2);
		this.addAuxItem(ChromaStacks.floatstone, 0, 2);
		this.addAuxItem(ChromaStacks.floatstone, 4, 2);
		this.addAuxItem(ChromaStacks.floatstone, 2, 4);
		this.addAuxItem(ChromaStacks.floatstone, -2, 4);

		this.addAuxItem(ChromaStacks.bindingCrystal, -2, 2);
		this.addAuxItem(ChromaStacks.bindingCrystal, 2, 2);

		this.addAuxItem(ChromaStacks.resocrystal, -4, -2);
		this.addAuxItem(ChromaStacks.resocrystal, -4, 0);
		this.addAuxItem(ChromaStacks.resocrystal, 4, -2);
		this.addAuxItem(ChromaStacks.resocrystal, 4, 0);

		this.addAuxItem(ChromaStacks.spaceIngot, 2, 0);
		this.addAuxItem(ChromaStacks.spaceIngot, -2, 0);
		this.addAuxItem(ChromaStacks.spaceIngot, 0, -2);

		this.addAuraRequirement(CrystalElement.LIME, 20000);
		this.addAuraRequirement(CrystalElement.BROWN, 1000);
	}

	@Override
	public NBTTagCompound getOutputTag(NBTTagCompound input) {
		if (special != null) {
			NBTTagCompound nbt = input != null ? (NBTTagCompound)input.copy() : new NBTTagCompound();
			NBTTagCompound tag = new NBTTagCompound();
			special.writeToNBT(tag);
			nbt.setTag("special", tag);
			return nbt;
		}
		return null;
	}

}
