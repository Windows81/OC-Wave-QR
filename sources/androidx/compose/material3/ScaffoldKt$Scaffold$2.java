package androidx.compose.material3;

import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
public final class ScaffoldKt$Scaffold$2 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f10766A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function3 f10767B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ MutableWindowInsets E;
    public final /* synthetic */ Function2 F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f10768z;

    public ScaffoldKt$Scaffold$2(int i2, Function2 function2, Function3 function3, Function2 function22, Function2 function23, MutableWindowInsets mutableWindowInsets, Function2 function24) {
        this.f10768z = i2;
        this.f10766A = function2;
        this.f10767B = function3;
        this.C = function22;
        this.D = function23;
        this.E = mutableWindowInsets;
        this.F = function24;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(848889571, i2, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:104)");
            }
            ScaffoldKt.g(this.f10768z, this.f10766A, this.f10767B, this.C, this.D, this.E, this.F, composer, 0);
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
