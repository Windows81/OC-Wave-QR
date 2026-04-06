package androidx.compose.material3;

import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.NavigationDrawerTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;

@Metadata
public final class DrawerDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final DrawerDefaults f9874a = new DrawerDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final float f9875b = ElevationTokens.f13121a.a();

    /* renamed from: c  reason: collision with root package name */
    public static final float f9876c;

    /* renamed from: d  reason: collision with root package name */
    public static final float f9877d;

    /* renamed from: e  reason: collision with root package name */
    public static final float f9878e;

    static {
        NavigationDrawerTokens navigationDrawerTokens = NavigationDrawerTokens.f13594a;
        f9876c = navigationDrawerTokens.c();
        f9877d = navigationDrawerTokens.c();
        f9878e = navigationDrawerTokens.a();
    }

    public final float a() {
        return f9876c;
    }

    public final long b(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-125949421, i2, -1, "androidx.compose.material3.DrawerDefaults.<get-standardContainerColor> (NavigationDrawer.kt:1027)");
        }
        long k2 = ColorSchemeKt.k(NavigationDrawerTokens.f13594a.b(), composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return k2;
    }
}
