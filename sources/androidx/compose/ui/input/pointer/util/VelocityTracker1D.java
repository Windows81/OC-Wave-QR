package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

@Metadata
public final class VelocityTracker1D {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f16966a;

    /* renamed from: b  reason: collision with root package name */
    public final Strategy f16967b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16968c;

    /* renamed from: d  reason: collision with root package name */
    public final DataPointAtTime[] f16969d;

    /* renamed from: e  reason: collision with root package name */
    public int f16970e;

    /* renamed from: f  reason: collision with root package name */
    public final float[] f16971f;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f16972g;

    /* renamed from: h  reason: collision with root package name */
    public final float[] f16973h;

    @Metadata
    public enum Strategy {
        Lsq2,
        Impulse;

        static {
            Strategy[] d2;
            C = EnumEntriesKt.a(d2);
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16977a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.ui.input.pointer.util.VelocityTracker1D$Strategy[] r0 = androidx.compose.ui.input.pointer.util.VelocityTracker1D.Strategy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.input.pointer.util.VelocityTracker1D$Strategy r1 = androidx.compose.ui.input.pointer.util.VelocityTracker1D.Strategy.Impulse     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.input.pointer.util.VelocityTracker1D$Strategy r1 = androidx.compose.ui.input.pointer.util.VelocityTracker1D.Strategy.Lsq2     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f16977a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.util.VelocityTracker1D.WhenMappings.<clinit>():void");
        }
    }

    public VelocityTracker1D(boolean z2, Strategy strategy) {
        this.f16966a = z2;
        this.f16967b = strategy;
        if (!z2 || !strategy.equals(Strategy.Lsq2)) {
            int i2 = WhenMappings.f16977a[strategy.ordinal()];
            int i3 = 2;
            if (i2 != 1) {
                if (i2 == 2) {
                    i3 = 3;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            this.f16968c = i3;
            this.f16969d = new DataPointAtTime[20];
            this.f16971f = new float[20];
            this.f16972g = new float[20];
            this.f16973h = new float[3];
            return;
        }
        throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
    }

    public final void a(long j2, float f2) {
        int i2 = (this.f16970e + 1) % 20;
        this.f16970e = i2;
        VelocityTrackerKt.j(this.f16969d, i2, j2, f2);
    }

    public final float b(float[] fArr, float[] fArr2, int i2) {
        try {
            return VelocityTrackerKt.i(fArr2, fArr, i2, 2, this.f16973h)[1];
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }

    public final float c() {
        float f2;
        float[] fArr = this.f16971f;
        float[] fArr2 = this.f16972g;
        int i2 = this.f16970e;
        DataPointAtTime dataPointAtTime = this.f16969d[i2];
        if (dataPointAtTime == null) {
            return 0.0f;
        }
        int i3 = 0;
        DataPointAtTime dataPointAtTime2 = dataPointAtTime;
        while (true) {
            DataPointAtTime dataPointAtTime3 = this.f16969d[i2];
            if (dataPointAtTime3 != null) {
                float b2 = (float) (dataPointAtTime.b() - dataPointAtTime3.b());
                float abs = (float) Math.abs(dataPointAtTime3.b() - dataPointAtTime2.b());
                DataPointAtTime dataPointAtTime4 = (this.f16967b == Strategy.Lsq2 || this.f16966a) ? dataPointAtTime3 : dataPointAtTime;
                if (b2 > 100.0f || abs > 40.0f) {
                    break;
                }
                fArr[i3] = dataPointAtTime3.a();
                fArr2[i3] = -b2;
                if (i2 == 0) {
                    i2 = 20;
                }
                i2--;
                i3++;
                if (i3 >= 20) {
                    break;
                }
                dataPointAtTime2 = dataPointAtTime4;
            } else {
                break;
            }
        }
        if (i3 < this.f16968c) {
            return 0.0f;
        }
        int i4 = WhenMappings.f16977a[this.f16967b.ordinal()];
        if (i4 == 1) {
            f2 = VelocityTrackerKt.f(fArr, fArr2, i3, this.f16966a);
        } else if (i4 == 2) {
            f2 = b(fArr, fArr2, i3);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return f2 * ((float) 1000);
    }

    public final float d(float f2) {
        if (!(f2 > 0.0f)) {
            InlineClassHelperKt.c("maximumVelocity should be a positive value. You specified=" + f2);
        }
        float c2 = c();
        if (c2 != 0.0f && !Float.isNaN(c2)) {
            return c2 > 0.0f ? RangesKt.i(c2, f2) : RangesKt.d(c2, -f2);
        }
        return 0.0f;
    }

    public final void e() {
        ArraysKt.z(this.f16969d, (Object) null, 0, 0, 6, (Object) null);
        this.f16970e = 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VelocityTracker1D(boolean z2, Strategy strategy, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z2, (i2 & 2) != 0 ? Strategy.Lsq2 : strategy);
    }

    public VelocityTracker1D(boolean z2) {
        this(z2, Strategy.Impulse);
    }
}
