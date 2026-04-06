package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.Icons;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata
public final class ExposedDropdownMenuDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final ExposedDropdownMenuDefaults f9944a = new ExposedDropdownMenuDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final PaddingValues f9945b = PaddingKt.b(ExposedDropdownMenuKt.f9947a, Dp.m((float) 0));

    /* renamed from: c  reason: collision with root package name */
    public static final int f9946c = 0;

    public static final Unit c(ExposedDropdownMenuDefaults exposedDropdownMenuDefaults, boolean z2, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        exposedDropdownMenuDefaults.b(z2, modifier, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public final void b(boolean z2, Modifier modifier, Composer composer, int i2, int i3) {
        int i4;
        Composer q2 = composer.q(-1732824199);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (q2.d(z2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= q2.W(modifier) ? 32 : 16;
        }
        if (q2.E((i4 & 19) != 18, i4 & 1)) {
            if (i5 != 0) {
                modifier = Modifier.f15489d;
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(-1732824199, i4, -1, "androidx.compose.material3.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.kt:511)");
            }
            IconKt.e(Icons.Filled.f12257a.a(), (String) null, RotateKt.a(modifier, z2 ? 180.0f : 0.0f), 0, q2, 48, 8);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new A2(this, z2, modifier2, i2, i3));
        }
    }
}
