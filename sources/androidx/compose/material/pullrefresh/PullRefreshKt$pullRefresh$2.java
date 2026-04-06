package androidx.compose.material.pullrefresh;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata
final /* synthetic */ class PullRefreshKt$pullRefresh$2 extends AdaptedFunctionReference implements Function2<Float, Continuation<? super Float>, Object>, SuspendFunction {
    public final Object b(float f2, Continuation continuation) {
        return Boxing.b(((PullRefreshState) this.f40864z).r(f2));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return b(((Number) obj).floatValue(), (Continuation) obj2);
    }
}
