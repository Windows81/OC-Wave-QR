package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyStaggeredGridMeasureKt$measure$1$29$1 extends Lambda implements Function1<LazyStaggeredGridMeasuredItem, CharSequence> {

    /* renamed from: z  reason: collision with root package name */
    public static final LazyStaggeredGridMeasureKt$measure$1$29$1 f5102z = new LazyStaggeredGridMeasureKt$measure$1$29$1();

    public LazyStaggeredGridMeasureKt$measure$1$29$1() {
        super(1);
    }

    /* renamed from: b */
    public final CharSequence invoke(LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem) {
        return String.valueOf(lazyStaggeredGridMeasuredItem.getIndex());
    }
}
