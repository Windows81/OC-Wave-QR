package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class IntStack {

    /* renamed from: a  reason: collision with root package name */
    public int[] f14681a = new int[10];

    /* renamed from: b  reason: collision with root package name */
    public int f14682b;

    public final void a() {
        this.f14682b = 0;
    }

    public final int b(int i2) {
        int[] iArr = this.f14681a;
        int min = Math.min(iArr.length, this.f14682b);
        for (int i3 = 0; i3 < min; i3++) {
            if (iArr[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    public final int c() {
        return this.f14681a[this.f14682b - 1];
    }

    public final int d(int i2) {
        return this.f14681a[i2];
    }

    public final int e() {
        return this.f14681a[this.f14682b - 2];
    }

    public final int f(int i2) {
        int i3 = this.f14682b - 1;
        return i3 >= 0 ? this.f14681a[i3] : i2;
    }

    public final int g() {
        int[] iArr = this.f14681a;
        int i2 = this.f14682b - 1;
        this.f14682b = i2;
        return iArr[i2];
    }

    public final void h(int i2) {
        int[] iArr = this.f14681a;
        if (this.f14682b >= iArr.length) {
            iArr = i();
        }
        int i3 = this.f14682b;
        this.f14682b = i3 + 1;
        iArr[i3] = i2;
    }

    public final int[] i() {
        int[] iArr = this.f14681a;
        int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
        Intrinsics.h(copyOf, "copyOf(...)");
        this.f14681a = copyOf;
        return copyOf;
    }
}
