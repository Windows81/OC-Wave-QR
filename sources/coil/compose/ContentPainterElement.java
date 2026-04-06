package coil.compose;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ContentPainterElement extends ModifierNodeElement<ContentPainterNode> {

    /* renamed from: A  reason: collision with root package name */
    public final Alignment f23305A;

    /* renamed from: B  reason: collision with root package name */
    public final ContentScale f23306B;
    public final float C;
    public final ColorFilter D;

    /* renamed from: z  reason: collision with root package name */
    public final Painter f23307z;

    public ContentPainterElement(Painter painter, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter) {
        this.f23307z = painter;
        this.f23305A = alignment;
        this.f23306B = contentScale;
        this.C = f2;
        this.D = colorFilter;
    }

    /* renamed from: c */
    public ContentPainterNode a() {
        return new ContentPainterNode(this.f23307z, this.f23305A, this.f23306B, this.C, this.D);
    }

    /* renamed from: d */
    public void b(ContentPainterNode contentPainterNode) {
        boolean f2 = Size.f(contentPainterNode.a3().k(), this.f23307z.k());
        contentPainterNode.f3(this.f23307z);
        contentPainterNode.c3(this.f23305A);
        contentPainterNode.e3(this.f23306B);
        contentPainterNode.d(this.C);
        contentPainterNode.d3(this.D);
        if (!f2) {
            LayoutModifierNodeKt.b(contentPainterNode);
        }
        DrawModifierNodeKt.a(contentPainterNode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPainterElement)) {
            return false;
        }
        ContentPainterElement contentPainterElement = (ContentPainterElement) obj;
        return Intrinsics.d(this.f23307z, contentPainterElement.f23307z) && Intrinsics.d(this.f23305A, contentPainterElement.f23305A) && Intrinsics.d(this.f23306B, contentPainterElement.f23306B) && Float.compare(this.C, contentPainterElement.C) == 0 && Intrinsics.d(this.D, contentPainterElement.D);
    }

    public int hashCode() {
        int hashCode = ((((((this.f23307z.hashCode() * 31) + this.f23305A.hashCode()) * 31) + this.f23306B.hashCode()) * 31) + Float.hashCode(this.C)) * 31;
        ColorFilter colorFilter = this.D;
        return hashCode + (colorFilter == null ? 0 : colorFilter.hashCode());
    }

    public String toString() {
        return "ContentPainterElement(painter=" + this.f23307z + ", alignment=" + this.f23305A + ", contentScale=" + this.f23306B + ", alpha=" + this.C + ", colorFilter=" + this.D + ')';
    }
}
