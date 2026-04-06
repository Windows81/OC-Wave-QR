package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavBackStackEntryProviderKt$SaveableStateProvider$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f22504A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f22505B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SaveableStateHolder f22506z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavBackStackEntryProviderKt$SaveableStateProvider$1(SaveableStateHolder saveableStateHolder, Function2 function2, int i2) {
        super(2);
        this.f22506z = saveableStateHolder;
        this.f22504A = function2;
        this.f22505B = i2;
    }

    public final void b(Composer composer, int i2) {
        NavBackStackEntryProviderKt.b(this.f22506z, this.f22504A, composer, RecomposeScopeImplKt.a(this.f22505B | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
