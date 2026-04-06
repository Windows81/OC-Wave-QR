package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata
final class DefaultTransformableState implements TransformableState {

    /* renamed from: a  reason: collision with root package name */
    public final Function3 f3444a;

    /* renamed from: b  reason: collision with root package name */
    public final TransformScope f3445b;

    /* renamed from: c  reason: collision with root package name */
    public final MutatorMutex f3446c;

    /* renamed from: d  reason: collision with root package name */
    public final MutableState f3447d;

    public Object a(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object f2 = CoroutineScopeKt.f(new DefaultTransformableState$transform$2(this, mutatePriority, function2, (Continuation) null), continuation);
        return f2 == IntrinsicsKt.f() ? f2 : Unit.f40552a;
    }

    public final Function3 e() {
        return this.f3444a;
    }
}
