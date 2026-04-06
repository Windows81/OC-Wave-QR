package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;

@Metadata
public final class AppBarMenuState {

    /* renamed from: a  reason: collision with root package name */
    public final MutableState f9202a;

    public final void a() {
        c(false);
    }

    public final boolean b() {
        return ((Boolean) this.f9202a.getValue()).booleanValue();
    }

    public final void c(boolean z2) {
        this.f9202a.setValue(Boolean.valueOf(z2));
    }
}
