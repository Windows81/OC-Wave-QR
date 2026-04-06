package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.System_jvmKt;
import androidx.compose.runtime.internal.WeakReference;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;

@Metadata
public final class SnapshotWeakSet<T> {

    /* renamed from: a  reason: collision with root package name */
    public int f15327a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f15328b = new int[16];

    /* renamed from: c  reason: collision with root package name */
    public WeakReference[] f15329c = new WeakReference[16];

    public final boolean a(Object obj) {
        int i2;
        int i3 = this.f15327a;
        int a2 = System_jvmKt.a(obj);
        if (i3 > 0) {
            i2 = b(obj, a2);
            if (i2 >= 0) {
                return false;
            }
        } else {
            i2 = -1;
        }
        int i4 = -(i2 + 1);
        WeakReference[] weakReferenceArr = this.f15329c;
        int length = weakReferenceArr.length;
        if (i3 == length) {
            int i5 = length * 2;
            WeakReference[] weakReferenceArr2 = new WeakReference[i5];
            int[] iArr = new int[i5];
            int i6 = i4 + 1;
            System.arraycopy(weakReferenceArr, i4, weakReferenceArr2, i6, i3 - i4);
            System.arraycopy(this.f15329c, 0, weakReferenceArr2, 0, i4);
            ArraysKt.j(this.f15328b, iArr, i6, i4, i3);
            ArraysKt.o(this.f15328b, iArr, 0, 0, i4, 6, (Object) null);
            this.f15329c = weakReferenceArr2;
            this.f15328b = iArr;
        } else {
            int i7 = i4 + 1;
            System.arraycopy(weakReferenceArr, i4, weakReferenceArr, i7, i3 - i4);
            int[] iArr2 = this.f15328b;
            ArraysKt.j(iArr2, iArr2, i7, i4, i3);
        }
        this.f15329c[i4] = new WeakReference(obj);
        this.f15328b[i4] = a2;
        this.f15327a++;
        return true;
    }

    public final int b(Object obj, int i2) {
        int i3 = this.f15327a - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = this.f15328b[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 > i2) {
                i3 = i5 - 1;
            } else {
                WeakReference weakReference = this.f15329c[i5];
                return obj == (weakReference != null ? weakReference.get() : null) ? i5 : c(i5, obj, i2);
            }
        }
        return -(i4 + 1);
    }

    public final int c(int i2, Object obj, int i3) {
        int i4 = i2 - 1;
        while (true) {
            Object obj2 = null;
            if (-1 >= i4 || this.f15328b[i4] != i3) {
                int i5 = i2 + 1;
                int i6 = this.f15327a;
            } else {
                WeakReference weakReference = this.f15329c[i4];
                if (weakReference != null) {
                    obj2 = weakReference.get();
                }
                if (obj2 == obj) {
                    return i4;
                }
                i4--;
            }
        }
        int i52 = i2 + 1;
        int i62 = this.f15327a;
        while (true) {
            if (i52 >= i62) {
                i52 = this.f15327a;
                break;
            } else if (this.f15328b[i52] != i3) {
                break;
            } else {
                WeakReference weakReference2 = this.f15329c[i52];
                if ((weakReference2 != null ? weakReference2.get() : null) == obj) {
                    return i52;
                }
                i52++;
            }
        }
        return -(i52 + 1);
    }

    public final int[] d() {
        return this.f15328b;
    }

    public final int e() {
        return this.f15327a;
    }

    public final WeakReference[] f() {
        return this.f15329c;
    }

    public final void g(int i2) {
        this.f15327a = i2;
    }
}
