package UnlimitedResource;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/** 
 * Simple Class to Handle Configuration File easly
 * @author Antonio
 *
 */
public class ConfigurationManager {
  public ConfigurationManager(){} //No Constructor Needed
  /** 
   * Simple Method to handle the config, in the safiest way we can do just using forge library
   * @param FMLPreInitializationEvent
   */
  public void LoadConfig(FMLPreInitializationEvent e){
	  Configuration config = new Configuration(e.getSuggestedConfigurationFile());//Creates a new instance of the configuration manager made by the forge team
	  try{ //try and catch, just to be safe
		  config.load();
		  Props.PowerBlockId = config.get("Block Ids", "Power Block Id", 4000).getInt();
		  Props.ResourceBlockId = config.get("Block Ids", "Resource Block Id", 4001).getInt();
	  }
	  catch(Exception exception){//Something went wrong, log this and prints the error on logger
		  FMLLog.getLogger().warning("Error While handling the Configuration of UnlimitedResources mod!");
		  exception.printStackTrace();
	  }
	  finally{//If all went fine, we just check to see if something has changed, if yes we save those !.
		  if(config.hasChanged()) config.save();
	  }
  }
}
