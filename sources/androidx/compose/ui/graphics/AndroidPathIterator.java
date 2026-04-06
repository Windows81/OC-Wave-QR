package androidx.compose.ui.graphics;

import android.graphics.Path;
import androidx.compose.ui.graphics.PathIterator;
import androidx.compose.ui.graphics.PathSegment;
import androidx.graphics.path.PathIterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata
final class AndroidPathIterator implements PathIterator {

    /* renamed from: A  reason: collision with root package name */
    public final PathIterator.ConicEvaluation f15912A;

    /* renamed from: B  reason: collision with root package name */
    public final float f15913B;
    public final float[] C = new float[8];
    public final androidx.graphics.path.PathIterator D;

    /* renamed from: z  reason: collision with root package name */
    public final Path f15914z;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15915a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f15916b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|21) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0044 */
        static {
            /*
                androidx.compose.ui.graphics.PathIterator$ConicEvaluation[] r0 = androidx.compose.ui.graphics.PathIterator.ConicEvaluation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                androidx.compose.ui.graphics.PathIterator$ConicEvaluation r2 = androidx.compose.ui.graphics.PathIterator.ConicEvaluation.AsConic     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                androidx.compose.ui.graphics.PathIterator$ConicEvaluation r3 = androidx.compose.ui.graphics.PathIterator.ConicEvaluation.AsQuadratics     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f15915a = r0
                androidx.compose.ui.graphics.PathSegment$Type[] r0 = androidx.compose.ui.graphics.PathSegment.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.graphics.PathSegment$Type r3 = androidx.compose.ui.graphics.PathSegment.Type.Move     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                androidx.compose.ui.graphics.PathSegment$Type r1 = androidx.compose.ui.graphics.PathSegment.Type.Line     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                androidx.compose.ui.graphics.PathSegment$Type r1 = androidx.compose.ui.graphics.PathSegment.Type.Quadratic     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                androidx.compose.ui.graphics.PathSegment$Type r1 = androidx.compose.ui.graphics.PathSegment.Type.Conic     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                androidx.compose.ui.graphics.PathSegment$Type r1 = androidx.compose.ui.graphics.PathSegment.Type.Cubic     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                f15916b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.AndroidPathIterator.WhenMappings.<clinit>():void");
        }
    }

    public AndroidPathIterator(Path path, PathIterator.ConicEvaluation conicEvaluation, float f2) {
        PathIterator.ConicEvaluation conicEvaluation2;
        this.f15914z = path;
        this.f15912A = conicEvaluation;
        this.f15913B = f2;
        Path c2 = c();
        if (c2 instanceof AndroidPath) {
            Path B2 = ((AndroidPath) c2).B();
            int i2 = WhenMappings.f15915a[b().ordinal()];
            if (i2 == 1) {
                conicEvaluation2 = PathIterator.ConicEvaluation.AsConic;
            } else if (i2 == 2) {
                conicEvaluation2 = PathIterator.ConicEvaluation.AsQuadratics;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            this.D = new androidx.graphics.path.PathIterator(B2, conicEvaluation2, e());
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public PathIterator.ConicEvaluation b() {
        return this.f15912A;
    }

    public Path c() {
        return this.f15914z;
    }

    public float e() {
        return this.f15913B;
    }

    public boolean hasNext() {
        return this.D.hasNext();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public PathSegment next() {
        float[] fArr;
        float[] fArr2 = this.C;
        if (fArr2.length < 8) {
            return PathSegmentKt.b();
        }
        PathSegment.Type b2 = AndroidPathIterator_androidKt.c(this.D.b(fArr2, 0));
        if (b2 == PathSegment.Type.Done) {
            return PathSegmentKt.b();
        }
        if (b2 == PathSegment.Type.Close) {
            return PathSegmentKt.a();
        }
        int i2 = WhenMappings.f15916b[b2.ordinal()];
        if (i2 == 1) {
            fArr = new float[]{fArr2[0], fArr2[1]};
        } else if (i2 == 2) {
            fArr = new float[]{fArr2[0], fArr2[1], fArr2[2], fArr2[3]};
        } else if (i2 == 3) {
            fArr = new float[]{fArr2[0], fArr2[1], fArr2[2], fArr2[3], fArr2[4], fArr2[5]};
        } else if (i2 != 4) {
            fArr = i2 != 5 ? new float[0] : new float[]{fArr2[0], fArr2[1], fArr2[2], fArr2[3], fArr2[4], fArr2[5], fArr2[6], fArr2[7]};
        } else {
            fArr = new float[]{fArr2[0], fArr2[1], fArr2[2], fArr2[3], fArr2[4], fArr2[5]};
        }
        return new PathSegment(b2, fArr, b2 == PathSegment.Type.Conic ? fArr2[6] : 0.0f);
    }
}
