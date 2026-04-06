package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata
public final class Arrangement$End$1 implements Arrangement.Horizontal {
    public void c(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        if (layoutDirection == LayoutDirection.Ltr) {
            Arrangement.f3739a.j(i2, iArr, iArr2, false);
        } else {
            Arrangement.f3739a.i(iArr, iArr2, true);
        }
    }

    public String toString() {
        return "Arrangement#End";
    }
}
