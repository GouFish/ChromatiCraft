/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2016
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ChromatiCraft.Base;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import Reika.ChromatiCraft.ChromatiCraft;
import Reika.DragonAPI.DragonAPICore;


public abstract class BlockDimensionStructure extends Block {

	protected BlockDimensionStructure(Material mat) {
		super(mat);
		this.setResistance(60000);
		this.setBlockUnbreakable();
		this.setCreativeTab(DragonAPICore.isReikasComputer() ? ChromatiCraft.tabChromaGen : null);
	}

}
