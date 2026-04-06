package androidx.compose.ui.text.style;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class TextGeometricTransform {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f19107c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final TextGeometricTransform f19108d = new TextGeometricTransform(1.0f, 0.0f);

    /* renamed from: a  reason: collision with root package name */
    public final float f19109a;

    /* renamed from: b  reason: collision with root package name */
    public final float f19110b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TextGeometricTransform a() {
            return TextGeometricTransform.f19108d;
        }

        public Companion() {
        }
    }

    public TextGeometricTransform(float f2, float f3) {
        this.f19109a = f2;
        this.f19110b = f3;
    }

    public final float b() {
        return this.f19109a;
    }

    public final float c() {
        return this.f19110b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextGeometricTransform)) {
            return false;
        }
        TextGeometricTransform textGeometricTransform = (TextGeometricTransform) obj;
        return this.f19109a == textGeometricTransform.f19109a && this.f19110b == textGeometricTransform.f19110b;
    }

    public int hashCode() {
        return (Float.hashCode(this.f19109a) * 31) + Float.hashCode(this.f19110b);
    }

    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.f19109a + ", skewX=" + this.f19110b + ')';
    }
}
