package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ButtonColors {

    /* renamed from: a  reason: collision with root package name */
    public final long f9297a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9298b;

    /* renamed from: c  reason: collision with root package name */
    public final long f9299c;

    /* renamed from: d  reason: collision with root package name */
    public final long f9300d;

    public /* synthetic */ ButtonColors(long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5);
    }

    public final long a(boolean z2) {
        return z2 ? this.f9297a : this.f9299c;
    }

    public final long b(boolean z2) {
        return z2 ? this.f9298b : this.f9300d;
    }

    public final ButtonColors c(long j2, long j3, long j4, long j5) {
        return new ButtonColors(j2 != 16 ? j2 : this.f9297a, j3 != 16 ? j3 : this.f9298b, j4 != 16 ? j4 : this.f9299c, j5 != 16 ? j5 : this.f9300d, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ButtonColors)) {
            return false;
        }
        ButtonColors buttonColors = (ButtonColors) obj;
        return Color.n(this.f9297a, buttonColors.f9297a) && Color.n(this.f9298b, buttonColors.f9298b) && Color.n(this.f9299c, buttonColors.f9299c) && Color.n(this.f9300d, buttonColors.f9300d);
    }

    public int hashCode() {
        return (((((Color.t(this.f9297a) * 31) + Color.t(this.f9298b)) * 31) + Color.t(this.f9299c)) * 31) + Color.t(this.f9300d);
    }

    public ButtonColors(long j2, long j3, long j4, long j5) {
        this.f9297a = j2;
        this.f9298b = j3;
        this.f9299c = j4;
        this.f9300d = j5;
    }
}
