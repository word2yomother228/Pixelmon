package net.minecraft.src;

public class BlockJukeBox extends BlockContainer
{
    protected BlockJukeBox(int par1, int par2)
    {
        super(par1, par2, Material.wood);
        this.setCreativeTab(CreativeTabs.tabDeco);
    }

    /**
     * Returns the block texture based on the side being looked at.  Args: side
     */
    public int getBlockTextureFromSide(int par1)
    {
        return this.blockIndexInTexture + (par1 == 1 ? 1 : 0);
    }

    /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
        if (par1World.getBlockMetadata(par2, par3, par4) == 0)
        {
            return false;
        }
        else
        {
            this.ejectRecord(par1World, par2, par3, par4);
            return true;
        }
    }

    /**
     * Inserts the given record into the JukeBox.
     */
    public void insertRecord(World par1World, int par2, int par3, int par4, int par5)
    {
        if (!par1World.isRemote)
        {
            TileEntityRecordPlayer var6 = (TileEntityRecordPlayer)par1World.getBlockTileEntity(par2, par3, par4);

            if (var6 != null)
            {
                var6.record = par5;
                var6.onInventoryChanged();
                par1World.setBlockMetadataWithNotify(par2, par3, par4, 1);
            }
        }
    }

    /**
     * Ejects the current record inside of the jukebox.
     */
    public void ejectRecord(World par1World, int par2, int par3, int par4)
    {
        if (!par1World.isRemote)
        {
            TileEntityRecordPlayer var5 = (TileEntityRecordPlayer)par1World.getBlockTileEntity(par2, par3, par4);

            if (var5 != null)
            {
                int var6 = var5.record;

                if (var6 != 0)
                {
                    par1World.playAuxSFX(1005, par2, par3, par4, 0);
                    par1World.playRecord((String)null, par2, par3, par4);
                    var5.record = 0;
                    var5.onInventoryChanged();
                    par1World.setBlockMetadataWithNotify(par2, par3, par4, 0);
                    float var7 = 0.7F;
                    double var8 = (double)(par1World.rand.nextFloat() * var7) + (double)(1.0F - var7) * 0.5D;
                    double var10 = (double)(par1World.rand.nextFloat() * var7) + (double)(1.0F - var7) * 0.2D + 0.6D;
                    double var12 = (double)(par1World.rand.nextFloat() * var7) + (double)(1.0F - var7) * 0.5D;
                    EntityItem var14 = new EntityItem(par1World, (double)par2 + var8, (double)par3 + var10, (double)par4 + var12, new ItemStack(var6, 1, 0));
                    var14.delayBeforeCanPickup = 10;
                    par1World.spawnEntityInWorld(var14);
                }
            }
        }
    }

    /**
     * ejects contained items into the world, and notifies neighbours of an update, as appropriate
     */
    public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6)
    {
        this.ejectRecord(par1World, par2, par3, par4);
        super.breakBlock(par1World, par2, par3, par4, par5, par6);
    }

    /**
     * Drops the block items with a specified chance of dropping the specified items
     */
    public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
        if (!par1World.isRemote)
        {
            super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, 0);
        }
    }

    /**
     * each class overrdies this to return a new <className>
     */
    public TileEntity createNewTileEntity(World par1World)
    {
        return new TileEntityRecordPlayer();
    }
}
