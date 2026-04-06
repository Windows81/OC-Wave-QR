package com.google.zxing.oned.rss.expanded;

import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.FinderPattern;
import java.util.Objects;

final class ExpandedPair {

    /* renamed from: a  reason: collision with root package name */
    public final DataCharacter f32746a;

    /* renamed from: b  reason: collision with root package name */
    public final DataCharacter f32747b;

    /* renamed from: c  reason: collision with root package name */
    public final FinderPattern f32748c;

    public boolean equals(Object obj) {
        if (!(obj instanceof ExpandedPair)) {
            return false;
        }
        ExpandedPair expandedPair = (ExpandedPair) obj;
        return Objects.equals(this.f32746a, expandedPair.f32746a) && Objects.equals(this.f32747b, expandedPair.f32747b) && Objects.equals(this.f32748c, expandedPair.f32748c);
    }

    public int hashCode() {
        return (Objects.hashCode(this.f32746a) ^ Objects.hashCode(this.f32747b)) ^ Objects.hashCode(this.f32748c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.f32746a);
        sb.append(" , ");
        sb.append(this.f32747b);
        sb.append(" : ");
        FinderPattern finderPattern = this.f32748c;
        sb.append(finderPattern == null ? "null" : Integer.valueOf(finderPattern.a()));
        sb.append(" ]");
        return sb.toString();
    }
}
