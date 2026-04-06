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
public final class TextFieldDefaults$decorator$2 implements TextFieldDecorator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OutputTransformation f11381a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TextFieldState f11382b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TextFieldLineLimits f11383c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TextFieldLabelPosition f11384d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Function3 f11385e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Function2 f11386f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Function2 f11387g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Function2 f11388h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Function2 f11389i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Function2 f11390j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Function2 f11391k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ boolean f11392l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ boolean f11393m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ InteractionSource f11394n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ PaddingValues f11395o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ TextFieldColors f11396p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Function2 f11397q;

    public TextFieldDefaults$decorator$2(OutputTransformation outputTransformation, TextFieldState textFieldState, TextFieldLineLimits textFieldLineLimits, TextFieldLabelPosition textFieldLabelPosition, Function3 function3, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, boolean z2, boolean z3, InteractionSource interactionSource, PaddingValues paddingValues, TextFieldColors textFieldColors, Function2 function27) {
        this.f11381a = outputTransformation;
        this.f11382b = textFieldState;
        this.f11383c = textFieldLineLimits;
        this.f11384d = textFieldLabelPosition;
        this.f11385e = function3;
        this.f11386f = function2;
        this.f11387g = function22;
        this.f11388h = function23;
        this.f11389i = function24;
        this.f11390j = function25;
        this.f11391k = function26;
        this.f11392l = z2;
        this.f11393m = z3;
        this.f11394n = interactionSource;
        this.f11395o = paddingValues;
        this.f11396p = textFieldColors;
        this.f11397q = function27;
    }

    public static final Unit c(TextFieldDefaults$decorator$2 textFieldDefaults$decorator$2, Function2 function2, int i2, Composer composer, int i3) {
        textFieldDefaults$decorator$2.a(function2, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public final void a(Function2 function2, Composer composer, int i2) {
        int i3;
        Composer composer2;
        TextFieldBuffer textFieldBuffer;
        CharSequence a2;
        Function2 function22 = function2;
        Composer q2 = composer.q(-94654579);
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
                ComposerKt.Y(-94654579, i3, -1, "androidx.compose.material3.TextFieldDefaults.decorator.<no name provided>.Decoration (TextFieldDefaults.kt:179)");
            }
            if (this.f11381a == null) {
                a2 = this.f11382b.i();
            } else {
                TextFieldState textFieldState = this.f11382b;
                TextFieldBuffer r2 = textFieldState.r();
                try {
                    textFieldState.d(r2);
                    textFieldState.f();
                    OutputTransformation outputTransformation = this.f11381a;
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
            TextFieldImplKt.l(TextFieldType.Filled, a2, function2, this.f11384d, this.f11385e, this.f11386f, this.f11387g, this.f11388h, this.f11389i, this.f11390j, this.f11391k, Intrinsics.d(this.f11383c, TextFieldLineLimits.SingleLine.f6073b), this.f11392l, this.f11393m, this.f11394n, this.f11395o, this.f11396p, this.f11397q, composer2, ((i3 << 6) & 896) | 6, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            composer2 = q2;
            composer2.B();
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new C0080d7(this, function22, i2));
        }
    }
}
