package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata
public final class AppBarTokens {

    /* renamed from: a  reason: collision with root package name */
    public static final AppBarTokens f12745a = new AppBarTokens();

    /* renamed from: b  reason: collision with root package name */
    public static final float f12746b = Dp.m((float) 32.0d);

    /* renamed from: c  reason: collision with root package name */
    public static final ColorSchemeKeyTokens f12747c = ColorSchemeKeyTokens.Surface;

    /* renamed from: d  reason: collision with root package name */
    public static final float f12748d;

    /* renamed from: e  reason: collision with root package name */
    public static final ShapeKeyTokens f12749e = ShapeKeyTokens.CornerNone;

    /* renamed from: f  reason: collision with root package name */
    public static final float f12750f = Dp.m((float) 0.0d);

    /* renamed from: g  reason: collision with root package name */
    public static final float f12751g = Dp.m((float) 24.0d);

    /* renamed from: h  reason: collision with root package name */
    public static final ColorSchemeKeyTokens f12752h;

    /* renamed from: i  reason: collision with root package name */
    public static final float f12753i;

    /* renamed from: j  reason: collision with root package name */
    public static final ColorSchemeKeyTokens f12754j = ColorSchemeKeyTokens.SurfaceContainer;

    /* renamed from: k  reason: collision with root package name */
    public static final float f12755k;

    /* renamed from: l  reason: collision with root package name */
    public static final ColorSchemeKeyTokens f12756l;

    /* renamed from: m  reason: collision with root package name */
    public static final ColorSchemeKeyTokens f12757m;

    /* renamed from: n  reason: collision with root package name */
    public static final ColorSchemeKeyTokens f12758n;

    /* renamed from: o  reason: collision with root package name */
    public static final float f12759o;

    static {
        ElevationTokens elevationTokens = ElevationTokens.f13121a;
        f12748d = elevationTokens.a();
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        f12752h = colorSchemeKeyTokens;
        float f2 = (float) 4.0d;
        f12753i = Dp.m(f2);
        f12755k = elevationTokens.c();
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurfaceVariant;
        f12756l = colorSchemeKeyTokens2;
        f12757m = colorSchemeKeyTokens;
        f12758n = colorSchemeKeyTokens2;
        f12759o = Dp.m(f2);
    }

    public final ColorSchemeKeyTokens a() {
        return f12747c;
    }

    public final ColorSchemeKeyTokens b() {
        return f12752h;
    }

    public final ColorSchemeKeyTokens c() {
        return f12754j;
    }

    public final ColorSchemeKeyTokens d() {
        return f12756l;
    }

    public final ColorSchemeKeyTokens e() {
        return f12757m;
    }

    public final ColorSchemeKeyTokens f() {
        return f12758n;
    }
}
