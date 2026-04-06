package androidx.compose.material.ripple;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;

@Metadata
public final class RippleThemeKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f9091a = CompositionLocalKt.j(RippleThemeKt$LocalRippleTheme$1.f9095z);

    /* renamed from: b  reason: collision with root package name */
    public static final RippleAlpha f9092b = new RippleAlpha(0.16f, 0.24f, 0.08f, 0.24f);

    /* renamed from: c  reason: collision with root package name */
    public static final RippleAlpha f9093c = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.12f);

    /* renamed from: d  reason: collision with root package name */
    public static final RippleAlpha f9094d = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.1f);

    public static final ProvidableCompositionLocal d() {
        return f9091a;
    }
}
