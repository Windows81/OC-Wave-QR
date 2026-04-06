package dagger.hilt.android.internal.managers;

import androidx.lifecycle.SavedStateHandle;
import dagger.Module;

@Module
abstract class SavedStateHandleModule {
    public static SavedStateHandle a(SavedStateHandleHolder savedStateHandleHolder) {
        return savedStateHandleHolder.b();
    }
}
