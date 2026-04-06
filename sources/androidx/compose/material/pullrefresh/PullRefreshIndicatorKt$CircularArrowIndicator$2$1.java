package androidx.compose.material.pullrefresh;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PullRefreshIndicatorKt$CircularArrowIndicator$2$1 extends Lambda implements Function1<DrawScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ State f9015A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f9016B;
    public final /* synthetic */ Path C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PullRefreshState f9017z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PullRefreshIndicatorKt$CircularArrowIndicator$2$1(PullRefreshState pullRefreshState, State state, long j2, Path path) {
        super(1);
        this.f9017z = pullRefreshState;
        this.f9015A = state;
        this.f9016B = j2;
        this.C = path;
    }

    public final void b(DrawScope drawScope) {
        long j2;
        DrawContext drawContext;
        DrawScope drawScope2 = drawScope;
        ArrowValues f2 = PullRefreshIndicatorKt.a(this.f9017z.j());
        float floatValue = ((Number) this.f9015A.getValue()).floatValue();
        float b2 = f2.b();
        long j3 = this.f9016B;
        Path path = this.C;
        long T1 = drawScope.T1();
        DrawContext G1 = drawScope.G1();
        long c2 = G1.c();
        G1.j().o();
        try {
            G1.e().i(b2, T1);
            float B1 = drawScope2.B1(PullRefreshIndicatorKt.f9008c) + (drawScope2.B1(PullRefreshIndicatorKt.f9009d) / 2.0f);
            Rect rect = new Rect(Offset.m(SizeKt.b(drawScope.c())) - B1, Offset.n(SizeKt.b(drawScope.c())) - B1, Offset.m(SizeKt.b(drawScope.c())) + B1, Offset.n(SizeKt.b(drawScope.c())) + B1);
            Rect rect2 = rect;
            long j4 = c2;
            DrawContext drawContext2 = G1;
            Path path2 = path;
            long j5 = j3;
            try {
                DrawScope.a2(drawScope, j3, f2.d(), f2.a() - f2.d(), false, rect.t(), rect.q(), floatValue, new Stroke(drawScope2.B1(PullRefreshIndicatorKt.f9009d), 0.0f, StrokeCap.f16130b.c(), 0, (PathEffect) null, 26, (DefaultConstructorMarker) null), (ColorFilter) null, 0, 768, (Object) null);
                PullRefreshIndicatorKt.k(drawScope, path2, rect2, j5, floatValue, f2);
                drawContext2.j().t();
                drawContext2.f(j4);
            } catch (Throwable th) {
                th = th;
                drawContext = drawContext2;
                j2 = j4;
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
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DrawScope) obj);
        return Unit.f40552a;
    }
}
