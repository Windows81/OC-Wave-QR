package androidx.compose.material;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TabKt$Tab$1 extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f8656A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f8657z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabKt$Tab$1(Function2 function2, Function2 function22) {
        super(3);
        this.f8657z = function2;
        this.f8656A = function22;
    }

    public final void b(ColumnScope columnScope, Composer composer, int i2) {
        if (composer.E((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-178151495, i2, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:115)");
            }
            TabKt.d(this.f8657z, this.f8656A, composer, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
