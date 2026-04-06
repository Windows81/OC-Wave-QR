package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ProgressIndicatorKt$CircularProgressIndicator$3$1 extends Lambda implements Function1<DrawScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Stroke f8178A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f8179B;
    public final /* synthetic */ long C;
    public final /* synthetic */ State D;
    public final /* synthetic */ State E;
    public final /* synthetic */ State F;
    public final /* synthetic */ State G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f8180z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$CircularProgressIndicator$3$1(long j2, Stroke stroke, float f2, long j3, State state, State state2, State state3, State state4) {
        super(1);
        this.f8180z = j2;
        this.f8178A = stroke;
        this.f8179B = f2;
        this.C = j3;
        this.D = state;
        this.E = state2;
        this.F = state3;
        this.G = state4;
    }

    public final void b(DrawScope drawScope) {
        ProgressIndicatorKt.J(drawScope, this.f8180z, this.f8178A);
        DrawScope drawScope2 = drawScope;
        ProgressIndicatorKt.L(drawScope2, ProgressIndicatorKt.g(this.F) + (((((float) ProgressIndicatorKt.h(this.D)) * 216.0f) % 360.0f) - 0.049804688f) + ProgressIndicatorKt.e(this.G), this.f8179B, Math.abs(ProgressIndicatorKt.f(this.E) - ProgressIndicatorKt.g(this.F)), this.C, this.f8178A);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DrawScope) obj);
        return Unit.f40552a;
    }
}
