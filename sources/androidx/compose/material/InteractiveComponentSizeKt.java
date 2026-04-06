package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import kotlin.Metadata;

@Metadata
public final class InteractiveComponentSizeKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f7905a;

    /* renamed from: b  reason: collision with root package name */
    public static final ProvidableCompositionLocal f7906b;

    /* renamed from: c  reason: collision with root package name */
    public static final long f7907c;

    static {
        ProvidableCompositionLocal j2 = CompositionLocalKt.j(InteractiveComponentSizeKt$LocalMinimumInteractiveComponentEnforcement$1.f7908z);
        f7905a = j2;
        f7906b = j2;
        float f2 = (float) 48;
        f7907c = DpKt.b(Dp.m(f2), Dp.m(f2));
    }

    public static final ProvidableCompositionLocal b() {
        return f7905a;
    }

    public static final Modifier c(Modifier modifier) {
        return modifier.o0(MinimumInteractiveModifier.f7978z);
    }
}
