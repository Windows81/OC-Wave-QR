package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class SelectionHandleInfo {

    /* renamed from: a  reason: collision with root package name */
    public final Handle f6844a;

    /* renamed from: b  reason: collision with root package name */
    public final long f6845b;

    /* renamed from: c  reason: collision with root package name */
    public final SelectionHandleAnchor f6846c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f6847d;

    public /* synthetic */ SelectionHandleInfo(Handle handle, long j2, SelectionHandleAnchor selectionHandleAnchor, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(handle, j2, selectionHandleAnchor, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionHandleInfo)) {
            return false;
        }
        SelectionHandleInfo selectionHandleInfo = (SelectionHandleInfo) obj;
        return this.f6844a == selectionHandleInfo.f6844a && Offset.j(this.f6845b, selectionHandleInfo.f6845b) && this.f6846c == selectionHandleInfo.f6846c && this.f6847d == selectionHandleInfo.f6847d;
    }

    public int hashCode() {
        return (((((this.f6844a.hashCode() * 31) + Offset.o(this.f6845b)) * 31) + this.f6846c.hashCode()) * 31) + Boolean.hashCode(this.f6847d);
    }

    public String toString() {
        return "SelectionHandleInfo(handle=" + this.f6844a + ", position=" + Offset.s(this.f6845b) + ", anchor=" + this.f6846c + ", visible=" + this.f6847d + ')';
    }

    public SelectionHandleInfo(Handle handle, long j2, SelectionHandleAnchor selectionHandleAnchor, boolean z2) {
        this.f6844a = handle;
        this.f6845b = j2;
        this.f6846c = selectionHandleAnchor;
        this.f6847d = z2;
    }
}
