package cc.isotopestudio.Capture.util;

import com.splt.epicguild.EpicGuild;
import com.splt.epicguild.guild.Guild;
import com.splt.epicguild.guild.member.GuildMember;
import com.splt.epicguild.guild.member.GuildMemberManager;
import org.bukkit.entity.Player;

/**
 * Created by Mars on 7/5/2016.
 * Copyright ISOTOPE Studio
 */
public class GuildLink {

    private static GuildMemberManager memberManager;

    public static boolean link() {
        try {
            memberManager = EpicGuild.getInstance().getGuildMemberManager();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isSameGuild(Player a, Player b) {
        GuildMember aMember = memberManager.getGuildMember(a);
        GuildMember bMember = memberManager.getGuildMember(b);
        Guild aGuild = aMember.getGuild();
        Guild bGuild = bMember.getGuild();
        return !(aGuild == null || bGuild == null) && aGuild.equals(bGuild);
    }

}
