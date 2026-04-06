package com.hansecom.abt.ui.components.bottomSheet;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectionModeKt;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

@Metadata
public final class OptionsBottomSheetKt {
    public static final void f(SheetState sheetState, String str, ImmutableList immutableList, Function1 function1, Function1 function12, Function1 function13, Function0 function0, Composer composer, int i2) {
        int i3;
        Composer composer2;
        String str2 = str;
        ImmutableList immutableList2 = immutableList;
        Function1 function14 = function1;
        Function1 function15 = function12;
        Function1 function16 = function13;
        int i4 = i2;
        Composer q2 = composer.q(-1238819784);
        SheetState sheetState2 = sheetState;
        if ((i4 & 6) == 0) {
            i3 = (q2.W(sheetState2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.W(str2) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= (i4 & 512) == 0 ? q2.W(immutableList2) : q2.l(immutableList2) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i3 |= q2.l(function14) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i3 |= q2.l(function15) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i3 |= q2.l(function16) ? 131072 : 65536;
        }
        Function0 function02 = function0;
        if ((1572864 & i4) == 0) {
            i3 |= q2.l(function02) ? 1048576 : 524288;
        }
        if ((599187 & i3) != 599186 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1238819784, i3, -1, "com.hansecom.abt.ui.components.bottomSheet.BottomSheet (OptionsBottomSheet.kt:80)");
            }
            composer2 = q2;
            AbtBottomSheetKt.e(sheetState, str, 0, 0, (Shape) null, (Function2) null, function0, ComposableLambdaKt.e(1646535909, true, new OptionsBottomSheetKt$BottomSheet$1(str2), q2, 54), ComposableLambdaKt.e(609419332, true, new OptionsBottomSheetKt$BottomSheet$2(immutableList2, function14, function15, function16), q2, 54), composer2, (i3 & 14) | 113246208 | (i3 & 112) | (i3 & 3670016), 60);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            composer2 = q2;
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new i(sheetState, str, immutableList, function1, function12, function13, function0, i2));
        }
    }

    public static final Unit g(SheetState sheetState, String str, ImmutableList immutableList, Function1 function1, Function1 function12, Function1 function13, Function0 function0, int i2, Composer composer, int i3) {
        f(sheetState, str, immutableList, function1, function12, function13, function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void h(String str, ImmutableList immutableList, Function1 function1, Function1 function12, Function1 function13, boolean z2, Function0 function0, Composer composer, int i2) {
        int i3;
        Composer composer2;
        SheetState sheetState;
        String str2 = str;
        ImmutableList immutableList2 = immutableList;
        Function1 function14 = function1;
        Function1 function15 = function12;
        Function1 function16 = function13;
        boolean z3 = z2;
        Function0 function02 = function0;
        int i4 = i2;
        Intrinsics.i(str2, "title");
        Intrinsics.i(immutableList2, "items");
        Intrinsics.i(function14, "itemKey");
        Intrinsics.i(function15, "itemLabel");
        Intrinsics.i(function16, "onSelectItem");
        Intrinsics.i(function02, "onDismissRequest");
        Composer q2 = composer.q(-1777355504);
        if ((i4 & 6) == 0) {
            i3 = (q2.W(str2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= (i4 & 64) == 0 ? q2.W(immutableList2) : q2.l(immutableList2) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.l(function14) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i3 |= q2.l(function15) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i3 |= q2.l(function16) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i3 |= q2.d(z3) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i3 |= q2.l(function02) ? 1048576 : 524288;
        }
        if ((599187 & i3) != 599186 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1777355504, i3, -1, "com.hansecom.abt.ui.components.bottomSheet.OptionsBottomSheet (OptionsBottomSheet.kt:45)");
            }
            if (z3) {
                if (((Boolean) q2.C(InspectionModeKt.a())).booleanValue()) {
                    q2.X(-1836759683);
                    SheetValue sheetValue = SheetValue.Expanded;
                    q2.X(1464776534);
                    Object g2 = q2.g();
                    Composer.Companion companion = Composer.f14567a;
                    if (g2 == companion.a()) {
                        g2 = new f();
                        q2.N(g2);
                    }
                    Function0 function03 = (Function0) g2;
                    q2.M();
                    q2.X(1464777942);
                    Object g3 = q2.g();
                    if (g3 == companion.a()) {
                        g3 = new g();
                        q2.N(g3);
                    }
                    q2.M();
                    sheetState = new SheetState(true, function03, (Function0) g3, sheetValue, (Function1) null, true, 16, (DefaultConstructorMarker) null);
                    q2.M();
                } else {
                    q2.X(-1836484930);
                    sheetState = ModalBottomSheetKt.T(false, (Function1) null, q2, 6, 2);
                    q2.M();
                }
                composer2 = q2;
                f(sheetState, str, immutableList, function1, function12, function13, function0, q2, ((i3 << 3) & 524272) | (i3 & 3670016));
            } else {
                composer2 = q2;
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            composer2 = q2;
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            h hVar = r0;
            h hVar2 = new h(str, immutableList, function1, function12, function13, z2, function0, i2);
            x2.a(hVar);
        }
    }

    public static final float i() {
        return 0.0f;
    }

    public static final float j() {
        return 0.0f;
    }

    public static final Unit k(String str, ImmutableList immutableList, Function1 function1, Function1 function12, Function1 function13, boolean z2, Function0 function0, int i2, Composer composer, int i3) {
        h(str, immutableList, function1, function12, function13, z2, function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void l(String str, Function0 function0, Composer composer, int i2) {
        int i3;
        Composer composer2;
        String str2 = str;
        Function0 function02 = function0;
        Composer q2 = composer.q(2071678484);
        if ((i2 & 6) == 0) {
            i3 = i2 | (q2.W(str2) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.l(function02) ? 32 : 16;
        }
        int i4 = i3;
        if ((i4 & 19) != 18 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(2071678484, i4, -1, "com.hansecom.abt.ui.components.bottomSheet.OptionsBottomSheetHeader (OptionsBottomSheet.kt:114)");
            }
            Arrangement.HorizontalOrVertical d2 = Arrangement.f3739a.d();
            Alignment.Vertical i5 = Alignment.f15444a.i();
            Modifier.Companion companion = Modifier.f15489d;
            Modifier k2 = PaddingKt.k(SizeKt.h(companion, 0.0f, 1, (Object) null), 0.0f, Dp.m((float) 4), 1, (Object) null);
            MeasurePolicy b2 = RowKt.b(d2, i5, q2, 54);
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, k2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a3 = companion2.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a3);
            } else {
                q2.K();
            }
            Composer b3 = Updater.b(q2);
            Updater.g(b3, b2, companion2.c());
            Updater.g(b3, I, companion2.e());
            Function2 b4 = companion2.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a2))) {
                b3.N(Integer.valueOf(a2));
                b3.A(Integer.valueOf(a2), b4);
            }
            Updater.g(b3, e2, companion2.d());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f4150a;
            composer2 = q2;
            AbtTextKt.c(str, (Modifier) null, 0, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, AbtTheme.f38851a.d(q2, 6).m(), composer2, i4 & 14, 0, 65534);
            IconButtonKt.e(function0, OffsetKt.c(SizeKt.t(companion, Dp.m((float) 48)), Dp.m((float) 12), 0.0f, 2, (Object) null), false, (IconButtonColors) null, (MutableInteractionSource) null, (Shape) null, ComposableSingletons$OptionsBottomSheetKt.f38032a.a(), composer2, ((i4 >> 3) & 14) | 1572912, 60);
            composer2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            composer2 = q2;
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new e(str, function0, i2));
        }
    }

    public static final Unit m(String str, Function0 function0, int i2, Composer composer, int i3) {
        l(str, function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
