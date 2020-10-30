package com.github.jp.erudosan.emj.job.jobs.fisher;

import com.github.jp.erudosan.emj.Main;
import com.github.jp.erudosan.emj.gui.GuiIcon;
import com.github.jp.erudosan.emj.job.Job;
import com.github.jp.erudosan.emj.job.JobGenre;
import org.bukkit.entity.Player;

public class Mage extends Job {
    public Mage(Main plugin) {
        super(plugin);
    }

    @Override
    public String name() {
        return "mage";
    }

    @Override
    public JobGenre genre() {
        return JobGenre.FISHING;
    }

    @Override
    public int rank() {
        return 4;
    }

    @Override
    public GuiIcon ItemIcon() {
        return null;
    }

    @Override
    public void onLevelUp(Player player, int level) {

    }

}
