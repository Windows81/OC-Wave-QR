package androidx.collection;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class MutableFloatList extends FloatList {
    public MutableFloatList(int i2) {
        super(i2, (DefaultConstructorMarker) null);
    }

    public final boolean d(float f2) {
        e(this.f1747b + 1);
        float[] fArr = this.f1746a;
        int i2 = this.f1747b;
        fArr[i2] = f2;
        this.f1747b = i2 + 1;
        return true;
    }

    public final void e(int i2) {
        float[] fArr = this.f1746a;
        if (fArr.length < i2) {
            float[] copyOf = Arrays.copyOf(fArr, Math.max(i2, (fArr.length * 3) / 2));
            Intrinsics.h(copyOf, "copyOf(...)");
            this.f1746a = copyOf;
        }
    }
}
