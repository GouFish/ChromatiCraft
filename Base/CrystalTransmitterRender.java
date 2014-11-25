/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2014
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ChromatiCraft.Base;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.MinecraftForgeClient;

import org.lwjgl.opengl.GL11;

import Reika.ChromatiCraft.Auxiliary.ChromaFX;
import Reika.ChromatiCraft.Base.TileEntity.CrystalTransmitterBase;
import Reika.DragonAPI.Instantiable.Data.WorldLocation;
import Reika.DragonAPI.Interfaces.RenderFetcher;

public abstract class CrystalTransmitterRender extends ChromaRenderBase {

	@Override
	public final String getImageFileName(RenderFetcher te) {
		return "";
	}

	@Override
	public void renderTileEntityAt(TileEntity tile, double par2, double par4, double par6, float par8) {
		if (tile.hasWorldObj() && MinecraftForgeClient.getRenderPass() == 0) {
			CrystalTransmitterBase te = (CrystalTransmitterBase)tile;
			GL11.glPushMatrix();
			GL11.glTranslated(par2, par4, par6);
			ChromaFX.drawEnergyTransferBeams(new WorldLocation(te), te.getTargets());
			GL11.glPopMatrix();
		}
	}

}
