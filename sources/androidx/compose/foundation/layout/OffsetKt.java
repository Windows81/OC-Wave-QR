package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class OffsetKt {
    public static final Modifier a(Modifier modifier, Function1 function1) {
        return modifier.o0(new OffsetPxElement(function1, true, new OffsetKt$offset$2(function1)));
    }

    public static final Modifier b(Modifier modifier, float f2, float f3) {
        return modifier.o0(new OffsetElement(f2, f3, true, new OffsetKt$offset$1(f2, f3), (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ Modifier c(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.m((float) 0);
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.m((float) 0);
        }
        return b(modifier, f2, f3);
    }
}
