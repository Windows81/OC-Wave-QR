package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.InlineClassHelperKt;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;

@Metadata
public final class CanvasDrawScopeKt$asDrawTransform$1 implements DrawTransform {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DrawContext f16286a;

    public CanvasDrawScopeKt$asDrawTransform$1(DrawContext drawContext) {
        this.f16286a = drawContext;
    }

    public void a(float[] fArr) {
        this.f16286a.j().q(fArr);
    }

    public void b(float f2, float f3, float f4, float f5, int i2) {
        this.f16286a.j().b(f2, f3, f4, f5, i2);
    }

    public void c(Path path, int i2) {
        this.f16286a.j().c(path, i2);
    }

    public void d(float f2, float f3) {
        this.f16286a.j().d(f2, f3);
    }

    public void g(float f2, float f3, long j2) {
        Canvas j3 = this.f16286a.j();
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        j3.d(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
        j3.f(f2, f3);
        j3.d(-Float.intBitsToFloat(i2), -Float.intBitsToFloat(i3));
    }

    public void h(float f2, float f3, float f4, float f5) {
        Canvas j2 = this.f16286a.j();
        DrawContext drawContext = this.f16286a;
        long d2 = Size.d((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j() & 4294967295L)) - (f5 + f3))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j() >> 32)) - (f4 + f2))) << 32));
        if (!(Float.intBitsToFloat((int) (d2 >> 32)) >= 0.0f && Float.intBitsToFloat((int) (d2 & 4294967295L)) >= 0.0f)) {
            InlineClassHelperKt.a("Width and height must be greater than or equal to zero");
        }
        drawContext.f(d2);
        j2.d(f2, f3);
    }

    public void i(float f2, long j2) {
        Canvas j3 = this.f16286a.j();
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        j3.d(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
        j3.i(f2);
        j3.d(-Float.intBitsToFloat(i2), -Float.intBitsToFloat(i3));
    }

    public long j() {
        return this.f16286a.c();
    }
}
