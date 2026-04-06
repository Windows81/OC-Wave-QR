package androidx.compose.material3.internal;

import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class DraggableAnchorsElementV2<T> extends ModifierNodeElement<DraggableAnchorsNodeV2<T>> {

    /* renamed from: A  reason: collision with root package name */
    public final Function2 f12222A;

    /* renamed from: B  reason: collision with root package name */
    public final Orientation f12223B;

    /* renamed from: z  reason: collision with root package name */
    public final AnchoredDraggableState f12224z;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElementV2)) {
            return false;
        }
        DraggableAnchorsElementV2 draggableAnchorsElementV2 = (DraggableAnchorsElementV2) obj;
        return Intrinsics.d(this.f12224z, draggableAnchorsElementV2.f12224z) && this.f12222A == draggableAnchorsElementV2.f12222A && this.f12223B == draggableAnchorsElementV2.f12223B;
    }

    /* renamed from: g */
    public DraggableAnchorsNodeV2 a() {
        return new DraggableAnchorsNodeV2(this.f12224z, this.f12222A, this.f12223B);
    }

    /* renamed from: h */
    public void b(DraggableAnchorsNodeV2 draggableAnchorsNodeV2) {
        draggableAnchorsNodeV2.g3(this.f12224z);
        draggableAnchorsNodeV2.e3(this.f12222A);
        draggableAnchorsNodeV2.f3(this.f12223B);
    }

    public int hashCode() {
        return (((this.f12224z.hashCode() * 31) + this.f12222A.hashCode()) * 31) + this.f12223B.hashCode();
    }
}
