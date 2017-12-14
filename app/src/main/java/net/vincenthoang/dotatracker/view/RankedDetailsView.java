package net.vincenthoang.dotatracker.view;

import net.vincenthoang.dotatracker.model.objects.response.match.Match;
import net.vincenthoang.dotatracker.model.objects.response.profile.PlayerProfile;

import java.util.List;

/**
 * Created by vincenthoang on 12/14/17.
 */

public interface RankedDetailsView extends LoadDataView {

    void renderUser(PlayerProfile player);

    void renderList(List<Match> matchList);
}
