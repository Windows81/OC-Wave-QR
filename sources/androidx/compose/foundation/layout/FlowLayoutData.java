package androidx.compose.foundation.layout;

import kotlin.Metadata;

@Metadata
public final class FlowLayoutData {

    /* renamed from: a  reason: collision with root package name */
    public float f3936a;

    public FlowLayoutData(float f2) {
        this.f3936a = f2;
    }

    public final float a() {
        return this.f3936a;
    }

    public final void b(float f2) {
        this.f3936a = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FlowLayoutData) && Float.compare(this.f3936a, ((FlowLayoutData) obj).f3936a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f3936a);
    }

    public String toString() {
        return "FlowLayoutData(fillCrossAxisFraction=" + this.f3936a + ')';
    }
}
