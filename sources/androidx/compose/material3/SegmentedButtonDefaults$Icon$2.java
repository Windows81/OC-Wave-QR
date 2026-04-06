package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
public final class SegmentedButtonDefaults$Icon$2 implements Function3<Boolean, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f10926A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f10927z;

    public SegmentedButtonDefaults$Icon$2(Function2 function2, Function2 function22) {
        this.f10927z = function2;
        this.f10926A = function22;
    }

    public final void b(boolean z2, Composer composer, int i2) {
        Function2 function2;
        if ((i2 & 6) == 0) {
            i2 |= composer.d(z2) ? 4 : 2;
        }
        if (composer.E((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1785818285, i2, -1, "androidx.compose.material3.SegmentedButtonDefaults.Icon.<anonymous> (SegmentedButton.kt:657)");
            }
            if (z2) {
                composer.X(1815547362);
                function2 = this.f10927z;
            } else {
                composer.X(1815548036);
                function2 = this.f10926A;
            }
            function2.m(composer, 0);
            composer.M();
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b(((Boolean) obj).booleanValue(), (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
