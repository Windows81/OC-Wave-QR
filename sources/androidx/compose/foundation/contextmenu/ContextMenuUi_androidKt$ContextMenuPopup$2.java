package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ContextMenuUi_androidKt$ContextMenuPopup$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f3283A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f3284B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ContextMenuColors f3285z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContextMenuUi_androidKt$ContextMenuPopup$2(ContextMenuColors contextMenuColors, Modifier modifier, Function1 function1) {
        super(2);
        this.f3285z = contextMenuColors;
        this.f3283A = modifier;
        this.f3284B = function1;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(795909757, i2, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup.<anonymous> (ContextMenuUi.android.kt:130)");
            }
            final ContextMenuColors contextMenuColors = this.f3285z;
            Modifier modifier = this.f3283A;
            final Function1 function1 = this.f3284B;
            ContextMenuUi_androidKt.a(contextMenuColors, modifier, ComposableLambdaKt.e(1156688164, true, new Function3<ColumnScope, Composer, Integer, Unit>() {
                public final void b(ColumnScope columnScope, Composer composer, int i2) {
                    if (composer.E((i2 & 17) != 16, i2 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(1156688164, i2, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup.<anonymous>.<anonymous> (ContextMenuUi.android.kt:131)");
                        }
                        Object g2 = composer.g();
                        if (g2 == Composer.f14567a.a()) {
                            g2 = new ContextMenuScope();
                            composer.N(g2);
                        }
                        ContextMenuScope contextMenuScope = (ContextMenuScope) g2;
                        Function1 function1 = function1;
                        ContextMenuColors contextMenuColors = contextMenuColors;
                        contextMenuScope.b();
                        function1.invoke(contextMenuScope);
                        contextMenuScope.a(contextMenuColors, composer, 0);
                        if (ComposerKt.P()) {
                            ComposerKt.X();
                            return;
                        }
                        return;
                    }
                    composer.B();
                }

                public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
                    b((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.f40552a;
                }
            }, composer, 54), composer, 384, 0);
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
