package androidx.compose.ui.platform;

import android.os.Bundle;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.savedstate.SavedStateRegistry;

public final /* synthetic */ class v implements SavedStateRegistry.SavedStateProvider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SaveableStateRegistry f17984a;

    public /* synthetic */ v(SaveableStateRegistry saveableStateRegistry) {
        this.f17984a = saveableStateRegistry;
    }

    public final Bundle a() {
        return DisposableSaveableStateRegistry_androidKt.d(this.f17984a);
    }
}
