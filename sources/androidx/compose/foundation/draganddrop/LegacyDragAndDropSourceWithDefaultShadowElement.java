package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class LegacyDragAndDropSourceWithDefaultShadowElement extends ModifierNodeElement<LegacyDragSourceNodeWithDefaultPainter> {

    /* renamed from: z  reason: collision with root package name */
    public final Function2 f3317z;

    /* renamed from: c */
    public LegacyDragSourceNodeWithDefaultPainter a() {
        return new LegacyDragSourceNodeWithDefaultPainter(this.f3317z);
    }

    /* renamed from: d */
    public void b(LegacyDragSourceNodeWithDefaultPainter legacyDragSourceNodeWithDefaultPainter) {
        legacyDragSourceNodeWithDefaultPainter.g3(this.f3317z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyDragAndDropSourceWithDefaultShadowElement)) {
            return false;
        }
        return Intrinsics.d(this.f3317z, ((LegacyDragAndDropSourceWithDefaultShadowElement) obj).f3317z);
    }

    public int hashCode() {
        return this.f3317z.hashCode();
    }
}
