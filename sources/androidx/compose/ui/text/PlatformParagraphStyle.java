package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class PlatformParagraphStyle {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f18341c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final PlatformParagraphStyle f18342d = new PlatformParagraphStyle();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f18343a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18344b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PlatformParagraphStyle a() {
            return PlatformParagraphStyle.f18342d;
        }

        public Companion() {
        }
    }

    public /* synthetic */ PlatformParagraphStyle(int i2, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, z2);
    }

    public final int b() {
        return this.f18344b;
    }

    public final boolean c() {
        return this.f18343a;
    }

    public final PlatformParagraphStyle d(PlatformParagraphStyle platformParagraphStyle) {
        return platformParagraphStyle == null ? this : platformParagraphStyle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformParagraphStyle)) {
            return false;
        }
        PlatformParagraphStyle platformParagraphStyle = (PlatformParagraphStyle) obj;
        return this.f18343a == platformParagraphStyle.f18343a && EmojiSupportMatch.g(this.f18344b, platformParagraphStyle.f18344b);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f18343a) * 31) + EmojiSupportMatch.h(this.f18344b);
    }

    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f18343a + ", emojiSupportMatch=" + EmojiSupportMatch.i(this.f18344b) + ')';
    }

    public PlatformParagraphStyle(boolean z2) {
        this.f18343a = z2;
        this.f18344b = EmojiSupportMatch.f18271b.b();
    }

    public PlatformParagraphStyle(int i2, boolean z2) {
        this.f18343a = z2;
        this.f18344b = i2;
    }

    public PlatformParagraphStyle() {
        this(EmojiSupportMatch.f18271b.b(), false, (DefaultConstructorMarker) null);
    }
}
