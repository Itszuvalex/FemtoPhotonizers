package com.n0rw0lf.femtophotonizers.blocks

import com.itszuvalex.femtocraft.Femtocraft
import net.minecraft.block.BlockContainer
import net.minecraft.block.material.Material
import net.minecraft.tileentity.TileEntity
import net.minecraft.world.World

/**
 * Created by Simon on 2015-01-01.
 */

class BlockBase extends BlockContainer(Material.iron) {
  def this(id: Int) {
    this()
    setCreativeTab(Femtocraft.femtocraftTab)
    setHardness(2F)
    }

  def createNewTileEntity(p_149915_1_ : World, p_149915_2_ : Int): TileEntity = {
    return null
  }
}


