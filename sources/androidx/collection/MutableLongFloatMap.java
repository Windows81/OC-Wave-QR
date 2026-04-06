package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class MutableLongFloatMap extends LongFloatMap {

    /* renamed from: f  reason: collision with root package name */
    public int f1889f;

    public MutableLongFloatMap(int i2) {
        super((DefaultConstructorMarker) null);
        if (!(i2 >= 0)) {
            RuntimeHelpersKt.a("Capacity must be a positive value.");
        }
        g(ScatterMapKt.f(i2));
    }

    public final void e() {
        this.f1889f = ScatterMapKt.b(b()) - this.f1810e;
    }

    public final void f(int i2) {
        long[] jArr;
        if (i2 == 0) {
            jArr = ScatterMapKt.f1964a;
        } else {
            jArr = new long[(((i2 + 15) & -8) >> 3)];
            ArraysKt.y(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f1806a = jArr;
        int i3 = i2 >> 3;
        long j2 = 255 << ((i2 & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j2)) | j2;
        e();
    }

    public final void g(int i2) {
        int max = i2 > 0 ? Math.max(7, ScatterMapKt.e(i2)) : 0;
        this.f1809d = max;
        f(max);
        this.f1807b = new long[max];
        this.f1808c = new float[max];
    }
}
