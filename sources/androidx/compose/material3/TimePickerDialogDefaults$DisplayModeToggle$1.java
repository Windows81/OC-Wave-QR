package androidx.compose.material3;

import androidx.compose.material3.TimePickerDisplayMode;
import androidx.compose.material3.internal.Icons;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
final class TimePickerDialogDefaults$DisplayModeToggle$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f11450z;

    public final void b(Composer composer, int i2) {
        int i3;
        if (composer.E((i2 & 3) != 2, 1 & i2)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-698026161, i2, -1, "androidx.compose.material3.TimePickerDialogDefaults.DisplayModeToggle.<anonymous> (TimePickerDialog.kt:266)");
            }
            int i4 = this.f11450z;
            TimePickerDisplayMode.Companion companion = TimePickerDisplayMode.f11464b;
            ImageVector a2 = TimePickerDisplayMode.d(i4, companion.a()) ? Icons.Outlined.f12264a.a() : Icons.Outlined.f12264a.b();
            if (TimePickerDisplayMode.d(this.f11450z, companion.a())) {
                Strings.Companion companion2 = Strings.f12320b;
                i3 = Strings.a(R.string.c0);
            } else {
                Strings.Companion companion3 = Strings.f12320b;
                i3 = Strings.a(R.string.b0);
            }
            IconKt.e(a2, Strings_androidKt.b(i3, composer, 0), (Modifier) null, 0, composer, 0, 12);
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
