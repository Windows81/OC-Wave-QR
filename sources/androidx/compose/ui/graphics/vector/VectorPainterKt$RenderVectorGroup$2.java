package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class VectorPainterKt$RenderVectorGroup$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Map f16669A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f16670B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ VectorGroup f16671z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VectorPainterKt$RenderVectorGroup$2(VectorGroup vectorGroup, Map map, int i2, int i3) {
        super(2);
        this.f16671z = vectorGroup;
        this.f16669A = map;
        this.f16670B = i2;
        this.C = i3;
    }

    public final void b(Composer composer, int i2) {
        VectorPainterKt.a(this.f16671z, this.f16669A, composer, RecomposeScopeImplKt.a(this.f16670B | 1), this.C);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
