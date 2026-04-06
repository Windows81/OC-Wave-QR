package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import kotlin.Metadata;

@Metadata
public final class AndroidPaint_androidKt {

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15904a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f15905b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f15906c;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|(2:21|22)|23|25) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004c */
        static {
            /*
                android.graphics.Paint$Style[] r0 = android.graphics.Paint.Style.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                f15904a = r0
                android.graphics.Paint$Cap[] r0 = android.graphics.Paint.Cap.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                android.graphics.Paint$Cap r2 = android.graphics.Paint.Cap.BUTT     // Catch:{ NoSuchFieldError -> 0x0021 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0021 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0021 }
            L_0x0021:
                r2 = 2
                android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 3
                android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.SQUARE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                f15905b = r0
                android.graphics.Paint$Join[] r0 = android.graphics.Paint.Join.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                android.graphics.Paint$Join r4 = android.graphics.Paint.Join.MITER     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                android.graphics.Paint$Join r1 = android.graphics.Paint.Join.BEVEL     // Catch:{ NoSuchFieldError -> 0x004c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                android.graphics.Paint$Join r1 = android.graphics.Paint.Join.ROUND     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                f15906c = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.AndroidPaint_androidKt.WhenMappings.<clinit>():void");
        }
    }

    public static final Paint a() {
        return new AndroidPaint();
    }

    public static final Paint b(Paint paint) {
        return new AndroidPaint(paint);
    }

    public static final float c(Paint paint) {
        return ((float) paint.getAlpha()) / 255.0f;
    }

    public static final long d(Paint paint) {
        return ColorKt.b(paint.getColor());
    }

    public static final int e(Paint paint) {
        return !paint.isFilterBitmap() ? FilterQuality.f16003b.b() : FilterQuality.f16003b.a();
    }

    public static final int f(Paint paint) {
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i2 = strokeCap == null ? -1 : WhenMappings.f15905b[strokeCap.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? StrokeCap.f16130b.a() : StrokeCap.f16130b.c() : StrokeCap.f16130b.b() : StrokeCap.f16130b.a();
    }

    public static final int g(Paint paint) {
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i2 = strokeJoin == null ? -1 : WhenMappings.f15906c[strokeJoin.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? StrokeJoin.f16135b.b() : StrokeJoin.f16135b.c() : StrokeJoin.f16135b.a() : StrokeJoin.f16135b.b();
    }

    public static final float h(Paint paint) {
        return paint.getStrokeMiter();
    }

    public static final float i(Paint paint) {
        return paint.getStrokeWidth();
    }

    public static final Paint j() {
        return new Paint(7);
    }

    public static final void k(Paint paint, float f2) {
        paint.setAlpha((int) ((float) Math.rint((double) (f2 * 255.0f))));
    }

    public static final void l(Paint paint, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            WrapperVerificationHelperMethods.f16158a.a(paint, i2);
        } else {
            paint.setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.b(i2)));
        }
    }

    public static final void m(Paint paint, long j2) {
        paint.setColor(ColorKt.j(j2));
    }

    public static final void n(Paint paint, ColorFilter colorFilter) {
        paint.setColorFilter(colorFilter != null ? AndroidColorFilter_androidKt.c(colorFilter) : null);
    }

    public static final void o(Paint paint, int i2) {
        paint.setFilterBitmap(!FilterQuality.e(i2, FilterQuality.f16003b.b()));
    }

    public static final void p(Paint paint, PathEffect pathEffect) {
        AndroidPathEffect androidPathEffect = (AndroidPathEffect) pathEffect;
        paint.setPathEffect(androidPathEffect != null ? androidPathEffect.a() : null);
    }

    public static final void q(Paint paint, Shader shader) {
        paint.setShader(shader);
    }

    public static final void r(Paint paint, int i2) {
        StrokeCap.Companion companion = StrokeCap.f16130b;
        paint.setStrokeCap(StrokeCap.g(i2, companion.c()) ? Paint.Cap.SQUARE : StrokeCap.g(i2, companion.b()) ? Paint.Cap.ROUND : StrokeCap.g(i2, companion.a()) ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public static final void s(Paint paint, int i2) {
        StrokeJoin.Companion companion = StrokeJoin.f16135b;
        paint.setStrokeJoin(StrokeJoin.g(i2, companion.b()) ? Paint.Join.MITER : StrokeJoin.g(i2, companion.a()) ? Paint.Join.BEVEL : StrokeJoin.g(i2, companion.c()) ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public static final void t(Paint paint, float f2) {
        paint.setStrokeMiter(f2);
    }

    public static final void u(Paint paint, float f2) {
        paint.setStrokeWidth(f2);
    }

    public static final void v(Paint paint, int i2) {
        paint.setStyle(PaintingStyle.e(i2, PaintingStyle.f16061b.b()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
