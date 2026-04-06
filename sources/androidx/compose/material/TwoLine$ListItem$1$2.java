package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TwoLine$ListItem$1$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f8917A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f8918z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TwoLine$ListItem$1$2(Function2 function2, Function2 function22) {
        super(2);
        this.f8918z = function2;
        this.f8917A = function22;
    }

    public final void b(Composer composer, int i2) {
        boolean z2 = false;
        if ((i2 & 3) != 2) {
            z2 = true;
        }
        if (composer.E(z2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1675021441, i2, -1, "androidx.compose.material.TwoLine.ListItem.<anonymous>.<anonymous> (ListItem.kt:243)");
            }
            this.f8918z.m(composer, 0);
            this.f8917A.m(composer, 0);
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
