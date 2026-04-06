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
public final class SelectableTextAnnotatedStringElement extends ModifierNodeElement<SelectableTextAnnotatedStringNode> {

    /* renamed from: A  reason: collision with root package name */
    public final TextStyle f6650A;

    /* renamed from: B  reason: collision with root package name */
    public final FontFamily.Resolver f6651B;
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

    /* renamed from: z  reason: collision with root package name */
    public final AnnotatedString f6652z;

    public /* synthetic */ SelectableTextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i2, boolean z2, int i3, int i4, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, function1, i2, z2, i3, i4, list, function12, selectionController, colorProducer, textAutoSize);
    }

    /* renamed from: c */
    public SelectableTextAnnotatedStringNode a() {
        return new SelectableTextAnnotatedStringNode(this.f6652z, this.f6650A, this.f6651B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, (Function1) null, 8192, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public void b(SelectableTextAnnotatedStringNode selectableTextAnnotatedStringNode) {
        selectableTextAnnotatedStringNode.f3(this.f6652z, this.f6650A, this.H, this.G, this.F, this.E, this.f6651B, this.D, this.C, this.I, this.J, this.K, this.L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        return Intrinsics.d(this.K, selectableTextAnnotatedStringElement.K) && Intrinsics.d(this.f6652z, selectableTextAnnotatedStringElement.f6652z) && Intrinsics.d(this.f6650A, selectableTextAnnotatedStringElement.f6650A) && Intrinsics.d(this.H, selectableTextAnnotatedStringElement.H) && Intrinsics.d(this.f6651B, selectableTextAnnotatedStringElement.f6651B) && Intrinsics.d(this.L, selectableTextAnnotatedStringElement.L) && this.C == selectableTextAnnotatedStringElement.C && TextOverflow.h(this.D, selectableTextAnnotatedStringElement.D) && this.E == selectableTextAnnotatedStringElement.E && this.F == selectableTextAnnotatedStringElement.F && this.G == selectableTextAnnotatedStringElement.G && this.I == selectableTextAnnotatedStringElement.I && Intrinsics.d(this.J, selectableTextAnnotatedStringElement.J);
    }

    public int hashCode() {
        int hashCode = ((((this.f6652z.hashCode() * 31) + this.f6650A.hashCode()) * 31) + this.f6651B.hashCode()) * 31;
        Function1 function1 = this.C;
        int i2 = 0;
        int hashCode2 = (((((((((hashCode + (function1 != null ? function1.hashCode() : 0)) * 31) + TextOverflow.i(this.D)) * 31) + Boolean.hashCode(this.E)) * 31) + this.F) * 31) + this.G) * 31;
        List list = this.H;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Function1 function12 = this.I;
        int hashCode4 = (hashCode3 + (function12 != null ? function12.hashCode() : 0)) * 31;
        SelectionController selectionController = this.J;
        int hashCode5 = (hashCode4 + (selectionController != null ? selectionController.hashCode() : 0)) * 31;
        TextAutoSize textAutoSize = this.L;
        int hashCode6 = (hashCode5 + (textAutoSize != null ? textAutoSize.hashCode() : 0)) * 31;
        ColorProducer colorProducer = this.K;
        if (colorProducer != null) {
            i2 = colorProducer.hashCode();
        }
        return hashCode6 + i2;
    }

    public String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + this.f6652z + ", style=" + this.f6650A + ", fontFamilyResolver=" + this.f6651B + ", onTextLayout=" + this.C + ", overflow=" + TextOverflow.j(this.D) + ", softWrap=" + this.E + ", maxLines=" + this.F + ", minLines=" + this.G + ", placeholders=" + this.H + ", onPlaceholderLayout=" + this.I + ", selectionController=" + this.J + ", color=" + this.K + ", autoSize=" + this.L + ')';
    }

    public SelectableTextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i2, boolean z2, int i3, int i4, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize) {
        this.f6652z = annotatedString;
        this.f6650A = textStyle;
        this.f6651B = resolver;
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
    }
}
