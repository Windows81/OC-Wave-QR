package androidx.compose.material;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ProgressIndicatorKt$CircularProgressIndicator$1$1 extends Lambda implements Function1<DrawScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f8172A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Stroke f8173B;
    public final /* synthetic */ long C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f8174z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$CircularProgressIndicator$1$1(float f2, long j2, Stroke stroke, long j3) {
        super(1);
        this.f8174z = f2;
        this.f8172A = j2;
        this.f8173B = stroke;
        this.C = j3;
    }

    public final void b(DrawScope drawScope) {
        float f2 = this.f8174z * 360.0f;
        ProgressIndicatorKt.J(drawScope, this.f8172A, this.f8173B);
        ProgressIndicatorKt.K(drawScope, 270.0f, f2, this.C, this.f8173B);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DrawScope) obj);
        return Unit.f40552a;
    }
}
