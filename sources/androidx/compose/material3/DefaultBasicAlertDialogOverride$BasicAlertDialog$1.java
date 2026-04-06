package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
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
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DefaultBasicAlertDialogOverride$BasicAlertDialog$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BasicAlertDialogOverrideScope f9824z;

    public DefaultBasicAlertDialogOverride$BasicAlertDialog$1(BasicAlertDialogOverrideScope basicAlertDialogOverrideScope) {
        this.f9824z = basicAlertDialogOverrideScope;
    }

    /* access modifiers changed from: private */
    public static final Unit e(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.o0(semanticsPropertyReceiver, str);
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1163527043, i2, -1, "androidx.compose.material3.DefaultBasicAlertDialogOverride.BasicAlertDialog.<anonymous> (AlertDialog.kt:165)");
            }
            Strings.Companion companion = Strings.f12320b;
            String b2 = Strings_androidKt.b(Strings.a(R.string.I), composer, 0);
            Modifier x2 = SizeKt.x(this.f9824z.b(), AlertDialogKt.v(), 0.0f, AlertDialogKt.u(), 0.0f, 10, (Object) null);
            Modifier.Companion companion2 = Modifier.f15489d;
            boolean W = composer.W(b2);
            Object g2 = composer.g();
            if (W || g2 == Composer.f14567a.a()) {
                g2 = new C0085e2(b2);
                composer.N(g2);
            }
            Modifier o0 = x2.o0(SemanticsModifierKt.d(companion2, false, (Function1) g2, 1, (Object) null));
            BasicAlertDialogOverrideScope basicAlertDialogOverrideScope = this.f9824z;
            MeasurePolicy g3 = BoxKt.g(Alignment.f15444a.o(), true);
            int a2 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer, o0);
            ComposeUiNode.Companion companion3 = ComposeUiNode.f17222h;
            Function0 a3 = companion3.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer.y(a3);
            } else {
                composer.K();
            }
            Composer b3 = Updater.b(composer);
            Updater.g(b3, g3, companion3.c());
            Updater.g(b3, I, companion3.e());
            Function2 b4 = companion3.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a2))) {
                b3.N(Integer.valueOf(a2));
                b3.A(Integer.valueOf(a2), b4);
            }
            Updater.g(b3, e2, companion3.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            basicAlertDialogOverrideScope.a().m(composer, 0);
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
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
