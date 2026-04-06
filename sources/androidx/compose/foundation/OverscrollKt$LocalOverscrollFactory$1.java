package androidx.compose.foundation;

import androidx.compose.runtime.CompositionLocalAccessorScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class OverscrollKt$LocalOverscrollFactory$1 extends Lambda implements Function1<CompositionLocalAccessorScope, OverscrollFactory> {

    /* renamed from: z  reason: collision with root package name */
    public static final OverscrollKt$LocalOverscrollFactory$1 f3138z = new OverscrollKt$LocalOverscrollFactory$1();

    public OverscrollKt$LocalOverscrollFactory$1() {
        super(1);
    }

    /* renamed from: b */
    public final OverscrollFactory invoke(CompositionLocalAccessorScope compositionLocalAccessorScope) {
        return AndroidOverscroll_androidKt.b(compositionLocalAccessorScope);
    }
}
