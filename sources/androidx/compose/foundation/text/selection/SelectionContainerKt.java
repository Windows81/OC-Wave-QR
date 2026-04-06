package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class SelectionContainerKt {
    public static final void a(Function2 function2, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(336063542);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(function2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (q2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(336063542, i3, -1, "androidx.compose.foundation.text.selection.DisableSelection (SelectionContainer.kt:69)");
            }
            CompositionLocalKt.c(SelectionRegistrarKt.a().d((Object) null), function2, q2, ((i3 << 3) & 112) | ProvidedValue.f14769i);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new SelectionContainerKt$DisableSelection$1(function2, i2));
        }
    }

    public static final void b(Modifier modifier, Selection selection, Function1 function1, Function2 function2, Composer composer, int i2, int i3) {
        int i4;
        Modifier modifier2;
        Modifier.Companion companion;
        Selection selection2 = selection;
        Function1 function12 = function1;
        Function2 function22 = function2;
        int i5 = i2;
        Composer q2 = composer.q(2078139907);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i5 | 6;
            modifier2 = modifier;
        } else if ((i5 & 6) == 0) {
            modifier2 = modifier;
            i4 = (q2.W(modifier2) ? 4 : 2) | i5;
        } else {
            modifier2 = modifier;
            i4 = i5;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i5 & 48) == 0) {
            i4 |= q2.W(selection2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i5 & 384) == 0) {
            i4 |= q2.l(function12) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i4 |= q2.l(function22) ? 2048 : 1024;
        }
        if (q2.E((i4 & 1171) != 1170, i4 & 1)) {
            companion = i6 != 0 ? Modifier.f15489d : modifier2;
            if (ComposerKt.P()) {
                ComposerKt.Y(2078139907, i4, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:89)");
            }
            SelectionRegistrarImpl selectionRegistrarImpl = (SelectionRegistrarImpl) RememberSaveableKt.h(new Object[0], SelectionRegistrarImpl.f6937m.a(), (String) null, SelectionContainerKt$SelectionContainer$registrarImpl$1.f6820z, q2, 3072, 4);
            Object g2 = q2.g();
            Composer.Companion companion2 = Composer.f14567a;
            if (g2 == companion2.a()) {
                g2 = new SelectionManager(selectionRegistrarImpl);
                q2.N(g2);
            }
            SelectionManager selectionManager = (SelectionManager) g2;
            Clipboard clipboard = (Clipboard) q2.C(CompositionLocalsKt.e());
            Object g3 = q2.g();
            if (g3 == companion2.a()) {
                g3 = EffectsKt.j(EmptyCoroutineContext.f40721z, q2);
                q2.N(g3);
            }
            CoroutineScope coroutineScope = (CoroutineScope) g3;
            selectionManager.a0((HapticFeedback) q2.C(CompositionLocalsKt.k()));
            boolean W = q2.W(coroutineScope) | q2.W(clipboard);
            Object g4 = q2.g();
            if (W || g4 == companion2.a()) {
                g4 = new SelectionContainerKt$SelectionContainer$3$1(coroutineScope, clipboard);
                q2.N(g4);
            }
            selectionManager.d0((Function1) g4);
            selectionManager.i0((TextToolbar) q2.C(CompositionLocalsKt.r()));
            selectionManager.e0(function12);
            selectionManager.f0(selection2);
            SimpleLayoutKt.a(companion.o0(selectionManager.A()), ComposableLambdaKt.e(-1869667463, true, new SelectionContainerKt$SelectionContainer$4(selectionManager, selectionRegistrarImpl, function22), q2, 54), q2, 48, 0);
            boolean l2 = q2.l(selectionManager);
            Object g5 = q2.g();
            if (l2 || g5 == companion2.a()) {
                g5 = new SelectionContainerKt$SelectionContainer$5$1(selectionManager);
                q2.N(g5);
            }
            EffectsKt.c(selectionManager, (Function1) g5, q2, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            companion = modifier2;
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new SelectionContainerKt$SelectionContainer$6(companion, selection, function1, function2, i2, i3));
        }
    }

    public static final void c(Modifier modifier, Function2 function2, Composer composer, int i2, int i3) {
        int i4;
        Composer q2 = composer.q(-1075498320);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (q2.W(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= q2.l(function2) ? 32 : 16;
        }
        if (q2.E((i4 & 19) != 18, i4 & 1)) {
            if (i5 != 0) {
                modifier = Modifier.f15489d;
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(-1075498320, i4, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:52)");
            }
            Object g2 = q2.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                q2.N(g2);
            }
            MutableState mutableState = (MutableState) g2;
            Selection d2 = d(mutableState);
            Object g3 = q2.g();
            if (g3 == companion.a()) {
                g3 = new SelectionContainerKt$SelectionContainer$1$1(mutableState);
                q2.N(g3);
            }
            b(modifier, d2, (Function1) g3, function2, q2, (i4 & 14) | 384 | ((i4 << 6) & 7168), 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new SelectionContainerKt$SelectionContainer$2(modifier, function2, i2, i3));
        }
    }

    public static final Selection d(MutableState mutableState) {
        return (Selection) mutableState.getValue();
    }

    public static final void e(MutableState mutableState, Selection selection) {
        mutableState.setValue(selection);
    }
}
