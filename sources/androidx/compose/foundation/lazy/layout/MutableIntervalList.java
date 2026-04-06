package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class MutableIntervalList<T> implements IntervalList<T> {

    /* renamed from: a  reason: collision with root package name */
    public final MutableVector f4951a = new MutableVector(new IntervalList.Interval[16], 0);

    /* renamed from: b  reason: collision with root package name */
    public int f4952b;

    /* renamed from: c  reason: collision with root package name */
    public IntervalList.Interval f4953c;

    public void a(int i2, int i3, Function1 function1) {
        if (i2 < 0 || i2 >= e()) {
            InlineClassHelperKt.e("Index " + i2 + ", size " + e());
        }
        if (i3 < 0 || i3 >= e()) {
            InlineClassHelperKt.e("Index " + i3 + ", size " + e());
        }
        if (!(i3 >= i2)) {
            InlineClassHelperKt.a("toIndex (" + i3 + ") should be not smaller than fromIndex (" + i2 + ')');
        }
        int a2 = IntervalListKt.b(this.f4951a, i2);
        int b2 = ((IntervalList.Interval) this.f4951a.f15005z[a2]).b();
        while (b2 <= i3) {
            IntervalList.Interval interval = (IntervalList.Interval) this.f4951a.f15005z[a2];
            function1.invoke(interval);
            b2 += interval.a();
            a2++;
        }
    }

    public final void b(int i2, Object obj) {
        if (!(i2 >= 0)) {
            InlineClassHelperKt.a("size should be >=0");
        }
        if (i2 != 0) {
            IntervalList.Interval interval = new IntervalList.Interval(e(), i2, obj);
            this.f4952b = e() + i2;
            this.f4951a.d(interval);
        }
    }

    public final boolean c(IntervalList.Interval interval, int i2) {
        return i2 < interval.b() + interval.a() && interval.b() <= i2;
    }

    public final IntervalList.Interval d(int i2) {
        IntervalList.Interval interval = this.f4953c;
        if (interval != null && c(interval, i2)) {
            return interval;
        }
        MutableVector mutableVector = this.f4951a;
        IntervalList.Interval interval2 = (IntervalList.Interval) mutableVector.f15005z[IntervalListKt.b(mutableVector, i2)];
        this.f4953c = interval2;
        return interval2;
    }

    public int e() {
        return this.f4952b;
    }

    public IntervalList.Interval get(int i2) {
        if (i2 < 0 || i2 >= e()) {
            InlineClassHelperKt.e("Index " + i2 + ", size " + e());
        }
        return d(i2);
    }
}
