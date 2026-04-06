package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.Metadata;

@Metadata
public interface FlowLineMeasurePolicy extends RowColumnMeasurePolicy {
    void a(int i2, int[] iArr, int[] iArr2, MeasureScope measureScope) {
        if (o()) {
            m().c(measureScope, i2, iArr, measureScope.getLayoutDirection(), iArr2);
            return;
        }
        n().b(measureScope, i2, iArr, iArr2);
    }

    MeasureResult d(Placeable[] placeableArr, MeasureScope measureScope, int i2, int[] iArr, int i3, int i4, int[] iArr2, int i5, int i6, int i7) {
        int i8;
        int i9;
        if (o()) {
            i9 = i3;
            i8 = i4;
        } else {
            i8 = i3;
            i9 = i4;
        }
        return MeasureScope.R1(measureScope, i9, i8, (Map) null, new FlowLineMeasurePolicy$placeHelper$1$1(iArr2, i5, i6, i7, placeableArr, this, i4, o() ? LayoutDirection.Ltr : measureScope.getLayoutDirection(), i2, iArr), 4, (Object) null);
    }

    long e(int i2, int i3, int i4, int i5, boolean z2) {
        return o() ? RowKt.a(z2, i2, i3, i4, i5) : ColumnKt.b(z2, i2, i3, i4, i5);
    }

    int g(Placeable placeable) {
        return o() ? placeable.H0() : placeable.E0();
    }

    int j(Placeable placeable) {
        return o() ? placeable.E0() : placeable.H0();
    }

    CrossAxisAlignment k();

    Arrangement.Horizontal m();

    Arrangement.Vertical n();

    boolean o();

    int p(Placeable placeable, int i2, LayoutDirection layoutDirection, int i3) {
        CrossAxisAlignment crossAxisAlignment;
        RowColumnParentData d2 = RowColumnImplKt.d(placeable);
        if (d2 == null || (crossAxisAlignment = d2.a()) == null) {
            crossAxisAlignment = k();
        }
        return crossAxisAlignment.a(i2 - j(placeable), layoutDirection, placeable, i3);
    }
}
