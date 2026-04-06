package androidx.compose.ui.spatial;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class RectListDebugger_androidKt$RectListDebugger$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f18160A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f18161B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f18162z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RectListDebugger_androidKt$RectListDebugger$1(Modifier modifier, int i2, int i3) {
        super(2);
        this.f18162z = modifier;
        this.f18160A = i2;
        this.f18161B = i3;
    }

    public final void b(Composer composer, int i2) {
        RectListDebugger_androidKt.a(this.f18162z, composer, RecomposeScopeImplKt.a(this.f18160A | 1), this.f18161B);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
