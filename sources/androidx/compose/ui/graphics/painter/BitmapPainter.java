package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BitmapPainter extends Painter {
    public final ImageBitmap F;
    public final long G;
    public final long H;
    public int I;
    public final long J;
    public float K;
    public ColorFilter L;

    public /* synthetic */ BitmapPainter(ImageBitmap imageBitmap, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageBitmap, j2, j3);
    }

    public boolean a(float f2) {
        this.K = f2;
        return true;
    }

    public boolean b(ColorFilter colorFilter) {
        this.L = colorFilter;
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) obj;
        return Intrinsics.d(this.F, bitmapPainter.F) && IntOffset.j(this.G, bitmapPainter.G) && IntSize.e(this.H, bitmapPainter.H) && FilterQuality.e(this.I, bitmapPainter.I);
    }

    public int hashCode() {
        return (((((this.F.hashCode() * 31) + IntOffset.m(this.G)) * 31) + IntSize.h(this.H)) * 31) + FilterQuality.f(this.I);
    }

    public long k() {
        return IntSizeKt.e(this.J);
    }

    public void m(DrawScope drawScope) {
        ImageBitmap imageBitmap = this.F;
        long j2 = this.G;
        long j3 = this.H;
        int round = Math.round(Float.intBitsToFloat((int) (drawScope.c() >> 32)));
        DrawScope.m0(drawScope, imageBitmap, j2, j3, 0, IntSize.c((((long) Math.round(Float.intBitsToFloat((int) (drawScope.c() & 4294967295L)))) & 4294967295L) | (((long) round) << 32)), this.K, (DrawStyle) null, this.L, 0, this.I, 328, (Object) null);
    }

    public final void n(int i2) {
        this.I = i2;
    }

    public final long o(long j2, long j3) {
        int i2;
        int i3;
        if (IntOffset.k(j2) >= 0 && IntOffset.l(j2) >= 0 && (i2 = (int) (j3 >> 32)) >= 0 && (i3 = (int) (4294967295L & j3)) >= 0 && i2 <= this.F.b() && i3 <= this.F.a()) {
            return j3;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public String toString() {
        return "BitmapPainter(image=" + this.F + ", srcOffset=" + IntOffset.p(this.G) + ", srcSize=" + IntSize.i(this.H) + ", filterQuality=" + FilterQuality.g(this.I) + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BitmapPainter(androidx.compose.ui.graphics.ImageBitmap r8, long r9, long r11, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r7 = this;
            r14 = r13 & 2
            if (r14 == 0) goto L_0x000a
            androidx.compose.ui.unit.IntOffset$Companion r9 = androidx.compose.ui.unit.IntOffset.f19160b
            long r9 = r9.b()
        L_0x000a:
            r2 = r9
            r9 = r13 & 4
            if (r9 == 0) goto L_0x0027
            int r9 = r8.b()
            int r10 = r8.a()
            long r11 = (long) r9
            r9 = 32
            long r11 = r11 << r9
            long r9 = (long) r10
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r13
            long r9 = r9 | r11
            long r11 = androidx.compose.ui.unit.IntSize.c(r9)
        L_0x0027:
            r4 = r11
            r6 = 0
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.painter.BitmapPainter.<init>(androidx.compose.ui.graphics.ImageBitmap, long, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public BitmapPainter(ImageBitmap imageBitmap, long j2, long j3) {
        this.F = imageBitmap;
        this.G = j2;
        this.H = j3;
        this.I = FilterQuality.f16003b.a();
        this.J = o(j2, j3);
        this.K = 1.0f;
    }
}
