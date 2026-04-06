package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
final class TimePickerDialogKt$TimePickerDialog$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f11455A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f11456B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ Shape E;
    public final /* synthetic */ long F;
    public final /* synthetic */ Function3 G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f11457z;

    public final void b(Composer composer, int i2) {
        int i3 = i2;
        if (composer.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(296331566, i3, -1, "androidx.compose.material3.TimePickerDialog.<anonymous> (TimePickerDialog.kt:81)");
            }
            TimePickerDialogKt.e(this.f11457z, this.f11455A, this.f11456B, this.C, this.D, this.E, this.F, this.G, composer, 0, 0);
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
