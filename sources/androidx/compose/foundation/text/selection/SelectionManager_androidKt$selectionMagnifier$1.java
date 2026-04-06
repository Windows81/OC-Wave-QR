package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SelectionManager_androidKt$selectionMagnifier$1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SelectionManager f6925z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionManager_androidKt$selectionMagnifier$1(SelectionManager selectionManager) {
        super(3);
        this.f6925z = selectionManager;
    }

    public static final long f(MutableState mutableState) {
        return ((IntSize) mutableState.getValue()).j();
    }

    public static final void g(MutableState mutableState, long j2) {
        mutableState.setValue(IntSize.b(j2));
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return e((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    public final Modifier e(Modifier modifier, Composer composer, int i2) {
        composer.X(-1914520728);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1914520728, i2, -1, "androidx.compose.foundation.text.selection.selectionMagnifier.<anonymous> (SelectionManager.android.kt:49)");
        }
        Density density = (Density) composer.C(CompositionLocalsKt.g());
        Object g2 = composer.g();
        Composer.Companion companion = Composer.f14567a;
        if (g2 == companion.a()) {
            g2 = SnapshotStateKt__SnapshotStateKt.e(IntSize.b(IntSize.f19170b.a()), (SnapshotMutationPolicy) null, 2, (Object) null);
            composer.N(g2);
        }
        MutableState mutableState = (MutableState) g2;
        boolean l2 = composer.l(this.f6925z);
        SelectionManager selectionManager = this.f6925z;
        Object g3 = composer.g();
        if (l2 || g3 == companion.a()) {
            g3 = new SelectionManager_androidKt$selectionMagnifier$1$1$1(selectionManager, mutableState);
            composer.N(g3);
        }
        Function0 function0 = (Function0) g3;
        boolean W = composer.W(density);
        Object g4 = composer.g();
        if (W || g4 == companion.a()) {
            g4 = new SelectionManager_androidKt$selectionMagnifier$1$2$1(density, mutableState);
            composer.N(g4);
        }
        Modifier d2 = SelectionMagnifierKt.d(modifier, function0, (Function1) g4);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return d2;
    }
}
