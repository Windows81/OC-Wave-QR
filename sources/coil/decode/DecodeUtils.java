package coil.decode;

import coil.size.Scale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ranges.RangesKt;

@Metadata
public final class DecodeUtils {

    /* renamed from: a  reason: collision with root package name */
    public static final DecodeUtils f23364a = new DecodeUtils();

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23365a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                coil.size.Scale[] r0 = coil.size.Scale.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                coil.size.Scale r1 = coil.size.Scale.FILL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                coil.size.Scale r1 = coil.size.Scale.FIT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f23365a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: coil.decode.DecodeUtils.WhenMappings.<clinit>():void");
        }
    }

    public static final int a(int i2, int i3, int i4, int i5, Scale scale) {
        int i6;
        int highestOneBit = Integer.highestOneBit(i2 / i4);
        int highestOneBit2 = Integer.highestOneBit(i3 / i5);
        int i7 = WhenMappings.f23365a[scale.ordinal()];
        if (i7 == 1) {
            i6 = Math.min(highestOneBit, highestOneBit2);
        } else if (i7 == 2) {
            i6 = Math.max(highestOneBit, highestOneBit2);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return RangesKt.e(i6, 1);
    }

    public static final double b(double d2, double d3, double d4, double d5, Scale scale) {
        double d6 = d4 / d2;
        double d7 = d5 / d3;
        int i2 = WhenMappings.f23365a[scale.ordinal()];
        if (i2 == 1) {
            return Math.max(d6, d7);
        }
        if (i2 == 2) {
            return Math.min(d6, d7);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final double c(int i2, int i3, int i4, int i5, Scale scale) {
        double d2 = ((double) i4) / ((double) i2);
        double d3 = ((double) i5) / ((double) i3);
        int i6 = WhenMappings.f23365a[scale.ordinal()];
        if (i6 == 1) {
            return Math.max(d2, d3);
        }
        if (i6 == 2) {
            return Math.min(d2, d3);
        }
        throw new NoWhenBranchMatchedException();
    }
}
