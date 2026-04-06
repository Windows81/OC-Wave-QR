package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class MutableFloatObjectMap<V> extends FloatObjectMap<V> {

    /* renamed from: f  reason: collision with root package name */
    public int f1877f;

    public MutableFloatObjectMap(int i2) {
        super((DefaultConstructorMarker) null);
        if (!(i2 >= 0)) {
            RuntimeHelpersKt.a("Capacity must be a positive value.");
        }
        h(ScatterMapKt.f(i2));
    }

    public final void f() {
        this.f1877f = ScatterMapKt.b(c()) - this.f1759e;
    }

    public final void g(int i2) {
        long[] jArr;
        if (i2 == 0) {
            jArr = ScatterMapKt.f1964a;
        } else {
            jArr = new long[(((i2 + 15) & -8) >> 3)];
            ArraysKt.y(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f1755a = jArr;
        int i3 = i2 >> 3;
        long j2 = 255 << ((i2 & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j2)) | j2;
        f();
    }

    public final void h(int i2) {
        int max = i2 > 0 ? Math.max(7, ScatterMapKt.e(i2)) : 0;
        this.f1758d = max;
        g(max);
        this.f1756b = new float[max];
        this.f1757c = new Object[max];
    }
}
