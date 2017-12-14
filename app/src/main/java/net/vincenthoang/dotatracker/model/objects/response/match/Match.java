package net.vincenthoang.dotatracker.model.objects.response.match;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Match {

    @SerializedName("match_id")
    @Expose
    private int matchId;
    @SerializedName("player_slot")
    @Expose
    private int playerSlot;
    @SerializedName("radiant_win")
    @Expose
    private boolean radiantWin;
    @SerializedName("duration")
    @Expose
    private int duration;
    @SerializedName("game_mode")
    @Expose
    private int gameMode;
    @SerializedName("lobby_type")
    @Expose
    private int lobbyType;
    @SerializedName("hero_id")
    @Expose
    private int heroId;
    @SerializedName("start_time")
    @Expose
    private int startTime;
    @SerializedName("version")
    @Expose
    private int version;
    @SerializedName("kills")
    @Expose
    private int kills;
    @SerializedName("deaths")
    @Expose
    private int deaths;
    @SerializedName("assists")
    @Expose
    private int assists;
    @SerializedName("skill")
    @Expose
    private int skill;
    @SerializedName("heroes")
    @Expose
    private Heroes heroes;

    /**
     * No args constructor for use in serialization
     *
     */
    public Match() {
    }

    /**
     *
     * @param assists
     * @param heroes
     * @param playerSlot
     * @param version
     * @param gameMode
     * @param startTime
     * @param duration
     * @param lobbyType
     * @param skill
     * @param radiantWin
     * @param deaths
     * @param matchId
     * @param kills
     * @param heroId
     */
    public Match(int matchId, int playerSlot, boolean radiantWin, int duration, int gameMode, int lobbyType, int heroId, int startTime, int version, int kills, int deaths, int assists, int skill, Heroes heroes) {
        super();
        this.matchId = matchId;
        this.playerSlot = playerSlot;
        this.radiantWin = radiantWin;
        this.duration = duration;
        this.gameMode = gameMode;
        this.lobbyType = lobbyType;
        this.heroId = heroId;
        this.startTime = startTime;
        this.version = version;
        this.kills = kills;
        this.deaths = deaths;
        this.assists = assists;
        this.skill = skill;
        this.heroes = heroes;
    }

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public Match withMatchId(int matchId) {
        this.matchId = matchId;
        return this;
    }

    public int getPlayerSlot() {
        return playerSlot;
    }

    public void setPlayerSlot(int playerSlot) {
        this.playerSlot = playerSlot;
    }

    public Match withPlayerSlot(int playerSlot) {
        this.playerSlot = playerSlot;
        return this;
    }

    public boolean isRadiantWin() {
        return radiantWin;
    }

    public void setRadiantWin(boolean radiantWin) {
        this.radiantWin = radiantWin;
    }

    public Match withRadiantWin(boolean radiantWin) {
        this.radiantWin = radiantWin;
        return this;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Match withDuration(int duration) {
        this.duration = duration;
        return this;
    }

    public int getGameMode() {
        return gameMode;
    }

    public void setGameMode(int gameMode) {
        this.gameMode = gameMode;
    }

    public Match withGameMode(int gameMode) {
        this.gameMode = gameMode;
        return this;
    }

    public int getLobbyType() {
        return lobbyType;
    }

    public void setLobbyType(int lobbyType) {
        this.lobbyType = lobbyType;
    }

    public Match withLobbyType(int lobbyType) {
        this.lobbyType = lobbyType;
        return this;
    }

    public int getHeroId() {
        return heroId;
    }

    public void setHeroId(int heroId) {
        this.heroId = heroId;
    }

    public Match withHeroId(int heroId) {
        this.heroId = heroId;
        return this;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public Match withStartTime(int startTime) {
        this.startTime = startTime;
        return this;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Match withVersion(int version) {
        this.version = version;
        return this;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public Match withKills(int kills) {
        this.kills = kills;
        return this;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public Match withDeaths(int deaths) {
        this.deaths = deaths;
        return this;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public Match withAssists(int assists) {
        this.assists = assists;
        return this;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public Match withSkill(int skill) {
        this.skill = skill;
        return this;
    }

    public Heroes getHeroes() {
        return heroes;
    }

    public void setHeroes(Heroes heroes) {
        this.heroes = heroes;
    }

    public Match withHeroes(Heroes heroes) {
        this.heroes = heroes;
        return this;
    }

}