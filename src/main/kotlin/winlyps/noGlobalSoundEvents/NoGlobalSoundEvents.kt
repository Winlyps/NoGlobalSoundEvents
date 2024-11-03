package winlyps.noGlobalSoundEvents

import org.bukkit.plugin.java.JavaPlugin

class NoGlobalSoundEvents : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("globalSoundEvents", "false")
        }
        logger.info("NoGlobalSoundEvents plugin has been enabled.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("globalSoundEvents", "true")
            logger.info("NoGlobalSoundEvents plugin has been disabled.")
        }
    }
}