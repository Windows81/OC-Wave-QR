package androidx.compose.ui.layout;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.node.ComposeUiNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LayoutKt$combineAsVirtualLayouts$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f17058z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutKt$combineAsVirtualLayouts$1(List list) {
        super(2);
        this.f17058z = list;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1953651383, i2, -1, "androidx.compose.ui.layout.combineAsVirtualLayouts.<anonymous> (Layout.kt:176)");
            }
            List list = this.f17058z;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Function2 function2 = (Function2) list.get(i3);
                int a2 = ComposablesKt.a(composer, 0);
                ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
                Function0 f2 = companion.f();
                if (composer.v() == null) {
                    ComposablesKt.d();
                }
                composer.s();
                if (composer.n()) {
                    composer.y(f2);
                } else {
                    composer.K();
                }
                Composer b2 = Updater.b(composer);
                Function2 b3 = companion.b();
                if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                    b2.N(Integer.valueOf(a2));
                    b2.A(Integer.valueOf(a2), b3);
                }
                function2.m(composer, 0);
                composer.T();
            }
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
