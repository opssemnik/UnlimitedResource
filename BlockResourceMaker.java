package UnlimitedResource;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockResourceMaker extends BlockContainer{
    private boolean isPowerBlock;
	protected BlockResourceMaker(int par1, Material par2Material, boolean powerOrNot) {
		super(par1, par2Material);
		isPowerBlock = powerOrNot;
		this.setHardness(0F);
		this.setResistance(0F);	
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityResourceMaker();
	}

}
