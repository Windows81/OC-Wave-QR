package dagger.hilt.android.internal.managers;

import androidx.lifecycle.SavedStateHandle;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

public final class SavedStateHandleModule_ProvideSavedStateHandleFactory implements Factory<SavedStateHandle> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f39745a;

    public static SavedStateHandle b(SavedStateHandleHolder savedStateHandleHolder) {
        return (SavedStateHandle) Preconditions.d(SavedStateHandleModule.a(savedStateHandleHolder));
    }

    /* renamed from: a */
    public SavedStateHandle get() {
        return b((SavedStateHandleHolder) this.f39745a.get());
    }
}
