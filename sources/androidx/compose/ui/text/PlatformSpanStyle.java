package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class PlatformSpanStyle {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f18345a = new Companion((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    public static final PlatformSpanStyle f18346b = new PlatformSpanStyle();

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PlatformSpanStyle a() {
            return PlatformSpanStyle.f18346b;
        }

        public Companion() {
        }
    }

    public final PlatformSpanStyle b(PlatformSpanStyle platformSpanStyle) {
        return this;
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof PlatformSpanStyle);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return "PlatformSpanStyle()";
    }
}
