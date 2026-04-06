package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.ranges.IntRange;

@Metadata
public final class NearestRangeKeyIndexMap implements LazyLayoutKeyIndexMap {

    /* renamed from: a  reason: collision with root package name */
    public final ObjectIntMap f4954a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f4955b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4956c;

    public NearestRangeKeyIndexMap(IntRange intRange, LazyLayoutIntervalContent lazyLayoutIntervalContent) {
        IntervalList h2 = lazyLayoutIntervalContent.h();
        int n2 = intRange.n();
        if (!(n2 >= 0)) {
            InlineClassHelperKt.c("negative nearestRange.first");
        }
        int min = Math.min(intRange.o(), h2.e() - 1);
        if (min < n2) {
            this.f4954a = ObjectIntMapKt.a();
            this.f4955b = new Object[0];
            this.f4956c = 0;
            return;
        }
        int i2 = (min - n2) + 1;
        this.f4955b = new Object[i2];
        this.f4956c = n2;
        MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(i2);
        h2.a(n2, min, new NearestRangeKeyIndexMap$2$1(n2, min, mutableObjectIntMap, this));
        this.f4954a = mutableObjectIntMap;
    }

    public Object c(int i2) {
        Object[] objArr = this.f4955b;
        int i3 = i2 - this.f4956c;
        if (i3 < 0 || i3 > ArraysKt.m0(objArr)) {
            return null;
        }
        return objArr[i3];
    }

    public int e(Object obj) {
        ObjectIntMap objectIntMap = this.f4954a;
        int b2 = objectIntMap.b(obj);
        if (b2 >= 0) {
            return objectIntMap.f1933c[b2];
        }
        return -1;
    }
}
