package androidx.navigation.compose;

import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BackStackEntryIdViewModel extends ViewModel {

    /* renamed from: b  reason: collision with root package name */
    public final String f22453b = "SaveableStateHolder_BackStackEntryKey";

    /* renamed from: c  reason: collision with root package name */
    public final UUID f22454c;

    /* renamed from: d  reason: collision with root package name */
    public WeakReference f22455d;

    public BackStackEntryIdViewModel(SavedStateHandle savedStateHandle) {
        UUID uuid = (UUID) savedStateHandle.c("SaveableStateHolder_BackStackEntryKey");
        if (uuid == null) {
            uuid = UUID.randomUUID();
            savedStateHandle.f("SaveableStateHolder_BackStackEntryKey", uuid);
        }
        this.f22454c = uuid;
    }

    public void f() {
        super.f();
        SaveableStateHolder saveableStateHolder = (SaveableStateHolder) h().get();
        if (saveableStateHolder != null) {
            saveableStateHolder.a(this.f22454c);
        }
        h().clear();
    }

    public final UUID g() {
        return this.f22454c;
    }

    public final WeakReference h() {
        WeakReference weakReference = this.f22455d;
        if (weakReference != null) {
            return weakReference;
        }
        Intrinsics.y("saveableStateHolderRef");
        return null;
    }

    public final void i(WeakReference weakReference) {
        this.f22455d = weakReference;
    }
}
