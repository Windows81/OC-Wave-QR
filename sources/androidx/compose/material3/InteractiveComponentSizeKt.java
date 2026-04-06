package androidx.compose.material3;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata
public final class InteractiveComponentSizeKt {

    /* renamed from: a  reason: collision with root package name */
    public static final HorizontalAlignmentLine f10151a = new HorizontalAlignmentLine(InteractiveComponentSizeKt$MinimumInteractiveTopAlignmentLine$1.I);

    /* renamed from: b  reason: collision with root package name */
    public static final VerticalAlignmentLine f10152b = new VerticalAlignmentLine(InteractiveComponentSizeKt$MinimumInteractiveLeftAlignmentLine$1.I);

    /* renamed from: c  reason: collision with root package name */
    public static final ProvidableCompositionLocal f10153c = CompositionLocalKt.j(new C0096f3());

    /* renamed from: d  reason: collision with root package name */
    public static final ProvidableCompositionLocal f10154d = CompositionLocalKt.j(new C0105g3());

    public static final boolean c() {
        return true;
    }

    public static final Dp d() {
        return Dp.j(Dp.m((float) 48));
    }

    public static final ProvidableCompositionLocal e() {
        return f10154d;
    }

    public static final VerticalAlignmentLine f() {
        return f10152b;
    }

    public static final HorizontalAlignmentLine g() {
        return f10151a;
    }

    public static final Modifier h(Modifier modifier) {
        return modifier.o0(MinimumInteractiveModifier.f10310z);
    }
}
