package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class EditingBuffer {

    /* renamed from: f  reason: collision with root package name */
    public static final Companion f18810f = new Companion((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f18811g = 8;

    /* renamed from: a  reason: collision with root package name */
    public final PartialGapBuffer f18812a;

    /* renamed from: b  reason: collision with root package name */
    public int f18813b;

    /* renamed from: c  reason: collision with root package name */
    public int f18814c;

    /* renamed from: d  reason: collision with root package name */
    public int f18815d;

    /* renamed from: e  reason: collision with root package name */
    public int f18816e;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public /* synthetic */ EditingBuffer(AnnotatedString annotatedString, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j2);
    }

    public final void a() {
        this.f18815d = -1;
        this.f18816e = -1;
    }

    public final void b(int i2, int i3) {
        long b2 = TextRangeKt.b(i2, i3);
        this.f18812a.c(i2, i3, "");
        long a2 = EditingBufferKt.a(TextRangeKt.b(this.f18813b, this.f18814c), b2);
        r(TextRange.l(a2));
        q(TextRange.k(a2));
        if (l()) {
            long a3 = EditingBufferKt.a(TextRangeKt.b(this.f18815d, this.f18816e), b2);
            if (TextRange.h(a3)) {
                a();
                return;
            }
            this.f18815d = TextRange.l(a3);
            this.f18816e = TextRange.k(a3);
        }
    }

    public final char c(int i2) {
        return this.f18812a.a(i2);
    }

    public final TextRange d() {
        if (l()) {
            return TextRange.b(TextRangeKt.b(this.f18815d, this.f18816e));
        }
        return null;
    }

    public final int e() {
        return this.f18816e;
    }

    public final int f() {
        return this.f18815d;
    }

    public final int g() {
        int i2 = this.f18813b;
        int i3 = this.f18814c;
        if (i2 == i3) {
            return i3;
        }
        return -1;
    }

    public final int h() {
        return this.f18812a.b();
    }

    public final long i() {
        return TextRangeKt.b(this.f18813b, this.f18814c);
    }

    public final int j() {
        return this.f18814c;
    }

    public final int k() {
        return this.f18813b;
    }

    public final boolean l() {
        return this.f18815d != -1;
    }

    public final void m(int i2, int i3, String str) {
        if (i2 < 0 || i2 > this.f18812a.b()) {
            throw new IndexOutOfBoundsException("start (" + i2 + ") offset is outside of text region " + this.f18812a.b());
        } else if (i3 < 0 || i3 > this.f18812a.b()) {
            throw new IndexOutOfBoundsException("end (" + i3 + ") offset is outside of text region " + this.f18812a.b());
        } else if (i2 <= i3) {
            this.f18812a.c(i2, i3, str);
            r(str.length() + i2);
            q(i2 + str.length());
            this.f18815d = -1;
            this.f18816e = -1;
        } else {
            throw new IllegalArgumentException("Do not set reversed range: " + i2 + " > " + i3);
        }
    }

    public final void n(int i2, int i3) {
        if (i2 < 0 || i2 > this.f18812a.b()) {
            throw new IndexOutOfBoundsException("start (" + i2 + ") offset is outside of text region " + this.f18812a.b());
        } else if (i3 < 0 || i3 > this.f18812a.b()) {
            throw new IndexOutOfBoundsException("end (" + i3 + ") offset is outside of text region " + this.f18812a.b());
        } else if (i2 < i3) {
            this.f18815d = i2;
            this.f18816e = i3;
        } else {
            throw new IllegalArgumentException("Do not set reversed or empty range: " + i2 + " > " + i3);
        }
    }

    public final void o(int i2) {
        p(i2, i2);
    }

    public final void p(int i2, int i3) {
        if (i2 < 0 || i2 > this.f18812a.b()) {
            throw new IndexOutOfBoundsException("start (" + i2 + ") offset is outside of text region " + this.f18812a.b());
        } else if (i3 < 0 || i3 > this.f18812a.b()) {
            throw new IndexOutOfBoundsException("end (" + i3 + ") offset is outside of text region " + this.f18812a.b());
        } else if (i2 <= i3) {
            r(i2);
            q(i3);
        } else {
            throw new IllegalArgumentException("Do not set reversed range: " + i2 + " > " + i3);
        }
    }

    public final void q(int i2) {
        if (!(i2 >= 0)) {
            InlineClassHelperKt.a("Cannot set selectionEnd to a negative value: " + i2);
        }
        this.f18814c = i2;
    }

    public final void r(int i2) {
        if (!(i2 >= 0)) {
            InlineClassHelperKt.a("Cannot set selectionStart to a negative value: " + i2);
        }
        this.f18813b = i2;
    }

    public final AnnotatedString s() {
        return new AnnotatedString(toString(), (List) null, 2, (DefaultConstructorMarker) null);
    }

    public String toString() {
        return this.f18812a.toString();
    }

    public EditingBuffer(AnnotatedString annotatedString, long j2) {
        this.f18812a = new PartialGapBuffer(annotatedString.k());
        this.f18813b = TextRange.l(j2);
        this.f18814c = TextRange.k(j2);
        this.f18815d = -1;
        this.f18816e = -1;
        int l2 = TextRange.l(j2);
        int k2 = TextRange.k(j2);
        if (l2 < 0 || l2 > annotatedString.length()) {
            throw new IndexOutOfBoundsException("start (" + l2 + ") offset is outside of text region " + annotatedString.length());
        } else if (k2 < 0 || k2 > annotatedString.length()) {
            throw new IndexOutOfBoundsException("end (" + k2 + ") offset is outside of text region " + annotatedString.length());
        } else if (l2 > k2) {
            throw new IllegalArgumentException("Do not set reversed range: " + l2 + " > " + k2);
        }
    }
}
