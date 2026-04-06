package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class LayoutIdElement extends ModifierNodeElement<LayoutIdModifier> {

    /* renamed from: z  reason: collision with root package name */
    public final Object f17053z;

    public LayoutIdElement(Object obj) {
        this.f17053z = obj;
    }

    /* renamed from: c */
    public LayoutIdModifier a() {
        return new LayoutIdModifier(this.f17053z);
    }

    /* renamed from: d */
    public void b(LayoutIdModifier layoutIdModifier) {
        layoutIdModifier.Z2(this.f17053z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && Intrinsics.d(this.f17053z, ((LayoutIdElement) obj).f17053z);
    }

    public int hashCode() {
        return this.f17053z.hashCode();
    }

    public String toString() {
        return "LayoutIdElement(layoutId=" + this.f17053z + ')';
    }
}
