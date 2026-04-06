package androidx.compose.ui.node;

import androidx.compose.ui.layout.MeasureResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class PlaceableResult implements OwnerScope {

    /* renamed from: A  reason: collision with root package name */
    public final LookaheadCapablePlaceable f17447A;

    /* renamed from: z  reason: collision with root package name */
    public final MeasureResult f17448z;

    public PlaceableResult(MeasureResult measureResult, LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        this.f17448z = measureResult;
        this.f17447A = lookaheadCapablePlaceable;
    }

    public final LookaheadCapablePlaceable a() {
        return this.f17447A;
    }

    public final MeasureResult b() {
        return this.f17448z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceableResult)) {
            return false;
        }
        PlaceableResult placeableResult = (PlaceableResult) obj;
        return Intrinsics.d(this.f17448z, placeableResult.f17448z) && Intrinsics.d(this.f17447A, placeableResult.f17447A);
    }

    public int hashCode() {
        return (this.f17448z.hashCode() * 31) + this.f17447A.hashCode();
    }

    public String toString() {
        return "PlaceableResult(result=" + this.f17448z + ", placeable=" + this.f17447A + ')';
    }

    public boolean v0() {
        return this.f17447A.e1().b();
    }
}
