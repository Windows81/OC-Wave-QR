package androidx.compose.ui.platform;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class WindowInfoImpl implements WindowInfo {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f17921c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final MutableState f17922d = SnapshotStateKt__SnapshotStateKt.e(PointerKeyboardModifiers.a(PointerEvent_androidKt.a()), (SnapshotMutationPolicy) null, 2, (Object) null);

    /* renamed from: a  reason: collision with root package name */
    public final MutableState f17923a;

    /* renamed from: b  reason: collision with root package name */
    public final MutableState f17924b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MutableState a() {
            return WindowInfoImpl.f17922d;
        }

        public Companion() {
        }
    }

    public long a() {
        return ((IntSize) this.f17923a.getValue()).j();
    }

    public boolean b() {
        return ((Boolean) this.f17924b.getValue()).booleanValue();
    }
}
