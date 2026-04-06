package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextStringSimpleNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {
    public String N;
    public TextStyle O;
    public FontFamily.Resolver P;
    public int Q;
    public boolean R;
    public int S;
    public int T;
    public ColorProducer U;
    public Map V;
    public ParagraphLayoutCache W;
    public Function1 X;
    public TextSubstitutionValue Y;

    public /* synthetic */ TextStringSimpleNode(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z2, int i3, int i4, ColorProducer colorProducer, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, resolver, i2, z2, i3, i4, colorProducer);
    }

    /* access modifiers changed from: private */
    public final void l3() {
        SemanticsModifierNodeKt.b(this);
        LayoutModifierNodeKt.b(this);
        DrawModifierNodeKt.a(this);
    }

    public boolean D2() {
        return false;
    }

    public int I(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return j3(intrinsicMeasureScope).j(intrinsicMeasureScope.getLayoutDirection());
    }

    public void U(ContentDrawScope contentDrawScope) {
        if (F2()) {
            ParagraphLayoutCache k3 = k3();
            Paragraph e2 = k3.e();
            if (e2 != null) {
                Canvas j2 = contentDrawScope.G1().j();
                boolean b2 = k3.b();
                if (b2) {
                    j2.o();
                    Canvas.e(j2, 0.0f, 0.0f, (float) ((int) (k3.c() >> 32)), (float) ((int) (k3.c() & 4294967295L)), 0, 16, (Object) null);
                }
                try {
                    TextDecoration A2 = this.O.A();
                    if (A2 == null) {
                        A2 = TextDecoration.f19089b.c();
                    }
                    TextDecoration textDecoration = A2;
                    Shadow x2 = this.O.x();
                    if (x2 == null) {
                        x2 = Shadow.f16116d.a();
                    }
                    Shadow shadow = x2;
                    DrawStyle i2 = this.O.i();
                    if (i2 == null) {
                        i2 = Fill.f16295a;
                    }
                    DrawStyle drawStyle = i2;
                    Brush g2 = this.O.g();
                    if (g2 != null) {
                        Paragraph.B(e2, j2, g2, this.O.d(), shadow, textDecoration, drawStyle, 0, 64, (Object) null);
                    } else {
                        ColorProducer colorProducer = this.U;
                        long a2 = colorProducer != null ? colorProducer.a() : Color.f15975b.f();
                        if (a2 == 16) {
                            a2 = this.O.h() != 16 ? this.O.h() : Color.f15975b.a();
                        }
                        Paragraph.i(e2, j2, a2, shadow, textDecoration, drawStyle, 0, 32, (Object) null);
                    }
                } finally {
                    if (b2) {
                        j2.t();
                    }
                }
            } else {
                InlineClassHelperKt.b("no paragraph (layoutCache=" + this.W + ", textSubstitution=" + this.Y + ')');
                throw new KotlinNothingValueException();
            }
        }
    }

    public void W(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Function1 function1 = this.X;
        if (function1 == null) {
            function1 = new TextStringSimpleNode$applySemantics$1(this);
            this.X = function1;
        }
        SemanticsPropertiesKt.z0(semanticsPropertyReceiver, new AnnotatedString(this.N, (List) null, 2, (DefaultConstructorMarker) null));
        TextSubstitutionValue textSubstitutionValue = this.Y;
        if (textSubstitutionValue != null) {
            SemanticsPropertiesKt.w0(semanticsPropertyReceiver, textSubstitutionValue.c());
            SemanticsPropertiesKt.D0(semanticsPropertyReceiver, new AnnotatedString(textSubstitutionValue.b(), (List) null, 2, (DefaultConstructorMarker) null));
        }
        SemanticsPropertiesKt.F0(semanticsPropertyReceiver, (String) null, new TextStringSimpleNode$applySemantics$2(this), 1, (Object) null);
        SemanticsPropertiesKt.L0(semanticsPropertyReceiver, (String) null, new TextStringSimpleNode$applySemantics$3(this), 1, (Object) null);
        SemanticsPropertiesKt.d(semanticsPropertyReceiver, (String) null, new TextStringSimpleNode$applySemantics$4(this), 1, (Object) null);
        SemanticsPropertiesKt.u(semanticsPropertyReceiver, (String) null, function1, 1, (Object) null);
    }

    public int Z(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return j3(intrinsicMeasureScope).f(i2, intrinsicMeasureScope.getLayoutDirection());
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        ParagraphLayoutCache j3 = j3(measureScope);
        boolean h2 = j3.h(j2, measureScope.getLayoutDirection());
        j3.d();
        Paragraph e2 = j3.e();
        Intrinsics.f(e2);
        long c2 = j3.c();
        if (h2) {
            LayoutModifierNodeKt.a(this);
            Map map = this.V;
            if (map == null) {
                map = new HashMap(2);
                this.V = map;
            }
            map.put(AlignmentLineKt.a(), Integer.valueOf(Math.round(e2.s())));
            map.put(AlignmentLineKt.b(), Integer.valueOf(Math.round(e2.n())));
        }
        int i2 = (int) (c2 >> 32);
        int i3 = (int) (c2 & 4294967295L);
        Placeable c0 = measurable.c0(Constraints.f19137b.b(i2, i2, i3, i3));
        Map map2 = this.V;
        Intrinsics.f(map2);
        return measureScope.y0(i2, i3, map2, new TextStringSimpleNode$measure$1(c0));
    }

    public final void g3() {
        this.Y = null;
    }

    public final void h3(boolean z2, boolean z3, boolean z4) {
        if (z3 || z4) {
            i3().p(this.N, this.O, this.P, this.Q, this.R, this.S, this.T);
        }
        if (F2()) {
            if (z3 || (z2 && this.X != null)) {
                SemanticsModifierNodeKt.b(this);
            }
            if (z3 || z4) {
                LayoutModifierNodeKt.b(this);
                DrawModifierNodeKt.a(this);
            }
            if (z2) {
                DrawModifierNodeKt.a(this);
            }
        }
    }

    public final ParagraphLayoutCache i3() {
        if (this.W == null) {
            this.W = new ParagraphLayoutCache(this.N, this.O, this.P, this.Q, this.R, this.S, this.T, (DefaultConstructorMarker) null);
        }
        ParagraphLayoutCache paragraphLayoutCache = this.W;
        Intrinsics.f(paragraphLayoutCache);
        return paragraphLayoutCache;
    }

    public final ParagraphLayoutCache j3(IntrinsicMeasureScope intrinsicMeasureScope) {
        ParagraphLayoutCache k3 = k3();
        k3.m(intrinsicMeasureScope);
        return k3;
    }

    public final ParagraphLayoutCache k3() {
        ParagraphLayoutCache a2;
        TextSubstitutionValue textSubstitutionValue = this.Y;
        if (textSubstitutionValue != null) {
            if (!textSubstitutionValue.c()) {
                textSubstitutionValue = null;
            }
            if (!(textSubstitutionValue == null || (a2 = textSubstitutionValue.a()) == null)) {
                return a2;
            }
        }
        return i3();
    }

    public final boolean m3(String str) {
        Unit unit;
        TextSubstitutionValue textSubstitutionValue = this.Y;
        if (textSubstitutionValue == null) {
            TextSubstitutionValue textSubstitutionValue2 = new TextSubstitutionValue(this.N, str, false, (ParagraphLayoutCache) null, 12, (DefaultConstructorMarker) null);
            ParagraphLayoutCache paragraphLayoutCache = new ParagraphLayoutCache(str, this.O, this.P, this.Q, this.R, this.S, this.T, (DefaultConstructorMarker) null);
            paragraphLayoutCache.m(i3().a());
            textSubstitutionValue2.d(paragraphLayoutCache);
            this.Y = textSubstitutionValue2;
            return true;
        } else if (Intrinsics.d(str, textSubstitutionValue.b())) {
            return false;
        } else {
            textSubstitutionValue.f(str);
            ParagraphLayoutCache a2 = textSubstitutionValue.a();
            if (a2 != null) {
                a2.p(str, this.O, this.P, this.Q, this.R, this.S, this.T);
                unit = Unit.f40552a;
            } else {
                unit = null;
            }
            return unit != null;
        }
    }

    public final boolean n3(ColorProducer colorProducer, TextStyle textStyle) {
        boolean d2 = Intrinsics.d(colorProducer, this.U);
        this.U = colorProducer;
        return !d2 || !textStyle.F(this.O);
    }

    public final boolean o3(TextStyle textStyle, int i2, int i3, boolean z2, FontFamily.Resolver resolver, int i4) {
        boolean z3 = !this.O.G(textStyle);
        this.O = textStyle;
        if (this.T != i2) {
            this.T = i2;
            z3 = true;
        }
        if (this.S != i3) {
            this.S = i3;
            z3 = true;
        }
        if (this.R != z2) {
            this.R = z2;
            z3 = true;
        }
        if (!Intrinsics.d(this.P, resolver)) {
            this.P = resolver;
            z3 = true;
        }
        if (TextOverflow.h(this.Q, i4)) {
            return z3;
        }
        this.Q = i4;
        return true;
    }

    public final boolean p3(String str) {
        if (Intrinsics.d(this.N, str)) {
            return false;
        }
        this.N = str;
        g3();
        return true;
    }

    public int t(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return j3(intrinsicMeasureScope).f(i2, intrinsicMeasureScope.getLayoutDirection());
    }

    public int w(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return j3(intrinsicMeasureScope).k(intrinsicMeasureScope.getLayoutDirection());
    }

    public TextStringSimpleNode(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z2, int i3, int i4, ColorProducer colorProducer) {
        this.N = str;
        this.O = textStyle;
        this.P = resolver;
        this.Q = i2;
        this.R = z2;
        this.S = i3;
        this.T = i4;
        this.U = colorProducer;
    }

    @Metadata
    public static final class TextSubstitutionValue {

        /* renamed from: a  reason: collision with root package name */
        public final String f6688a;

        /* renamed from: b  reason: collision with root package name */
        public String f6689b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f6690c;

        /* renamed from: d  reason: collision with root package name */
        public ParagraphLayoutCache f6691d;

        public TextSubstitutionValue(String str, String str2, boolean z2, ParagraphLayoutCache paragraphLayoutCache) {
            this.f6688a = str;
            this.f6689b = str2;
            this.f6690c = z2;
            this.f6691d = paragraphLayoutCache;
        }

        public final ParagraphLayoutCache a() {
            return this.f6691d;
        }

        public final String b() {
            return this.f6689b;
        }

        public final boolean c() {
            return this.f6690c;
        }

        public final void d(ParagraphLayoutCache paragraphLayoutCache) {
            this.f6691d = paragraphLayoutCache;
        }

        public final void e(boolean z2) {
            this.f6690c = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextSubstitutionValue)) {
                return false;
            }
            TextSubstitutionValue textSubstitutionValue = (TextSubstitutionValue) obj;
            return Intrinsics.d(this.f6688a, textSubstitutionValue.f6688a) && Intrinsics.d(this.f6689b, textSubstitutionValue.f6689b) && this.f6690c == textSubstitutionValue.f6690c && Intrinsics.d(this.f6691d, textSubstitutionValue.f6691d);
        }

        public final void f(String str) {
            this.f6689b = str;
        }

        public int hashCode() {
            int hashCode = ((((this.f6688a.hashCode() * 31) + this.f6689b.hashCode()) * 31) + Boolean.hashCode(this.f6690c)) * 31;
            ParagraphLayoutCache paragraphLayoutCache = this.f6691d;
            return hashCode + (paragraphLayoutCache == null ? 0 : paragraphLayoutCache.hashCode());
        }

        public String toString() {
            return "TextSubstitution(layoutCache=" + this.f6691d + ", isShowingSubstitution=" + this.f6690c + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ TextSubstitutionValue(String str, String str2, boolean z2, ParagraphLayoutCache paragraphLayoutCache, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? null : paragraphLayoutCache);
        }
    }
}
