package net.vincenthoang.dotatracker.view;

import android.content.Context;
import android.content.Intent;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by vincenthoang on 12/13/17.
 */

@Singleton
public class ViewNavigator {
    @Inject
    public ViewNavigator(){}

    public void navigateToRankedStats(Context context) {
        if (context != null) {
            Intent intent;
        }
    }

    /*  Example

     * Goes to the user list screen.
     *
     * @param context A Context needed to open the destiny activity.

    public void navigateToUserList(Context context) {
        if (context != null) {
            Intent intentToLaunch = UserListActivity.getCallingIntent(context);
            context.startActivity(intentToLaunch);
        }
    }


     * Goes to the user details screen.
     *
     * @param context A Context needed to open the destiny activity.

    public void navigateToUserDetails(Context context, int userId) {
        if (context != null) {
            Intent intentToLaunch = UserDetailsActivity.getCallingIntent(context, userId);
            context.startActivity(intentToLaunch);
        }
    }
    */
}
