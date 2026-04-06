package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AlertDialogKt$AlertDialogContent$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f9134A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f9135B;
    public final /* synthetic */ long C;
    public final /* synthetic */ long D;
    public final /* synthetic */ long E;
    public final /* synthetic */ long F;
    public final /* synthetic */ Function2 G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f9136z;

    public AlertDialogKt$AlertDialogContent$1(Function2 function2, Function2 function22, Function2 function23, long j2, long j3, long j4, long j5, Function2 function24) {
        this.f9136z = function2;
        this.f9134A = function22;
        this.f9135B = function23;
        this.C = j2;
        this.D = j3;
        this.E = j4;
        this.F = j5;
        this.G = function24;
    }

    public final void b(Composer composer, int i2) {
        Function2 function2;
        Composer composer2 = composer;
        int i3 = i2;
        if (composer2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-652798794, i3, -1, "androidx.compose.material3.AlertDialogContent.<anonymous> (AlertDialog.kt:315)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier h2 = PaddingKt.h(companion, AlertDialogKt.f9129e);
            Function2 function22 = this.f9136z;
            Function2 function23 = this.f9134A;
            Function2 function24 = this.f9135B;
            long j2 = this.C;
            long j3 = this.D;
            long j4 = this.E;
            Modifier.Companion companion2 = companion;
            long j5 = this.F;
            Function2 function25 = this.G;
            Arrangement.Vertical g2 = Arrangement.f3739a.g();
            Alignment.Companion companion3 = Alignment.f15444a;
            Function2 function26 = function25;
            MeasurePolicy a2 = ColumnKt.a(g2, companion3.k(), composer2, 0);
            int a3 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, h2);
            ComposeUiNode.Companion companion4 = ComposeUiNode.f17222h;
            long j6 = j5;
            Function0 a4 = companion4.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer2.y(a4);
            } else {
                composer.K();
            }
            Composer b2 = Updater.b(composer);
            Updater.g(b2, a2, companion4.c());
            Updater.g(b2, I, companion4.e());
            Function2 b3 = companion4.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e2, companion4.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            if (function22 == null) {
                composer2.X(346092326);
            } else {
                composer2.X(346092327);
                CompositionLocalKt.c(ContentColorKt.a().d(Color.h(j2)), ComposableLambdaKt.e(-1128150638, true, new AlertDialogKt$AlertDialogContent$1$1$1$1(columnScopeInstance, function22), composer2, 54), composer2, ProvidedValue.f14769i | 48);
            }
            composer.M();
            if (function23 == null) {
                composer2.X(346396529);
                composer.M();
                function2 = function26;
            } else {
                composer2.X(346396530);
                function2 = function26;
                ProvideContentColorTextStyleKt.b(j3, TypographyKt.e(DialogTokens.f13036a.g(), composer2, 6), ComposableLambdaKt.e(71284337, true, new AlertDialogKt$AlertDialogContent$1$1$2$1(columnScopeInstance, function22, function23), composer2, 54), composer, 384);
                composer.M();
            }
            if (function24 == null) {
                composer2.X(347174009);
            } else {
                composer2.X(347174010);
                ProvideContentColorTextStyleKt.b(j4, TypographyKt.e(DialogTokens.f13036a.j(), composer2, 6), ComposableLambdaKt.e(705583346, true, new AlertDialogKt$AlertDialogContent$1$1$3$1(columnScopeInstance, function24), composer2, 54), composer, 384);
            }
            composer.M();
            Modifier b4 = columnScopeInstance.b(companion2, companion3.j());
            MeasurePolicy g3 = BoxKt.g(companion3.o(), false);
            int a5 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I2 = composer.I();
            Modifier e3 = ComposedModifierKt.e(composer2, b4);
            Function0 a6 = companion4.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer2.y(a6);
            } else {
                composer.K();
            }
            Composer b5 = Updater.b(composer);
            Updater.g(b5, g3, companion4.c());
            Updater.g(b5, I2, companion4.e());
            Function2 b6 = companion4.b();
            if (b5.n() || !Intrinsics.d(b5.g(), Integer.valueOf(a5))) {
                b5.N(Integer.valueOf(a5));
                b5.A(Integer.valueOf(a5), b6);
            }
            Updater.g(b5, e3, companion4.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            ProvideContentColorTextStyleKt.b(j6, TypographyKt.e(DialogTokens.f13036a.b(), composer2, 6), function2, composer, 0);
            composer.T();
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
