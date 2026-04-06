package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.internal.Icons;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
public final class DatePickerKt$YearPickerMenuButton$1 implements Function3<RowScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f9766A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f9767z;

    public DatePickerKt$YearPickerMenuButton$1(Function2 function2, boolean z2) {
        this.f9767z = function2;
        this.f9766A = z2;
    }

    public final void b(RowScope rowScope, Composer composer, int i2) {
        String b2;
        if (composer.E((i2 & 17) != 16, 1 & i2)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1899489890, i2, -1, "androidx.compose.material3.YearPickerMenuButton.<anonymous> (DatePicker.kt:2256)");
            }
            this.f9767z.m(composer, 0);
            Modifier.Companion companion = Modifier.f15489d;
            SpacerKt.a(SizeKt.t(companion, ButtonDefaults.f9301a.g()), composer, 6);
            ImageVector a2 = Icons.Filled.f12257a.a();
            if (this.f9766A) {
                composer.X(1509384391);
                Strings.Companion companion2 = Strings.f12320b;
                b2 = Strings_androidKt.b(Strings.a(R.string.f10672s), composer, 0);
                composer.M();
            } else {
                composer.X(1509478662);
                Strings.Companion companion3 = Strings.f12320b;
                b2 = Strings_androidKt.b(Strings.a(R.string.f10676w), composer, 0);
                composer.M();
            }
            IconKt.e(a2, b2, RotateKt.a(companion, this.f9766A ? 180.0f : 0.0f), 0, composer, 0, 8);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
