package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextAnnotatedStringElement extends ModifierNodeElement<TextAnnotatedStringNode> {

    /* renamed from: A  reason: collision with root package name */
    public final TextStyle f6673A;

    /* renamed from: B  reason: collision with root package name */
    public final FontFamily.Resolver f6674B;
    public final Function1 C;
    public final int D;
    public final boolean E;
    public final int F;
    public final int G;
    public final List H;
    public final Function1 I;
    public final SelectionController J;
    public final ColorProducer K;
    public final TextAutoSize L;
    public final Function1 M;

    /* renamed from: z  reason: collision with root package name */
    public final AnnotatedString f6675z;

    public /* synthetic */ TextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i2, boolean z2, int i3, int i4, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, Function1 function13, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, function1, i2, z2, i3, i4, list, function12, selectionController, colorProducer, textAutoSize, function13);
    }

    /* renamed from: c */
    public TextAnnotatedStringNode a() {
        return new TextAnnotatedStringNode(this.f6675z, this.f6673A, this.f6674B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public void b(TextAnnotatedStringNode textAnnotatedStringNode) {
        textAnnotatedStringNode.g3(textAnnotatedStringNode.t3(this.K, this.f6673A), textAnnotatedStringNode.v3(this.f6675z), textAnnotatedStringNode.u3(this.f6673A, this.H, this.G, this.F, this.E, this.f6674B, this.D, this.L), textAnnotatedStringNode.s3(this.C, this.I, this.J, this.M));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return Intrinsics.d(this.K, textAnnotatedStringElement.K) && Intrinsics.d(this.f6675z, textAnnotatedStringElement.f6675z) && Intrinsics.d(this.f6673A, textAnnotatedStringElement.f6673A) && Intrinsics.d(this.H, textAnnotatedStringElement.H) && Intrinsics.d(this.f6674B, textAnnotatedStringElement.f6674B) && this.C == textAnnotatedStringElement.C && this.M == textAnnotatedStringElement.M && TextOverflow.h(this.D, textAnnotatedStringElement.D) && this.E == textAnnotatedStringElement.E && this.F == textAnnotatedStringElement.F && this.G == textAnnotatedStringElement.G && this.I == textAnnotatedStringElement.I && Intrinsics.d(this.J, textAnnotatedStringElement.J);
    }

    public int hashCode() {
        int hashCode = ((((this.f6675z.hashCode() * 31) + this.f6673A.hashCode()) * 31) + this.f6674B.hashCode()) * 31;
        Function1 function1 = this.C;
        int i2 = 0;
        int hashCode2 = (((((((((hashCode + (function1 != null ? function1.hashCode() : 0)) * 31) + TextOverflow.i(this.D)) * 31) + Boolean.hashCode(this.E)) * 31) + this.F) * 31) + this.G) * 31;
        List list = this.H;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Function1 function12 = this.I;
        int hashCode4 = (hashCode3 + (function12 != null ? function12.hashCode() : 0)) * 31;
        SelectionController selectionController = this.J;
        int hashCode5 = (hashCode4 + (selectionController != null ? selectionController.hashCode() : 0)) * 31;
        ColorProducer colorProducer = this.K;
        int hashCode6 = (hashCode5 + (colorProducer != null ? colorProducer.hashCode() : 0)) * 31;
        Function1 function13 = this.M;
        if (function13 != null) {
            i2 = function13.hashCode();
        }
        return hashCode6 + i2;
    }

    public TextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i2, boolean z2, int i3, int i4, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, Function1 function13) {
        this.f6675z = annotatedString;
        this.f6673A = textStyle;
        this.f6674B = resolver;
        this.C = function1;
        this.D = i2;
        this.E = z2;
        this.F = i3;
        this.G = i4;
        this.H = list;
        this.I = function12;
        this.J = selectionController;
        this.K = colorProducer;
        this.L = textAutoSize;
        this.M = function13;
    }
}
