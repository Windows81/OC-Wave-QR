package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;

@Metadata
public final class LazyLayoutBeyondBoundsInfo {

    /* renamed from: b  reason: collision with root package name */
    public static final int f4785b = MutableVector.C;

    /* renamed from: a  reason: collision with root package name */
    public final MutableVector f4786a = new MutableVector(new Interval[16], 0);

    @Metadata
    public static final class Interval {

        /* renamed from: a  reason: collision with root package name */
        public final int f4787a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4788b;

        public Interval(int i2, int i3) {
            this.f4787a = i2;
            this.f4788b = i3;
            boolean z2 = false;
            if (!(i2 >= 0)) {
                InlineClassHelperKt.a("negative start index");
            }
            if (!(i3 >= i2 ? true : z2)) {
                InlineClassHelperKt.a("end index greater than start");
            }
        }

        public final int a() {
            return this.f4788b;
        }

        public final int b() {
            return this.f4787a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Interval)) {
                return false;
            }
            Interval interval = (Interval) obj;
            return this.f4787a == interval.f4787a && this.f4788b == interval.f4788b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f4787a) * 31) + Integer.hashCode(this.f4788b);
        }

        public String toString() {
            return "Interval(start=" + this.f4787a + ", end=" + this.f4788b + ')';
        }
    }

    public final Interval a(int i2, int i3) {
        Interval interval = new Interval(i2, i3);
        this.f4786a.d(interval);
        return interval;
    }

    public final int b() {
        int a2 = ((Interval) this.f4786a.o()).a();
        MutableVector mutableVector = this.f4786a;
        Object[] objArr = mutableVector.f15005z;
        int p2 = mutableVector.p();
        for (int i2 = 0; i2 < p2; i2++) {
            Interval interval = (Interval) objArr[i2];
            if (interval.a() > a2) {
                a2 = interval.a();
            }
        }
        return a2;
    }

    public final int c() {
        int b2 = ((Interval) this.f4786a.o()).b();
        MutableVector mutableVector = this.f4786a;
        Object[] objArr = mutableVector.f15005z;
        int p2 = mutableVector.p();
        boolean z2 = false;
        for (int i2 = 0; i2 < p2; i2++) {
            Interval interval = (Interval) objArr[i2];
            if (interval.b() < b2) {
                b2 = interval.b();
            }
        }
        if (b2 >= 0) {
            z2 = true;
        }
        if (!z2) {
            InlineClassHelperKt.a("negative minIndex");
        }
        return b2;
    }

    public final boolean d() {
        return this.f4786a.p() != 0;
    }

    public final void e(Interval interval) {
        this.f4786a.v(interval);
    }
}
