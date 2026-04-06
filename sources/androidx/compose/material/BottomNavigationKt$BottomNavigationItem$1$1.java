package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BottomNavigationKt$BottomNavigationItem$1$1 extends Lambda implements Function3<Float, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f7331A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f7332B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f7333z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomNavigationKt$BottomNavigationItem$1$1(boolean z2, Function2 function2, Function2 function22) {
        super(3);
        this.f7333z = z2;
        this.f7331A = function2;
        this.f7332B = function22;
    }

    public final void b(float f2, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= composer.h(f2) ? 4 : 2;
        }
        if (composer.E((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1411872801, i2, -1, "androidx.compose.material.BottomNavigationItem.<anonymous>.<anonymous> (BottomNavigation.kt:239)");
            }
            if (this.f7333z) {
                f2 = 1.0f;
            }
            BottomNavigationKt.d(this.f7331A, this.f7332B, f2, composer, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b(((Number) obj).floatValue(), (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
