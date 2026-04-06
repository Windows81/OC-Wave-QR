package androidx.compose.material3;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Metadata;

@Metadata
public final class TooltipDefaults$rememberTooltipPositionProvider$1$1 implements PopupPositionProvider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11589a;

    public long a(IntRect intRect, long j2, LayoutDirection layoutDirection, long j3) {
        int i2 = (int) (j3 >> 32);
        int g2 = intRect.g() + ((intRect.l() - i2) / 2);
        if (g2 < 0) {
            g2 = intRect.g();
        } else if (g2 + i2 > ((int) (j2 >> 32))) {
            g2 = intRect.h() - i2;
        }
        int j4 = (intRect.j() - ((int) (j3 & 4294967295L))) - this.f11589a;
        if (j4 < 0) {
            j4 = this.f11589a + intRect.d();
        }
        return IntOffset.f((((long) j4) & 4294967295L) | (((long) g2) << 32));
    }
}
