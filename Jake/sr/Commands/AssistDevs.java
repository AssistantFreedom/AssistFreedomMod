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
        aliases = "AD",
        usage = "/<command>")
public class Command_AssistDevs extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
          TFM_Util.playerMsg(sender_p, "The current list of devlopers of TotalFreedomMod and AssitFreedom are", ChatColor.BLUE);
        TFM_Util.playerMsg(sender_p, "Bladezo, Prozza, Madgeek1450, DarthSalmon, AcidicCyanide, Wild1145, WickedGamingUK are the current developers", ChatColor.BLUE);
        //TFM_Util.playerMsg(sender_p, "These our a developers", ChatColor.GREEN);
       // TFM_Util.playerMsg(sender_p, "We work hard to make content for you!", ChatColor.RED);
        return true;
    }
}
       
