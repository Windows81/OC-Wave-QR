package com.google.zxing.oned.rss.expanded;

import java.util.List;

final class ExpandedRow {

    /* renamed from: a  reason: collision with root package name */
    public final List f32749a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f32750b;

    public boolean equals(Object obj) {
        if (!(obj instanceof ExpandedRow)) {
            return false;
        }
        ExpandedRow expandedRow = (ExpandedRow) obj;
        return this.f32749a.equals(expandedRow.f32749a) && this.f32750b == expandedRow.f32750b;
    }

    public int hashCode() {
        return this.f32749a.hashCode() ^ Boolean.valueOf(this.f32750b).hashCode();
    }

    public String toString() {
        return "{ " + this.f32749a + " }";
    }
}
