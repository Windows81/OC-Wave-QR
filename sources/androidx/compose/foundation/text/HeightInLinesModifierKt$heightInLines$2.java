package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class HeightInLinesModifierKt$heightInLines$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f5742A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TextStyle f5743B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f5744z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HeightInLinesModifierKt$heightInLines$2(int i2, int i3, TextStyle textStyle) {
        super(3);
        this.f5744z = i2;
        this.f5742A = i3;
        this.f5743B = textStyle;
    }

    public static final Object c(State state) {
        return state.getValue();
    }

    public final Modifier b(Modifier modifier, Composer composer, int i2) {
        composer.X(408240218);
        if (ComposerKt.P()) {
            ComposerKt.Y(408240218, i2, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:62)");
        }
        HeightInLinesModifierKt.b(this.f5744z, this.f5742A);
        if (this.f5744z == 1 && this.f5742A == Integer.MAX_VALUE) {
            Modifier.Companion companion = Modifier.f15489d;
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
            composer.M();
            return companion;
        }
        Density density = (Density) composer.C(CompositionLocalsKt.g());
        FontFamily.Resolver resolver = (FontFamily.Resolver) composer.C(CompositionLocalsKt.i());
        LayoutDirection layoutDirection = (LayoutDirection) composer.C(CompositionLocalsKt.m());
        boolean W = composer.W(this.f5743B) | composer.W(layoutDirection);
        TextStyle textStyle = this.f5743B;
        Object g2 = composer.g();
        if (W || g2 == Composer.f14567a.a()) {
            g2 = TextStyleKt.d(textStyle, layoutDirection);
            composer.N(g2);
        }
        TextStyle textStyle2 = (TextStyle) g2;
        boolean W2 = composer.W(resolver) | composer.W(textStyle2);
        Object g3 = composer.g();
        if (W2 || g3 == Composer.f14567a.a()) {
            FontFamily j2 = textStyle2.j();
            FontWeight o2 = textStyle2.o();
            if (o2 == null) {
                o2 = FontWeight.f18746A.g();
            }
            FontStyle m2 = textStyle2.m();
            int i3 = m2 != null ? m2.i() : FontStyle.f18724b.b();
            FontSynthesis n2 = textStyle2.n();
            g3 = resolver.a(j2, o2, i3, n2 != null ? n2.m() : FontSynthesis.f18728b.a());
            composer.N(g3);
        }
        State state = (State) g3;
        boolean W3 = composer.W(c(state)) | composer.W(density) | composer.W(resolver) | composer.W(this.f5743B) | composer.W(layoutDirection);
        Object g4 = composer.g();
        if (W3 || g4 == Composer.f14567a.a()) {
            g4 = Integer.valueOf((int) (TextFieldDelegateKt.a(textStyle2, density, resolver, TextFieldDelegateKt.c(), 1) & 4294967295L));
            composer.N(g4);
        }
        int intValue = ((Number) g4).intValue();
        boolean W4 = composer.W(layoutDirection) | composer.W(density) | composer.W(resolver) | composer.W(this.f5743B) | composer.W(c(state));
        Object g5 = composer.g();
        if (W4 || g5 == Composer.f14567a.a()) {
            g5 = Integer.valueOf((int) (TextFieldDelegateKt.a(textStyle2, density, resolver, TextFieldDelegateKt.c() + 10 + TextFieldDelegateKt.c(), 2) & 4294967295L));
            composer.N(g5);
        }
        int intValue2 = ((Number) g5).intValue() - intValue;
        int i4 = this.f5744z;
        Integer num = null;
        Integer valueOf = i4 == 1 ? null : Integer.valueOf(((i4 - 1) * intValue2) + intValue);
        int i5 = this.f5742A;
        if (i5 != Integer.MAX_VALUE) {
            num = Integer.valueOf(intValue + (intValue2 * (i5 - 1)));
        }
        Modifier j3 = SizeKt.j(Modifier.f15489d, valueOf != null ? density.D(valueOf.intValue()) : Dp.f19144A.c(), num != null ? density.D(num.intValue()) : Dp.f19144A.c());
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return j3;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
