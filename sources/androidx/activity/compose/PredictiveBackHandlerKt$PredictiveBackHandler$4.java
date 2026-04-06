package androidx.activity.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PredictiveBackHandlerKt$PredictiveBackHandler$4 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f170A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f171B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f172z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PredictiveBackHandlerKt$PredictiveBackHandler$4(boolean z2, Function2 function2, int i2, int i3) {
        super(2);
        this.f172z = z2;
        this.f170A = function2;
        this.f171B = i2;
        this.C = i3;
    }

    public final void b(Composer composer, int i2) {
        PredictiveBackHandlerKt.a(this.f172z, this.f170A, composer, RecomposeScopeImplKt.a(this.f171B | 1), this.C);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
