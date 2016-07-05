package cc.isotopestudio.Capture;

import cc.isotopestudio.Capture.util.GuildLink;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Capture extends JavaPlugin {

    private static final String pluginName = "Capture";
    static final String prefix = (new StringBuilder()).append(ChatColor.GOLD).append(ChatColor.BOLD).append("[")
            .append("ϵͳ").append("]").append(ChatColor.RED).toString();

    @Override
    public void onEnable() {
        if (!GuildLink.link()) {

        }
        getLogger().info(pluginName + "�ɹ�����!");
        getLogger().info(pluginName + "��ISOTOPE Studio����!");
        getLogger().info("http://isotopestudio.cc");
    }

    @Override
    public void onDisable() {
        getLogger().info(pluginName + "�ɹ�ж��!");
    }

}
