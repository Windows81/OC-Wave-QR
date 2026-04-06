package androidx.compose.material3;

import androidx.compose.material3.TooltipAnchorPosition;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class TooltipPositionProviderImpl implements PopupPositionProvider {

    /* renamed from: a  reason: collision with root package name */
    public final int f11617a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11618b;

    public /* synthetic */ TooltipPositionProviderImpl(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3);
    }

    public long a(IntRect intRect, long j2, LayoutDirection layoutDirection, long j3) {
        int i2 = this.f11617a;
        TooltipAnchorPosition.Companion companion = TooltipAnchorPosition.f11568b;
        return TooltipAnchorPosition.i(i2, companion.d()) ? f(intRect, j3) : TooltipAnchorPosition.i(i2, companion.e()) ? g(intRect, j3, j2) : TooltipAnchorPosition.i(i2, companion.a()) ? b(intRect, j3, j2) : TooltipAnchorPosition.i(i2, companion.b()) ? c(intRect, j3, j2) : TooltipAnchorPosition.i(i2, companion.f()) ? h(layoutDirection, intRect, j3, j2) : TooltipAnchorPosition.i(i2, companion.c()) ? d(layoutDirection, intRect, j3, j2) : b(intRect, j3, j2);
    }

    public final long b(IntRect intRect, long j2, long j3) {
        int i2 = (int) (j2 >> 32);
        int g2 = intRect.g() + ((intRect.l() - i2) / 2);
        if (g2 < 0) {
            g2 = intRect.g();
        } else if (g2 + i2 > ((int) (j3 >> 32))) {
            g2 = intRect.h() - i2;
        }
        int j4 = (intRect.j() - ((int) (j2 & 4294967295L))) - this.f11618b;
        if (j4 < 0) {
            j4 = intRect.d() + this.f11618b;
        }
        return IntOffset.f((((long) g2) << 32) | (((long) j4) & 4294967295L));
    }

    public final long c(IntRect intRect, long j2, long j3) {
        int i2 = (int) (j2 >> 32);
        int g2 = intRect.g() + ((intRect.l() - i2) / 2);
        if (g2 < 0) {
            g2 = intRect.g();
        } else if (g2 + i2 > ((int) (j3 >> 32))) {
            g2 = intRect.h() - i2;
        }
        int d2 = intRect.d() + this.f11618b;
        int i3 = (int) (j2 & 4294967295L);
        if (d2 + i3 > ((int) (j3 & 4294967295L))) {
            d2 = (intRect.j() - i3) - this.f11618b;
        }
        return IntOffset.f((((long) g2) << 32) | (((long) d2) & 4294967295L));
    }

    public final long d(LayoutDirection layoutDirection, IntRect intRect, long j2, long j3) {
        return layoutDirection == LayoutDirection.Ltr ? g(intRect, j2, j3) : f(intRect, j2);
    }

    public final int e() {
        return this.f11617a;
    }

    public final long f(IntRect intRect, long j2) {
        int g2 = intRect.g() - (((int) (j2 >> 32)) + this.f11618b);
        if (g2 < 0) {
            g2 = intRect.h() + this.f11618b;
        }
        return IntOffset.f((((long) g2) << 32) | (((long) (((intRect.j() + intRect.d()) - ((int) (j2 & 4294967295L))) / 2)) & 4294967295L));
    }

    public final long g(IntRect intRect, long j2, long j3) {
        int h2 = intRect.h() + this.f11618b;
        int i2 = (int) (j2 >> 32);
        if (h2 + i2 > ((int) (j3 >> 32))) {
            h2 = intRect.g() - (i2 + this.f11618b);
        }
        return IntOffset.f((((long) h2) << 32) | (((long) (((intRect.j() + intRect.d()) - ((int) (j2 & 4294967295L))) / 2)) & 4294967295L));
    }

    public final long h(LayoutDirection layoutDirection, IntRect intRect, long j2, long j3) {
        return layoutDirection == LayoutDirection.Ltr ? f(intRect, j2) : g(intRect, j2, j3);
    }

    public TooltipPositionProviderImpl(int i2, int i3) {
        this.f11617a = i2;
        this.f11618b = i3;
    }
}
