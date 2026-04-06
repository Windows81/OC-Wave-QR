package androidx.compose.material;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class MenuKt$DropdownMenuContent$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableState f7961A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ScrollState f7962B;
    public final /* synthetic */ Modifier C;
    public final /* synthetic */ Function3 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableTransitionState f7963z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MenuKt$DropdownMenuContent$3(MutableTransitionState mutableTransitionState, MutableState mutableState, ScrollState scrollState, Modifier modifier, Function3 function3, int i2, int i3) {
        super(2);
        this.f7963z = mutableTransitionState;
        this.f7961A = mutableState;
        this.f7962B = scrollState;
        this.C = modifier;
        this.D = function3;
        this.E = i2;
        this.F = i3;
    }

    public final void b(Composer composer, int i2) {
        MenuKt.a(this.f7963z, this.f7961A, this.f7962B, this.C, this.D, composer, RecomposeScopeImplKt.a(this.E | 1), this.F);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
