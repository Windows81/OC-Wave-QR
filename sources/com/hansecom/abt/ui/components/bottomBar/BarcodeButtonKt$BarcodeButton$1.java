package com.hansecom.abt.ui.components.bottomBar;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.Role;
import com.hansecom.abt.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata
public final class BarcodeButtonKt$BarcodeButton$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f37985A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f37986B;
    public final /* synthetic */ State C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f37987z;

    public BarcodeButtonKt$BarcodeButton$1(boolean z2, Function0 function0, float f2, State state) {
        this.f37987z = z2;
        this.f37985A = function0;
        this.f37986B = f2;
        this.C = state;
    }

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1249094922, i2, -1, "com.hansecom.abt.ui.components.bottomBar.BarcodeButton.<anonymous> (BarcodeButton.kt:48)");
            }
            IconKt.d(PainterResources_androidKt.c(R.drawable.R, composer, 0), (String) null, SizeKt.f(PaddingKt.i(ClickableKt.f(Modifier.f15489d, this.f37987z, (String) null, (Role) null, this.f37985A, 6, (Object) null), this.f37986B), 0.0f, 1, (Object) null), BarcodeButtonKt.c(this.C), composer, 48, 0);
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
