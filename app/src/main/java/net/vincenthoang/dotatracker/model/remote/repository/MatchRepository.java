package net.vincenthoang.dotatracker.model.remote.repository;

import net.vincenthoang.dotatracker.model.objects.response.match.Match;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by vincenthoang on 12/14/17.
 */

public interface MatchRepository {
    Observable<List<Match>> matches(final long accountId);
}
