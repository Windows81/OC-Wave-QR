package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Metadata;

@Metadata
public final class IntrinsicKt {
    public static final Modifier a(Modifier modifier, IntrinsicSize intrinsicSize) {
        return modifier.o0(new IntrinsicHeightElement(intrinsicSize, true, InspectableValueKt.b() ? new IntrinsicKt$height$$inlined$debugInspectorInfo$1(intrinsicSize) : InspectableValueKt.a()));
    }

    public static final Modifier b(Modifier modifier, IntrinsicSize intrinsicSize) {
        return modifier.o0(new IntrinsicWidthElement(intrinsicSize, true, InspectableValueKt.b() ? new IntrinsicKt$width$$inlined$debugInspectorInfo$1(intrinsicSize) : InspectableValueKt.a()));
    }
}
