package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BasicTextKt$BasicText$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f5583A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TextStyle f5584B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;
    public final /* synthetic */ Map H;
    public final /* synthetic */ ColorProducer I;
    public final /* synthetic */ TextAutoSize J;
    public final /* synthetic */ int K;
    public final /* synthetic */ int L;
    public final /* synthetic */ int M;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AnnotatedString f5585z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextKt$BasicText$3(AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, Function1 function1, int i2, boolean z2, int i3, int i4, Map map, ColorProducer colorProducer, TextAutoSize textAutoSize, int i5, int i6, int i7) {
        super(2);
        this.f5585z = annotatedString;
        this.f5583A = modifier;
        this.f5584B = textStyle;
        this.C = function1;
        this.D = i2;
        this.E = z2;
        this.F = i3;
        this.G = i4;
        this.H = map;
        this.I = colorProducer;
        this.J = textAutoSize;
        this.K = i5;
        this.L = i6;
        this.M = i7;
    }

    public final void b(Composer composer, int i2) {
        BasicTextKt.d(this.f5585z, this.f5583A, this.f5584B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, composer, RecomposeScopeImplKt.a(this.K | 1), RecomposeScopeImplKt.a(this.L), this.M);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
