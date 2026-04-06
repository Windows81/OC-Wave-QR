package androidx.compose.material3;

import androidx.compose.material3.tokens.NavigationBarHorizontalItemTokens;
import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.material3.tokens.NavigationBarVerticalItemTokens;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.math.MathKt;

@Metadata
public final class ShortNavigationBarKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f11020a = CompositionLocalKt.h((SnapshotMutationPolicy) null, new Z5(), 1, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    public static final float f11021b;

    /* renamed from: c  reason: collision with root package name */
    public static final float f11022c;

    /* renamed from: d  reason: collision with root package name */
    public static final float f11023d;

    /* renamed from: e  reason: collision with root package name */
    public static final float f11024e;

    /* renamed from: f  reason: collision with root package name */
    public static final float f11025f = Dp.m((float) 4);

    /* renamed from: g  reason: collision with root package name */
    public static final float f11026g;

    /* renamed from: h  reason: collision with root package name */
    public static final float f11027h = NavigationBarTokens.f13572a.b();

    static {
        NavigationBarVerticalItemTokens navigationBarVerticalItemTokens = NavigationBarVerticalItemTokens.f13587a;
        f11021b = navigationBarVerticalItemTokens.c();
        float f2 = (float) 2;
        f11022c = Dp.m(Dp.m(navigationBarVerticalItemTokens.a() - navigationBarVerticalItemTokens.d()) / f2);
        f11023d = Dp.m(Dp.m(navigationBarVerticalItemTokens.b() - navigationBarVerticalItemTokens.d()) / f2);
        NavigationBarHorizontalItemTokens navigationBarHorizontalItemTokens = NavigationBarHorizontalItemTokens.f13567a;
        f11024e = Dp.m(Dp.m(navigationBarHorizontalItemTokens.a() - navigationBarHorizontalItemTokens.c()) / f2);
        f11026g = navigationBarHorizontalItemTokens.b();
    }

    public static final ShortNavigationBarOverride b() {
        return DefaultShortNavigationBarOverride.f9842a;
    }

    public static final int d(int i2, int i3) {
        if (i2 > 6) {
            return 0;
        }
        return MathKt.d(((((float) (100 - ((i2 + 3) * 10))) / 2.0f) / ((float) 100)) * ((float) i3));
    }
}
