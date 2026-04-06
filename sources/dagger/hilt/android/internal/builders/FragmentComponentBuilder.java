package dagger.hilt.android.internal.builders;

import androidx.fragment.app.Fragment;
import dagger.hilt.android.components.FragmentComponent;

public interface FragmentComponentBuilder {
    FragmentComponentBuilder a(Fragment fragment);

    FragmentComponent d();
}
