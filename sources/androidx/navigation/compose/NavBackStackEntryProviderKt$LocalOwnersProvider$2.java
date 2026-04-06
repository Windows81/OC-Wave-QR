package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavBackStackEntryProviderKt$LocalOwnersProvider$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SaveableStateHolder f22501A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f22502B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f22503z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavBackStackEntryProviderKt$LocalOwnersProvider$2(NavBackStackEntry navBackStackEntry, SaveableStateHolder saveableStateHolder, Function2 function2, int i2) {
        super(2);
        this.f22503z = navBackStackEntry;
        this.f22501A = saveableStateHolder;
        this.f22502B = function2;
        this.C = i2;
    }

    public final void b(Composer composer, int i2) {
        NavBackStackEntryProviderKt.a(this.f22503z, this.f22501A, this.f22502B, composer, RecomposeScopeImplKt.a(this.C | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
