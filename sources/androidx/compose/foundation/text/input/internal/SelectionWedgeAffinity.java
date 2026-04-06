package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;

@Metadata
public final class SelectionWedgeAffinity {

    /* renamed from: a  reason: collision with root package name */
    public final WedgeAffinity f6277a;

    /* renamed from: b  reason: collision with root package name */
    public final WedgeAffinity f6278b;

    public SelectionWedgeAffinity(WedgeAffinity wedgeAffinity, WedgeAffinity wedgeAffinity2) {
        this.f6277a = wedgeAffinity;
        this.f6278b = wedgeAffinity2;
    }

    public static /* synthetic */ SelectionWedgeAffinity b(SelectionWedgeAffinity selectionWedgeAffinity, WedgeAffinity wedgeAffinity, WedgeAffinity wedgeAffinity2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            wedgeAffinity = selectionWedgeAffinity.f6277a;
        }
        if ((i2 & 2) != 0) {
            wedgeAffinity2 = selectionWedgeAffinity.f6278b;
        }
        return selectionWedgeAffinity.a(wedgeAffinity, wedgeAffinity2);
    }

    public final SelectionWedgeAffinity a(WedgeAffinity wedgeAffinity, WedgeAffinity wedgeAffinity2) {
        return new SelectionWedgeAffinity(wedgeAffinity, wedgeAffinity2);
    }

    public final WedgeAffinity c() {
        return this.f6278b;
    }

    public final WedgeAffinity d() {
        return this.f6277a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionWedgeAffinity)) {
            return false;
        }
        SelectionWedgeAffinity selectionWedgeAffinity = (SelectionWedgeAffinity) obj;
        return this.f6277a == selectionWedgeAffinity.f6277a && this.f6278b == selectionWedgeAffinity.f6278b;
    }

    public int hashCode() {
        return (this.f6277a.hashCode() * 31) + this.f6278b.hashCode();
    }

    public String toString() {
        return "SelectionWedgeAffinity(startAffinity=" + this.f6277a + ", endAffinity=" + this.f6278b + ')';
    }

    public SelectionWedgeAffinity(WedgeAffinity wedgeAffinity) {
        this(wedgeAffinity, wedgeAffinity);
    }
}
