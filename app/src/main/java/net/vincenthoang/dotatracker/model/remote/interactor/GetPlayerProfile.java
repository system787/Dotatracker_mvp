package net.vincenthoang.dotatracker.model.remote.interactor;

import net.vincenthoang.dotatracker.model.objects.response.profile.PlayerProfile;
import net.vincenthoang.dotatracker.model.remote.executor.PostExecutionThread;
import net.vincenthoang.dotatracker.model.remote.executor.ThreadExecutor;
import net.vincenthoang.dotatracker.model.remote.repository.PlayerRepository;

import javax.inject.Inject;

import dagger.internal.Preconditions;
import io.reactivex.Observable;

/**
 * Created by vincenthoang on 12/14/17.
 */

public class GetPlayerProfile extends UseCase<PlayerProfile, GetPlayerProfile.Params> {

    private final PlayerRepository mPlayerRepository;

    @Inject
    GetPlayerProfile(PlayerRepository playerRepository, ThreadExecutor threadExecutor,
                     PostExecutionThread postExecutionThread) {
        super(threadExecutor, postExecutionThread);
        this.mPlayerRepository = playerRepository;
    }

    @Override
    Observable<PlayerProfile> buildUseCaseObservable(Params params) {
        Preconditions.checkNotNull(params);
        return this.mPlayerRepository.profile(params.accountId);
    }

    public static final class Params {
        private final long accountId;

        private Params(long accountId) {
            this.accountId = accountId;
        }

        public static Params forPlayerProfile(long accountId) {
            return new Params(accountId);
        }
    }
}
