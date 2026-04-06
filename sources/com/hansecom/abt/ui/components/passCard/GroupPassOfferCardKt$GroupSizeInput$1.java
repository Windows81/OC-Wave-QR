package com.hansecom.abt.ui.components.passCard;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonDefaults;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.R;
import com.hansecom.abt.ui.components.formFields.AbtBaseTextFieldKt;
import com.hansecom.abt.ui.components.formFields.AbtOutlineTextFieldDefaults;
import com.hansecom.abt.ui.theme.AbtTheme;
import com.hansecom.abt.util.resourcesResolvers.StringResourceKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class GroupPassOfferCardKt$GroupSizeInput$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f38615A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f38616B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PassOfferCardState f38617z;

    public GroupPassOfferCardKt$GroupSizeInput$1(PassOfferCardState passOfferCardState, Function0 function0, Function0 function02) {
        this.f38617z = passOfferCardState;
        this.f38615A = function0;
        this.f38616B = function02;
    }

    /* access modifiers changed from: private */
    public static final Unit e(String str) {
        Intrinsics.i(str, "it");
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(2054733979, i3, -1, "com.hansecom.abt.ui.components.passCard.GroupSizeInput.<anonymous> (GroupPassOfferCard.kt:85)");
            }
            String a2 = StringResourceKt.a(R.string.K, new Object[0], composer2, 0);
            AbtTheme abtTheme = AbtTheme.f38851a;
            AbtTheme abtTheme2 = abtTheme;
            TextKt.j(a2, (Modifier) null, abtTheme.b(composer2, 6).q(), (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme.d(composer2, 6).c(), composer, 0, 0, 131066);
            Alignment.Vertical i4 = Alignment.f15444a.i();
            float f2 = (float) 8;
            Arrangement.HorizontalOrVertical n2 = Arrangement.f3739a.n(Dp.m(f2));
            Function0 function0 = this.f38615A;
            PassOfferCardState passOfferCardState = this.f38617z;
            Function0 function02 = this.f38616B;
            Modifier.Companion companion = Modifier.f15489d;
            Composer composer3 = composer;
            MeasurePolicy b2 = RowKt.b(n2, i4, composer3, 54);
            int a3 = ComposablesKt.a(composer3, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer3, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a4 = companion2.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer3.y(a4);
            } else {
                composer.K();
            }
            Composer b3 = Updater.b(composer);
            Updater.g(b3, b2, companion2.c());
            Updater.g(b3, I, companion2.e());
            Function2 b4 = companion2.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a3))) {
                b3.N(Integer.valueOf(a3));
                b3.A(Integer.valueOf(a3), b4);
            }
            Updater.g(b3, e2, companion2.d());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f4150a;
            boolean z2 = true;
            boolean z3 = passOfferCardState.d() > passOfferCardState.g();
            IconButtonDefaults iconButtonDefaults = IconButtonDefaults.f10121a;
            AbtTheme abtTheme3 = abtTheme2;
            long b5 = abtTheme3.b(composer3, 6).b();
            long a5 = abtTheme3.b(composer3, 6).a();
            int i5 = IconButtonDefaults.f10122b;
            Modifier.Companion companion3 = companion;
            Function0 function03 = function02;
            IconButtonColors f3 = iconButtonDefaults.f(0, b5, 0, a5, composer, i5 << 12, 5);
            ComposableSingletons$GroupPassOfferCardKt composableSingletons$GroupPassOfferCardKt = ComposableSingletons$GroupPassOfferCardKt.f38586a;
            IconButtonKt.e(function0, (Modifier) null, z3, f3, (MutableInteractionSource) null, (Shape) null, composableSingletons$GroupPassOfferCardKt.a(), composer, 1572864, 50);
            String valueOf = String.valueOf(passOfferCardState.d());
            AbtOutlineTextFieldDefaults abtOutlineTextFieldDefaults = AbtOutlineTextFieldDefaults.f38255a;
            Composer composer4 = composer;
            TextFieldColors d2 = TextFieldColors.d(abtOutlineTextFieldDefaults.a(composer4, 6), 0, 0, abtOutlineTextFieldDefaults.a(composer4, 6).n(), 0, 0, 0, 0, 0, 0, 0, (TextSelectionColors) null, 0, 0, abtOutlineTextFieldDefaults.a(composer4, 6).m(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -8197, 2047, (Object) null);
            AbtTheme abtTheme4 = abtTheme3;
            TextStyle c2 = TextStyle.c(abtTheme4.d(composer4, 6).c(), 0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.f19080b.a(), 0, 0, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744447, (Object) null);
            PaddingValues b6 = PaddingKt.b(Dp.m((float) 12), Dp.m(f2));
            float m2 = Dp.m((float) 60);
            float c3 = Dp.f19144A.c();
            composer4.X(-1643987112);
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = new x();
                composer4.N(g2);
            }
            composer.M();
            PassOfferCardState passOfferCardState2 = passOfferCardState;
            float f4 = f2;
            AbtBaseTextFieldKt.c(valueOf, (Function1) g2, (Modifier) null, false, false, c2, (Function2) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, d2, b6, m2, c3, 0.0f, 0.0f, (Function0) null, composer, 3120, 12582912, 224256, 473825236);
            Composer composer5 = composer;
            AbtTheme abtTheme5 = abtTheme4;
            if (passOfferCardState2.d() >= passOfferCardState2.f()) {
                z2 = false;
            }
            IconButtonKt.e(function03, (Modifier) null, z2, iconButtonDefaults.f(0, abtTheme5.b(composer5, 6).v(), 0, abtTheme5.b(composer5, 6).a(), composer, i5 << 12, 5), (MutableInteractionSource) null, (Shape) null, composableSingletons$GroupPassOfferCardKt.b(), composer, 1572864, 50);
            composer.T();
            TextKt.j(StringResourceKt.a(R.string.L, new Object[]{String.valueOf(this.f38617z.g()), String.valueOf(this.f38617z.f())}, composer5, 0), PaddingKt.m(companion3, 0.0f, Dp.m(f4), 0.0f, 0.0f, 13, (Object) null), abtTheme5.b(composer5, 6).q(), (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme5.d(composer5, 6).e(), composer, 48, 0, 131064);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
