package dagger.hilt.android.internal.builders;

import android.view.View;
import dagger.hilt.android.components.ViewWithFragmentComponent;

public interface ViewWithFragmentComponentBuilder {
    ViewWithFragmentComponentBuilder a(View view);

    ViewWithFragmentComponent d();
}
