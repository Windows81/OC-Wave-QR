package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;

@Metadata
public interface RowColumnMeasurePolicy {
    static /* synthetic */ long l(RowColumnMeasurePolicy rowColumnMeasurePolicy, int i2, int i3, int i4, int i5, boolean z2, int i6, Object obj) {
        if (obj == null) {
            if ((i6 & 16) != 0) {
                z2 = false;
            }
            return rowColumnMeasurePolicy.e(i2, i3, i4, i5, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createConstraints-xF2OJ5Q");
    }

    void a(int i2, int[] iArr, int[] iArr2, MeasureScope measureScope);

    MeasureResult d(Placeable[] placeableArr, MeasureScope measureScope, int i2, int[] iArr, int i3, int i4, int[] iArr2, int i5, int i6, int i7);

    long e(int i2, int i3, int i4, int i5, boolean z2);

    int g(Placeable placeable);

    int j(Placeable placeable);
}
