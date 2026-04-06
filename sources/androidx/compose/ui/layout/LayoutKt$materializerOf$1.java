package androidx.compose.ui.layout;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LayoutKt$materializerOf$1 extends Lambda implements Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f17059z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutKt$materializerOf$1(Modifier modifier) {
        super(3);
        this.f17059z = modifier;
    }

    public final void b(Composer composer, Composer composer2, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1586257396, i2, -1, "androidx.compose.ui.layout.materializerOf.<anonymous> (Layout.kt:196)");
        }
        int a2 = ComposablesKt.a(composer2, 0);
        Modifier e2 = ComposedModifierKt.e(composer2, this.f17059z);
        composer.f(509942095);
        Composer b2 = Updater.b(composer);
        ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
        Updater.g(b2, e2, companion.d());
        Function2 b3 = companion.b();
        if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
            b2.N(Integer.valueOf(a2));
            b2.A(Integer.valueOf(a2), b3);
        }
        composer.S();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b(((SkippableUpdater) obj).f(), (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
