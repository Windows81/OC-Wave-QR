package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public abstract class LazyLayoutIntervalContent<Interval extends Interval> {

    @Metadata
    public interface Interval {
        Function1 getKey() {
            return null;
        }

        Function1 getType() {
            return LazyLayoutIntervalContent$Interval$type$1.f4798z;
        }
    }

    public final Object g(int i2) {
        IntervalList.Interval interval = h().get(i2);
        return ((Interval) interval.c()).getType().invoke(Integer.valueOf(i2 - interval.b()));
    }

    public abstract IntervalList h();

    public final int i() {
        return h().e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001a, code lost:
        r0 = r0.invoke(java.lang.Integer.valueOf(r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(int r3) {
        /*
            r2 = this;
            androidx.compose.foundation.lazy.layout.IntervalList r0 = r2.h()
            androidx.compose.foundation.lazy.layout.IntervalList$Interval r0 = r0.get(r3)
            int r1 = r0.b()
            int r1 = r3 - r1
            java.lang.Object r0 = r0.c()
            androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent$Interval r0 = (androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval) r0
            kotlin.jvm.functions.Function1 r0 = r0.getKey()
            if (r0 == 0) goto L_0x0024
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.invoke(r1)
            if (r0 != 0) goto L_0x0028
        L_0x0024:
            java.lang.Object r0 = androidx.compose.foundation.lazy.layout.Lazy_androidKt.a(r3)
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.j(int):java.lang.Object");
    }
}
