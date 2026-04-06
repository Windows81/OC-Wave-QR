package com.hansecom.abt.ui.components.snackbar;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SnackbarVisuals;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.ui.components.AbtTextKt;
import com.hansecom.abt.ui.theme.AbtTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AbtSnackbarKt$AbtSnackbar$2 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SnackbarVisuals f38786A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f38787B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Painter f38788z;

    public AbtSnackbarKt$AbtSnackbar$2(Painter painter, SnackbarVisuals snackbarVisuals, long j2) {
        this.f38788z = painter;
        this.f38786A = snackbarVisuals;
        this.f38787B = j2;
    }

    public final void b(Composer composer, int i2) {
        CharSequence charSequence;
        Composer composer2 = composer;
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1353396603, i3, -1, "com.hansecom.abt.ui.components.snackbar.AbtSnackbar.<anonymous> (AbtSnackbar.kt:143)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Arrangement.HorizontalOrVertical n2 = Arrangement.f3739a.n(Dp.m((float) 16));
            Alignment.Vertical i4 = Alignment.f15444a.i();
            Painter painter = this.f38788z;
            SnackbarVisuals snackbarVisuals = this.f38786A;
            long j2 = this.f38787B;
            MeasurePolicy b2 = RowKt.b(n2, i4, composer2, 54);
            int a2 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a3 = companion2.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer2.y(a3);
            } else {
                composer.K();
            }
            Composer b3 = Updater.b(composer);
            Updater.g(b3, b2, companion2.c());
            Updater.g(b3, I, companion2.e());
            Function2 b4 = companion2.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a2))) {
                b3.N(Integer.valueOf(a2));
                b3.A(Integer.valueOf(a2), b4);
            }
            Updater.g(b3, e2, companion2.d());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f4150a;
            composer2.X(763372153);
            if (painter != null) {
                IconKt.d(painter, (String) null, SizeKt.t(companion, Dp.m((float) 24)), j2, composer, 432, 0);
            }
            composer.M();
            AbtSnackbarVisuals abtSnackbarVisuals = snackbarVisuals instanceof AbtSnackbarVisuals ? (AbtSnackbarVisuals) snackbarVisuals : null;
            if (abtSnackbarVisuals == null || (charSequence = abtSnackbarVisuals.e()) == null) {
                charSequence = snackbarVisuals.a();
            }
            AbtTextKt.c(charSequence, (Modifier) null, 0, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, AbtTheme.f38851a.d(composer2, 6).d(), composer, 0, 0, 65534);
            composer.T();
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
