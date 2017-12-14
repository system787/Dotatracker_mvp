package net.vincenthoang.dotatracker.model.objects.response.match;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlayerSlot {

    @SerializedName("account_id")
    @Expose
    private int accountId;
    @SerializedName("hero_id")
    @Expose
    private int heroId;
    @SerializedName("player_slot")
    @Expose
    private int playerSlot;

    /**
     * No args constructor for use in serialization
     *
     */
    public PlayerSlot() {
    }

    /**
     *
     * @param accountId
     * @param playerSlot
     * @param heroId
     */
    public PlayerSlot(int accountId, int heroId, int playerSlot) {
        super();
        this.accountId = accountId;
        this.heroId = heroId;
        this.playerSlot = playerSlot;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public PlayerSlot withAccountId(int accountId) {
        this.accountId = accountId;
        return this;
    }

    public int getHeroId() {
        return heroId;
    }

    public void setHeroId(int heroId) {
        this.heroId = heroId;
    }

    public PlayerSlot withHeroId(int heroId) {
        this.heroId = heroId;
        return this;
    }

    public int getPlayerSlot() {
        return playerSlot;
    }

    public void setPlayerSlot(int playerSlot) {
        this.playerSlot = playerSlot;
    }

    public PlayerSlot withPlayerSlot(int playerSlot) {
        this.playerSlot = playerSlot;
        return this;
    }

}