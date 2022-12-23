package FOBPackage.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import FOBPackage.Main;

public class CommandManager implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();

        if (!(sender instanceof Player)) // If person executing command is not a player, stop method
        {
            return true;
        }

        Player plr = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("join"))
        {

        }

        if (cmd.getName().equalsIgnoreCase("start"))
        {
            if (args[0].equalsIgnoreCase("teams"))
            {
                //Remove old teams
                Bukkit.dispatchCommand(console, "/team remove red");
                Bukkit.dispatchCommand(console, "/team remove blue");

                //Add new teams
                Bukkit.dispatchCommand(console, "/team add red Red");
                Bukkit.dispatchCommand(console, "/team add blue Blue");

                Bukkit.broadcastMessage(Chatcolor.Green + "The teams have been created!");
                Bukkit.broadcastMessage(Chatcolor.Blue + "Join team blue with /join blue");
                Bukkit.broadcastMessage(Chatcolor.Red + "Join team red with /join red");
            }

            if (args[0].equalsIgnoreCase("game"))
            {

            }
        }



        return false;
    }
}