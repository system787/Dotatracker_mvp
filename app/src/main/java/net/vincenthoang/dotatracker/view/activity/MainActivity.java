package net.vincenthoang.dotatracker.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;

import net.vincenthoang.dotatracker.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by vincenthoang on 12/13/17.
 */

public class MainActivity extends BaseActivity {

    @BindView(R.id.cardRanked)
    CardView mRankedCardView;

    @BindView(R.id.cardRecent)
    CardView mRecentCardView;

    @BindView(R.id.cardHeroes)
    CardView mHeroesCardView;

    @BindView(R.id.cardPlayers)
    CardView mPlayersCardView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.cardRanked)
    void navigateToRankedStats() {

    }

    @OnClick(R.id.cardRecent)
    void navigateToRecents() {

    }

    @OnClick(R.id.cardHeroes)
    void navigateToHeroes() {

    }

    @OnClick(R.id.cardPlayers)
    void navigateToPlayers() {

    }

}
