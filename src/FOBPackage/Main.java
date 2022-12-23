
package FOBPackage;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
    Team red;
    Team blue;

    @Override
    public void onEnable()
    {
        CommandManager command = new CommandManager();
        getCommand("skills").setExecutor(command);

        manager = new Manager(this);
        //Need to read config.yml file

        getConfig().getKeys(false).forEach(key -> {
            //PlayerData pd = new PlayerData(this, key.get  );
            //manager.addPlayerData(pd);
        });
        getServer().getPluginManager().registerEvents(new PlayerJoinTest(this), this);
        getServer().getPluginManager().registerEvents(new SkillsListener(this), this);
        getServer().getPluginManager().registerEvents(new ItemListener(this), this);
        getLogger().info("~Feild of Battle (FOB) Plugin has been enabled~");
    }

    @Override
    public void onDisable()
    {
        getLogger().info("~Feild of Battle (FOB) Plugin has been disabled~");
    }

    public Main getPlugin()
    {
        return this;
    }
}