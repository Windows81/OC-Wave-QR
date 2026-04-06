package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableObjectIntMap;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NearestRangeKeyIndexMap$2$1 extends Lambda implements Function1<IntervalList.Interval<? extends LazyLayoutIntervalContent.Interval>, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f4957A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableObjectIntMap f4958B;
    public final /* synthetic */ NearestRangeKeyIndexMap C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f4959z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NearestRangeKeyIndexMap$2$1(int i2, int i3, MutableObjectIntMap mutableObjectIntMap, NearestRangeKeyIndexMap nearestRangeKeyIndexMap) {
        super(1);
        this.f4959z = i2;
        this.f4957A = i3;
        this.f4958B = mutableObjectIntMap;
        this.C = nearestRangeKeyIndexMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0037, code lost:
        if (r3 == null) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.compose.foundation.lazy.layout.IntervalList.Interval r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r7.c()
            androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent$Interval r0 = (androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval) r0
            kotlin.jvm.functions.Function1 r0 = r0.getKey()
            int r1 = r6.f4959z
            int r2 = r7.b()
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r6.f4957A
            int r3 = r7.b()
            int r4 = r7.a()
            int r3 = r3 + r4
            int r3 = r3 + -1
            int r2 = java.lang.Math.min(r2, r3)
            if (r1 > r2) goto L_0x0057
        L_0x0027:
            if (r0 == 0) goto L_0x0039
            int r3 = r7.b()
            int r3 = r1 - r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r0.invoke(r3)
            if (r3 != 0) goto L_0x003d
        L_0x0039:
            java.lang.Object r3 = androidx.compose.foundation.lazy.layout.Lazy_androidKt.a(r1)
        L_0x003d:
            androidx.collection.MutableObjectIntMap r4 = r6.f4958B
            r4.u(r3, r1)
            androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap r4 = r6.C
            java.lang.Object[] r4 = r4.f4955b
            androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap r5 = r6.C
            int r5 = r5.f4956c
            int r5 = r1 - r5
            r4[r5] = r3
            if (r1 == r2) goto L_0x0057
            int r1 = r1 + 1
            goto L_0x0027
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap$2$1.b(androidx.compose.foundation.lazy.layout.IntervalList$Interval):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((IntervalList.Interval) obj);
        return Unit.f40552a;
    }
}
