package rimcraft_core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.neoforged.fml.common.Mod;

@Mod(RimCraftCore.MOD_ID)
public final class RimCraftCore {
    public static final String MOD_ID = "rimcraft_core";
    private static final Logger LOGGER = LoggerFactory.getLogger(RimCraftCore.class);

    public RimCraftCore() {
        LOGGER.info("RimCraft Core initialized");
    }
}
