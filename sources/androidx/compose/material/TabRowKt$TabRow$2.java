package androidx.compose.material;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TabRowKt$TabRow$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f8713A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function3 f8714B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f8715z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabRowKt$TabRow$2(Function2 function2, Function2 function22, Function3 function3) {
        super(2);
        this.f8715z = function2;
        this.f8713A = function22;
        this.f8714B = function3;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1961746365, i2, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:151)");
            }
            Modifier h2 = SizeKt.h(Modifier.f15489d, 0.0f, 1, (Object) null);
            boolean W = composer.W(this.f8715z) | composer.W(this.f8713A) | composer.W(this.f8714B);
            Function2 function2 = this.f8715z;
            Function2 function22 = this.f8713A;
            Function3 function3 = this.f8714B;
            Object g2 = composer.g();
            if (W || g2 == Composer.f14567a.a()) {
                g2 = new TabRowKt$TabRow$2$1$1(function2, function22, function3);
                composer.N(g2);
            }
            SubcomposeLayoutKt.a(h2, (Function2) g2, composer, 6, 0);
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
