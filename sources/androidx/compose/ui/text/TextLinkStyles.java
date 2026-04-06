package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextLinkStyles {

    /* renamed from: a  reason: collision with root package name */
    public final SpanStyle f18485a;

    /* renamed from: b  reason: collision with root package name */
    public final SpanStyle f18486b;

    /* renamed from: c  reason: collision with root package name */
    public final SpanStyle f18487c;

    /* renamed from: d  reason: collision with root package name */
    public final SpanStyle f18488d;

    public TextLinkStyles(SpanStyle spanStyle, SpanStyle spanStyle2, SpanStyle spanStyle3, SpanStyle spanStyle4) {
        this.f18485a = spanStyle;
        this.f18486b = spanStyle2;
        this.f18487c = spanStyle3;
        this.f18488d = spanStyle4;
    }

    public final SpanStyle a() {
        return this.f18486b;
    }

    public final SpanStyle b() {
        return this.f18487c;
    }

    public final SpanStyle c() {
        return this.f18488d;
    }

    public final SpanStyle d() {
        return this.f18485a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TextLinkStyles)) {
            return false;
        }
        TextLinkStyles textLinkStyles = (TextLinkStyles) obj;
        return Intrinsics.d(this.f18485a, textLinkStyles.f18485a) && Intrinsics.d(this.f18486b, textLinkStyles.f18486b) && Intrinsics.d(this.f18487c, textLinkStyles.f18487c) && Intrinsics.d(this.f18488d, textLinkStyles.f18488d);
    }

    public int hashCode() {
        SpanStyle spanStyle = this.f18485a;
        int i2 = 0;
        int hashCode = (spanStyle != null ? spanStyle.hashCode() : 0) * 31;
        SpanStyle spanStyle2 = this.f18486b;
        int hashCode2 = (hashCode + (spanStyle2 != null ? spanStyle2.hashCode() : 0)) * 31;
        SpanStyle spanStyle3 = this.f18487c;
        int hashCode3 = (hashCode2 + (spanStyle3 != null ? spanStyle3.hashCode() : 0)) * 31;
        SpanStyle spanStyle4 = this.f18488d;
        if (spanStyle4 != null) {
            i2 = spanStyle4.hashCode();
        }
        return hashCode3 + i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextLinkStyles(SpanStyle spanStyle, SpanStyle spanStyle2, SpanStyle spanStyle3, SpanStyle spanStyle4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : spanStyle, (i2 & 2) != 0 ? null : spanStyle2, (i2 & 4) != 0 ? null : spanStyle3, (i2 & 8) != 0 ? null : spanStyle4);
    }
}
