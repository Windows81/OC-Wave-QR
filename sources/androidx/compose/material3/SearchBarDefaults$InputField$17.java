package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.PropertyReference0Impl;

@Metadata
final class SearchBarDefaults$InputField$17 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f10796A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f10797B;
    public final /* synthetic */ Shape C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldColors f10798z;

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1551441816, i2, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous> (SearchBar.kt:1586)");
            }
            BoxKt.a(TextFieldImplKt.N(Modifier.f15489d, new SearchBarKt$sam$androidx_compose_ui_graphics_ColorProducer$0(new PropertyReference0Impl(SingleValueAnimationKt.a(this.f10798z.b(this.f10796A, false, this.f10797B), MotionSchemeKt.b(MotionSchemeKeyTokens.FastEffects, composer, 6), (String) null, (Function1) null, composer, 0, 12)) {
                public Object get() {
                    return ((State) this.f40885A).getValue();
                }
            }), this.C), composer, 0);
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
