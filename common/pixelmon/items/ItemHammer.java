package pixelmon.items;

import pixelmon.blocks.TileEntityAnvil;
import pixelmon.config.PixelmonBlocks;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ItemTool;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class ItemHammer extends ItemTool {

	public ItemHammer(int par1, EnumToolMaterial par3EnumToolMaterial, int i) {
		super(par1, 2, par3EnumToolMaterial, new Block[] { PixelmonBlocks.anvil });
		this.setIconIndex(i);
		setTextureFile("/pixelmon/image/pitems.png");
		setTabToDisplayOn(CreativeTabs.tabTools);
	}

	/**
	 * Returns if the item (tool) can harvest results from the block type.
	 */
	public boolean canHarvestBlock(Block par1Block) {
		return false;
	}

	public boolean func_77660_a(ItemStack par1ItemStack, World par2World, int par3, int par4, int par5, int par6, EntityLiving par7EntityLiving) {
		if ((double) Block.blocksList[par3].getBlockHardness(par2World, par4, par5, par6) != 0.0D) {
			par1ItemStack.damageItem(1, par7EntityLiving);
		}

		return true;
	}

	
	
	@Override
	public boolean onBlockStartBreak(ItemStack itemstack, int X, int Y, int Z, EntityPlayer player) {
		if (player.worldObj.getBlockId(X, Y, Z) == PixelmonBlocks.anvilId) {
			if (((TileEntityAnvil) player.worldObj.getBlockTileEntity(X, Y, Z)).blockHit((int)getStrVsBlock(null, PixelmonBlocks.anvil))){
				itemstack.damageItem(1, player);
			}
				
			return true;
		}
		return super.onBlockStartBreak(itemstack, X, Y, Z, player);
	}

	/**
	 * Returns the strength of the stack against a given block. 1.0F base,
	 * (Quality+1)*2 if correct blocktype, 1.5F if sword
	 */
	public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block) {
		if (par2Block == PixelmonBlocks.anvil){
			if (toolMaterial == EnumToolMaterial.WOOD)
				return 1;
			else if (toolMaterial == EnumToolMaterial.STONE)
				return 2;
			else if (toolMaterial == EnumToolMaterial.IRON)
				return 3;
			else if (toolMaterial == EnumToolMaterial.GOLD)
				return 4;
			else if (toolMaterial == EnumToolMaterial.EMERALD)
				return 5;
			
 
		}
		return 1;
	}

}
