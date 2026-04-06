package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
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
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ListItemKt$applyTextStyle$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TextStyle f7929A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ LineHeightStyle f7930B;
    public final /* synthetic */ Function2 C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f7931z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListItemKt$applyTextStyle$1(float f2, TextStyle textStyle, LineHeightStyle lineHeightStyle, Function2 function2) {
        super(2);
        this.f7931z = f2;
        this.f7929A = textStyle;
        this.f7930B = lineHeightStyle;
        this.C = function2;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-830176860, i2, -1, "androidx.compose.material.applyTextStyle.<anonymous> (ListItem.kt:439)");
            }
            ProvidedValue d2 = ContentAlphaKt.a().d(Float.valueOf(this.f7931z));
            final TextStyle textStyle = this.f7929A;
            final LineHeightStyle lineHeightStyle = this.f7930B;
            final Function2 function2 = this.C;
            CompositionLocalKt.c(d2, ComposableLambdaKt.e(1665877604, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    Composer composer2 = composer;
                    int i3 = i2;
                    if (composer2.E((i3 & 3) != 2, i3 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(1665877604, i3, -1, "androidx.compose.material.applyTextStyle.<anonymous>.<anonymous> (ListItem.kt:440)");
                        }
                        TextKt.a(TextStyle.c(textStyle, 0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0, (TextIndent) null, (PlatformTextStyle) null, lineHeightStyle, 0, 0, (TextMotion) null, 15728639, (Object) null), function2, composer2, 0);
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
            }, composer, 54), composer, ProvidedValue.f14769i | 48);
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
