package androidx.compose.foundation;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@Deprecated
public final class OverscrollConfiguration {

    /* renamed from: a  reason: collision with root package name */
    public final long f3133a;

    /* renamed from: b  reason: collision with root package name */
    public final PaddingValues f3134b;

    public /* synthetic */ OverscrollConfiguration(long j2, PaddingValues paddingValues, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, paddingValues);
    }

    public final PaddingValues a() {
        return this.f3134b;
    }

    public final long b() {
        return this.f3133a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(OverscrollConfiguration.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) obj;
        return Color.n(this.f3133a, overscrollConfiguration.f3133a) && Intrinsics.d(this.f3134b, overscrollConfiguration.f3134b);
    }

    public int hashCode() {
        return (Color.t(this.f3133a) * 31) + this.f3134b.hashCode();
    }

    public String toString() {
        return "OverscrollConfiguration(glowColor=" + Color.u(this.f3133a) + ", drawPadding=" + this.f3134b + ')';
    }

    public OverscrollConfiguration(long j2, PaddingValues paddingValues) {
        this.f3133a = j2;
        this.f3134b = paddingValues;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OverscrollConfiguration(long j2, PaddingValues paddingValues, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? ColorKt.d(4284900966L) : j2, (i2 & 2) != 0 ? PaddingKt.c(0.0f, 0.0f, 3, (Object) null) : paddingValues, (DefaultConstructorMarker) null);
    }
}
