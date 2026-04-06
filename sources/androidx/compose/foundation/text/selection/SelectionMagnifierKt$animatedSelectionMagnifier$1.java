package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SelectionMagnifierKt$animatedSelectionMagnifier$1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f6871A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f6872z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionMagnifierKt$animatedSelectionMagnifier$1(Function0 function0, Function1 function1) {
        super(3);
        this.f6872z = function0;
        this.f6871A = function1;
    }

    /* access modifiers changed from: private */
    public static final long e(State state) {
        return ((Offset) state.getValue()).t();
    }

    public final Modifier c(Modifier modifier, Composer composer, int i2) {
        composer.X(759876635);
        if (ComposerKt.P()) {
            ComposerKt.Y(759876635, i2, -1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:64)");
        }
        State b2 = SelectionMagnifierKt.h(this.f6872z, composer, 0);
        Function1 function1 = this.f6871A;
        boolean W = composer.W(b2);
        Object g2 = composer.g();
        if (W || g2 == Composer.f14567a.a()) {
            g2 = new SelectionMagnifierKt$animatedSelectionMagnifier$1$1$1(b2);
            composer.N(g2);
        }
        Modifier modifier2 = (Modifier) function1.invoke((Function0) g2);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return modifier2;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return c((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
