package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class IconButtonColors {

    /* renamed from: a  reason: collision with root package name */
    public final long f10117a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10118b;

    /* renamed from: c  reason: collision with root package name */
    public final long f10119c;

    /* renamed from: d  reason: collision with root package name */
    public final long f10120d;

    public /* synthetic */ IconButtonColors(long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5);
    }

    public static /* synthetic */ IconButtonColors d(IconButtonColors iconButtonColors, long j2, long j3, long j4, long j5, int i2, Object obj) {
        IconButtonColors iconButtonColors2 = iconButtonColors;
        return iconButtonColors.c((i2 & 1) != 0 ? iconButtonColors2.f10117a : j2, (i2 & 2) != 0 ? iconButtonColors2.f10118b : j3, (i2 & 4) != 0 ? iconButtonColors2.f10119c : j4, (i2 & 8) != 0 ? iconButtonColors2.f10120d : j5);
    }

    public final long a(boolean z2) {
        return z2 ? this.f10117a : this.f10119c;
    }

    public final long b(boolean z2) {
        return z2 ? this.f10118b : this.f10120d;
    }

    public final IconButtonColors c(long j2, long j3, long j4, long j5) {
        return new IconButtonColors(j2 != 16 ? j2 : this.f10117a, j3 != 16 ? j3 : this.f10118b, j4 != 16 ? j4 : this.f10119c, j5 != 16 ? j5 : this.f10120d, (DefaultConstructorMarker) null);
    }

    public final long e() {
        return this.f10118b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof IconButtonColors)) {
            return false;
        }
        IconButtonColors iconButtonColors = (IconButtonColors) obj;
        return Color.n(this.f10117a, iconButtonColors.f10117a) && Color.n(this.f10118b, iconButtonColors.f10118b) && Color.n(this.f10119c, iconButtonColors.f10119c) && Color.n(this.f10120d, iconButtonColors.f10120d);
    }

    public int hashCode() {
        return (((((Color.t(this.f10117a) * 31) + Color.t(this.f10118b)) * 31) + Color.t(this.f10119c)) * 31) + Color.t(this.f10120d);
    }

    public IconButtonColors(long j2, long j3, long j4, long j5) {
        this.f10117a = j2;
        this.f10118b = j3;
        this.f10119c = j4;
        this.f10120d = j5;
    }
}
