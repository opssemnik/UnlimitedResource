package UnlimitedResource;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;


public class Blocks {
 public static BlockResourceMaker theBlock = null;
 public static int HowManyBlockWeWillCreate = 2;//Internal Thing
 public static String[] Names = new String[] {"Resource Maker","Power Maker"};//Just add the name of another block if you want
 public static Boolean[] isPowerBlock = new Boolean[]{false,true};
 
 public Blocks(){}
 /**
  * Method for Handling the Block Creaton and proprietes stuff
  */
 public void MakeBlocks(){
	for(int i = 0; i < HowManyBlockWeWillCreate;i++)
	theBlock = new BlockResourceMaker(Props.ids_array[i],Material.rock,isPowerBlock[i]);
	//Makes 2 instances of the block, one with boolean power true(so it will act as power)
	//and other with false(so it will act as resource one)
	GameRegistry.registerBlock(theBlock, "UnlimitedResourcesBlock");
	//Register our block	
 }
}
