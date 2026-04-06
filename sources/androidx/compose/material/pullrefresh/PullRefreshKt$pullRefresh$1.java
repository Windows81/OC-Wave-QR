package androidx.compose.material.pullrefresh;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata
final /* synthetic */ class PullRefreshKt$pullRefresh$1 extends FunctionReferenceImpl implements Function1<Float, Float> {
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return v(((Number) obj).floatValue());
    }

    public final Float v(float f2) {
        return Float.valueOf(((PullRefreshState) this.f40885A).q(f2));
    }
}
