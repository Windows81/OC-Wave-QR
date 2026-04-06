package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import androidx.activity.FullyDrawnReporterOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class ReportDrawnKt {
    public static final void a(Composer composer, int i2) {
        Composer q2 = composer.q(-1357012904);
        if (i2 != 0 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1357012904, i2, -1, "androidx.activity.compose.ReportDrawn (ReportDrawn.kt:135)");
            }
            c(ReportDrawnKt$ReportDrawn$1.f180z, q2, 6);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new ReportDrawnKt$ReportDrawn$2(i2));
        }
    }

    public static final void b(Function1 function1, Composer composer, int i2) {
        int i3;
        FullyDrawnReporter f2;
        Composer q2 = composer.q(945311272);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(function1) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(945311272, i3, -1, "androidx.activity.compose.ReportDrawnAfter (ReportDrawn.kt:148)");
            }
            FullyDrawnReporterOwner a2 = LocalFullyDrawnReporterOwner.f151a.a(q2, 6);
            if (a2 == null || (f2 = a2.f()) == null) {
                if (ComposerKt.P()) {
                    ComposerKt.X();
                }
                ScopeUpdateScope x2 = q2.x();
                if (x2 != null) {
                    x2.a(new ReportDrawnKt$ReportDrawnAfter$fullyDrawnReporter$1(function1, i2));
                    return;
                }
                return;
            }
            boolean l2 = q2.l(f2) | q2.l(function1);
            Object g2 = q2.g();
            if (l2 || g2 == Composer.f14567a.a()) {
                g2 = new ReportDrawnKt$ReportDrawnAfter$1$1(f2, function1, (Continuation) null);
                q2.N(g2);
            }
            EffectsKt.f(function1, f2, (Function2) g2, q2, i3 & 14);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x3 = q2.x();
        if (x3 != null) {
            x3.a(new ReportDrawnKt$ReportDrawnAfter$2(function1, i2));
        }
    }

    public static final void c(Function0 function0, Composer composer, int i2) {
        int i3;
        FullyDrawnReporter f2;
        Composer q2 = composer.q(-2047119994);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-2047119994, i3, -1, "androidx.activity.compose.ReportDrawnWhen (ReportDrawn.kt:116)");
            }
            FullyDrawnReporterOwner a2 = LocalFullyDrawnReporterOwner.f151a.a(q2, 6);
            if (a2 == null || (f2 = a2.f()) == null) {
                if (ComposerKt.P()) {
                    ComposerKt.X();
                }
                ScopeUpdateScope x2 = q2.x();
                if (x2 != null) {
                    x2.a(new ReportDrawnKt$ReportDrawnWhen$fullyDrawnReporter$1(function0, i2));
                    return;
                }
                return;
            }
            boolean l2 = q2.l(f2) | ((i3 & 14) == 4);
            Object g2 = q2.g();
            if (l2 || g2 == Composer.f14567a.a()) {
                g2 = new ReportDrawnKt$ReportDrawnWhen$1$1(f2, function0);
                q2.N(g2);
            }
            EffectsKt.b(f2, function0, (Function1) g2, q2, (i3 << 3) & 112);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x3 = q2.x();
        if (x3 != null) {
            x3.a(new ReportDrawnKt$ReportDrawnWhen$2(function0, i2));
        }
    }
}
