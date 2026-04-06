package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazySaveableStateHolderKt$LazySaveableStateHolderProvider$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f4947A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function3 f4948z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazySaveableStateHolderKt$LazySaveableStateHolderProvider$2(Function3 function3, int i2) {
        super(2);
        this.f4948z = function3;
        this.f4947A = i2;
    }

    public final void b(Composer composer, int i2) {
        LazySaveableStateHolderKt.a(this.f4948z, composer, RecomposeScopeImplKt.a(this.f4947A | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
