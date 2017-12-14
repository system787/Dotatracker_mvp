package net.vincenthoang.dotatracker.model.remote.repository;

import net.vincenthoang.dotatracker.model.objects.response.HeroesPlayed;
import net.vincenthoang.dotatracker.model.objects.response.WinLoss;
import net.vincenthoang.dotatracker.model.objects.response.profile.PlayerProfile;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by vincenthoang on 12/14/17.
 */

public interface PlayerRepository {
    Observable<PlayerProfile> profile(final long accountId);
    Observable<WinLoss> winLoss(final long accountId);
    Observable<List<HeroesPlayed>> heroesPlayedList(final long accountId);
}
