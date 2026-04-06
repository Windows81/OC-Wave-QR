package androidx.compose.material3;

import androidx.compose.animation.core.EasingKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class TopAppBarColors {

    /* renamed from: a  reason: collision with root package name */
    public final long f11625a;

    /* renamed from: b  reason: collision with root package name */
    public final long f11626b;

    /* renamed from: c  reason: collision with root package name */
    public final long f11627c;

    /* renamed from: d  reason: collision with root package name */
    public final long f11628d;

    /* renamed from: e  reason: collision with root package name */
    public final long f11629e;

    /* renamed from: f  reason: collision with root package name */
    public final long f11630f;

    public /* synthetic */ TopAppBarColors(long j2, long j3, long j4, long j5, long j6, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7);
    }

    public final long a(float f2) {
        return ColorKt.h(this.f11625a, this.f11626b, EasingKt.c().a(f2));
    }

    public final long b() {
        return this.f11629e;
    }

    public final long c() {
        return this.f11627c;
    }

    public final long d() {
        return this.f11630f;
    }

    public final long e() {
        return this.f11628d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TopAppBarColors)) {
            return false;
        }
        TopAppBarColors topAppBarColors = (TopAppBarColors) obj;
        return Color.n(this.f11625a, topAppBarColors.f11625a) && Color.n(this.f11626b, topAppBarColors.f11626b) && Color.n(this.f11627c, topAppBarColors.f11627c) && Color.n(this.f11628d, topAppBarColors.f11628d) && Color.n(this.f11629e, topAppBarColors.f11629e) && Color.n(this.f11630f, topAppBarColors.f11630f);
    }

    public int hashCode() {
        return (((((((((Color.t(this.f11625a) * 31) + Color.t(this.f11626b)) * 31) + Color.t(this.f11627c)) * 31) + Color.t(this.f11628d)) * 31) + Color.t(this.f11629e)) * 31) + Color.t(this.f11630f);
    }

    public TopAppBarColors(long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f11625a = j2;
        this.f11626b = j3;
        this.f11627c = j4;
        this.f11628d = j5;
        this.f11629e = j6;
        this.f11630f = j7;
    }
}
