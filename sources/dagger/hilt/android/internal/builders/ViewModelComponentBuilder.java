package dagger.hilt.android.internal.builders;

import androidx.lifecycle.SavedStateHandle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.components.ViewModelComponent;

public interface ViewModelComponentBuilder {
    ViewModelComponentBuilder a(ViewModelLifecycle viewModelLifecycle);

    ViewModelComponentBuilder b(SavedStateHandle savedStateHandle);

    ViewModelComponent d();
}
