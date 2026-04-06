package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class EmojiSupportMatch {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f18271b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f18272c = e(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f18273d = e(1);

    /* renamed from: e  reason: collision with root package name */
    public static final int f18274e = e(2);

    /* renamed from: a  reason: collision with root package name */
    public final int f18275a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return EmojiSupportMatch.f18274e;
        }

        public final int b() {
            return EmojiSupportMatch.f18272c;
        }

        public final int c() {
            return EmojiSupportMatch.f18273d;
        }

        public Companion() {
        }
    }

    public /* synthetic */ EmojiSupportMatch(int i2) {
        this.f18275a = i2;
    }

    public static final /* synthetic */ EmojiSupportMatch d(int i2) {
        return new EmojiSupportMatch(i2);
    }

    public static int e(int i2) {
        return i2;
    }

    public static boolean f(int i2, Object obj) {
        return (obj instanceof EmojiSupportMatch) && i2 == ((EmojiSupportMatch) obj).j();
    }

    public static final boolean g(int i2, int i3) {
        return i2 == i3;
    }

    public static int h(int i2) {
        return Integer.hashCode(i2);
    }

    public static String i(int i2) {
        if (i2 == f18272c) {
            return "EmojiSupportMatch.Default";
        }
        if (i2 == f18273d) {
            return "EmojiSupportMatch.None";
        }
        if (i2 == f18274e) {
            return "EmojiSupportMatch.All";
        }
        return "Invalid(value=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f18275a, obj);
    }

    public int hashCode() {
        return h(this.f18275a);
    }

    public final /* synthetic */ int j() {
        return this.f18275a;
    }

    public String toString() {
        return i(this.f18275a);
    }
}
