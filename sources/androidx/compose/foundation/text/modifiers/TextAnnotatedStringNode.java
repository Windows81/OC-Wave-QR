package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
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
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextAnnotatedStringNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {
    public AnnotatedString N;
    public TextStyle O;
    public FontFamily.Resolver P;
    public Function1 Q;
    public int R;
    public boolean S;
    public int T;
    public int U;
    public List V;
    public Function1 W;
    public SelectionController X;
    public ColorProducer Y;
    public TextAutoSize Z;
    public Function1 a0;
    public Map b0;
    public MultiParagraphLayoutCache c0;
    public Function1 d0;
    public TextSubstitutionValue e0;

    public /* synthetic */ TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i2, boolean z2, int i3, int i4, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, Function1 function13, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, function1, i2, z2, i3, i4, list, function12, selectionController, colorProducer, textAutoSize, function13);
    }

    public boolean D2() {
        return false;
    }

    public int I(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return j3(intrinsicMeasureScope).q(intrinsicMeasureScope.getLayoutDirection());
    }

    public void U(ContentDrawScope contentDrawScope) {
        if (F2()) {
            SelectionController selectionController = this.X;
            ContentDrawScope contentDrawScope2 = contentDrawScope;
            if (selectionController != null) {
                selectionController.b(contentDrawScope2);
            }
            Canvas j2 = contentDrawScope.G1().j();
            TextLayoutResult k2 = j3(contentDrawScope).k();
            MultiParagraph w2 = k2.w();
            boolean z2 = true;
            boolean z3 = k2.i() && !TextOverflow.h(this.R, TextOverflow.f19125b.e());
            if (z3) {
                Rect c2 = RectKt.c(Offset.f15855b.c(), Size.d((((long) Float.floatToRawIntBits((float) ((int) (k2.B() >> 32)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((float) ((int) (k2.B() & 4294967295L)))))));
                j2.o();
                Canvas.n(j2, c2, 0, 2, (Object) null);
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
                    MultiParagraph.J(w2, j2, g2, this.O.d(), shadow, textDecoration, drawStyle, 0, 64, (Object) null);
                } else {
                    ColorProducer colorProducer = this.Y;
                    long a2 = colorProducer != null ? colorProducer.a() : Color.f15975b.f();
                    if (a2 == 16) {
                        a2 = this.O.h() != 16 ? this.O.h() : Color.f15975b.a();
                    }
                    MultiParagraph.H(w2, j2, a2, shadow, textDecoration, drawStyle, 0, 32, (Object) null);
                }
                TextSubstitutionValue textSubstitutionValue = this.e0;
                if (!((textSubstitutionValue == null || !textSubstitutionValue.d()) ? TextAnnotatedStringNodeKt.a(this.N) : false)) {
                    Collection collection = this.V;
                    if (collection != null && !collection.isEmpty()) {
                        z2 = false;
                    }
                    if (z2) {
                        return;
                    }
                }
                contentDrawScope.q2();
            } finally {
                if (z3) {
                    j2.t();
                }
            }
        }
    }

    public void W(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Function1 function1 = this.d0;
        if (function1 == null) {
            function1 = new TextAnnotatedStringNode$applySemantics$1(this);
            this.d0 = function1;
        }
        SemanticsPropertiesKt.z0(semanticsPropertyReceiver, this.N);
        TextSubstitutionValue textSubstitutionValue = this.e0;
        if (textSubstitutionValue != null) {
            SemanticsPropertiesKt.D0(semanticsPropertyReceiver, textSubstitutionValue.c());
            SemanticsPropertiesKt.w0(semanticsPropertyReceiver, textSubstitutionValue.d());
        }
        SemanticsPropertiesKt.F0(semanticsPropertyReceiver, (String) null, new TextAnnotatedStringNode$applySemantics$2(this), 1, (Object) null);
        SemanticsPropertiesKt.L0(semanticsPropertyReceiver, (String) null, new TextAnnotatedStringNode$applySemantics$3(this), 1, (Object) null);
        SemanticsPropertiesKt.d(semanticsPropertyReceiver, (String) null, new TextAnnotatedStringNode$applySemantics$4(this), 1, (Object) null);
        SemanticsPropertiesKt.u(semanticsPropertyReceiver, (String) null, function1, 1, (Object) null);
    }

    public int Z(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return j3(intrinsicMeasureScope).l(i2, intrinsicMeasureScope.getLayoutDirection());
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        MultiParagraphLayoutCache j3 = j3(measureScope);
        boolean n2 = j3.n(j2, measureScope.getLayoutDirection());
        TextLayoutResult k2 = j3.k();
        k2.w().j().a();
        if (n2) {
            LayoutModifierNodeKt.a(this);
            Function1 function1 = this.Q;
            if (function1 != null) {
                function1.invoke(k2);
            }
            SelectionController selectionController = this.X;
            if (selectionController != null) {
                selectionController.g(k2);
            }
            Map map = this.b0;
            if (map == null) {
                map = new LinkedHashMap(2);
            }
            map.put(AlignmentLineKt.a(), Integer.valueOf(Math.round(k2.h())));
            map.put(AlignmentLineKt.b(), Integer.valueOf(Math.round(k2.k())));
            this.b0 = map;
        }
        Function1 function12 = this.W;
        if (function12 != null) {
            function12.invoke(k2.A());
        }
        Placeable c02 = measurable.c0(Constraints.f19137b.b((int) (k2.B() >> 32), (int) (k2.B() >> 32), (int) (k2.B() & 4294967295L), (int) (k2.B() & 4294967295L)));
        int B2 = (int) (k2.B() >> 32);
        int B3 = (int) (k2.B() & 4294967295L);
        Map map2 = this.b0;
        Intrinsics.f(map2);
        return measureScope.y0(B2, B3, map2, new TextAnnotatedStringNode$measure$1(c02));
    }

    public final void f3() {
        this.e0 = null;
    }

    public final void g3(boolean z2, boolean z3, boolean z4, boolean z5) {
        if (z3 || z4 || z5) {
            i3().x(this.N, this.O, this.P, this.R, this.S, this.T, this.U, this.V, this.Z);
        }
        if (F2()) {
            if (z3 || (z2 && this.d0 != null)) {
                SemanticsModifierNodeKt.b(this);
            }
            if (z3 || z4 || z5) {
                LayoutModifierNodeKt.b(this);
                DrawModifierNodeKt.a(this);
            }
            if (z2) {
                DrawModifierNodeKt.a(this);
            }
        }
    }

    public final void h3(ContentDrawScope contentDrawScope) {
        U(contentDrawScope);
    }

    public final MultiParagraphLayoutCache i3() {
        if (this.c0 == null) {
            this.c0 = new MultiParagraphLayoutCache(this.N, this.O, this.P, this.R, this.S, this.T, this.U, this.V, this.Z, (DefaultConstructorMarker) null);
        }
        MultiParagraphLayoutCache multiParagraphLayoutCache = this.c0;
        Intrinsics.f(multiParagraphLayoutCache);
        return multiParagraphLayoutCache;
    }

    public final MultiParagraphLayoutCache j3(Density density) {
        MultiParagraphLayoutCache a2;
        TextSubstitutionValue textSubstitutionValue = this.e0;
        if (textSubstitutionValue == null || !textSubstitutionValue.d() || (a2 = textSubstitutionValue.a()) == null) {
            MultiParagraphLayoutCache i3 = i3();
            i3.t(density);
            return i3;
        }
        a2.t(density);
        return a2;
    }

    public final TextSubstitutionValue k3() {
        return this.e0;
    }

    public final void l3() {
        SemanticsModifierNodeKt.b(this);
        LayoutModifierNodeKt.b(this);
        DrawModifierNodeKt.a(this);
    }

    public final int m3(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return t(intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    public final int n3(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return I(intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    public final MeasureResult o3(MeasureScope measureScope, Measurable measurable, long j2) {
        return f(measureScope, measurable, j2);
    }

    public final int p3(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return Z(intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    public final int q3(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return w(intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    public final boolean r3(AnnotatedString annotatedString) {
        Unit unit;
        AnnotatedString annotatedString2 = annotatedString;
        TextSubstitutionValue textSubstitutionValue = this.e0;
        if (textSubstitutionValue == null) {
            TextSubstitutionValue textSubstitutionValue2 = new TextSubstitutionValue(this.N, annotatedString, false, (MultiParagraphLayoutCache) null, 12, (DefaultConstructorMarker) null);
            MultiParagraphLayoutCache multiParagraphLayoutCache = new MultiParagraphLayoutCache(annotatedString, this.O, this.P, this.R, this.S, this.T, this.U, CollectionsKt.m(), this.Z, (DefaultConstructorMarker) null);
            multiParagraphLayoutCache.t(i3().h());
            textSubstitutionValue2.e(multiParagraphLayoutCache);
            this.e0 = textSubstitutionValue2;
            return true;
        } else if (Intrinsics.d(annotatedString2, textSubstitutionValue.c())) {
            return false;
        } else {
            textSubstitutionValue.g(annotatedString2);
            MultiParagraphLayoutCache a2 = textSubstitutionValue.a();
            if (a2 != null) {
                a2.x(annotatedString, this.O, this.P, this.R, this.S, this.T, this.U, CollectionsKt.m(), this.Z);
                unit = Unit.f40552a;
            } else {
                unit = null;
            }
            return unit != null;
        }
    }

    public final boolean s3(Function1 function1, Function1 function12, SelectionController selectionController, Function1 function13) {
        boolean z2;
        if (this.Q != function1) {
            this.Q = function1;
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.W != function12) {
            this.W = function12;
            z2 = true;
        }
        if (!Intrinsics.d(this.X, selectionController)) {
            this.X = selectionController;
            z2 = true;
        }
        if (this.a0 == function13) {
            return z2;
        }
        this.a0 = function13;
        return true;
    }

    public int t(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return j3(intrinsicMeasureScope).l(i2, intrinsicMeasureScope.getLayoutDirection());
    }

    public final boolean t3(ColorProducer colorProducer, TextStyle textStyle) {
        boolean d2 = Intrinsics.d(colorProducer, this.Y);
        this.Y = colorProducer;
        return !d2 || !textStyle.F(this.O);
    }

    public final boolean u3(TextStyle textStyle, List list, int i2, int i3, boolean z2, FontFamily.Resolver resolver, int i4, TextAutoSize textAutoSize) {
        boolean z3 = !this.O.G(textStyle);
        this.O = textStyle;
        if (!Intrinsics.d(this.V, list)) {
            this.V = list;
            z3 = true;
        }
        if (this.U != i2) {
            this.U = i2;
            z3 = true;
        }
        if (this.T != i3) {
            this.T = i3;
            z3 = true;
        }
        if (this.S != z2) {
            this.S = z2;
            z3 = true;
        }
        if (!Intrinsics.d(this.P, resolver)) {
            this.P = resolver;
            z3 = true;
        }
        if (!TextOverflow.h(this.R, i4)) {
            this.R = i4;
            z3 = true;
        }
        if (Intrinsics.d(this.Z, textAutoSize)) {
            return z3;
        }
        this.Z = textAutoSize;
        return true;
    }

    public final boolean v3(AnnotatedString annotatedString) {
        boolean d2 = Intrinsics.d(this.N.k(), annotatedString.k());
        boolean z2 = !d2 || !this.N.n(annotatedString);
        if (z2) {
            this.N = annotatedString;
        }
        if (!d2) {
            f3();
        }
        return z2;
    }

    public int w(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return j3(intrinsicMeasureScope).r(intrinsicMeasureScope.getLayoutDirection());
    }

    public TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i2, boolean z2, int i3, int i4, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, Function1 function13) {
        this.N = annotatedString;
        this.O = textStyle;
        this.P = resolver;
        this.Q = function1;
        this.R = i2;
        this.S = z2;
        this.T = i3;
        this.U = i4;
        this.V = list;
        this.W = function12;
        this.X = selectionController;
        this.Y = colorProducer;
        this.Z = textAutoSize;
        this.a0 = function13;
    }

    @Metadata
    public static final class TextSubstitutionValue {

        /* renamed from: a  reason: collision with root package name */
        public final AnnotatedString f6676a;

        /* renamed from: b  reason: collision with root package name */
        public AnnotatedString f6677b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f6678c;

        /* renamed from: d  reason: collision with root package name */
        public MultiParagraphLayoutCache f6679d;

        public TextSubstitutionValue(AnnotatedString annotatedString, AnnotatedString annotatedString2, boolean z2, MultiParagraphLayoutCache multiParagraphLayoutCache) {
            this.f6676a = annotatedString;
            this.f6677b = annotatedString2;
            this.f6678c = z2;
            this.f6679d = multiParagraphLayoutCache;
        }

        public final MultiParagraphLayoutCache a() {
            return this.f6679d;
        }

        public final AnnotatedString b() {
            return this.f6676a;
        }

        public final AnnotatedString c() {
            return this.f6677b;
        }

        public final boolean d() {
            return this.f6678c;
        }

        public final void e(MultiParagraphLayoutCache multiParagraphLayoutCache) {
            this.f6679d = multiParagraphLayoutCache;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextSubstitutionValue)) {
                return false;
            }
            TextSubstitutionValue textSubstitutionValue = (TextSubstitutionValue) obj;
            return Intrinsics.d(this.f6676a, textSubstitutionValue.f6676a) && Intrinsics.d(this.f6677b, textSubstitutionValue.f6677b) && this.f6678c == textSubstitutionValue.f6678c && Intrinsics.d(this.f6679d, textSubstitutionValue.f6679d);
        }

        public final void f(boolean z2) {
            this.f6678c = z2;
        }

        public final void g(AnnotatedString annotatedString) {
            this.f6677b = annotatedString;
        }

        public int hashCode() {
            int hashCode = ((((this.f6676a.hashCode() * 31) + this.f6677b.hashCode()) * 31) + Boolean.hashCode(this.f6678c)) * 31;
            MultiParagraphLayoutCache multiParagraphLayoutCache = this.f6679d;
            return hashCode + (multiParagraphLayoutCache == null ? 0 : multiParagraphLayoutCache.hashCode());
        }

        public String toString() {
            return "TextSubstitutionValue(original=" + this.f6676a + ", substitution=" + this.f6677b + ", isShowingSubstitution=" + this.f6678c + ", layoutCache=" + this.f6679d + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ TextSubstitutionValue(AnnotatedString annotatedString, AnnotatedString annotatedString2, boolean z2, MultiParagraphLayoutCache multiParagraphLayoutCache, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(annotatedString, annotatedString2, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? null : multiParagraphLayoutCache);
        }
    }
}
