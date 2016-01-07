package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_Util;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
//upated by looperXD
@CommandPermissions(level = AdminLevel.ALL, source = SourceType.BOTH)
@CommandParameters(
        description = "The Developers of AssistFreedom.",
        aliases = "AT",
        usage = "/<command>")
public class Command_About extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
          TFM_Util.playerMsg(sender_p, "TotalFreedomMod was made for a FreeOP server TotalFreedom that you can do anything one, some commands are blocked", ChatColor.BLUE);
        TFM_Util.playerMsg(sender_p, "So me Bladezo after learning java i said i should make an assist plugin for it", ChatColor.BLUE);
        //TFM_Util.playerMsg(sender_p, "So i made AssitFreedom just a few commands with basic java that can help TotalFreedomMod", ChatColor.GREEN);
       // TFM_Util.playerMsg(sender_p, "Saves work for our developers!!", ChatColor.RED);
        return true;
    }
}
       
