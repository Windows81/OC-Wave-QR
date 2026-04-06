package com.hansecom.abt.ui.components.passCard;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.R;
import com.hansecom.abt.ui.theme.AbtTheme;
import com.hansecom.abt.util.resourcesResolvers.StringResourceKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class GroupPassOfferCardKt$GroupPassOfferCardSmall$1 implements Function3<ColumnScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PassOfferCardState f38614z;

    public GroupPassOfferCardKt$GroupPassOfferCardSmall$1(PassOfferCardState passOfferCardState) {
        this.f38614z = passOfferCardState;
    }

    public final void b(ColumnScope columnScope, Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        Intrinsics.i(columnScope, "$this$PassContainer");
        if ((i3 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1252346641, i3, -1, "com.hansecom.abt.ui.components.passCard.GroupPassOfferCardSmall.<anonymous> (GroupPassOfferCard.kt:189)");
            }
            PassOfferCardKt.k(this.f38614z.h(), this.f38614z.j(), this.f38614z.l(), composer2, 0);
            AbtTheme abtTheme = AbtTheme.f38851a;
            long u2 = abtTheme.b(composer2, 6).u();
            Modifier.Companion companion = Modifier.f15489d;
            DividerKt.e(PaddingKt.k(companion, 0.0f, Dp.m((float) 16), 1, (Object) null), 0.0f, u2, composer, 6, 2);
            PassOfferCardState passOfferCardState = this.f38614z;
            MeasurePolicy b2 = RowKt.b(Arrangement.f3739a.f(), Alignment.f15444a.l(), composer2, 0);
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
            String a4 = StringResourceKt.a(R.string.K, new Object[0], composer2, 0);
            TextStyle c2 = abtTheme.d(composer2, 6).c();
            Composer composer3 = composer;
            TextKt.j(a4, rowScopeInstance.b(companion), abtTheme.b(composer2, 6).q(), (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, c2, composer3, 0, 0, 131064);
            String valueOf = String.valueOf(passOfferCardState.d());
            Composer composer4 = composer;
            AbtTheme abtTheme2 = abtTheme;
            TextStyle f2 = abtTheme2.d(composer4, 6).f();
            TextKt.j(valueOf, PaddingKt.m(rowScopeInstance.b(companion), Dp.m((float) 4), 0.0f, 0.0f, 0.0f, 14, (Object) null), abtTheme2.b(composer4, 6).q(), (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, f2, composer3, 0, 0, 131064);
            composer.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
