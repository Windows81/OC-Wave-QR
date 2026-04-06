package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextStringSimpleElement extends ModifierNodeElement<TextStringSimpleNode> {

    /* renamed from: A  reason: collision with root package name */
    public final TextStyle f6685A;

    /* renamed from: B  reason: collision with root package name */
    public final FontFamily.Resolver f6686B;
    public final int C;
    public final boolean D;
    public final int E;
    public final int F;
    public final ColorProducer G;

    /* renamed from: z  reason: collision with root package name */
    public final String f6687z;

    public /* synthetic */ TextStringSimpleElement(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z2, int i3, int i4, ColorProducer colorProducer, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, resolver, i2, z2, i3, i4, colorProducer);
    }

    /* renamed from: c */
    public TextStringSimpleNode a() {
        return new TextStringSimpleNode(this.f6687z, this.f6685A, this.f6686B, this.C, this.D, this.E, this.F, this.G, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public void b(TextStringSimpleNode textStringSimpleNode) {
        textStringSimpleNode.h3(textStringSimpleNode.n3(this.G, this.f6685A), textStringSimpleNode.p3(this.f6687z), textStringSimpleNode.o3(this.f6685A, this.F, this.E, this.D, this.f6686B, this.C));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return Intrinsics.d(this.G, textStringSimpleElement.G) && Intrinsics.d(this.f6687z, textStringSimpleElement.f6687z) && Intrinsics.d(this.f6685A, textStringSimpleElement.f6685A) && Intrinsics.d(this.f6686B, textStringSimpleElement.f6686B) && TextOverflow.h(this.C, textStringSimpleElement.C) && this.D == textStringSimpleElement.D && this.E == textStringSimpleElement.E && this.F == textStringSimpleElement.F;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.f6687z.hashCode() * 31) + this.f6685A.hashCode()) * 31) + this.f6686B.hashCode()) * 31) + TextOverflow.i(this.C)) * 31) + Boolean.hashCode(this.D)) * 31) + this.E) * 31) + this.F) * 31;
        ColorProducer colorProducer = this.G;
        return hashCode + (colorProducer != null ? colorProducer.hashCode() : 0);
    }

    public TextStringSimpleElement(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z2, int i3, int i4, ColorProducer colorProducer) {
        this.f6687z = str;
        this.f6685A = textStyle;
        this.f6686B = resolver;
        this.C = i2;
        this.D = z2;
        this.E = i3;
        this.F = i4;
        this.G = colorProducer;
    }
}
