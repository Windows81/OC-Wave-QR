package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
final class PointerInteropFilter_androidKt$pointerInteropFilter$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ RequestDisallowInterceptTouchEvent f16929A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f16930z;

    public final Modifier b(Modifier modifier, Composer composer, int i2) {
        composer.X(374375707);
        if (ComposerKt.P()) {
            ComposerKt.Y(374375707, i2, -1, "androidx.compose.ui.input.pointer.pointerInteropFilter.<anonymous> (PointerInteropFilter.android.kt:77)");
        }
        Object g2 = composer.g();
        if (g2 == Composer.f14567a.a()) {
            g2 = new PointerInteropFilter();
            composer.N(g2);
        }
        PointerInteropFilter pointerInteropFilter = (PointerInteropFilter) g2;
        pointerInteropFilter.d(this.f16930z);
        pointerInteropFilter.e(this.f16929A);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return pointerInteropFilter;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
