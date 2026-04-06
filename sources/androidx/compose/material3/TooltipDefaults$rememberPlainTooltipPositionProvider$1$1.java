package androidx.compose.material3;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Metadata;

@Metadata
public final class TooltipDefaults$rememberPlainTooltipPositionProvider$1$1 implements PopupPositionProvider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11587a;

    public long a(IntRect intRect, long j2, LayoutDirection layoutDirection, long j3) {
        int g2 = intRect.g() + ((intRect.l() - ((int) (j3 >> 32))) / 2);
        int j4 = (intRect.j() - ((int) (j3 & 4294967295L))) - this.f11587a;
        if (j4 < 0) {
            j4 = this.f11587a + intRect.d();
        }
        return IntOffset.f((((long) g2) << 32) | (((long) j4) & 4294967295L));
    }
}
