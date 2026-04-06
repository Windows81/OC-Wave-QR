package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;

@Metadata
public final class RailPredictiveBackState {

    /* renamed from: a  reason: collision with root package name */
    public final MutableState f10702a;

    public final boolean a() {
        return ((Boolean) this.f10702a.getValue()).booleanValue();
    }

    public final void b(boolean z2) {
        this.f10702a.setValue(Boolean.valueOf(z2));
    }

    public final void c(boolean z2, boolean z3) {
        b((z2 && !z3) || (!z2 && z3));
    }
}
