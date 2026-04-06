package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ThreeLine$ListItem$1$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f8896A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f8897B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f8898z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreeLine$ListItem$1$2(Function2 function2, Function2 function22, Function2 function23) {
        super(2);
        this.f8898z = function2;
        this.f8896A = function22;
        this.f8897B = function23;
    }

    public final void b(Composer composer, int i2) {
        boolean z2 = false;
        if ((i2 & 3) != 2) {
            z2 = true;
        }
        if (composer.E(z2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-318094245, i2, -1, "androidx.compose.material.ThreeLine.ListItem.<anonymous>.<anonymous> (ListItem.kt:339)");
            }
            if (this.f8898z != null) {
                composer.X(-1959304577);
                this.f8898z.m(composer, 0);
            } else {
                composer.X(-608886287);
            }
            composer.M();
            this.f8896A.m(composer, 0);
            this.f8897B.m(composer, 0);
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
