package info.u_team.overworldmirror;

import org.apache.logging.log4j.*;

public class OverworldMirrorConstants {
	
	public static final String MODID = "overworldmirror";
	public static final String NAME = "Overworld Mirror";
	public static final String VERSION = "${version}";
	public static final String MCVERSION = "${mcversion}";
	public static final String DEPENDENCIES = "required:forge@[14.23.4.2705,);required-after:uteamcore@[2.0.0.81,);";
	public static final String UPDATEURL = "https://api.u-team.info/update/overworldmirror.json";
	
	public static final String COMMONPROXY = "info.u_team.overworldmirror.proxy.CommonProxy";
	public static final String CLIENTPROXY = "info.u_team.overworldmirror.proxy.ClientProxy";
	
	public static final Logger LOGGER = LogManager.getLogger(NAME);
	
	private OverworldMirrorConstants() {
	}
}