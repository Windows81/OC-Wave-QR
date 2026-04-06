package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@JvmInline
public final class ObservableScopeInvalidator {

    /* renamed from: a  reason: collision with root package name */
    public final MutableState f4960a;

    public static final void a(MutableState mutableState) {
        mutableState.getValue();
    }

    public static MutableState b(MutableState mutableState) {
        return mutableState;
    }

    public static /* synthetic */ MutableState c(MutableState mutableState, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            mutableState = SnapshotStateKt.i(Unit.f40552a, SnapshotStateKt.k());
        }
        return b(mutableState);
    }

    public static boolean d(MutableState mutableState, Object obj) {
        return (obj instanceof ObservableScopeInvalidator) && Intrinsics.d(mutableState, ((ObservableScopeInvalidator) obj).h());
    }

    public static int e(MutableState mutableState) {
        return mutableState.hashCode();
    }

    public static final void f(MutableState mutableState) {
        mutableState.setValue(Unit.f40552a);
    }

    public static String g(MutableState mutableState) {
        return "ObservableScopeInvalidator(state=" + mutableState + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f4960a, obj);
    }

    public final /* synthetic */ MutableState h() {
        return this.f4960a;
    }

    public int hashCode() {
        return e(this.f4960a);
    }

    public String toString() {
        return g(this.f4960a);
    }
}
