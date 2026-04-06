package androidx.compose.runtime.tooling;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
final class SourceInfoParserState {

    /* renamed from: a  reason: collision with root package name */
    public final String f15409a;

    /* renamed from: b  reason: collision with root package name */
    public int f15410b;

    public SourceInfoParserState(String str) {
        this.f15409a = str;
    }

    public static /* synthetic */ void b(SourceInfoParserState sourceInfoParserState, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 1;
        }
        sourceInfoParserState.a(i2);
    }

    public final void a(int i2) {
        this.f15410b += i2;
    }

    public final boolean c() {
        return this.f15410b >= this.f15409a.length();
    }

    public final char d() {
        return this.f15409a.charAt(this.f15410b);
    }

    public final void e(char c2) {
        if (!h(c2)) {
            m("expected " + c2);
            throw new KotlinNothingValueException();
        }
    }

    public final String f() {
        return this.f15409a;
    }

    public final int g() {
        return this.f15410b;
    }

    public final boolean h(char c2) {
        return this.f15410b < this.f15409a.length() && this.f15409a.charAt(this.f15410b) == c2;
    }

    public final void i(String str) {
        while (this.f15410b < this.f15409a.length() && !StringsKt.V(str, this.f15409a.charAt(this.f15410b), false, 2, (Object) null)) {
            this.f15410b++;
        }
    }

    public final int j(String str) {
        Integer q2 = StringsKt.q(k(str));
        if (q2 != null) {
            return q2.intValue();
        }
        m("expected int");
        throw new KotlinNothingValueException();
    }

    public final String k(String str) {
        int i2 = this.f15410b;
        i(str);
        int i3 = this.f15410b;
        if (i3 <= i2) {
            return "";
        }
        String substring = this.f15409a.substring(i2, i3);
        Intrinsics.h(substring, "substring(...)");
        return substring;
    }

    public final String l() {
        String str = this.f15409a;
        String substring = str.substring(this.f15410b, str.length());
        Intrinsics.h(substring, "substring(...)");
        return substring;
    }

    public final Void m(String str) {
        int min = Math.min(this.f15410b, this.f15409a.length());
        StringBuilder sb = new StringBuilder();
        sb.append("Error while parsing source information: ");
        sb.append(str);
        sb.append(" at ");
        String substring = this.f15409a.substring(0, min);
        Intrinsics.h(substring, "substring(...)");
        sb.append(substring);
        sb.append('|');
        String substring2 = this.f15409a.substring(min);
        Intrinsics.h(substring2, "substring(...)");
        sb.append(substring2);
        throw new ParseException(sb.toString());
    }
}
