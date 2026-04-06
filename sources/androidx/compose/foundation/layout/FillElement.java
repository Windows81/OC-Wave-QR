package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class FillElement extends ModifierNodeElement<FillNode> {
    public static final Companion C = new Companion((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public final float f3892A;

    /* renamed from: B  reason: collision with root package name */
    public final String f3893B;

    /* renamed from: z  reason: collision with root package name */
    public final Direction f3894z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FillElement a(float f2) {
            return new FillElement(Direction.Vertical, f2, "fillMaxHeight");
        }

        public final FillElement b(float f2) {
            return new FillElement(Direction.Both, f2, "fillMaxSize");
        }

        public final FillElement c(float f2) {
            return new FillElement(Direction.Horizontal, f2, "fillMaxWidth");
        }

        public Companion() {
        }
    }

    public FillElement(Direction direction, float f2, String str) {
        this.f3894z = direction;
        this.f3892A = f2;
        this.f3893B = str;
    }

    /* renamed from: c */
    public FillNode a() {
        return new FillNode(this.f3894z, this.f3892A);
    }

    /* renamed from: d */
    public void b(FillNode fillNode) {
        fillNode.Z2(this.f3894z);
        fillNode.a3(this.f3892A);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.f3894z == fillElement.f3894z && this.f3892A == fillElement.f3892A;
    }

    public int hashCode() {
        return (this.f3894z.hashCode() * 31) + Float.hashCode(this.f3892A);
    }
}
