package androidx.compose.ui.window;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class AlignmentOffsetPositionProvider implements PopupPositionProvider {

    /* renamed from: a  reason: collision with root package name */
    public final Alignment f19259a;

    /* renamed from: b  reason: collision with root package name */
    public final long f19260b;

    public /* synthetic */ AlignmentOffsetPositionProvider(Alignment alignment, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(alignment, j2);
    }

    public long a(IntRect intRect, long j2, LayoutDirection layoutDirection, long j3) {
        Alignment alignment = this.f19259a;
        IntSize.Companion companion = IntSize.f19170b;
        long a2 = alignment.a(companion.a(), intRect.i(), layoutDirection);
        return IntOffset.o(IntOffset.o(IntOffset.o(intRect.k(), a2), IntOffset.q(this.f19259a.a(companion.a(), j3, layoutDirection))), IntOffset.f((((long) (IntOffset.k(this.f19260b) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1))) << 32) | (((long) IntOffset.l(this.f19260b)) & 4294967295L)));
    }

    public AlignmentOffsetPositionProvider(Alignment alignment, long j2) {
        this.f19259a = alignment;
        this.f19260b = j2;
    }
}
