package androidx.graphics.path;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.graphics.path.PathIterator;
import androidx.graphics.path.PathSegment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class PathIteratorImpl {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f21826e = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Path f21827a;

    /* renamed from: b  reason: collision with root package name */
    public final PathIterator.ConicEvaluation f21828b;

    /* renamed from: c  reason: collision with root package name */
    public final float f21829c;

    /* renamed from: d  reason: collision with root package name */
    public final float[] f21830d = new float[8];

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21831a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                androidx.graphics.path.PathSegment$Type[] r0 = androidx.graphics.path.PathSegment.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.graphics.path.PathSegment$Type r1 = androidx.graphics.path.PathSegment.Type.Move     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.graphics.path.PathSegment$Type r1 = androidx.graphics.path.PathSegment.Type.Line     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.graphics.path.PathSegment$Type r1 = androidx.graphics.path.PathSegment.Type.Quadratic     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.graphics.path.PathSegment$Type r1 = androidx.graphics.path.PathSegment.Type.Conic     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.graphics.path.PathSegment$Type r1 = androidx.graphics.path.PathSegment.Type.Cubic     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f21831a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.graphics.path.PathIteratorImpl.WhenMappings.<clinit>():void");
        }
    }

    static {
        System.loadLibrary("androidx.graphics.path");
    }

    public PathIteratorImpl(Path path, PathIterator.ConicEvaluation conicEvaluation, float f2) {
        Intrinsics.i(path, "path");
        Intrinsics.i(conicEvaluation, "conicEvaluation");
        this.f21827a = path;
        this.f21828b = conicEvaluation;
        this.f21829c = f2;
    }

    public final PointF[] a(float[] fArr, PathSegment.Type type) {
        PointF[] pointFArr;
        int i2 = WhenMappings.f21831a[type.ordinal()];
        if (i2 == 1) {
            pointFArr = new PointF[]{new PointF(fArr[0], fArr[1])};
        } else if (i2 == 2) {
            pointFArr = new PointF[]{new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3])};
        } else if (i2 == 3 || i2 == 4) {
            pointFArr = new PointF[]{new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3]), new PointF(fArr[4], fArr[5])};
        } else if (i2 != 5) {
            return new PointF[0];
        } else {
            pointFArr = new PointF[]{new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3]), new PointF(fArr[4], fArr[5]), new PointF(fArr[6], fArr[7])};
        }
        return pointFArr;
    }

    public final PathIterator.ConicEvaluation b() {
        return this.f21828b;
    }

    public final float c() {
        return this.f21829c;
    }

    public abstract boolean d();

    public abstract PathSegment.Type e(float[] fArr, int i2);

    public final PathSegment f() {
        PathSegment.Type e2 = e(this.f21830d, 0);
        if (e2 == PathSegment.Type.Done) {
            return PathSegmentUtilities.b();
        }
        if (e2 == PathSegment.Type.Close) {
            return PathSegmentUtilities.a();
        }
        return new PathSegment(e2, a(this.f21830d, e2), e2 == PathSegment.Type.Conic ? this.f21830d[6] : 0.0f);
    }
}
