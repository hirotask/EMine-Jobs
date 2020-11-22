package com.github.jp.erudosan.emj.job.jobs.lamber;

import com.github.jp.erudosan.emj.Main;
import com.github.jp.erudosan.emj.gui.GUIIcon;
import com.github.jp.erudosan.emj.job.Job;
import com.github.jp.erudosan.emj.job.JobGenre;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class Lamber extends Job {

    public Lamber(Main plugin) {
        super(plugin);
    }

    @Override
    public String name() {
        return "lamber";
    }

    @Override
    public JobGenre genre() {
        return JobGenre.LAMBER;
    }

    @Override
    public int rank() {
        return 1;
    }

    @Override
    public GUIIcon ItemIcon() {
        return new GUIIcon(Material.STONE_AXE,plugin.getHandler().getCaption("lamber"));
    }

    @Override
    public void onLevelUp(Player player, int level) {

    }

    @Override
    public void onJobJoin(Player player) {

    }

}
