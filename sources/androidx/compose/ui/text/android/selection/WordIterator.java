package androidx.compose.ui.text.android.selection;

import androidx.compose.ui.text.android.CharSequenceCharacterIterator;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.emoji2.text.EmojiCompat;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class WordIterator {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f18610e = new Companion((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f18611f = 8;

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f18612a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18613b;

    /* renamed from: c  reason: collision with root package name */
    public final int f18614c;

    /* renamed from: d  reason: collision with root package name */
    public final BreakIterator f18615d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(int i2) {
            int type = Character.getType(i2);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }

        public Companion() {
        }
    }

    public WordIterator(CharSequence charSequence, int i2, int i3, Locale locale) {
        this.f18612a = charSequence;
        boolean z2 = true;
        if (!(i2 >= 0 && i2 <= charSequence.length())) {
            InlineClassHelperKt.a("input start index is outside the CharSequence");
        }
        if (!((i3 < 0 || i3 > charSequence.length()) ? false : z2)) {
            InlineClassHelperKt.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f18615d = wordInstance;
        this.f18613b = Math.max(0, i2 - 50);
        this.f18614c = Math.min(charSequence.length(), i3 + 50);
        wordInstance.setText(new CharSequenceCharacterIterator(charSequence, i2, i3));
    }

    public final void a(int i2) {
        int i3 = this.f18613b;
        boolean z2 = false;
        if (i2 <= this.f18614c && i3 <= i2) {
            z2 = true;
        }
        if (!z2) {
            InlineClassHelperKt.a("Invalid offset: " + i2 + ". Valid range is [" + this.f18613b + " , " + this.f18614c + ']');
        }
    }

    public final int b(int i2, boolean z2) {
        a(i2);
        if (l(i2)) {
            return (!j(i2) || (h(i2) && z2)) ? q(i2) : i2;
        }
        if (h(i2)) {
            return q(i2);
        }
        return -1;
    }

    public final int c(int i2, boolean z2) {
        a(i2);
        if (h(i2)) {
            return (!j(i2) || (l(i2) && z2)) ? p(i2) : i2;
        }
        if (l(i2)) {
            return p(i2);
        }
        return -1;
    }

    public final int d(int i2) {
        return c(i2, true);
    }

    public final int e(int i2) {
        return b(i2, true);
    }

    public final int f(int i2) {
        a(i2);
        while (i2 != -1 && !o(i2)) {
            i2 = q(i2);
        }
        return i2;
    }

    public final int g(int i2) {
        a(i2);
        while (i2 != -1 && !n(i2)) {
            i2 = p(i2);
        }
        return i2;
    }

    public final boolean h(int i2) {
        int i3 = this.f18613b + 1;
        if (i2 > this.f18614c || i3 > i2) {
            return false;
        }
        if (Character.isLetterOrDigit(Character.codePointBefore(this.f18612a, i2))) {
            return true;
        }
        int i4 = i2 - 1;
        if (Character.isSurrogate(this.f18612a.charAt(i4))) {
            return true;
        }
        if (!EmojiCompat.k()) {
            return false;
        }
        EmojiCompat c2 = EmojiCompat.c();
        return c2.g() == 1 && c2.f(this.f18612a, i4) != -1;
    }

    public final boolean i(int i2) {
        int i3 = this.f18613b + 1;
        if (i2 > this.f18614c || i3 > i2) {
            return false;
        }
        return f18610e.a(Character.codePointBefore(this.f18612a, i2));
    }

    public final boolean j(int i2) {
        a(i2);
        if (this.f18615d.isBoundary(i2) && (!l(i2) || !l(i2 - 1) || !l(i2 + 1))) {
            if (i2 <= 0 || i2 >= this.f18612a.length() - 1) {
                return true;
            }
            return !k(i2) && !k(i2 + 1);
        }
    }

    public final boolean k(int i2) {
        int i3 = i2 - 1;
        Character.UnicodeBlock of = Character.UnicodeBlock.of(this.f18612a.charAt(i3));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        return (Intrinsics.d(of, unicodeBlock) && Intrinsics.d(Character.UnicodeBlock.of(this.f18612a.charAt(i2)), Character.UnicodeBlock.KATAKANA)) || (Intrinsics.d(Character.UnicodeBlock.of(this.f18612a.charAt(i2)), unicodeBlock) && Intrinsics.d(Character.UnicodeBlock.of(this.f18612a.charAt(i3)), Character.UnicodeBlock.KATAKANA));
    }

    public final boolean l(int i2) {
        int i3 = this.f18613b;
        if (i2 >= this.f18614c || i3 > i2) {
            return false;
        }
        if (Character.isLetterOrDigit(Character.codePointAt(this.f18612a, i2)) || Character.isSurrogate(this.f18612a.charAt(i2))) {
            return true;
        }
        if (!EmojiCompat.k()) {
            return false;
        }
        EmojiCompat c2 = EmojiCompat.c();
        return c2.g() == 1 && c2.f(this.f18612a, i2) != -1;
    }

    public final boolean m(int i2) {
        int i3 = this.f18613b;
        if (i2 >= this.f18614c || i3 > i2) {
            return false;
        }
        return f18610e.a(Character.codePointAt(this.f18612a, i2));
    }

    public final boolean n(int i2) {
        return !m(i2) && i(i2);
    }

    public final boolean o(int i2) {
        return m(i2) && !i(i2);
    }

    public final int p(int i2) {
        a(i2);
        int following = this.f18615d.following(i2);
        return (!l(following + -1) || !l(following) || k(following)) ? following : p(following);
    }

    public final int q(int i2) {
        a(i2);
        int preceding = this.f18615d.preceding(i2);
        return (!l(preceding) || !h(preceding) || k(preceding)) ? preceding : q(preceding);
    }
}
