package androidx.compose.foundation;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BorderModifierNode$drawRoundRectBorder$1 extends Lambda implements Function1<ContentDrawScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Brush f2980A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f2981B;
    public final /* synthetic */ float C;
    public final /* synthetic */ float D;
    public final /* synthetic */ long E;
    public final /* synthetic */ long F;
    public final /* synthetic */ Stroke G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f2982z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BorderModifierNode$drawRoundRectBorder$1(boolean z2, Brush brush, long j2, float f2, float f3, long j3, long j4, Stroke stroke) {
        super(1);
        this.f2982z = z2;
        this.f2980A = brush;
        this.f2981B = j2;
        this.C = f2;
        this.D = f3;
        this.E = j3;
        this.F = j4;
        this.G = stroke;
    }

    public final void b(ContentDrawScope contentDrawScope) {
        long j2;
        DrawContext drawContext;
        contentDrawScope.q2();
        if (this.f2982z) {
            DrawScope.o2(contentDrawScope, this.f2980A, 0, 0, this.f2981B, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 246, (Object) null);
            return;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (this.f2981B >> 32));
        float f2 = this.C;
        if (intBitsToFloat < f2) {
            float f3 = this.D;
            float intBitsToFloat2 = Float.intBitsToFloat((int) (contentDrawScope.c() >> 32)) - this.D;
            float intBitsToFloat3 = Float.intBitsToFloat((int) (contentDrawScope.c() & 4294967295L)) - this.D;
            int a2 = ClipOp.f15971b.a();
            Brush brush = this.f2980A;
            long j3 = this.f2981B;
            DrawContext G1 = contentDrawScope.G1();
            long c2 = G1.c();
            G1.j().o();
            try {
                G1.e().b(f3, f3, intBitsToFloat2, intBitsToFloat3, a2);
                j2 = c2;
                drawContext = G1;
                try {
                    DrawScope.o2(contentDrawScope, brush, 0, 0, j3, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 246, (Object) null);
                    drawContext.j().t();
                    drawContext.f(j2);
                } catch (Throwable th) {
                    th = th;
                    drawContext.j().t();
                    drawContext.f(j2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                j2 = c2;
                drawContext = G1;
                drawContext.j().t();
                drawContext.f(j2);
                throw th;
            }
        } else {
            DrawScope.o2(contentDrawScope, this.f2980A, this.E, this.F, BorderKt.l(this.f2981B, f2), 0.0f, this.G, (ColorFilter) null, 0, 208, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((ContentDrawScope) obj);
        return Unit.f40552a;
    }
}
