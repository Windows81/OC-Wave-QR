package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata
public final class Arrangement$SpaceEvenly$1 implements Arrangement.HorizontalOrVertical {

    /* renamed from: a  reason: collision with root package name */
    public final float f3761a = Dp.m((float) 0);

    public float a() {
        return this.f3761a;
    }

    public void b(Density density, int i2, int[] iArr, int[] iArr2) {
        Arrangement.f3739a.m(i2, iArr, iArr2, false);
    }

    public void c(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        if (layoutDirection == LayoutDirection.Ltr) {
            Arrangement.f3739a.m(i2, iArr, iArr2, false);
        } else {
            Arrangement.f3739a.m(i2, iArr, iArr2, true);
        }
    }

    public String toString() {
        return "Arrangement#SpaceEvenly";
    }
}
