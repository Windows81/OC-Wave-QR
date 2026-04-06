package androidx.compose.ui;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata
public final class BiasAbsoluteAlignment implements Alignment {

    /* renamed from: b  reason: collision with root package name */
    public final float f15461b;

    /* renamed from: c  reason: collision with root package name */
    public final float f15462c;

    @Metadata
    public static final class Horizontal implements Alignment.Horizontal {

        /* renamed from: a  reason: collision with root package name */
        public final float f15463a;

        public Horizontal(float f2) {
            this.f15463a = f2;
        }

        public int a(int i2, int i3, LayoutDirection layoutDirection) {
            return Math.round((((float) (i3 - i2)) / 2.0f) * (((float) 1) + this.f15463a));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Horizontal) && Float.compare(this.f15463a, ((Horizontal) obj).f15463a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f15463a);
        }

        public String toString() {
            return "Horizontal(bias=" + this.f15463a + ')';
        }
    }

    public BiasAbsoluteAlignment(float f2, float f3) {
        this.f15461b = f2;
        this.f15462c = f3;
    }

    public long a(long j2, long j3, LayoutDirection layoutDirection) {
        long c2 = IntSize.c((((long) (((int) (j3 >> 32)) - ((int) (j2 >> 32)))) << 32) | (((long) (((int) (j3 & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L));
        float f2 = (float) 1;
        float f3 = (((float) ((int) (c2 >> 32))) / 2.0f) * (this.f15461b + f2);
        float f4 = (((float) ((int) (c2 & 4294967295L))) / 2.0f) * (f2 + this.f15462c);
        return IntOffset.f((((long) Math.round(f3)) << 32) | (((long) Math.round(f4)) & 4294967295L));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiasAbsoluteAlignment)) {
            return false;
        }
        BiasAbsoluteAlignment biasAbsoluteAlignment = (BiasAbsoluteAlignment) obj;
        return Float.compare(this.f15461b, biasAbsoluteAlignment.f15461b) == 0 && Float.compare(this.f15462c, biasAbsoluteAlignment.f15462c) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f15461b) * 31) + Float.hashCode(this.f15462c);
    }

    public String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f15461b + ", verticalBias=" + this.f15462c + ')';
    }
}
