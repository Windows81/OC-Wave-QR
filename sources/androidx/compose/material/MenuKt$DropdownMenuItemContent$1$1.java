package androidx.compose.material;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class MenuKt$DropdownMenuItemContent$1$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function3 f7966A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ RowScope f7967B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f7968z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MenuKt$DropdownMenuItemContent$1$1(boolean z2, Function3 function3, RowScope rowScope) {
        super(2);
        this.f7968z = z2;
        this.f7966A = function3;
        this.f7967B = rowScope;
    }

    public final void b(Composer composer, int i2) {
        float b2;
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1190489496, i2, -1, "androidx.compose.material.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:253)");
            }
            if (this.f7968z) {
                composer.X(-186854702);
                b2 = ContentAlpha.f7561a.c(composer, 6);
            } else {
                composer.X(-186853962);
                b2 = ContentAlpha.f7561a.b(composer, 6);
            }
            composer.M();
            ProvidedValue d2 = ContentAlphaKt.a().d(Float.valueOf(b2));
            final Function3 function3 = this.f7966A;
            final RowScope rowScope = this.f7967B;
            CompositionLocalKt.c(d2, ComposableLambdaKt.e(-1705995688, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    if (composer.E((i2 & 3) != 2, i2 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(-1705995688, i2, -1, "androidx.compose.material.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:254)");
                        }
                        function3.d(rowScope, composer, 0);
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
            }, composer, 54), composer, ProvidedValue.f14769i | 48);
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
