package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@JvmInline
public final class BlurredEdgeTreatment {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f15692b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final Shape f15693c = a(RectangleShapeKt.a());

    /* renamed from: d  reason: collision with root package name */
    public static final Shape f15694d = a((Shape) null);

    /* renamed from: a  reason: collision with root package name */
    public final Shape f15695a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public static Shape a(Shape shape) {
        return shape;
    }

    public static boolean b(Shape shape, Object obj) {
        return (obj instanceof BlurredEdgeTreatment) && Intrinsics.d(shape, ((BlurredEdgeTreatment) obj).e());
    }

    public static int c(Shape shape) {
        if (shape == null) {
            return 0;
        }
        return shape.hashCode();
    }

    public static String d(Shape shape) {
        return "BlurredEdgeTreatment(shape=" + shape + ')';
    }

    public final /* synthetic */ Shape e() {
        return this.f15695a;
    }

    public boolean equals(Object obj) {
        return b(this.f15695a, obj);
    }

    public int hashCode() {
        return c(this.f15695a);
    }

    public String toString() {
        return d(this.f15695a);
    }
}
