package androidx.graphics.path;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ConicConverter {

    /* renamed from: a  reason: collision with root package name */
    public int f21815a;

    /* renamed from: b  reason: collision with root package name */
    public int f21816b;

    /* renamed from: c  reason: collision with root package name */
    public float[] f21817c = new float[130];

    private final native int internalConicToQuadratics(float[] fArr, int i2, float[] fArr2, float f2, float f3);

    public final void a(float[] fArr, float f2, float f3, int i2) {
        Intrinsics.i(fArr, "points");
        int internalConicToQuadratics = internalConicToQuadratics(fArr, i2, this.f21817c, f2, f3);
        this.f21815a = internalConicToQuadratics;
        int i3 = (internalConicToQuadratics * 4) + 2;
        if (i3 > this.f21817c.length) {
            float[] fArr2 = new float[i3];
            this.f21817c = fArr2;
            this.f21815a = internalConicToQuadratics(fArr, i2, fArr2, f2, f3);
        }
        this.f21816b = 0;
    }

    public final int b() {
        return this.f21816b;
    }

    public final int c() {
        return this.f21815a;
    }

    public final boolean d(float[] fArr, int i2) {
        Intrinsics.i(fArr, "points");
        int i3 = this.f21816b;
        if (i3 >= this.f21815a) {
            return false;
        }
        int i4 = i3 * 4;
        float[] fArr2 = this.f21817c;
        fArr[i2] = fArr2[i4];
        fArr[i2 + 1] = fArr2[i4 + 1];
        fArr[i2 + 2] = fArr2[i4 + 2];
        fArr[i2 + 3] = fArr2[i4 + 3];
        fArr[i2 + 4] = fArr2[i4 + 4];
        fArr[i2 + 5] = fArr2[i4 + 5];
        this.f21816b = i3 + 1;
        return true;
    }
}
