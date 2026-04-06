package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
final class WindowInsetsConnection_androidKt$imeNestedScroll$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: z  reason: collision with root package name */
    public static final WindowInsetsConnection_androidKt$imeNestedScroll$2 f4212z = new WindowInsetsConnection_androidKt$imeNestedScroll$2();

    public WindowInsetsConnection_androidKt$imeNestedScroll$2() {
        super(3);
    }

    public final Modifier b(Modifier modifier, Composer composer, int i2) {
        composer.X(-369978792);
        if (ComposerKt.P()) {
            ComposerKt.Y(-369978792, i2, -1, "androidx.compose.foundation.layout.imeNestedScroll.<anonymous> (WindowInsetsConnection.android.kt:76)");
        }
        Modifier b2 = NestedScrollModifierKt.b(modifier, WindowInsetsConnection_androidKt.d(WindowInsetsHolder.f4215x.c(composer, 6).f(), WindowInsetsSides.f4266b.e(), composer, 48), (NestedScrollDispatcher) null, 2, (Object) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return b2;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
