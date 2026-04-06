package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ProgressIndicatorKt$LinearProgressIndicator$3$1 extends Lambda implements Function1<DrawScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f8198A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f8199B;
    public final /* synthetic */ State C;
    public final /* synthetic */ State D;
    public final /* synthetic */ State E;
    public final /* synthetic */ State F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f8200z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$LinearProgressIndicator$3$1(long j2, int i2, long j3, State state, State state2, State state3, State state4) {
        super(1);
        this.f8200z = j2;
        this.f8198A = i2;
        this.f8199B = j3;
        this.C = state;
        this.D = state2;
        this.E = state3;
        this.F = state4;
    }

    public final void b(DrawScope drawScope) {
        float g2 = Size.g(drawScope.c());
        ProgressIndicatorKt.N(drawScope, this.f8200z, g2, this.f8198A);
        if (ProgressIndicatorKt.m(this.C) - ProgressIndicatorKt.n(this.D) > 0.0f) {
            ProgressIndicatorKt.M(drawScope, ProgressIndicatorKt.m(this.C), ProgressIndicatorKt.n(this.D), this.f8199B, g2, this.f8198A);
        }
        if (ProgressIndicatorKt.o(this.E) - ProgressIndicatorKt.p(this.F) > 0.0f) {
            ProgressIndicatorKt.M(drawScope, ProgressIndicatorKt.o(this.E), ProgressIndicatorKt.p(this.F), this.f8199B, g2, this.f8198A);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DrawScope) obj);
        return Unit.f40552a;
    }
}
