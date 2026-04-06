package androidx.compose.foundation.gestures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DraggableAnchorsConfig<T> {

    /* renamed from: a  reason: collision with root package name */
    public final List f3510a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public float[] f3511b;

    public DraggableAnchorsConfig() {
        float[] fArr = new float[5];
        for (int i2 = 0; i2 < 5; i2++) {
            fArr[i2] = Float.NaN;
        }
        this.f3511b = fArr;
    }

    public final void a(Object obj, float f2) {
        this.f3510a.add(obj);
        if (this.f3511b.length < this.f3510a.size()) {
            d();
        }
        this.f3511b[this.f3510a.size() - 1] = f2;
    }

    public final List b() {
        return this.f3510a;
    }

    public final float[] c() {
        return ArraysKt.s(this.f3511b, 0, this.f3510a.size());
    }

    public final void d() {
        float[] copyOf = Arrays.copyOf(this.f3511b, this.f3510a.size() + 2);
        Intrinsics.h(copyOf, "copyOf(...)");
        this.f3511b = copyOf;
    }
}
