package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public abstract class Brush {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f15962b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final long f15963a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Brush e(Companion companion, List list, float f2, float f3, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                f2 = 0.0f;
            }
            if ((i3 & 4) != 0) {
                f3 = Float.POSITIVE_INFINITY;
            }
            if ((i3 & 8) != 0) {
                i2 = TileMode.f16143b.a();
            }
            return companion.c(list, f2, f3, i2);
        }

        public static /* synthetic */ Brush f(Companion companion, Pair[] pairArr, float f2, float f3, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                f2 = 0.0f;
            }
            if ((i3 & 4) != 0) {
                f3 = Float.POSITIVE_INFINITY;
            }
            if ((i3 & 8) != 0) {
                i2 = TileMode.f16143b.a();
            }
            return companion.d(pairArr, f2, f3, i2);
        }

        public final Brush a(List list, long j2, long j3, int i2) {
            return new LinearGradient(list, (List) null, j2, j3, i2, (DefaultConstructorMarker) null);
        }

        public final Brush b(Pair[] pairArr, long j2, long j3, int i2) {
            Pair[] pairArr2 = pairArr;
            ArrayList arrayList = new ArrayList(r1);
            for (Pair f2 : pairArr2) {
                arrayList.add(Color.h(((Color) f2.f()).v()));
            }
            ArrayList arrayList2 = new ArrayList(r1);
            for (Pair e2 : pairArr2) {
                arrayList2.add(Float.valueOf(((Number) e2.e()).floatValue()));
            }
            return new LinearGradient(arrayList, arrayList2, j2, j3, i2, (DefaultConstructorMarker) null);
        }

        public final Brush c(List list, float f2, float f3, int i2) {
            return a(list, Offset.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L)), Offset.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L)), i2);
        }

        public final Brush d(Pair[] pairArr, float f2, float f3, int i2) {
            return b((Pair[]) Arrays.copyOf(pairArr, pairArr.length), Offset.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L)), Offset.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L)), i2);
        }

        public Companion() {
        }
    }

    public /* synthetic */ Brush(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void a(long j2, Paint paint, float f2);

    public long b() {
        return this.f15963a;
    }

    public Brush() {
        this.f15963a = Size.f15876b.a();
    }
}
