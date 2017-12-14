package net.vincenthoang.dotatracker.model.objects.response.match;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Heroes {

    @SerializedName("player_slot")
    @Expose
    private PlayerSlot playerSlot;

    /**
     * No args constructor for use in serialization
     *
     */
    public Heroes() {
    }

    /**
     *
     * @param playerSlot
     */
    public Heroes(PlayerSlot playerSlot) {
        super();
        this.playerSlot = playerSlot;
    }

    public PlayerSlot getPlayerSlot() {
        return playerSlot;
    }

    public void setPlayerSlot(PlayerSlot playerSlot) {
        this.playerSlot = playerSlot;
    }

    public Heroes withPlayerSlot(PlayerSlot playerSlot) {
        this.playerSlot = playerSlot;
        return this;
    }

}

