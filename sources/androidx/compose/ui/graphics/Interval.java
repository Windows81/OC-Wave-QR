package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class Interval<T> {

    /* renamed from: a  reason: collision with root package name */
    public final float f16028a;

    /* renamed from: b  reason: collision with root package name */
    public final float f16029b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f16030c;

    public Interval(float f2, float f3, Object obj) {
        this.f16028a = f2;
        this.f16029b = f3;
        this.f16030c = obj;
    }

    public final Object a() {
        return this.f16030c;
    }

    public final float b() {
        return this.f16029b;
    }

    public final float c() {
        return this.f16028a;
    }

    public final boolean d(float f2, float f3) {
        return this.f16028a <= f3 && this.f16029b >= f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Interval interval = (Interval) obj;
            return this.f16028a == interval.f16028a && this.f16029b == interval.f16029b && Intrinsics.d(this.f16030c, interval.f16030c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((Float.hashCode(this.f16028a) * 31) + Float.hashCode(this.f16029b)) * 31;
        Object obj = this.f16030c;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "Interval(start=" + this.f16028a + ", end=" + this.f16029b + ", data=" + this.f16030c + ')';
    }
}
