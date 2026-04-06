package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata
public final class ContextMenuScope$item$1 extends Lambda implements Function3<ContextMenuColors, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f3249A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f3250B;
    public final /* synthetic */ Function3 C;
    public final /* synthetic */ Function0 D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f3251z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContextMenuScope$item$1(Function2 function2, boolean z2, Modifier modifier, Function3 function3, Function0 function0) {
        super(3);
        this.f3251z = function2;
        this.f3249A = z2;
        this.f3250B = modifier;
        this.C = function3;
        this.D = function0;
    }

    public final void b(ContextMenuColors contextMenuColors, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= composer.W(contextMenuColors) ? 4 : 2;
        }
        if (composer.E((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(262103052, i2, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.item.<anonymous> (ContextMenuUi.android.kt:282)");
            }
            String str = (String) this.f3251z.m(composer, 0);
            if (StringsKt.l0(str)) {
                InlineClassHelperKt.c("Label must not be blank");
            }
            ContextMenuUi_androidKt.b(str, this.f3249A, contextMenuColors, this.f3250B, this.C, this.D, composer, (i2 << 6) & 896, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((ContextMenuColors) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
