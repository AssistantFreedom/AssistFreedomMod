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
        aliases = "AF",
        usage = "/<command>")
public class Command_AssistFreedom extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
          TFM_Util.playerMsg(sender_p, "AssistFreedom is an addon for TotalFreedom", ChatColor.BLUE);
        TFM_Util.playerMsg(sender_p, "Bladezo is the developer of this plugin and always will be", ChatColor.BLUE);
        //TFM_Util.playerMsg(sender_p, "This is AssistFreedom", ChatColor.GREEN);
       // TFM_Util.playerMsg(sender_p, "I work hard to make an assistance plugin for TotalFreedomMod!", ChatColor.RED);
        return true;
    }
}
       
