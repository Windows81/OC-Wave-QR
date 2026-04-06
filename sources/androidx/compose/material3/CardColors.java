package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class CardColors {

    /* renamed from: a  reason: collision with root package name */
    public final long f9352a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9353b;

    /* renamed from: c  reason: collision with root package name */
    public final long f9354c;

    /* renamed from: d  reason: collision with root package name */
    public final long f9355d;

    public /* synthetic */ CardColors(long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5);
    }

    public static /* synthetic */ CardColors d(CardColors cardColors, long j2, long j3, long j4, long j5, int i2, Object obj) {
        CardColors cardColors2 = cardColors;
        return cardColors.c((i2 & 1) != 0 ? cardColors2.f9352a : j2, (i2 & 2) != 0 ? cardColors2.f9353b : j3, (i2 & 4) != 0 ? cardColors2.f9354c : j4, (i2 & 8) != 0 ? cardColors2.f9355d : j5);
    }

    public final long a(boolean z2) {
        return z2 ? this.f9352a : this.f9354c;
    }

    public final long b(boolean z2) {
        return z2 ? this.f9353b : this.f9355d;
    }

    public final CardColors c(long j2, long j3, long j4, long j5) {
        return new CardColors(j2 != 16 ? j2 : this.f9352a, j3 != 16 ? j3 : this.f9353b, j4 != 16 ? j4 : this.f9354c, j5 != 16 ? j5 : this.f9355d, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CardColors)) {
            return false;
        }
        CardColors cardColors = (CardColors) obj;
        return Color.n(this.f9352a, cardColors.f9352a) && Color.n(this.f9353b, cardColors.f9353b) && Color.n(this.f9354c, cardColors.f9354c) && Color.n(this.f9355d, cardColors.f9355d);
    }

    public int hashCode() {
        return (((((Color.t(this.f9352a) * 31) + Color.t(this.f9353b)) * 31) + Color.t(this.f9354c)) * 31) + Color.t(this.f9355d);
    }

    public CardColors(long j2, long j3, long j4, long j5) {
        this.f9352a = j2;
        this.f9353b = j3;
        this.f9354c = j4;
        this.f9355d = j5;
    }
}
