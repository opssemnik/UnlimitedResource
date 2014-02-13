package UnlimitedResource;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "Ur",name = "Ur",version = "1.0")
@NetworkMod(clientSideRequired = true,serverSideRequired = false)
public class UnlimitedResources {
	@Instance("Ur")//creates a instance of our mod to the forge mod sorting list, without this, our mod would conflict with others
	public static UnlimitedResources mod;
	
	/**
	 * Method to handle the pre Init faze of our mode, here we add things,
	 *  add things to important lists, etc...
	 * 
	 */
	@EventHandler
	public void PreInitializate(FMLPreInitializationEvent e){
	   new ConfigurationManager().LoadConfig(e);//Creates A New Instance of our Config Manager + calls the method that handles the config
	   new Blocks().MakeBlocks(); //makes a new instance of our block handler class, and calls the method to load blocks
	}
	
}
