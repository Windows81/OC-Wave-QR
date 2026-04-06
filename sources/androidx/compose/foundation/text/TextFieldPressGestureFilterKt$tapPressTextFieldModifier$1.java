package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f5938A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f5939z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1(Function1 function1, MutableInteractionSource mutableInteractionSource) {
        super(3);
        this.f5939z = function1;
        this.f5938A = mutableInteractionSource;
    }

    public final Modifier b(Modifier modifier, Composer composer, int i2) {
        composer.X(-102778667);
        if (ComposerKt.P()) {
            ComposerKt.Y(-102778667, i2, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)");
        }
        Object g2 = composer.g();
        Composer.Companion companion = Composer.f14567a;
        if (g2 == companion.a()) {
            g2 = EffectsKt.j(EmptyCoroutineContext.f40721z, composer);
            composer.N(g2);
        }
        CoroutineScope coroutineScope = (CoroutineScope) g2;
        Object g3 = composer.g();
        if (g3 == companion.a()) {
            g3 = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
            composer.N(g3);
        }
        MutableState mutableState = (MutableState) g3;
        State p2 = SnapshotStateKt.p(this.f5939z, composer, 0);
        MutableInteractionSource mutableInteractionSource = this.f5938A;
        boolean W = composer.W(this.f5938A);
        MutableInteractionSource mutableInteractionSource2 = this.f5938A;
        Object g4 = composer.g();
        if (W || g4 == companion.a()) {
            g4 = new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1(mutableState, mutableInteractionSource2);
            composer.N(g4);
        }
        EffectsKt.c(mutableInteractionSource, (Function1) g4, composer, 0);
        Modifier.Companion companion2 = Modifier.f15489d;
        MutableInteractionSource mutableInteractionSource3 = this.f5938A;
        boolean l2 = composer.l(coroutineScope) | composer.W(this.f5938A) | composer.W(p2);
        MutableInteractionSource mutableInteractionSource4 = this.f5938A;
        Object g5 = composer.g();
        if (l2 || g5 == companion.a()) {
            g5 = new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1(coroutineScope, mutableState, mutableInteractionSource4, p2);
            composer.N(g5);
        }
        Modifier c2 = SuspendingPointerInputFilterKt.c(companion2, mutableInteractionSource3, (PointerInputEventHandler) g5);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return c2;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
