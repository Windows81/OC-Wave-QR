package androidx.compose.ui.layout;

import androidx.compose.ui.internal.InlineClassHelperKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;

@MeasureScopeMarker
@Metadata
public interface MeasureScope extends IntrinsicMeasureScope {

    @Metadata
    public static final class DefaultImpls {
    }

    static /* synthetic */ MeasureResult R1(MeasureScope measureScope, int i2, int i3, Map map, Function1 function1, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 4) != 0) {
                map = MapsKt.h();
            }
            return measureScope.y0(i2, i3, map, function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
    }

    MeasureResult O1(int i2, int i3, Map map, Function1 function1, Function1 function12) {
        if (!((i2 & -16777216) == 0 && (-16777216 & i3) == 0)) {
            InlineClassHelperKt.c("Size(" + i2 + " x " + i3 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureScope$layout$1(i2, i3, map, function1, this, function12);
    }

    MeasureResult y0(int i2, int i3, Map map, Function1 function1) {
        return O1(i2, i3, map, (Function1) null, function1);
    }
}
