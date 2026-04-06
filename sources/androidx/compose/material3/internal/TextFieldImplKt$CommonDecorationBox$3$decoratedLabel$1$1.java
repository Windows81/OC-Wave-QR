package androidx.compose.material3.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
public final class TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TextStyle f12338A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ State f12339B;
    public final /* synthetic */ State C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ State E;
    public final /* synthetic */ Function3 F;
    public final /* synthetic */ TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1 G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextStyle f12340z;

    public TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1(TextStyle textStyle, TextStyle textStyle2, State state, State state2, boolean z2, State state3, Function3 function3, TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1 textFieldImplKt$CommonDecorationBox$3$labelScope$1$1) {
        this.f12340z = textStyle;
        this.f12338A = textStyle2;
        this.f12339B = state;
        this.C = state2;
        this.D = z2;
        this.E = state3;
        this.F = function3;
        this.G = textFieldImplKt$CommonDecorationBox$3$labelScope$1$1;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if (composer2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1076580032, i3, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:139)");
            }
            TextStyle c2 = TextStyleKt.c(this.f12340z, this.f12338A, ((Number) this.f12339B.getValue()).floatValue());
            TextStyle c3 = this.D ? TextStyle.c(c2, ((Color) this.E.getValue()).v(), 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (Object) null) : c2;
            long v2 = ((Color) this.C.getValue()).v();
            final Function3 function3 = this.F;
            final TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1 textFieldImplKt$CommonDecorationBox$3$labelScope$1$1 = this.G;
            TextFieldImplKt.s(v2, c3, ComposableLambdaKt.e(1157484991, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    if (composer.E((i2 & 3) != 2, i2 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(1157484991, i2, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:147)");
                        }
                        function3.d(textFieldImplKt$CommonDecorationBox$3$labelScope$1$1, composer, 6);
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
            }, composer2, 54), composer, 384);
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
