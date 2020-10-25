package com.github.jp.erudosan.emj.job.jobs.fisher;

import com.github.jp.erudosan.emj.Main;
import com.github.jp.erudosan.emj.job.Job;
import com.github.jp.erudosan.emj.job.JobGenre;
import org.bukkit.entity.Player;

public class Wizard extends Job {
    @Override
    public String name() {
        return "wizard";
    }

    @Override
    public JobGenre genre() {
        return JobGenre.FISHING;
    }

    @Override
    public int rank() {
        return 3;
    }

    @Override
    public void onLevelUp(Main plugin, Player player, int level) {

    }
}
