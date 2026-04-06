package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata
final class DefaultScrollableState implements ScrollableState {

    /* renamed from: a  reason: collision with root package name */
    public final Function1 f3437a;

    /* renamed from: b  reason: collision with root package name */
    public final ScrollScope f3438b = new DefaultScrollableState$scrollScope$1(this);

    /* renamed from: c  reason: collision with root package name */
    public final MutatorMutex f3439c = new MutatorMutex();

    /* renamed from: d  reason: collision with root package name */
    public final MutableState f3440d;

    /* renamed from: e  reason: collision with root package name */
    public final MutableState f3441e;

    /* renamed from: f  reason: collision with root package name */
    public final MutableState f3442f;

    public DefaultScrollableState(Function1 function1) {
        this.f3437a = function1;
        Boolean bool = Boolean.FALSE;
        this.f3440d = SnapshotStateKt__SnapshotStateKt.e(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f3441e = SnapshotStateKt__SnapshotStateKt.e(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f3442f = SnapshotStateKt__SnapshotStateKt.e(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    public boolean a() {
        return ((Boolean) this.f3440d.getValue()).booleanValue();
    }

    public float b(float f2) {
        return ((Number) this.f3437a.invoke(Float.valueOf(f2))).floatValue();
    }

    public Object e(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object f2 = CoroutineScopeKt.f(new DefaultScrollableState$scroll$2(this, mutatePriority, function2, (Continuation) null), continuation);
        return f2 == IntrinsicsKt.f() ? f2 : Unit.f40552a;
    }

    public final Function1 l() {
        return this.f3437a;
    }
}
