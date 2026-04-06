package androidx.compose.ui.graphics;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AndroidPath implements Path {

    /* renamed from: b  reason: collision with root package name */
    public final Path f15907b;

    /* renamed from: c  reason: collision with root package name */
    public RectF f15908c;

    /* renamed from: d  reason: collision with root package name */
    public float[] f15909d;

    /* renamed from: e  reason: collision with root package name */
    public Matrix f15910e;

    public AndroidPath(Path path) {
        this.f15907b = path;
    }

    public void A(RoundRect roundRect, Path.Direction direction) {
        if (this.f15908c == null) {
            this.f15908c = new RectF();
        }
        RectF rectF = this.f15908c;
        Intrinsics.f(rectF);
        rectF.set(roundRect.e(), roundRect.g(), roundRect.f(), roundRect.a());
        if (this.f15909d == null) {
            this.f15909d = new float[8];
        }
        float[] fArr = this.f15909d;
        Intrinsics.f(fArr);
        fArr[0] = Float.intBitsToFloat((int) (roundRect.h() >> 32));
        fArr[1] = Float.intBitsToFloat((int) (roundRect.h() & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (roundRect.i() >> 32));
        fArr[3] = Float.intBitsToFloat((int) (roundRect.i() & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (roundRect.c() >> 32));
        fArr[5] = Float.intBitsToFloat((int) (roundRect.c() & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (roundRect.b() >> 32));
        fArr[7] = Float.intBitsToFloat((int) (roundRect.b() & 4294967295L));
        android.graphics.Path path = this.f15907b;
        RectF rectF2 = this.f15908c;
        Intrinsics.f(rectF2);
        float[] fArr2 = this.f15909d;
        Intrinsics.f(fArr2);
        path.addRoundRect(rectF2, fArr2, AndroidPath_androidKt.e(direction));
    }

    public final android.graphics.Path B() {
        return this.f15907b;
    }

    public final void C(Rect rect) {
        if (Float.isNaN(rect.o()) || Float.isNaN(rect.r()) || Float.isNaN(rect.p()) || Float.isNaN(rect.i())) {
            AndroidPath_androidKt.d("Invalid rectangle, make sure no value is NaN");
        }
    }

    public void a(float[] fArr) {
        if (this.f15910e == null) {
            this.f15910e = new Matrix();
        }
        Matrix matrix = this.f15910e;
        Intrinsics.f(matrix);
        AndroidMatrixConversions_androidKt.a(matrix, fArr);
        android.graphics.Path path = this.f15907b;
        Matrix matrix2 = this.f15910e;
        Intrinsics.f(matrix2);
        path.transform(matrix2);
    }

    public void b() {
        this.f15907b.reset();
    }

    public void c(float f2, float f3, float f4, float f5) {
        this.f15907b.rQuadTo(f2, f3, f4, f5);
    }

    public void close() {
        this.f15907b.close();
    }

    public boolean e() {
        return this.f15907b.isConvex();
    }

    public void g(float f2, float f3) {
        this.f15907b.rMoveTo(f2, f3);
    }

    public Rect getBounds() {
        if (this.f15908c == null) {
            this.f15908c = new RectF();
        }
        RectF rectF = this.f15908c;
        Intrinsics.f(rectF);
        this.f15907b.computeBounds(rectF, true);
        return new Rect(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public void h(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.f15907b.rCubicTo(f2, f3, f4, f5, f6, f7);
    }

    public void i(float f2, float f3, float f4, float f5) {
        this.f15907b.quadTo(f2, f3, f4, f5);
    }

    public boolean isEmpty() {
        return this.f15907b.isEmpty();
    }

    public void k(float f2, float f3, float f4, float f5) {
        this.f15907b.rQuadTo(f2, f3, f4, f5);
    }

    public void m(int i2) {
        this.f15907b.setFillType(PathFillType.f(i2, PathFillType.f16071b.a()) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    public void n(float f2, float f3, float f4, float f5) {
        this.f15907b.quadTo(f2, f3, f4, f5);
    }

    public int o() {
        return this.f15907b.getFillType() == Path.FillType.EVEN_ODD ? PathFillType.f16071b.a() : PathFillType.f16071b.b();
    }

    public void q(float f2, float f3) {
        this.f15907b.moveTo(f2, f3);
    }

    public void r(Rect rect, Path.Direction direction) {
        C(rect);
        if (this.f15908c == null) {
            this.f15908c = new RectF();
        }
        RectF rectF = this.f15908c;
        Intrinsics.f(rectF);
        rectF.set(rect.o(), rect.r(), rect.p(), rect.i());
        android.graphics.Path path = this.f15907b;
        RectF rectF2 = this.f15908c;
        Intrinsics.f(rectF2);
        path.addRect(rectF2, AndroidPath_androidKt.e(direction));
    }

    public void s(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.f15907b.cubicTo(f2, f3, f4, f5, f6, f7);
    }

    public void t() {
        this.f15907b.rewind();
    }

    public boolean u(Path path, Path path2, int i2) {
        PathOperation.Companion companion = PathOperation.f16081b;
        Path.Op op = PathOperation.g(i2, companion.a()) ? Path.Op.DIFFERENCE : PathOperation.g(i2, companion.b()) ? Path.Op.INTERSECT : PathOperation.g(i2, companion.c()) ? Path.Op.REVERSE_DIFFERENCE : PathOperation.g(i2, companion.d()) ? Path.Op.UNION : Path.Op.XOR;
        android.graphics.Path path3 = this.f15907b;
        if (path instanceof AndroidPath) {
            android.graphics.Path B2 = ((AndroidPath) path).B();
            if (path2 instanceof AndroidPath) {
                return path3.op(B2, ((AndroidPath) path2).B(), op);
            }
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public void v(long j2) {
        Matrix matrix = this.f15910e;
        if (matrix == null) {
            this.f15910e = new Matrix();
        } else {
            Intrinsics.f(matrix);
            matrix.reset();
        }
        Matrix matrix2 = this.f15910e;
        Intrinsics.f(matrix2);
        matrix2.setTranslate(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
        android.graphics.Path path = this.f15907b;
        Matrix matrix3 = this.f15910e;
        Intrinsics.f(matrix3);
        path.transform(matrix3);
    }

    public void w(Rect rect, float f2, float f3, boolean z2) {
        float o2 = rect.o();
        float r2 = rect.r();
        float p2 = rect.p();
        float i2 = rect.i();
        if (this.f15908c == null) {
            this.f15908c = new RectF();
        }
        RectF rectF = this.f15908c;
        Intrinsics.f(rectF);
        rectF.set(o2, r2, p2, i2);
        android.graphics.Path path = this.f15907b;
        RectF rectF2 = this.f15908c;
        Intrinsics.f(rectF2);
        path.arcTo(rectF2, f2, f3, z2);
    }

    public void x(float f2, float f3) {
        this.f15907b.rLineTo(f2, f3);
    }

    public void y(Path path, long j2) {
        android.graphics.Path path2 = this.f15907b;
        if (path instanceof AndroidPath) {
            path2.addPath(((AndroidPath) path).B(), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public void z(float f2, float f3) {
        this.f15907b.lineTo(f2, f3);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidPath(android.graphics.Path path, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new android.graphics.Path() : path);
    }
}
