package androidx.compose.material3;

import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DragHandleShapes {

    /* renamed from: a  reason: collision with root package name */
    public final Shape f9868a;

    /* renamed from: b  reason: collision with root package name */
    public final Shape f9869b;

    /* renamed from: c  reason: collision with root package name */
    public final Shape f9870c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DragHandleShapes)) {
            return false;
        }
        DragHandleShapes dragHandleShapes = (DragHandleShapes) obj;
        return Intrinsics.d(this.f9868a, dragHandleShapes.f9868a) && Intrinsics.d(this.f9869b, dragHandleShapes.f9869b) && Intrinsics.d(this.f9870c, dragHandleShapes.f9870c);
    }

    public int hashCode() {
        return (((this.f9868a.hashCode() * 31) + this.f9869b.hashCode()) * 31) + this.f9870c.hashCode();
    }
}
