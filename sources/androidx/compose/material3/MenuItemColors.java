package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class MenuItemColors {

    /* renamed from: a  reason: collision with root package name */
    public final long f10285a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10286b;

    /* renamed from: c  reason: collision with root package name */
    public final long f10287c;

    /* renamed from: d  reason: collision with root package name */
    public final long f10288d;

    /* renamed from: e  reason: collision with root package name */
    public final long f10289e;

    /* renamed from: f  reason: collision with root package name */
    public final long f10290f;

    public /* synthetic */ MenuItemColors(long j2, long j3, long j4, long j5, long j6, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7);
    }

    public final long a(boolean z2) {
        return z2 ? this.f10286b : this.f10289e;
    }

    public final long b(boolean z2) {
        return z2 ? this.f10285a : this.f10288d;
    }

    public final long c(boolean z2) {
        return z2 ? this.f10287c : this.f10290f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MenuItemColors)) {
            return false;
        }
        MenuItemColors menuItemColors = (MenuItemColors) obj;
        return Color.n(this.f10285a, menuItemColors.f10285a) && Color.n(this.f10286b, menuItemColors.f10286b) && Color.n(this.f10287c, menuItemColors.f10287c) && Color.n(this.f10288d, menuItemColors.f10288d) && Color.n(this.f10289e, menuItemColors.f10289e) && Color.n(this.f10290f, menuItemColors.f10290f);
    }

    public int hashCode() {
        return (((((((((Color.t(this.f10285a) * 31) + Color.t(this.f10286b)) * 31) + Color.t(this.f10287c)) * 31) + Color.t(this.f10288d)) * 31) + Color.t(this.f10289e)) * 31) + Color.t(this.f10290f);
    }

    public MenuItemColors(long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f10285a = j2;
        this.f10286b = j3;
        this.f10287c = j4;
        this.f10288d = j5;
        this.f10289e = j6;
        this.f10290f = j7;
    }
}
