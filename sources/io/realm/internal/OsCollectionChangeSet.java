package io.realm.internal;

import io.realm.OrderedCollectionChangeSet;
import java.util.Arrays;

public class OsCollectionChangeSet implements OrderedCollectionChangeSet, NativeObject {

    /* renamed from: B  reason: collision with root package name */
    public static long f40149B = nativeGetFinalizerPtr();

    /* renamed from: A  reason: collision with root package name */
    public final boolean f40150A;

    /* renamed from: z  reason: collision with root package name */
    public final long f40151z;

    public OsCollectionChangeSet(long j2, boolean z2) {
        this.f40151z = j2;
        this.f40150A = z2;
        NativeContext.f40128c.a(this);
    }

    private static native long nativeGetFinalizerPtr();

    private static native int[] nativeGetRanges(long j2, int i2);

    public OrderedCollectionChangeSet.Range[] a() {
        return g(nativeGetRanges(this.f40151z, 2));
    }

    public OrderedCollectionChangeSet.Range[] b() {
        return g(nativeGetRanges(this.f40151z, 0));
    }

    public Throwable c() {
        return null;
    }

    public OrderedCollectionChangeSet.Range[] d() {
        return g(nativeGetRanges(this.f40151z, 1));
    }

    public boolean e() {
        return this.f40151z == 0;
    }

    public boolean f() {
        return this.f40150A;
    }

    public final OrderedCollectionChangeSet.Range[] g(int[] iArr) {
        if (iArr == null) {
            return new OrderedCollectionChangeSet.Range[0];
        }
        int length = iArr.length / 2;
        OrderedCollectionChangeSet.Range[] rangeArr = new OrderedCollectionChangeSet.Range[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            rangeArr[i2] = new OrderedCollectionChangeSet.Range(iArr[i3], iArr[i3 + 1]);
        }
        return rangeArr;
    }

    public long getNativeFinalizerPtr() {
        return f40149B;
    }

    public long getNativePtr() {
        return this.f40151z;
    }

    public String toString() {
        if (this.f40151z == 0) {
            return "Change set is empty.";
        }
        return "Deletion Ranges: " + Arrays.toString(b()) + "\nInsertion Ranges: " + Arrays.toString(d()) + "\nChange Ranges: " + Arrays.toString(a());
    }
}
