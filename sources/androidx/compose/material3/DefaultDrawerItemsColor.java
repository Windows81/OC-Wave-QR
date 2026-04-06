package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

@Metadata
final class DefaultDrawerItemsColor implements NavigationDrawerItemColors {

    /* renamed from: a  reason: collision with root package name */
    public final long f9825a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9826b;

    /* renamed from: c  reason: collision with root package name */
    public final long f9827c;

    /* renamed from: d  reason: collision with root package name */
    public final long f9828d;

    /* renamed from: e  reason: collision with root package name */
    public final long f9829e;

    /* renamed from: f  reason: collision with root package name */
    public final long f9830f;

    /* renamed from: g  reason: collision with root package name */
    public final long f9831g;

    /* renamed from: h  reason: collision with root package name */
    public final long f9832h;

    public State a(boolean z2, Composer composer, int i2) {
        composer.X(1141354218);
        if (ComposerKt.P()) {
            ComposerKt.Y(1141354218, i2, -1, "androidx.compose.material3.DefaultDrawerItemsColor.iconColor (NavigationDrawer.kt:1232)");
        }
        State p2 = SnapshotStateKt.p(Color.h(z2 ? this.f9825a : this.f9826b), composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return p2;
    }

    public State b(boolean z2, Composer composer, int i2) {
        composer.X(-561675044);
        if (ComposerKt.P()) {
            ComposerKt.Y(-561675044, i2, -1, "androidx.compose.material3.DefaultDrawerItemsColor.badgeColor (NavigationDrawer.kt:1249)");
        }
        State p2 = SnapshotStateKt.p(Color.h(z2 ? this.f9831g : this.f9832h), composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return p2;
    }

    public State c(boolean z2, Composer composer, int i2) {
        composer.X(1275109558);
        if (ComposerKt.P()) {
            ComposerKt.Y(1275109558, i2, -1, "androidx.compose.material3.DefaultDrawerItemsColor.textColor (NavigationDrawer.kt:1237)");
        }
        State p2 = SnapshotStateKt.p(Color.h(z2 ? this.f9827c : this.f9828d), composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return p2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultDrawerItemsColor)) {
            return false;
        }
        DefaultDrawerItemsColor defaultDrawerItemsColor = (DefaultDrawerItemsColor) obj;
        if (Color.n(this.f9825a, defaultDrawerItemsColor.f9825a) && Color.n(this.f9826b, defaultDrawerItemsColor.f9826b) && Color.n(this.f9827c, defaultDrawerItemsColor.f9827c) && Color.n(this.f9828d, defaultDrawerItemsColor.f9828d) && Color.n(this.f9829e, defaultDrawerItemsColor.f9829e) && Color.n(this.f9830f, defaultDrawerItemsColor.f9830f) && Color.n(this.f9831g, defaultDrawerItemsColor.f9831g)) {
            return Color.n(this.f9832h, defaultDrawerItemsColor.f9832h);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((Color.t(this.f9825a) * 31) + Color.t(this.f9826b)) * 31) + Color.t(this.f9827c)) * 31) + Color.t(this.f9828d)) * 31) + Color.t(this.f9829e)) * 31) + Color.t(this.f9830f)) * 31) + Color.t(this.f9831g)) * 31) + Color.t(this.f9832h);
    }
}
