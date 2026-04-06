package dagger.hilt.android.internal.builders;

import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;

public interface ActivityRetainedComponentBuilder {
    ActivityRetainedComponentBuilder a(SavedStateHandleHolder savedStateHandleHolder);

    ActivityRetainedComponent d();
}
