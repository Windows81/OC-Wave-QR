package com.hansecom.abt.ui.components.barcode;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import com.hansecom.abt.R;
import com.hansecom.abt.ui.components.abtButton.AbtButtonIconPosition;
import com.hansecom.abt.ui.components.abtButton.AbtButtonKt;
import com.hansecom.abt.ui.components.abtButton.AbtButtonState;
import com.hansecom.abt.ui.theme.AbtTheme;
import com.hansecom.abt.ui.theme.AbtThemeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BarcodeKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f37958a = Dp.m((float) 64);

    /* renamed from: b  reason: collision with root package name */
    public static final Saver f37959b = SaverKt.e(new a(), new b());

    public static final void h(BarcodeState barcodeState, Function1 function1, Composer composer, int i2) {
        int i3;
        BarcodeState barcodeState2 = barcodeState;
        Function1 function12 = function1;
        int i4 = i2;
        Intrinsics.i(barcodeState2, "state");
        Intrinsics.i(function12, "onBarcodeUpdate");
        Composer q2 = composer.q(1533224976);
        if ((i4 & 6) == 0) {
            i3 = ((i4 & 8) == 0 ? q2.W(barcodeState2) : q2.l(barcodeState2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.l(function12) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1533224976, i3, -1, "com.hansecom.abt.ui.components.barcode.Barcode (Barcode.kt:61)");
            }
            Object[] objArr = new Object[0];
            Saver saver = f37959b;
            q2.X(-1630337134);
            Object g2 = q2.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = new c();
                q2.N(g2);
            }
            q2.M();
            MutableState g3 = RememberSaveableKt.g(objArr, saver, (Function0) g2, q2, 384);
            Density density = (Density) q2.C(CompositionLocalsKt.g());
            Modifier b2 = BackgroundKt.b(ClipKt.a(SizeKt.C(SizeKt.h(Modifier.f15489d, 0.0f, 1, (Object) null), (Alignment.Vertical) null, false, 3, (Object) null), RoundedCornerShapeKt.d(Dp.m((float) 8))), Color.f15975b.g(), (Shape) null, 2, (Object) null);
            MeasurePolicy a2 = ColumnKt.a(Arrangement.f3739a.b(), Alignment.f15444a.k(), q2, 6);
            int a3 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, b2);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a4 = companion.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a4);
            } else {
                q2.K();
            }
            Composer b3 = Updater.b(q2);
            Updater.g(b3, a2, companion.c());
            Updater.g(b3, I, companion.e());
            Function2 b4 = companion.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a3))) {
                b3.N(Integer.valueOf(a3));
                b3.A(Integer.valueOf(a3), b4);
            }
            Updater.g(b3, e2, companion.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            AbtThemeKt.b(false, ComposableLambdaKt.e(-1058512906, true, new BarcodeKt$Barcode$1$1(g3, density, function12, barcodeState2), q2, 54), q2, 54, 0);
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new d(barcodeState2, function12, i4));
        }
    }

    public static final MutableState i() {
        return SnapshotStateKt__SnapshotStateKt.e(IntSize.b(IntSize.f19170b.a()), (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    public static final long j(MutableState mutableState) {
        return ((IntSize) mutableState.getValue()).j();
    }

    public static final void k(MutableState mutableState, long j2) {
        mutableState.setValue(IntSize.b(j2));
    }

    public static final Unit l(BarcodeState barcodeState, Function1 function1, int i2, Composer composer, int i3) {
        h(barcodeState, function1, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0182  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m(com.hansecom.abt.ui.components.barcode.BarcodeState r23, kotlin.jvm.functions.Function0 r24, androidx.compose.runtime.Composer r25, int r26) {
        /*
            r0 = r23
            r1 = r24
            r2 = r26
            r3 = 48
            r4 = -239401862(0xfffffffff1bb047a, float:-1.8521315E30)
            r5 = r25
            androidx.compose.runtime.Composer r15 = r5.q(r4)
            r5 = r2 & 6
            if (r5 != 0) goto L_0x0029
            r5 = r2 & 8
            if (r5 != 0) goto L_0x001e
            boolean r5 = r15.W(r0)
            goto L_0x0022
        L_0x001e:
            boolean r5 = r15.l(r0)
        L_0x0022:
            if (r5 == 0) goto L_0x0026
            r5 = 4
            goto L_0x0027
        L_0x0026:
            r5 = 2
        L_0x0027:
            r5 = r5 | r2
            goto L_0x002a
        L_0x0029:
            r5 = r2
        L_0x002a:
            r6 = r2 & 48
            if (r6 != 0) goto L_0x003a
            boolean r6 = r15.l(r1)
            if (r6 == 0) goto L_0x0037
            r6 = 32
            goto L_0x0039
        L_0x0037:
            r6 = 16
        L_0x0039:
            r5 = r5 | r6
        L_0x003a:
            r6 = r5 & 19
            r7 = 18
            if (r6 != r7) goto L_0x004d
            boolean r6 = r15.t()
            if (r6 != 0) goto L_0x0047
            goto L_0x004d
        L_0x0047:
            r15.B()
            r4 = r15
            goto L_0x0185
        L_0x004d:
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x0059
            r6 = -1
            java.lang.String r7 = "com.hansecom.abt.ui.components.barcode.BarcodeContent (Barcode.kt:102)"
            androidx.compose.runtime.ComposerKt.Y(r4, r5, r6, r7)
        L_0x0059:
            boolean r4 = r0 instanceof com.hansecom.abt.ui.components.barcode.BarcodeState.Loading
            if (r4 == 0) goto L_0x0083
            r3 = 1673194161(0x63baeab1, float:6.8960114E21)
            r15.X(r3)
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.f15489d
            r4 = 64
            float r4 = (float) r4
            float r4 = androidx.compose.ui.unit.Dp.m(r4)
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.t(r3, r4)
            r13 = 6
            r14 = 30
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = r15
            com.hansecom.abt.ui.components.progress.AbtCircularProgressIndicatorKt.e(r5, r6, r8, r9, r11, r12, r13, r14)
            r15.M()
        L_0x0080:
            r4 = r15
            goto L_0x017c
        L_0x0083:
            boolean r4 = r0 instanceof com.hansecom.abt.ui.components.barcode.BarcodeState.Error
            r6 = 0
            if (r4 == 0) goto L_0x00a5
            r3 = 1673308272(0x63bca870, float:6.96025E21)
            r15.X(r3)
            int r3 = com.hansecom.abt.R.string.D7
            java.lang.String r3 = androidx.compose.ui.res.StringResources_androidKt.b(r3, r15, r6)
            int r4 = com.hansecom.abt.R.string.C7
            java.lang.String r4 = androidx.compose.ui.res.StringResources_androidKt.b(r4, r15, r6)
            int r5 = r5 << 3
            r5 = r5 & 896(0x380, float:1.256E-42)
            o(r3, r4, r1, r15, r5)
            r15.M()
            goto L_0x0080
        L_0x00a5:
            boolean r4 = r0 instanceof com.hansecom.abt.ui.components.barcode.BarcodeState.Success
            if (r4 == 0) goto L_0x0194
            r4 = 1673619698(0x63c168f2, float:7.1355674E21)
            r15.X(r4)
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            r5 = 0
            r7 = 1
            r8 = 0
            androidx.compose.ui.Modifier r16 = androidx.compose.foundation.layout.SizeKt.h(r4, r5, r7, r8)
            r9 = 20
            float r9 = (float) r9
            float r18 = androidx.compose.ui.unit.Dp.m(r9)
            r21 = 13
            r22 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            androidx.compose.ui.Modifier r9 = androidx.compose.foundation.layout.PaddingKt.m(r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.ui.Alignment$Companion r10 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Horizontal r10 = r10.g()
            androidx.compose.foundation.layout.Arrangement r11 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Vertical r11 = r11.g()
            androidx.compose.ui.layout.MeasurePolicy r3 = androidx.compose.foundation.layout.ColumnKt.a(r11, r10, r15, r3)
            int r6 = androidx.compose.runtime.ComposablesKt.a(r15, r6)
            androidx.compose.runtime.CompositionLocalMap r10 = r15.I()
            androidx.compose.ui.Modifier r9 = androidx.compose.ui.ComposedModifierKt.e(r15, r9)
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r12 = r11.a()
            androidx.compose.runtime.Applier r13 = r15.v()
            if (r13 != 0) goto L_0x00f8
            androidx.compose.runtime.ComposablesKt.d()
        L_0x00f8:
            r15.s()
            boolean r13 = r15.n()
            if (r13 == 0) goto L_0x0105
            r15.y(r12)
            goto L_0x0108
        L_0x0105:
            r15.K()
        L_0x0108:
            androidx.compose.runtime.Composer r12 = androidx.compose.runtime.Updater.b(r15)
            kotlin.jvm.functions.Function2 r13 = r11.c()
            androidx.compose.runtime.Updater.g(r12, r3, r13)
            kotlin.jvm.functions.Function2 r3 = r11.e()
            androidx.compose.runtime.Updater.g(r12, r10, r3)
            kotlin.jvm.functions.Function2 r3 = r11.b()
            boolean r10 = r12.n()
            if (r10 != 0) goto L_0x0132
            java.lang.Object r10 = r12.g()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            boolean r10 = kotlin.jvm.internal.Intrinsics.d(r10, r13)
            if (r10 != 0) goto L_0x0140
        L_0x0132:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            r12.N(r10)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r12.A(r6, r3)
        L_0x0140:
            kotlin.jvm.functions.Function2 r3 = r11.d()
            androidx.compose.runtime.Updater.g(r12, r9, r3)
            androidx.compose.foundation.layout.ColumnScopeInstance r3 = androidx.compose.foundation.layout.ColumnScopeInstance.f3815a
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.h(r4, r5, r7, r8)
            float r4 = f37958a
            androidx.compose.ui.Modifier r7 = androidx.compose.foundation.layout.SizeKt.i(r3, r4)
            androidx.compose.ui.layout.ContentScale$Companion r3 = androidx.compose.ui.layout.ContentScale.f17026a
            androidx.compose.ui.layout.ContentScale r9 = r3.b()
            r3 = r0
            com.hansecom.abt.ui.components.barcode.BarcodeState$Success r3 = (com.hansecom.abt.ui.components.barcode.BarcodeState.Success) r3
            android.graphics.Bitmap r4 = r3.a()
            androidx.compose.ui.graphics.ImageBitmap r5 = androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.c(r4)
            java.lang.String r6 = r3.b()
            r14 = 24960(0x6180, float:3.4976E-41)
            r3 = 232(0xe8, float:3.25E-43)
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = r15
            r4 = r15
            r15 = r3
            androidx.compose.foundation.ImageKt.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r4.T()
            r4.M()
        L_0x017c:
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x0185
            androidx.compose.runtime.ComposerKt.X()
        L_0x0185:
            androidx.compose.runtime.ScopeUpdateScope r3 = r4.x()
            if (r3 == 0) goto L_0x0193
            com.hansecom.abt.ui.components.barcode.f r4 = new com.hansecom.abt.ui.components.barcode.f
            r4.<init>(r0, r1, r2)
            r3.a(r4)
        L_0x0193:
            return
        L_0x0194:
            r4 = r15
            r0 = -84573947(0xfffffffffaf58105, float:-6.3736478E35)
            r4.X(r0)
            r4.M()
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.components.barcode.BarcodeKt.m(com.hansecom.abt.ui.components.barcode.BarcodeState, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit n(BarcodeState barcodeState, Function0 function0, int i2, Composer composer, int i3) {
        m(barcodeState, function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void o(String str, String str2, Function0 function0, Composer composer, int i2) {
        int i3;
        String str3 = str;
        String str4 = str2;
        Function0 function02 = function0;
        int i4 = i2;
        Composer q2 = composer.q(-813208533);
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
        int i5 = i3;
        if ((i5 & 147) != 146 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-813208533, i5, -1, "com.hansecom.abt.ui.components.barcode.ErrorView (Barcode.kt:179)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            float f2 = (float) 16;
            Modifier m2 = PaddingKt.m(companion, Dp.m(f2), Dp.m((float) 24), Dp.m(f2), 0.0f, 8, (Object) null);
            MeasurePolicy a2 = ColumnKt.a(Arrangement.f3739a.b(), Alignment.f15444a.g(), q2, 54);
            int a3 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, m2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a4 = companion2.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a4);
            } else {
                q2.K();
            }
            Composer b2 = Updater.b(q2);
            Updater.g(b2, a2, companion2.c());
            Updater.g(b2, I, companion2.e());
            Function2 b3 = companion2.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e2, companion2.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            Modifier h2 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            int a5 = TextAlign.f19080b.a();
            AbtTheme abtTheme = AbtTheme.f38851a;
            AbtTheme abtTheme2 = abtTheme;
            int i6 = i5;
            Composer composer2 = q2;
            TextKt.j(str, h2, abtTheme.b(q2, 6).q(), (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, TextAlign.h(a5), 0, 0, false, 0, 0, (Function1) null, abtTheme2.d(q2, 6).f(), composer2, (i5 & 14) | 48, 0, 130040);
            Modifier.Companion companion3 = companion;
            q2 = composer2;
            SpacerKt.a(SizeKt.i(companion3, Dp.m((float) 4)), q2, 6);
            AbtButtonKt.j(function0, SizeKt.h(companion3, 0.0f, 1, (Object) null), abtTheme2.a(q2, 6).a(q2, 0), (AbtButtonState) null, str2, (Integer) null, (AbtButtonIconPosition) null, q2, ((i6 >> 6) & 14) | 48 | ((i6 << 9) & 57344), 104);
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new g(str, str2, function0, i2));
        }
    }

    public static final Unit p(String str, String str2, Function0 function0, int i2, Composer composer, int i3) {
        o(str, str2, function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final List q(SaverScope saverScope, IntSize intSize) {
        Intrinsics.i(saverScope, "$this$Saver");
        return CollectionsKt.p(Integer.valueOf((int) (intSize.j() >> 32)), Integer.valueOf((int) (intSize.j() & 4294967295L)));
    }

    public static final IntSize r(List list) {
        Intrinsics.i(list, "it");
        return IntSize.b(IntSize.c((((long) ((Number) list.get(0)).intValue()) << 32) | (((long) ((Number) list.get(1)).intValue()) & 4294967295L)));
    }

    public static final void s(Composer composer, int i2) {
        Composer q2 = composer.q(573842140);
        if (i2 != 0 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(573842140, i2, -1, "com.hansecom.abt.ui.components.barcode.VanillaBranding (Barcode.kt:137)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            float f2 = (float) 24;
            Modifier b2 = BackgroundKt.b(SizeKt.i(SizeKt.h(companion, 0.0f, 1, (Object) null), Dp.m(f2)), ColorKt.d(4278235271L), (Shape) null, 2, (Object) null);
            Alignment.Companion companion2 = Alignment.f15444a;
            MeasurePolicy g2 = BoxKt.g(companion2.e(), false);
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, b2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.f17222h;
            Function0 a3 = companion3.a();
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
            Updater.g(b3, g2, companion3.c());
            Updater.g(b3, I, companion3.e());
            Function2 b4 = companion3.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a2))) {
                b3.N(Integer.valueOf(a2));
                b3.A(Integer.valueOf(a2), b4);
            }
            Updater.g(b3, e2, companion3.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            Modifier h2 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            MeasurePolicy b5 = RowKt.b(Arrangement.f3739a.f(), companion2.i(), q2, 54);
            int a4 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I2 = q2.I();
            Modifier e3 = ComposedModifierKt.e(q2, h2);
            Function0 a5 = companion3.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a5);
            } else {
                q2.K();
            }
            Composer b6 = Updater.b(q2);
            Updater.g(b6, b5, companion3.c());
            Updater.g(b6, I2, companion3.e());
            Function2 b7 = companion3.b();
            if (b6.n() || !Intrinsics.d(b6.g(), Integer.valueOf(a4))) {
                b6.N(Integer.valueOf(a4));
                b6.A(Integer.valueOf(a4), b7);
            }
            Updater.g(b6, e3, companion3.d());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f4150a;
            Painter c2 = PainterResources_androidKt.c(R.drawable.l0, q2, 0);
            Color.Companion companion4 = Color.f15975b;
            IconKt.d(c2, (String) null, PaddingKt.i(SizeKt.t(companion, Dp.m(f2)), Dp.m((float) 4)), companion4.g(), q2, 3504, 0);
            DividerKt.h((Modifier) null, Dp.m((float) 2), companion4.g(), q2, 432, 1);
            IconKt.d(PainterResources_androidKt.c(R.drawable.m0, q2, 0), (String) null, RowScope.c(rowScopeInstance, companion, 1.0f, false, 2, (Object) null), companion4.g(), q2, 3120, 0);
            q2.T();
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new e(i2));
        }
    }

    public static final Unit t(int i2, Composer composer, int i3) {
        s(composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
