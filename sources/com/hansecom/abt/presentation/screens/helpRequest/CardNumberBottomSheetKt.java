package com.hansecom.abt.presentation.screens.helpRequest;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.ui.components.bottomSheet.AbtBottomSheetKt;
import com.hansecom.abt.ui.theme.AbtTheme;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

@Metadata
public final class CardNumberBottomSheetKt {
    public static final void f(SheetState sheetState, String str, ImmutableList immutableList, Function1 function1, Function0 function0, Composer composer, int i2) {
        int i3;
        Function1 function12 = function1;
        int i4 = i2;
        Composer q2 = composer.q(279070586);
        if ((i4 & 6) == 0) {
            i3 = (q2.W(sheetState) ? 4 : 2) | i4;
        } else {
            SheetState sheetState2 = sheetState;
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.W(str) ? 32 : 16;
        } else {
            String str2 = str;
        }
        ImmutableList immutableList2 = immutableList;
        if ((i4 & 384) == 0) {
            i3 |= q2.W(immutableList2) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i3 |= q2.l(function12) ? 2048 : 1024;
        }
        Function0 function02 = function0;
        if ((i4 & 24576) == 0) {
            i3 |= q2.l(function02) ? 16384 : 8192;
        }
        if ((i3 & 9363) != 9362 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(279070586, i3, -1, "com.hansecom.abt.presentation.screens.helpRequest.BottomSheet (CardNumberBottomSheet.kt:76)");
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object next : immutableList) {
                if (((CardNumberState) next).d()) {
                    arrayList.add(next);
                } else {
                    arrayList2.add(next);
                }
            }
            Pair pair = new Pair(arrayList, arrayList2);
            AbtBottomSheetKt.e(sheetState, str, 0, 0, (Shape) null, (Function2) null, function0, (Function3) null, ComposableLambdaKt.e(-1198814586, true, new CardNumberBottomSheetKt$BottomSheet$2((List) pair.a(), function12, (List) pair.b()), q2, 54), q2, (i3 & 14) | 100663296 | (i3 & 112) | ((i3 << 6) & 3670016), 188);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new C0428e(sheetState, str, immutableList, function1, function0, i2));
        }
    }

    public static final Unit g(SheetState sheetState, String str, ImmutableList immutableList, Function1 function1, Function0 function0, int i2, Composer composer, int i3) {
        f(sheetState, str, immutableList, function1, function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void h(String str, ImmutableList immutableList, Function1 function1, boolean z2, Function0 function0, Composer composer, int i2) {
        int i3;
        SheetState sheetState;
        String str2 = str;
        ImmutableList immutableList2 = immutableList;
        Function1 function12 = function1;
        boolean z3 = z2;
        Function0 function02 = function0;
        int i4 = i2;
        Intrinsics.i(str2, "title");
        Intrinsics.i(immutableList2, "items");
        Intrinsics.i(function12, "onSelectItem");
        Intrinsics.i(function02, "onDismissRequest");
        Composer q2 = composer.q(946646843);
        if ((i4 & 6) == 0) {
            i3 = (q2.W(str2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.W(immutableList2) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.l(function12) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i3 |= q2.d(z3) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i3 |= q2.l(function02) ? 16384 : 8192;
        }
        if ((i3 & 9363) != 9362 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(946646843, i3, -1, "com.hansecom.abt.presentation.screens.helpRequest.CardNumberBottomSheet (CardNumberBottomSheet.kt:45)");
            }
            if (z3) {
                if (((Boolean) q2.C(InspectionModeKt.a())).booleanValue()) {
                    q2.X(1543518059);
                    SheetValue sheetValue = SheetValue.Expanded;
                    q2.X(2128007080);
                    Object g2 = q2.g();
                    Composer.Companion companion = Composer.f14567a;
                    if (g2 == companion.a()) {
                        g2 = new C0425b();
                        q2.N(g2);
                    }
                    Function0 function03 = (Function0) g2;
                    q2.M();
                    q2.X(2128008488);
                    Object g3 = q2.g();
                    if (g3 == companion.a()) {
                        g3 = new C0426c();
                        q2.N(g3);
                    }
                    q2.M();
                    sheetState = new SheetState(true, function03, (Function0) g3, sheetValue, (Function1) null, true, 16, (DefaultConstructorMarker) null);
                    q2.M();
                } else {
                    q2.X(1543792812);
                    sheetState = ModalBottomSheetKt.T(false, (Function1) null, q2, 6, 2);
                    q2.M();
                }
                f(sheetState, str, immutableList, function1, function0, q2, ((i3 << 3) & 8176) | (i3 & 57344));
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new C0427d(str, immutableList, function1, z2, function0, i2));
        }
    }

    public static final float i() {
        return 0.0f;
    }

    public static final float j() {
        return 0.0f;
    }

    public static final Unit k(String str, ImmutableList immutableList, Function1 function1, boolean z2, Function0 function0, int i2, Composer composer, int i3) {
        h(str, immutableList, function1, z2, function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void l(String str, String str2, Function0 function0, Composer composer, int i2) {
        int i3;
        Composer composer2;
        String str3 = str;
        String str4 = str2;
        Function0 function02 = function0;
        int i4 = i2;
        Composer q2 = composer.q(-1208596440);
        if ((i4 & 6) == 0) {
            i3 = (q2.W(str3) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.W(str4) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.l(function02) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1208596440, i3, -1, "com.hansecom.abt.presentation.screens.helpRequest.FareMediaCard (CardNumberBottomSheet.kt:160)");
            }
            composer2 = q2;
            CardKt.d(function0, SizeKt.h(SizeKt.b(Modifier.f15489d, 0.0f, Dp.m((float) 80), 1, (Object) null), 0.0f, 1, (Object) null), false, RoundedCornerShapeKt.d(Dp.m((float) 4)), CardColors.d(CardDefaults.f9356a.a(q2, CardDefaults.f9357b), AbtTheme.f38851a.b(q2, 6).A(), 0, 0, 0, 14, (Object) null), (CardElevation) null, (BorderStroke) null, (MutableInteractionSource) null, ComposableLambdaKt.e(-662992429, true, new CardNumberBottomSheetKt$FareMediaCard$1(str3, str4), q2, 54), q2, ((i3 >> 6) & 14) | 100663344, 228);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            composer2 = q2;
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new C0424a(str3, str4, function02, i4));
        }
    }

    public static final Unit m(String str, String str2, Function0 function0, int i2, Composer composer, int i3) {
        l(str, str2, function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
