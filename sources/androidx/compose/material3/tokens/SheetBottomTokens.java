package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata
public final class SheetBottomTokens {

    /* renamed from: a  reason: collision with root package name */
    public static final SheetBottomTokens f13997a = new SheetBottomTokens();

    /* renamed from: b  reason: collision with root package name */
    public static final ColorSchemeKeyTokens f13998b = ColorSchemeKeyTokens.SurfaceContainerLow;

    /* renamed from: c  reason: collision with root package name */
    public static final ShapeKeyTokens f13999c = ShapeKeyTokens.CornerExtraLargeTop;

    /* renamed from: d  reason: collision with root package name */
    public static final ColorSchemeKeyTokens f14000d = ColorSchemeKeyTokens.OnSurfaceVariant;

    /* renamed from: e  reason: collision with root package name */
    public static final float f14001e = Dp.m((float) 4.0d);

    /* renamed from: f  reason: collision with root package name */
    public static final float f14002f = Dp.m((float) 32.0d);

    /* renamed from: g  reason: collision with root package name */
    public static final ShapeKeyTokens f14003g = ShapeKeyTokens.CornerNone;

    /* renamed from: h  reason: collision with root package name */
    public static final float f14004h;

    /* renamed from: i  reason: collision with root package name */
    public static final float f14005i;

    /* renamed from: j  reason: collision with root package name */
    public static final ColorSchemeKeyTokens f14006j = ColorSchemeKeyTokens.Secondary;

    static {
        ElevationTokens elevationTokens = ElevationTokens.f13121a;
        f14004h = elevationTokens.b();
        f14005i = elevationTokens.b();
    }

    public final ColorSchemeKeyTokens a() {
        return f13998b;
    }

    public final ShapeKeyTokens b() {
        return f13999c;
    }

    public final ColorSchemeKeyTokens c() {
        return f14000d;
    }

    public final float d() {
        return f14001e;
    }

    public final float e() {
        return f14002f;
    }

    public final float f() {
        return f14004h;
    }
}
