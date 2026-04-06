package com.hansecom.abt.ui.components.barcode;

import android.graphics.Bitmap;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import com.hansecom.abt.ui.components.barcode.BarcodeState;
import com.hansecom.abt.util.BitmapExtKt;
import com.hansecom.abt.util.resourcesResolvers.StringValueKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.barcode.ComposableSingletons$BarcodeKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$BarcodeKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$BarcodeKt$lambda1$1 f37969z = new ComposableSingletons$BarcodeKt$lambda1$1();

    public static final Unit g(IntSize intSize) {
        return Unit.f40552a;
    }

    public static final Unit h(IntSize intSize) {
        return Unit.f40552a;
    }

    public static final Unit i(IntSize intSize) {
        return Unit.f40552a;
    }

    public final void f(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(2047671476, i2, -1, "com.hansecom.abt.ui.components.barcode.ComposableSingletons$BarcodeKt.lambda-1.<anonymous> (Barcode.kt:206)");
            }
            float f2 = (float) 16;
            Modifier i3 = PaddingKt.i(Modifier.f15489d, Dp.m(f2));
            MeasurePolicy a2 = ColumnKt.a(Arrangement.f3739a.n(Dp.m(f2)), Alignment.f15444a.k(), composer, 6);
            int a3 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer, i3);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a4 = companion.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer.y(a4);
            } else {
                composer.K();
            }
            Composer b2 = Updater.b(composer);
            Updater.g(b2, a2, companion.c());
            Updater.g(b2, I, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e2, companion.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            BarcodeState.Loading loading = BarcodeState.Loading.f37964z;
            composer.X(-1542863247);
            Object g2 = composer.g();
            Composer.Companion companion2 = Composer.f14567a;
            if (g2 == companion2.a()) {
                g2 = new j();
                composer.N(g2);
            }
            composer.M();
            BarcodeKt.h(loading, (Function1) g2, composer, 54);
            BarcodeState.Error error = new BarcodeState.Error(StringValueKt.d("Error"));
            composer.X(-1542858703);
            Object g3 = composer.g();
            if (g3 == companion2.a()) {
                g3 = new k();
                composer.N(g3);
            }
            composer.M();
            BarcodeKt.h(error, (Function1) g3, composer, 48);
            BitMatrix b4 = new MultiFormatWriter().b("1234567890", BarcodeFormat.CODE_128, 200, 100);
            Intrinsics.h(b4, "encode(...)");
            Color.Companion companion3 = Color.f15975b;
            BarcodeState.Success success = new BarcodeState.Success("1234567890", BitmapExtKt.a(b4, ColorKt.j(companion3.a()), ColorKt.j(companion3.e()), Bitmap.Config.ALPHA_8));
            composer.X(-1542845391);
            Object g4 = composer.g();
            if (g4 == companion2.a()) {
                g4 = new l();
                composer.N(g4);
            }
            composer.M();
            BarcodeKt.h(success, (Function1) g4, composer, 48);
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
        f((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
