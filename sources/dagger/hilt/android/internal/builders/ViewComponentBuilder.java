package dagger.hilt.android.internal.builders;

import android.view.View;
import dagger.hilt.android.components.ViewComponent;

public interface ViewComponentBuilder {
    ViewComponentBuilder a(View view);

    ViewComponent d();
}
