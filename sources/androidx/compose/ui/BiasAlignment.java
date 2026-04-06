package androidx.compose.ui;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata
public final class BiasAlignment implements Alignment {

    /* renamed from: b  reason: collision with root package name */
    public final float f15464b;

    /* renamed from: c  reason: collision with root package name */
    public final float f15465c;

    @Metadata
    public static final class Horizontal implements Alignment.Horizontal {

        /* renamed from: a  reason: collision with root package name */
        public final float f15466a;

        public Horizontal(float f2) {
            this.f15466a = f2;
        }

        public int a(int i2, int i3, LayoutDirection layoutDirection) {
            return Math.round((((float) (i3 - i2)) / 2.0f) * (((float) 1) + (layoutDirection == LayoutDirection.Ltr ? this.f15466a : ((float) -1) * this.f15466a)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Horizontal) && Float.compare(this.f15466a, ((Horizontal) obj).f15466a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f15466a);
        }

        public String toString() {
            return "Horizontal(bias=" + this.f15466a + ')';
        }
    }

    @Metadata
    public static final class Vertical implements Alignment.Vertical {

        /* renamed from: a  reason: collision with root package name */
        public final float f15467a;

        public Vertical(float f2) {
            this.f15467a = f2;
        }

        public int a(int i2, int i3) {
            return Math.round((((float) (i3 - i2)) / 2.0f) * (((float) 1) + this.f15467a));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Vertical) && Float.compare(this.f15467a, ((Vertical) obj).f15467a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f15467a);
        }

        public String toString() {
            return "Vertical(bias=" + this.f15467a + ')';
        }
    }

    public BiasAlignment(float f2, float f3) {
        this.f15464b = f2;
        this.f15465c = f3;
    }

    public long a(long j2, long j3, LayoutDirection layoutDirection) {
        float f2 = ((float) (((int) (j3 >> 32)) - ((int) (j2 >> 32)))) / 2.0f;
        float f3 = ((float) (((int) (j3 & 4294967295L)) - ((int) (j2 & 4294967295L)))) / 2.0f;
        float f4 = (float) 1;
        return IntOffset.f((((long) Math.round(f2 * ((layoutDirection == LayoutDirection.Ltr ? this.f15464b : ((float) -1) * this.f15464b) + f4))) << 32) | (((long) Math.round(f3 * (f4 + this.f15465c))) & 4294967295L));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiasAlignment)) {
            return false;
        }
        BiasAlignment biasAlignment = (BiasAlignment) obj;
        return Float.compare(this.f15464b, biasAlignment.f15464b) == 0 && Float.compare(this.f15465c, biasAlignment.f15465c) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f15464b) * 31) + Float.hashCode(this.f15465c);
    }

    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.f15464b + ", verticalBias=" + this.f15465c + ')';
    }
}
