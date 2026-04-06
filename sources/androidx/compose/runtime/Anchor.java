package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata
public final class Anchor {

    /* renamed from: a  reason: collision with root package name */
    public int f14533a;

    public Anchor(int i2) {
        this.f14533a = i2;
    }

    public final int a() {
        return this.f14533a;
    }

    public final boolean b() {
        return this.f14533a != Integer.MIN_VALUE;
    }

    public final void c(int i2) {
        this.f14533a = i2;
    }

    public final int d(SlotTable slotTable) {
        return slotTable.g(this);
    }

    public final int e(SlotWriter slotWriter) {
        return slotWriter.C(this);
    }

    public String toString() {
        return super.toString() + "{ location = " + this.f14533a + " }";
    }
}
