package androidx.compose.material;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableState f7807A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ScrollState f7808B;
    public final /* synthetic */ ExposedDropdownMenuBoxScope C;
    public final /* synthetic */ Modifier D;
    public final /* synthetic */ Function3 E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableTransitionState f7809z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1(MutableTransitionState mutableTransitionState, MutableState mutableState, ScrollState scrollState, ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, Function3 function3) {
        super(2);
        this.f7809z = mutableTransitionState;
        this.f7807A = mutableState;
        this.f7808B = scrollState;
        this.C = exposedDropdownMenuBoxScope;
        this.D = modifier;
        this.E = function3;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1167205969, i2, -1, "androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.kt:211)");
            }
            MenuKt.a(this.f7809z, this.f7807A, this.f7808B, ExposedDropdownMenuBoxScope.c(this.C, this.D, false, 1, (Object) null), this.E, composer, MutableTransitionState.f2620d | 48, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
