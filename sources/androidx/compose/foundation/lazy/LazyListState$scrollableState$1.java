package androidx.compose.foundation.lazy;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyListState$scrollableState$1 extends Lambda implements Function1<Float, Float> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazyListState f4496z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListState$scrollableState$1(LazyListState lazyListState) {
        super(1);
        this.f4496z = lazyListState;
    }

    public final Float b(float f2) {
        return Float.valueOf(-this.f4496z.H(-f2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).floatValue());
    }
}
