package androidx.compose.material;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ProgressIndicatorKt$LinearProgressIndicator$1$1 extends Lambda implements Function1<DrawScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f8192A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f8193B;
    public final /* synthetic */ long C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f8194z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$LinearProgressIndicator$1$1(long j2, int i2, float f2, long j3) {
        super(1);
        this.f8194z = j2;
        this.f8192A = i2;
        this.f8193B = f2;
        this.C = j3;
    }

    public final void b(DrawScope drawScope) {
        float g2 = Size.g(drawScope.c());
        ProgressIndicatorKt.N(drawScope, this.f8194z, g2, this.f8192A);
        ProgressIndicatorKt.M(drawScope, 0.0f, this.f8193B, this.C, g2, this.f8192A);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DrawScope) obj);
        return Unit.f40552a;
    }
}
