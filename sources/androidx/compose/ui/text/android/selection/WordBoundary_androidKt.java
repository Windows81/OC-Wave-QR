package androidx.compose.ui.text.android.selection;

import kotlin.Metadata;

@Metadata
public final class WordBoundary_androidKt {
    public static final int a(WordIterator wordIterator, int i2) {
        int g2 = wordIterator.i(wordIterator.p(i2)) ? wordIterator.g(i2) : wordIterator.d(i2);
        return g2 == -1 ? i2 : g2;
    }

    public static final int b(WordIterator wordIterator, int i2) {
        int f2 = wordIterator.m(wordIterator.q(i2)) ? wordIterator.f(i2) : wordIterator.e(i2);
        return f2 == -1 ? i2 : f2;
    }
}
