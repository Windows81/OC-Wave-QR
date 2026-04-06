package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TwoLine$ListItem$1$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f8919A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f8920z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TwoLine$ListItem$1$3(Function2 function2, Function2 function22) {
        super(2);
        this.f8920z = function2;
        this.f8919A = function22;
    }

    public final void b(Composer composer, int i2) {
        boolean z2 = false;
        if ((i2 & 3) != 2) {
            z2 = true;
        }
        if (composer.E(z2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(993836488, i2, -1, "androidx.compose.material.TwoLine.ListItem.<anonymous>.<anonymous> (ListItem.kt:262)");
            }
            this.f8920z.m(composer, 0);
            Function2 function2 = this.f8919A;
            Intrinsics.f(function2);
            function2.m(composer, 0);
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
