package androidx.compose.foundation.text.selection;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Metadata;

@Metadata
public final class HandlePositionProvider implements PopupPositionProvider {

    /* renamed from: a  reason: collision with root package name */
    public final Alignment f6750a;

    /* renamed from: b  reason: collision with root package name */
    public final OffsetProvider f6751b;

    /* renamed from: c  reason: collision with root package name */
    public long f6752c = Offset.f15855b.c();

    public HandlePositionProvider(Alignment alignment, OffsetProvider offsetProvider) {
        this.f6750a = alignment;
        this.f6751b = offsetProvider;
    }

    public long a(IntRect intRect, long j2, LayoutDirection layoutDirection, long j3) {
        long a2 = this.f6751b.a();
        if ((9223372034707292159L & a2) == 9205357640488583168L) {
            a2 = this.f6752c;
        }
        this.f6752c = a2;
        return IntOffset.o(IntOffset.o(intRect.k(), IntOffsetKt.d(a2)), this.f6750a.a(j3, IntSize.f19170b.a(), layoutDirection));
    }
}
