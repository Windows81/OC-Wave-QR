package com.hansecom.abt.ui.components.barcode;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BarcodeKt$Barcode$1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Density f37960A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f37961B;
    public final /* synthetic */ BarcodeState C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableState f37962z;

    public BarcodeKt$Barcode$1$1(MutableState mutableState, Density density, Function1 function1, BarcodeState barcodeState) {
        this.f37962z = mutableState;
        this.f37960A = density;
        this.f37961B = function1;
        this.C = barcodeState;
    }

    public static final Unit f(Density density, Function1 function1, MutableState mutableState, IntSize intSize) {
        if (IntSize.e(BarcodeKt.j(mutableState), IntSize.f19170b.a())) {
            BarcodeKt.k(mutableState, IntSize.c((((long) ((int) (intSize.j() >> 32))) << 32) | (((long) ((int) density.B1(BarcodeKt.f37958a))) & 4294967295L)));
            function1.invoke(IntSize.b(BarcodeKt.j(mutableState)));
        }
        return Unit.f40552a;
    }

    public static final Unit g(Function1 function1, MutableState mutableState) {
        function1.invoke(IntSize.b(BarcodeKt.j(mutableState)));
        return Unit.f40552a;
    }

    public final void e(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1058512906, i2, -1, "com.hansecom.abt.ui.components.barcode.Barcode.<anonymous>.<anonymous> (Barcode.kt:73)");
            }
            Modifier i3 = SizeKt.i(SizeKt.h(Modifier.f15489d, 0.0f, 1, (Object) null), Dp.m((float) 116));
            composer.X(1653616800);
            boolean W = composer.W(this.f37962z) | composer.W(this.f37960A) | composer.W(this.f37961B);
            Density density = this.f37960A;
            Function1 function1 = this.f37961B;
            MutableState mutableState = this.f37962z;
            Object g2 = composer.g();
            if (W || g2 == Composer.f14567a.a()) {
                g2 = new h(density, function1, mutableState);
                composer.N(g2);
            }
            composer.M();
            Modifier a2 = OnRemeasuredModifierKt.a(i3, (Function1) g2);
            Alignment.Horizontal g3 = Alignment.f15444a.g();
            Arrangement.HorizontalOrVertical b2 = Arrangement.f3739a.b();
            BarcodeState barcodeState = this.C;
            Function1 function12 = this.f37961B;
            MutableState mutableState2 = this.f37962z;
            MeasurePolicy a3 = ColumnKt.a(b2, g3, composer, 54);
            int a4 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer, a2);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a5 = companion.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer.y(a5);
            } else {
                composer.K();
            }
            Composer b3 = Updater.b(composer);
            Updater.g(b3, a3, companion.c());
            Updater.g(b3, I, companion.e());
            Function2 b4 = companion.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a4))) {
                b3.N(Integer.valueOf(a4));
                b3.A(Integer.valueOf(a4), b4);
            }
            Updater.g(b3, e2, companion.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            composer.X(-1684513229);
            boolean W2 = composer.W(function12) | composer.W(mutableState2);
            Object g4 = composer.g();
            if (W2 || g4 == Composer.f14567a.a()) {
                g4 = new i(function12, mutableState2);
                composer.N(g4);
            }
            composer.M();
            BarcodeKt.m(barcodeState, (Function0) g4, composer, 0);
            composer.T();
            BarcodeKt.s(composer, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        e((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
