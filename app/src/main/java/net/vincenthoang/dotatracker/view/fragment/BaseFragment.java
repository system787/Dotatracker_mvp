package net.vincenthoang.dotatracker.view.fragment;

import android.app.Fragment;
import android.widget.Toast;

import net.vincenthoang.dotatracker.presenter.modules.HasComponent;

/**
 * Created by vincenthoang on 12/13/17.
 */

public abstract class BaseFragment extends Fragment {

    protected void showToastMessage(String message) {
        Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
    }

    @SuppressWarnings("unchecked")
    protected <C> C getComponent(Class<C> componentType) {
        return componentType.cast(((HasComponent<C>) getActivity()).getComponent());
    }
}
