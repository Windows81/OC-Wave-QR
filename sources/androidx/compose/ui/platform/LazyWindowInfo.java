package androidx.compose.ui.platform;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LazyWindowInfo implements WindowInfo {

    /* renamed from: a  reason: collision with root package name */
    public Function0 f17815a;

    /* renamed from: b  reason: collision with root package name */
    public MutableState f17816b;

    /* renamed from: c  reason: collision with root package name */
    public final MutableState f17817c = SnapshotStateKt__SnapshotStateKt.e(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);

    public long a() {
        if (this.f17816b == null) {
            Function0 function0 = this.f17815a;
            this.f17816b = SnapshotStateKt__SnapshotStateKt.e(IntSize.b(function0 != null ? ((IntSize) function0.invoke()).j() : IntSize.f19170b.a()), (SnapshotMutationPolicy) null, 2, (Object) null);
            this.f17815a = null;
        }
        MutableState mutableState = this.f17816b;
        Intrinsics.f(mutableState);
        return ((IntSize) mutableState.getValue()).j();
    }

    public boolean b() {
        return ((Boolean) this.f17817c.getValue()).booleanValue();
    }

    public void d(int i2) {
        WindowInfoImpl.f17921c.a().setValue(PointerKeyboardModifiers.a(i2));
    }

    public final void e(Function0 function0) {
        if (this.f17816b == null) {
            this.f17815a = function0;
        }
    }

    public void f(boolean z2) {
        this.f17817c.setValue(Boolean.valueOf(z2));
    }
}
