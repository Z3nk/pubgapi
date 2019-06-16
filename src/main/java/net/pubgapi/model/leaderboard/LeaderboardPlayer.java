package net.pubgapi.model.leaderboard;

import net.pubgapi.model.generic.Entity;
import com.google.gson.annotations.SerializedName;

public class LeaderboardPlayer extends Entity {

    @SerializedName("attributes")
    private LeaderboardPlayerAttributes leaderboardPlayerAttributes;

    public LeaderboardPlayer() {
    }

    public LeaderboardPlayerAttributes getLeaderboardPlayerAttributes() {
        return leaderboardPlayerAttributes;
    }

    public void setLeaderboardPlayerAttributes(LeaderboardPlayerAttributes leaderboardPlayerAttributes) {
        this.leaderboardPlayerAttributes = leaderboardPlayerAttributes;
    }
}
