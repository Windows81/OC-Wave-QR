package androidx.compose.ui.text.android.selection;

import kotlin.Metadata;

@Metadata
public final class WordSegmentFinder implements SegmentFinder {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f18616a;

    /* renamed from: b  reason: collision with root package name */
    public final WordIterator f18617b;

    public WordSegmentFinder(CharSequence charSequence, WordIterator wordIterator) {
        this.f18616a = charSequence;
        this.f18617b = wordIterator;
    }

    public int a(int i2) {
        do {
            i2 = this.f18617b.p(i2);
            if (i2 == -1 || i2 == this.f18616a.length()) {
                return -1;
            }
        } while (Character.isWhitespace(this.f18616a.charAt(i2)));
        return i2;
    }

    public int b(int i2) {
        do {
            i2 = this.f18617b.q(i2);
            if (i2 == -1 || i2 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.f18616a.charAt(i2 - 1)));
        return i2;
    }

    public int c(int i2) {
        do {
            i2 = this.f18617b.q(i2);
            if (i2 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f18616a.charAt(i2)));
        return i2;
    }

    public int d(int i2) {
        do {
            i2 = this.f18617b.p(i2);
            if (i2 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f18616a.charAt(i2 - 1)));
        return i2;
    }
}
