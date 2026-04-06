package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class AccessibilityIterators {

    @Metadata
    public static abstract class AbstractTextSegmentIterator implements TextSegmentIterator {

        /* renamed from: a  reason: collision with root package name */
        public String f17463a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f17464b = new int[2];

        public final int[] c(int i2, int i3) {
            if (i2 < 0 || i3 < 0 || i2 == i3) {
                return null;
            }
            int[] iArr = this.f17464b;
            iArr[0] = i2;
            iArr[1] = i3;
            return iArr;
        }

        public final String d() {
            String str = this.f17463a;
            if (str != null) {
                return str;
            }
            Intrinsics.y("text");
            return null;
        }

        public void e(String str) {
            f(str);
        }

        public final void f(String str) {
            this.f17463a = str;
        }
    }

    @Metadata
    public static class CharacterTextSegmentIterator extends AbstractTextSegmentIterator {

        /* renamed from: d  reason: collision with root package name */
        public static final Companion f17465d = new Companion((DefaultConstructorMarker) null);

        /* renamed from: e  reason: collision with root package name */
        public static final int f17466e = 8;

        /* renamed from: f  reason: collision with root package name */
        public static CharacterTextSegmentIterator f17467f;

        /* renamed from: c  reason: collision with root package name */
        public BreakIterator f17468c;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final CharacterTextSegmentIterator a(Locale locale) {
                if (CharacterTextSegmentIterator.f17467f == null) {
                    CharacterTextSegmentIterator.f17467f = new CharacterTextSegmentIterator(locale, (DefaultConstructorMarker) null);
                }
                CharacterTextSegmentIterator g2 = CharacterTextSegmentIterator.f17467f;
                Intrinsics.g(g2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                return g2;
            }

            public Companion() {
            }
        }

        public /* synthetic */ CharacterTextSegmentIterator(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
            this(locale);
        }

        public int[] a(int i2) {
            int length = d().length();
            if (length <= 0 || i2 >= length) {
                return null;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            do {
                BreakIterator breakIterator = this.f17468c;
                if (breakIterator == null) {
                    Intrinsics.y("impl");
                    breakIterator = null;
                }
                if (!breakIterator.isBoundary(i2)) {
                    BreakIterator breakIterator2 = this.f17468c;
                    if (breakIterator2 == null) {
                        Intrinsics.y("impl");
                        breakIterator2 = null;
                    }
                    i2 = breakIterator2.following(i2);
                } else {
                    BreakIterator breakIterator3 = this.f17468c;
                    if (breakIterator3 == null) {
                        Intrinsics.y("impl");
                        breakIterator3 = null;
                    }
                    int following = breakIterator3.following(i2);
                    if (following == -1) {
                        return null;
                    }
                    return c(i2, following);
                }
            } while (i2 != -1);
            return null;
        }

        public int[] b(int i2) {
            int length = d().length();
            if (length <= 0 || i2 <= 0) {
                return null;
            }
            if (i2 > length) {
                i2 = length;
            }
            do {
                BreakIterator breakIterator = this.f17468c;
                if (breakIterator == null) {
                    Intrinsics.y("impl");
                    breakIterator = null;
                }
                if (!breakIterator.isBoundary(i2)) {
                    BreakIterator breakIterator2 = this.f17468c;
                    if (breakIterator2 == null) {
                        Intrinsics.y("impl");
                        breakIterator2 = null;
                    }
                    i2 = breakIterator2.preceding(i2);
                } else {
                    BreakIterator breakIterator3 = this.f17468c;
                    if (breakIterator3 == null) {
                        Intrinsics.y("impl");
                        breakIterator3 = null;
                    }
                    int preceding = breakIterator3.preceding(i2);
                    if (preceding == -1) {
                        return null;
                    }
                    return c(preceding, i2);
                }
            } while (i2 != -1);
            return null;
        }

        public void e(String str) {
            super.e(str);
            BreakIterator breakIterator = this.f17468c;
            if (breakIterator == null) {
                Intrinsics.y("impl");
                breakIterator = null;
            }
            breakIterator.setText(str);
        }

        public final void i(Locale locale) {
            this.f17468c = BreakIterator.getCharacterInstance(locale);
        }

        public CharacterTextSegmentIterator(Locale locale) {
            i(locale);
        }
    }

    @Metadata
    public static final class LineTextSegmentIterator extends AbstractTextSegmentIterator {

        /* renamed from: d  reason: collision with root package name */
        public static final Companion f17469d = new Companion((DefaultConstructorMarker) null);

        /* renamed from: e  reason: collision with root package name */
        public static final int f17470e = 8;

        /* renamed from: f  reason: collision with root package name */
        public static LineTextSegmentIterator f17471f;

        /* renamed from: g  reason: collision with root package name */
        public static final ResolvedTextDirection f17472g = ResolvedTextDirection.Rtl;

        /* renamed from: h  reason: collision with root package name */
        public static final ResolvedTextDirection f17473h = ResolvedTextDirection.Ltr;

        /* renamed from: c  reason: collision with root package name */
        public TextLayoutResult f17474c;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final LineTextSegmentIterator a() {
                if (LineTextSegmentIterator.f17471f == null) {
                    LineTextSegmentIterator.f17471f = new LineTextSegmentIterator((DefaultConstructorMarker) null);
                }
                LineTextSegmentIterator g2 = LineTextSegmentIterator.f17471f;
                Intrinsics.g(g2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                return g2;
            }

            public Companion() {
            }
        }

        public /* synthetic */ LineTextSegmentIterator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public int[] a(int i2) {
            int i3;
            if (d().length() <= 0 || i2 >= d().length()) {
                return null;
            }
            if (i2 < 0) {
                TextLayoutResult textLayoutResult = this.f17474c;
                if (textLayoutResult == null) {
                    Intrinsics.y("layoutResult");
                    textLayoutResult = null;
                }
                i3 = textLayoutResult.q(0);
            } else {
                TextLayoutResult textLayoutResult2 = this.f17474c;
                if (textLayoutResult2 == null) {
                    Intrinsics.y("layoutResult");
                    textLayoutResult2 = null;
                }
                int q2 = textLayoutResult2.q(i2);
                i3 = i(q2, f17472g) == i2 ? q2 : q2 + 1;
            }
            TextLayoutResult textLayoutResult3 = this.f17474c;
            if (textLayoutResult3 == null) {
                Intrinsics.y("layoutResult");
                textLayoutResult3 = null;
            }
            if (i3 >= textLayoutResult3.n()) {
                return null;
            }
            return c(i(i3, f17472g), i(i3, f17473h) + 1);
        }

        public int[] b(int i2) {
            int i3;
            if (d().length() <= 0 || i2 <= 0) {
                return null;
            }
            if (i2 > d().length()) {
                TextLayoutResult textLayoutResult = this.f17474c;
                if (textLayoutResult == null) {
                    Intrinsics.y("layoutResult");
                    textLayoutResult = null;
                }
                i3 = textLayoutResult.q(d().length());
            } else {
                TextLayoutResult textLayoutResult2 = this.f17474c;
                if (textLayoutResult2 == null) {
                    Intrinsics.y("layoutResult");
                    textLayoutResult2 = null;
                }
                int q2 = textLayoutResult2.q(i2);
                i3 = i(q2, f17473h) + 1 == i2 ? q2 : q2 - 1;
            }
            if (i3 < 0) {
                return null;
            }
            return c(i(i3, f17472g), i(i3, f17473h) + 1);
        }

        public final int i(int i2, ResolvedTextDirection resolvedTextDirection) {
            TextLayoutResult textLayoutResult = this.f17474c;
            TextLayoutResult textLayoutResult2 = null;
            if (textLayoutResult == null) {
                Intrinsics.y("layoutResult");
                textLayoutResult = null;
            }
            int u2 = textLayoutResult.u(i2);
            TextLayoutResult textLayoutResult3 = this.f17474c;
            if (textLayoutResult3 == null) {
                Intrinsics.y("layoutResult");
                textLayoutResult3 = null;
            }
            if (resolvedTextDirection != textLayoutResult3.y(u2)) {
                TextLayoutResult textLayoutResult4 = this.f17474c;
                if (textLayoutResult4 == null) {
                    Intrinsics.y("layoutResult");
                } else {
                    textLayoutResult2 = textLayoutResult4;
                }
                return textLayoutResult2.u(i2);
            }
            TextLayoutResult textLayoutResult5 = this.f17474c;
            if (textLayoutResult5 == null) {
                Intrinsics.y("layoutResult");
                textLayoutResult5 = null;
            }
            return TextLayoutResult.p(textLayoutResult5, i2, false, 2, (Object) null) - 1;
        }

        public final void j(String str, TextLayoutResult textLayoutResult) {
            f(str);
            this.f17474c = textLayoutResult;
        }

        public LineTextSegmentIterator() {
        }
    }

    @Metadata
    public static final class PageTextSegmentIterator extends AbstractTextSegmentIterator {

        /* renamed from: f  reason: collision with root package name */
        public static final Companion f17475f = new Companion((DefaultConstructorMarker) null);

        /* renamed from: g  reason: collision with root package name */
        public static final int f17476g = 8;

        /* renamed from: h  reason: collision with root package name */
        public static PageTextSegmentIterator f17477h;

        /* renamed from: i  reason: collision with root package name */
        public static final ResolvedTextDirection f17478i = ResolvedTextDirection.Rtl;

        /* renamed from: j  reason: collision with root package name */
        public static final ResolvedTextDirection f17479j = ResolvedTextDirection.Ltr;

        /* renamed from: c  reason: collision with root package name */
        public TextLayoutResult f17480c;

        /* renamed from: d  reason: collision with root package name */
        public SemanticsNode f17481d;

        /* renamed from: e  reason: collision with root package name */
        public Rect f17482e;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final PageTextSegmentIterator a() {
                if (PageTextSegmentIterator.f17477h == null) {
                    PageTextSegmentIterator.f17477h = new PageTextSegmentIterator((DefaultConstructorMarker) null);
                }
                PageTextSegmentIterator g2 = PageTextSegmentIterator.f17477h;
                Intrinsics.g(g2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                return g2;
            }

            public Companion() {
            }
        }

        public /* synthetic */ PageTextSegmentIterator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int i(int i2, ResolvedTextDirection resolvedTextDirection) {
            TextLayoutResult textLayoutResult = this.f17480c;
            TextLayoutResult textLayoutResult2 = null;
            if (textLayoutResult == null) {
                Intrinsics.y("layoutResult");
                textLayoutResult = null;
            }
            int u2 = textLayoutResult.u(i2);
            TextLayoutResult textLayoutResult3 = this.f17480c;
            if (textLayoutResult3 == null) {
                Intrinsics.y("layoutResult");
                textLayoutResult3 = null;
            }
            if (resolvedTextDirection != textLayoutResult3.y(u2)) {
                TextLayoutResult textLayoutResult4 = this.f17480c;
                if (textLayoutResult4 == null) {
                    Intrinsics.y("layoutResult");
                } else {
                    textLayoutResult2 = textLayoutResult4;
                }
                return textLayoutResult2.u(i2);
            }
            TextLayoutResult textLayoutResult5 = this.f17480c;
            if (textLayoutResult5 == null) {
                Intrinsics.y("layoutResult");
                textLayoutResult5 = null;
            }
            return TextLayoutResult.p(textLayoutResult5, i2, false, 2, (Object) null) - 1;
        }

        public int[] a(int i2) {
            int n2;
            TextLayoutResult textLayoutResult = null;
            if (d().length() <= 0 || i2 >= d().length()) {
                return null;
            }
            try {
                SemanticsNode semanticsNode = this.f17481d;
                if (semanticsNode == null) {
                    Intrinsics.y("node");
                    semanticsNode = null;
                }
                androidx.compose.ui.geometry.Rect i3 = semanticsNode.i();
                int round = Math.round(i3.i() - i3.r());
                int e2 = RangesKt.e(0, i2);
                TextLayoutResult textLayoutResult2 = this.f17480c;
                if (textLayoutResult2 == null) {
                    Intrinsics.y("layoutResult");
                    textLayoutResult2 = null;
                }
                int q2 = textLayoutResult2.q(e2);
                TextLayoutResult textLayoutResult3 = this.f17480c;
                if (textLayoutResult3 == null) {
                    Intrinsics.y("layoutResult");
                    textLayoutResult3 = null;
                }
                float v2 = textLayoutResult3.v(q2) + ((float) round);
                TextLayoutResult textLayoutResult4 = this.f17480c;
                if (textLayoutResult4 == null) {
                    Intrinsics.y("layoutResult");
                    textLayoutResult4 = null;
                }
                TextLayoutResult textLayoutResult5 = this.f17480c;
                if (textLayoutResult5 == null) {
                    Intrinsics.y("layoutResult");
                    textLayoutResult5 = null;
                }
                if (v2 < textLayoutResult4.v(textLayoutResult5.n() - 1)) {
                    TextLayoutResult textLayoutResult6 = this.f17480c;
                    if (textLayoutResult6 == null) {
                        Intrinsics.y("layoutResult");
                    } else {
                        textLayoutResult = textLayoutResult6;
                    }
                    n2 = textLayoutResult.r(v2);
                } else {
                    TextLayoutResult textLayoutResult7 = this.f17480c;
                    if (textLayoutResult7 == null) {
                        Intrinsics.y("layoutResult");
                    } else {
                        textLayoutResult = textLayoutResult7;
                    }
                    n2 = textLayoutResult.n();
                }
                return c(e2, i(n2 - 1, f17479j) + 1);
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        public int[] b(int i2) {
            int i3;
            TextLayoutResult textLayoutResult = null;
            if (d().length() <= 0 || i2 <= 0) {
                return null;
            }
            try {
                SemanticsNode semanticsNode = this.f17481d;
                if (semanticsNode == null) {
                    Intrinsics.y("node");
                    semanticsNode = null;
                }
                androidx.compose.ui.geometry.Rect i4 = semanticsNode.i();
                int round = Math.round(i4.i() - i4.r());
                int j2 = RangesKt.j(d().length(), i2);
                TextLayoutResult textLayoutResult2 = this.f17480c;
                if (textLayoutResult2 == null) {
                    Intrinsics.y("layoutResult");
                    textLayoutResult2 = null;
                }
                int q2 = textLayoutResult2.q(j2);
                TextLayoutResult textLayoutResult3 = this.f17480c;
                if (textLayoutResult3 == null) {
                    Intrinsics.y("layoutResult");
                    textLayoutResult3 = null;
                }
                float v2 = textLayoutResult3.v(q2) - ((float) round);
                if (v2 > 0.0f) {
                    TextLayoutResult textLayoutResult4 = this.f17480c;
                    if (textLayoutResult4 == null) {
                        Intrinsics.y("layoutResult");
                    } else {
                        textLayoutResult = textLayoutResult4;
                    }
                    i3 = textLayoutResult.r(v2);
                } else {
                    i3 = 0;
                }
                if (j2 == d().length() && i3 < q2) {
                    i3++;
                }
                return c(i(i3, f17478i), j2);
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        public final void j(String str, TextLayoutResult textLayoutResult, SemanticsNode semanticsNode) {
            f(str);
            this.f17480c = textLayoutResult;
            this.f17481d = semanticsNode;
        }

        public PageTextSegmentIterator() {
            this.f17482e = new Rect();
        }
    }

    @Metadata
    public static final class ParagraphTextSegmentIterator extends AbstractTextSegmentIterator {

        /* renamed from: c  reason: collision with root package name */
        public static final Companion f17483c = new Companion((DefaultConstructorMarker) null);

        /* renamed from: d  reason: collision with root package name */
        public static ParagraphTextSegmentIterator f17484d;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ParagraphTextSegmentIterator a() {
                if (ParagraphTextSegmentIterator.f17484d == null) {
                    ParagraphTextSegmentIterator.f17484d = new ParagraphTextSegmentIterator((DefaultConstructorMarker) null);
                }
                ParagraphTextSegmentIterator g2 = ParagraphTextSegmentIterator.f17484d;
                Intrinsics.g(g2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                return g2;
            }

            public Companion() {
            }
        }

        public /* synthetic */ ParagraphTextSegmentIterator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public int[] a(int i2) {
            int length = d().length();
            if (length <= 0 || i2 >= length) {
                return null;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            while (i2 < length && d().charAt(i2) == 10 && !j(i2)) {
                i2++;
            }
            if (i2 >= length) {
                return null;
            }
            int i3 = i2 + 1;
            while (i3 < length && !i(i3)) {
                i3++;
            }
            return c(i2, i3);
        }

        public int[] b(int i2) {
            int length = d().length();
            if (length <= 0 || i2 <= 0) {
                return null;
            }
            if (i2 > length) {
                i2 = length;
            }
            while (i2 > 0 && d().charAt(i2 - 1) == 10 && !i(i2)) {
                i2--;
            }
            if (i2 <= 0) {
                return null;
            }
            int i3 = i2 - 1;
            while (i3 > 0 && !j(i3)) {
                i3--;
            }
            return c(i3, i2);
        }

        public final boolean i(int i2) {
            return i2 > 0 && d().charAt(i2 + -1) != 10 && (i2 == d().length() || d().charAt(i2) == 10);
        }

        public final boolean j(int i2) {
            return d().charAt(i2) != 10 && (i2 == 0 || d().charAt(i2 - 1) == 10);
        }

        public ParagraphTextSegmentIterator() {
        }
    }

    @Metadata
    public interface TextSegmentIterator {
        int[] a(int i2);

        int[] b(int i2);
    }

    @Metadata
    public static final class WordTextSegmentIterator extends AbstractTextSegmentIterator {

        /* renamed from: d  reason: collision with root package name */
        public static final Companion f17485d = new Companion((DefaultConstructorMarker) null);

        /* renamed from: e  reason: collision with root package name */
        public static final int f17486e = 8;

        /* renamed from: f  reason: collision with root package name */
        public static WordTextSegmentIterator f17487f;

        /* renamed from: c  reason: collision with root package name */
        public BreakIterator f17488c;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final WordTextSegmentIterator a(Locale locale) {
                if (WordTextSegmentIterator.f17487f == null) {
                    WordTextSegmentIterator.f17487f = new WordTextSegmentIterator(locale, (DefaultConstructorMarker) null);
                }
                WordTextSegmentIterator g2 = WordTextSegmentIterator.f17487f;
                Intrinsics.g(g2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                return g2;
            }

            public Companion() {
            }
        }

        public /* synthetic */ WordTextSegmentIterator(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
            this(locale);
        }

        private final boolean i(int i2) {
            return i2 > 0 && j(i2 + -1) && (i2 == d().length() || !j(i2));
        }

        private final boolean k(int i2) {
            return j(i2) && (i2 == 0 || !j(i2 - 1));
        }

        private final void l(Locale locale) {
            this.f17488c = BreakIterator.getWordInstance(locale);
        }

        public int[] a(int i2) {
            if (d().length() <= 0 || i2 >= d().length()) {
                return null;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            while (!j(i2) && !k(i2)) {
                BreakIterator breakIterator = this.f17488c;
                if (breakIterator == null) {
                    Intrinsics.y("impl");
                    breakIterator = null;
                }
                i2 = breakIterator.following(i2);
                if (i2 == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.f17488c;
            if (breakIterator2 == null) {
                Intrinsics.y("impl");
                breakIterator2 = null;
            }
            int following = breakIterator2.following(i2);
            if (following == -1 || !i(following)) {
                return null;
            }
            return c(i2, following);
        }

        public int[] b(int i2) {
            int length = d().length();
            if (length <= 0 || i2 <= 0) {
                return null;
            }
            if (i2 > length) {
                i2 = length;
            }
            while (i2 > 0 && !j(i2 - 1) && !i(i2)) {
                BreakIterator breakIterator = this.f17488c;
                if (breakIterator == null) {
                    Intrinsics.y("impl");
                    breakIterator = null;
                }
                i2 = breakIterator.preceding(i2);
                if (i2 == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.f17488c;
            if (breakIterator2 == null) {
                Intrinsics.y("impl");
                breakIterator2 = null;
            }
            int preceding = breakIterator2.preceding(i2);
            if (preceding == -1 || !k(preceding)) {
                return null;
            }
            return c(preceding, i2);
        }

        public void e(String str) {
            super.e(str);
            BreakIterator breakIterator = this.f17488c;
            if (breakIterator == null) {
                Intrinsics.y("impl");
                breakIterator = null;
            }
            breakIterator.setText(str);
        }

        public final boolean j(int i2) {
            if (i2 < 0 || i2 >= d().length()) {
                return false;
            }
            return Character.isLetterOrDigit(d().codePointAt(i2));
        }

        public WordTextSegmentIterator(Locale locale) {
            l(locale);
        }
    }
}
