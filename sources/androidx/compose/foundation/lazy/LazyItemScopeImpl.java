package androidx.compose.foundation.lazy;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class LazyItemScopeImpl implements LazyItemScope {

    /* renamed from: a  reason: collision with root package name */
    public MutableIntState f4351a = SnapshotIntStateKt.a(Integer.MAX_VALUE);

    /* renamed from: b  reason: collision with root package name */
    public MutableIntState f4352b = SnapshotIntStateKt.a(Integer.MAX_VALUE);

    public Modifier b(Modifier modifier, float f2) {
        return modifier.o0(new ParentSizeElement(f2, this.f4351a, (State) null, "fillParentMaxWidth", 4, (DefaultConstructorMarker) null));
    }

    public final void c(int i2, int i3) {
        this.f4351a.k(i2);
        this.f4352b.k(i3);
    }
}
