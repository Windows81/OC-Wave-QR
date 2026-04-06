package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.internal.TextFieldType;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class OutlinedTextFieldDefaults$decorator$2 implements TextFieldDecorator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OutputTransformation f10545a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TextFieldState f10546b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TextFieldLineLimits f10547c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TextFieldLabelPosition f10548d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Function3 f10549e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Function2 f10550f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Function2 f10551g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Function2 f10552h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Function2 f10553i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Function2 f10554j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Function2 f10555k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ boolean f10556l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ boolean f10557m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ InteractionSource f10558n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ PaddingValues f10559o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ TextFieldColors f10560p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Function2 f10561q;

    public OutlinedTextFieldDefaults$decorator$2(OutputTransformation outputTransformation, TextFieldState textFieldState, TextFieldLineLimits textFieldLineLimits, TextFieldLabelPosition textFieldLabelPosition, Function3 function3, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, boolean z2, boolean z3, InteractionSource interactionSource, PaddingValues paddingValues, TextFieldColors textFieldColors, Function2 function27) {
        this.f10545a = outputTransformation;
        this.f10546b = textFieldState;
        this.f10547c = textFieldLineLimits;
        this.f10548d = textFieldLabelPosition;
        this.f10549e = function3;
        this.f10550f = function2;
        this.f10551g = function22;
        this.f10552h = function23;
        this.f10553i = function24;
        this.f10554j = function25;
        this.f10555k = function26;
        this.f10556l = z2;
        this.f10557m = z3;
        this.f10558n = interactionSource;
        this.f10559o = paddingValues;
        this.f10560p = textFieldColors;
        this.f10561q = function27;
    }

    public static final Unit c(OutlinedTextFieldDefaults$decorator$2 outlinedTextFieldDefaults$decorator$2, Function2 function2, int i2, Composer composer, int i3) {
        outlinedTextFieldDefaults$decorator$2.a(function2, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public final void a(Function2 function2, Composer composer, int i2) {
        int i3;
        Composer composer2;
        TextFieldBuffer textFieldBuffer;
        CharSequence a2;
        Function2 function22 = function2;
        Composer q2 = composer.q(794272399);
        if ((i2 & 6) == 0) {
            i3 = i2 | (q2.l(function22) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.W(this) ? 32 : 16;
        }
        if (q2.E((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(794272399, i3, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.decorator.<no name provided>.Decoration (TextFieldDefaults.kt:994)");
            }
            if (this.f10545a == null) {
                a2 = this.f10546b.i();
            } else {
                TextFieldState textFieldState = this.f10546b;
                TextFieldBuffer r2 = textFieldState.r();
                try {
                    textFieldState.d(r2);
                    textFieldState.f();
                    OutputTransformation outputTransformation = this.f10545a;
                    if (r2 == null) {
                        Intrinsics.y("buffer");
                        textFieldBuffer = null;
                    } else {
                        textFieldBuffer = r2;
                    }
                    outputTransformation.a(textFieldBuffer);
                    a2 = r2.a();
                } catch (Throwable th) {
                    Throwable th2 = th;
                    textFieldState.f();
                    throw th2;
                }
            }
            composer2 = q2;
            TextFieldImplKt.l(TextFieldType.Outlined, a2, function2, this.f10548d, this.f10549e, this.f10550f, this.f10551g, this.f10552h, this.f10553i, this.f10554j, this.f10555k, Intrinsics.d(this.f10547c, TextFieldLineLimits.SingleLine.f6073b), this.f10556l, this.f10557m, this.f10558n, this.f10559o, this.f10560p, this.f10561q, composer2, ((i3 << 6) & 896) | 6, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            composer2 = q2;
            composer2.B();
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new J4(this, function22, i2));
        }
    }
}
