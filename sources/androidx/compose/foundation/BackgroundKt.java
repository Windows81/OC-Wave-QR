package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class BackgroundKt {
    public static final Modifier a(Modifier modifier, long j2, Shape shape) {
        return modifier.o0(new BackgroundElement(j2, (Brush) null, 1.0f, shape, InspectableValueKt.b() ? new BackgroundKt$backgroundbw27NRU$$inlined$debugInspectorInfo$1(j2, shape) : InspectableValueKt.a(), 2, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ Modifier b(Modifier modifier, long j2, Shape shape, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            shape = RectangleShapeKt.a();
        }
        return a(modifier, j2, shape);
    }
}
