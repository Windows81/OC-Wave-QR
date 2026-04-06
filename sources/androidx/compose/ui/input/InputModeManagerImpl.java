package androidx.compose.ui.input;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class InputModeManagerImpl implements InputModeManager {

    /* renamed from: a  reason: collision with root package name */
    public final Function1 f16746a;

    /* renamed from: b  reason: collision with root package name */
    public final MutableState f16747b;

    public /* synthetic */ InputModeManagerImpl(int i2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, function1);
    }

    public int a() {
        return ((InputMode) this.f16747b.getValue()).i();
    }

    public void b(int i2) {
        this.f16747b.setValue(InputMode.c(i2));
    }

    public InputModeManagerImpl(int i2, Function1 function1) {
        this.f16746a = function1;
        this.f16747b = SnapshotStateKt__SnapshotStateKt.e(InputMode.c(i2), (SnapshotMutationPolicy) null, 2, (Object) null);
    }
}
