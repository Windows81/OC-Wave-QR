package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata
public final class ClipScrollableContainerKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f3033a = Dp.m((float) 30);

    public static final Modifier a(Modifier modifier, Orientation orientation) {
        return modifier.o0(orientation == Orientation.Vertical ? ClipKt.a(Modifier.f15489d, VerticalScrollableClipShape.f3186a) : ClipKt.a(Modifier.f15489d, HorizontalScrollableClipShape.f3079a));
    }

    public static final float b() {
        return f3033a;
    }
}
