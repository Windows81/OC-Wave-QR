package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.unit.IntRect;
import kotlin.Metadata;

@Metadata
final class ScrollCaptureCandidate {

    /* renamed from: a  reason: collision with root package name */
    public final SemanticsNode f18012a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18013b;

    /* renamed from: c  reason: collision with root package name */
    public final IntRect f18014c;

    /* renamed from: d  reason: collision with root package name */
    public final LayoutCoordinates f18015d;

    public ScrollCaptureCandidate(SemanticsNode semanticsNode, int i2, IntRect intRect, LayoutCoordinates layoutCoordinates) {
        this.f18012a = semanticsNode;
        this.f18013b = i2;
        this.f18014c = intRect;
        this.f18015d = layoutCoordinates;
    }

    public final LayoutCoordinates a() {
        return this.f18015d;
    }

    public final int b() {
        return this.f18013b;
    }

    public final SemanticsNode c() {
        return this.f18012a;
    }

    public final IntRect d() {
        return this.f18014c;
    }

    public String toString() {
        return "ScrollCaptureCandidate(node=" + this.f18012a + ", depth=" + this.f18013b + ", viewportBoundsInWindow=" + this.f18014c + ", coordinates=" + this.f18015d + ')';
    }
}
