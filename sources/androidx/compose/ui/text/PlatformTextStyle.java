package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PlatformTextStyle {

    /* renamed from: a  reason: collision with root package name */
    public final PlatformSpanStyle f18347a;

    /* renamed from: b  reason: collision with root package name */
    public final PlatformParagraphStyle f18348b;

    public PlatformTextStyle(PlatformSpanStyle platformSpanStyle, PlatformParagraphStyle platformParagraphStyle) {
        this.f18347a = platformSpanStyle;
        this.f18348b = platformParagraphStyle;
    }

    public final PlatformParagraphStyle a() {
        return this.f18348b;
    }

    public final PlatformSpanStyle b() {
        return this.f18347a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformTextStyle)) {
            return false;
        }
        PlatformTextStyle platformTextStyle = (PlatformTextStyle) obj;
        return Intrinsics.d(this.f18348b, platformTextStyle.f18348b) && Intrinsics.d(this.f18347a, platformTextStyle.f18347a);
    }

    public int hashCode() {
        PlatformSpanStyle platformSpanStyle = this.f18347a;
        int i2 = 0;
        int hashCode = (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.f18348b;
        if (platformParagraphStyle != null) {
            i2 = platformParagraphStyle.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f18347a + ", paragraphSyle=" + this.f18348b + ')';
    }

    public PlatformTextStyle(boolean z2) {
        this((PlatformSpanStyle) null, new PlatformParagraphStyle(z2));
    }
}
