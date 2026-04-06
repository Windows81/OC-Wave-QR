package com.google.zxing.oned.rss;

public class DataCharacter {

    /* renamed from: a  reason: collision with root package name */
    public final int f32736a;

    /* renamed from: b  reason: collision with root package name */
    public final int f32737b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof DataCharacter)) {
            return false;
        }
        DataCharacter dataCharacter = (DataCharacter) obj;
        return this.f32736a == dataCharacter.f32736a && this.f32737b == dataCharacter.f32737b;
    }

    public final int hashCode() {
        return this.f32736a ^ this.f32737b;
    }

    public final String toString() {
        return this.f32736a + "(" + this.f32737b + ')';
    }
}
