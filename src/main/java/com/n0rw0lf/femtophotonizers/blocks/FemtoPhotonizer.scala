package com.n0rw0lf.femtophotonizers.blocks

import com.n0rw0lf.femtophotonizers.FemtoPhotonizers
import cpw.mods.fml.relauncher.{SideOnly, Side}
import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.client.renderer.texture.IIconRegister
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.util.IIcon
import net.minecraft.world.World

/**
 * Created by Simon on 2014-12-13.
 */
class FemtoPhotonizer(material: Material) extends Block(material){

  @SideOnly(Side.CLIENT)
  private var plate : IIcon = null
  @SideOnly(Side.CLIENT)
  private var front : IIcon = null
  @SideOnly(Side.CLIENT)
  private var left : IIcon = null
  @SideOnly(Side.CLIENT)
  private var right : IIcon = null

  var isConverting : Boolean = true

  @SideOnly(Side.CLIENT)
  override def registerBlockIcons(iconregister:IIconRegister): Unit = {
    blockIcon = iconregister.registerIcon(FemtoPhotonizers.ID + ":FemtoPhotonizerPlate")
    front = iconregister.registerIcon(if(this.isConverting) FemtoPhotonizers.ID + ":FemtoPhotonizerFrontOn" else FemtoPhotonizers.ID + "FemtoPhotonizerFrontOff")
    left = iconregister.registerIcon(if(this.isConverting) FemtoPhotonizers.ID + ":FemtoPhotonizerLeftOn" else FemtoPhotonizers.ID + "FemtoPhotonizerLeftOff")
    right = iconregister.registerIcon(if(this.isConverting) FemtoPhotonizers.ID + "FemtoPhotonizerRightOn" else FemtoPhotonizers.ID + "FemtoPhotonizerRightOff")
  }

  override def getIcon (side:Int, meta:Int) : IIcon = {
    if(side==2) {
      return null
    }
    else if(side==3) {
      return front
    }
    else {
      return plate
    }
  }

  def onActivated (world: World, x:Int, y:Int, z:Int, player:EntityPlayer, par6:Int, par7:Float, par8:Float, par9:Float) : Boolean =

    return true
}
