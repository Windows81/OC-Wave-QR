package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;

@Metadata
public final class LazyGridSlots {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f4702a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f4703b;

    public LazyGridSlots(int[] iArr, int[] iArr2) {
        this.f4702a = iArr;
        this.f4703b = iArr2;
    }

    public final int[] a() {
        return this.f4703b;
    }

    public final int[] b() {
        return this.f4702a;
    }
}
