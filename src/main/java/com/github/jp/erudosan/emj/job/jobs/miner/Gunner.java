package com.github.jp.erudosan.emj.job.jobs.miner;

import com.github.jp.erudosan.emj.Main;
import com.github.jp.erudosan.emj.gui.GUIIcon;
import com.github.jp.erudosan.emj.job.Job;
import com.github.jp.erudosan.emj.job.JobGenre;
import me.zombie_striker.qg.api.QualityArmory;
import me.zombie_striker.qg.guns.Gun;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class Gunner extends Job {
    public Gunner(Main plugin) {
        super(plugin);
    }

    @Override
    public String name() {
        return "gunner";
    }

    @Override
    public JobGenre genre() {
        return JobGenre.MINER;
    }

    @Override
    public int rank() {
        return 3;
    }

    @Override
    public GUIIcon ItemIcon() {
        Gun gun = QualityArmory.getGunByName("magnum");
        return new GUIIcon(gun.getItemStack());
    }

    @Override
    public void onLevelUp(Player player, int level) {

    }

    @Override
    public void onJobJoin(Player player) {
        String itemName = "GLOCK-17";
        List<String> lores = new ArrayList<>();
        Gun gun = QualityArmory.getGunByName("glock");

        player.getInventory().addItem(gun.getItemStack());
        player.getInventory().addItem(gun.getAmmoType().getItemStack());

        player.sendMessage("報酬として" + itemName + ChatColor.WHITE + "を手に入れた！");

    }

}
