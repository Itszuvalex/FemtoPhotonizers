package com.n0rw0lf.femtophotonizers

/**
 * Created by Simon Hawkenson (N0rw0lf) on 2014-12-13.
 */

import net.minecraft.block.Block
import cpw.mods.fml.common.Mod.EventHandler
import cpw.mods.fml.common.event.{FMLPreInitializationEvent, FMLInitializationEvent, FMLPostInitializationEvent}
import cpw.mods.fml.common.{FMLCommonHandler, Mod, SidedProxy}
import cpw.mods.fml.relauncher.Side
import org.apache.logging.log4j.{Logger, LogManager}

@Mod(modid = FemtoPhotonizers.ID, name = "FemtoPhotonizers", version = FemtoPhotonizers.VERSION, modLanguage = "scala")
object FemtoPhotonizers {

  final val ID = "FemtoPhotonizers"
  final val VERSION = "0.0"

  var log = LogManager.getLogger("FemtoPhotonizers")

  var logger                                : Logger                      = LogManager.getLogger("FemtoPhotonizers")

  var nanoFrame                             : Block                       = null
  var nanoPhotonizer                        : Block                       = null
  var femtoFrame                            : Block                       = null
  var femtoPhotonizer                       : Block                       = null

}
