package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.PropertyReference0Impl;

@Metadata
public final class SearchBarDefaults$InputField$23 implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f10799A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f10800B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ Function2 E;
    public final /* synthetic */ TextFieldColors F;
    public final /* synthetic */ boolean G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f10801z;

    public SearchBarDefaults$InputField$23(String str, boolean z2, MutableInteractionSource mutableInteractionSource, Function2 function2, Function2 function22, Function2 function23, TextFieldColors textFieldColors, boolean z3) {
        this.f10801z = str;
        this.f10799A = z2;
        this.f10800B = mutableInteractionSource;
        this.C = function2;
        this.D = function22;
        this.E = function23;
        this.F = textFieldColors;
        this.G = z3;
    }

    public final void b(Function2 function2, Composer composer, int i2) {
        int i3;
        ComposableLambda composableLambda;
        ComposableLambda composableLambda2;
        Composer composer2 = composer;
        Function2 function22 = function2;
        if ((i2 & 6) == 0) {
            i3 = i2 | (composer2.l(function22) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (composer2.E((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-813926844, i3, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous> (SearchBar.kt:1698)");
            }
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11367a;
            String str = this.f10801z;
            boolean z2 = this.f10799A;
            VisualTransformation c2 = VisualTransformation.f18929a.c();
            MutableInteractionSource mutableInteractionSource = this.f10800B;
            Function2 function23 = this.C;
            Function2 function24 = this.D;
            if (function24 == null) {
                composer2.X(1691265870);
                composer.M();
                composableLambda = null;
            } else {
                composer2.X(1691265871);
                ComposableLambda e2 = ComposableLambdaKt.e(1718822048, true, new SearchBarDefaults$InputField$23$1$1(function24), composer2, 54);
                composer.M();
                composableLambda = e2;
            }
            Function2 function25 = this.E;
            if (function25 == null) {
                composer2.X(1691490155);
                composer.M();
                composableLambda2 = null;
            } else {
                composer2.X(1691490156);
                ComposableLambda e3 = ComposableLambdaKt.e(-305306680, true, new SearchBarDefaults$InputField$23$2$1(function25), composer2, 54);
                composer.M();
                composableLambda2 = e3;
            }
            Shape o2 = SearchBarDefaults.f10786a.o(composer2, 6);
            TextFieldColors textFieldColors = this.F;
            PaddingValues l2 = TextFieldDefaults.l(textFieldDefaults, 0.0f, 0.0f, 0.0f, 0.0f, 15, (Object) null);
            final TextFieldColors textFieldColors2 = this.F;
            final boolean z3 = this.f10799A;
            final boolean z4 = this.G;
            textFieldDefaults.e(str, function2, z2, true, c2, mutableInteractionSource, false, (Function2) null, function23, composableLambda, composableLambda2, (Function2) null, (Function2) null, (Function2) null, o2, textFieldColors, l2, ComposableLambdaKt.e(-1197464330, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    if (composer.E((i2 & 3) != 2, i2 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(-1197464330, i2, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous>.<anonymous> (SearchBar.kt:1718)");
                        }
                        BoxKt.a(TextFieldImplKt.N(Modifier.f15489d, new SearchBarKt$sam$androidx_compose_ui_graphics_ColorProducer$0(new PropertyReference0Impl(SingleValueAnimationKt.a(textFieldColors2.b(z3, false, z4), MotionSchemeKt.b(MotionSchemeKeyTokens.FastEffects, composer, 6), (String) null, (Function1) null, composer, 0, 12)) {
                            public Object get() {
                                return ((State) this.f40885A).getValue();
                            }
                        }), SearchBarDefaults.f10786a.o(composer, 6)), composer, 0);
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
            }, composer2, 54), composer, ((i3 << 3) & 112) | 27648, 113246208, 14528);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((Function2) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
