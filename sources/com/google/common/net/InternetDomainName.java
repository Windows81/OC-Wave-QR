package com.google.common.net;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.errorprone.annotations.Immutable;

@Immutable
@ElementTypesAreNonnullByDefault
public final class InternetDomainName {

    /* renamed from: b  reason: collision with root package name */
    public static final CharMatcher f29078b = CharMatcher.d(".。．｡");

    /* renamed from: c  reason: collision with root package name */
    public static final Splitter f29079c = Splitter.f('.');

    /* renamed from: d  reason: collision with root package name */
    public static final Joiner f29080d = Joiner.h('.');

    /* renamed from: e  reason: collision with root package name */
    public static final CharMatcher f29081e;

    /* renamed from: f  reason: collision with root package name */
    public static final CharMatcher f29082f;

    /* renamed from: g  reason: collision with root package name */
    public static final CharMatcher f29083g;

    /* renamed from: h  reason: collision with root package name */
    public static final CharMatcher f29084h;

    /* renamed from: a  reason: collision with root package name */
    public final String f29085a;

    static {
        CharMatcher d2 = CharMatcher.d("-_");
        f29081e = d2;
        CharMatcher h2 = CharMatcher.h('0', '9');
        f29082f = h2;
        CharMatcher u2 = CharMatcher.h('a', 'z').u(CharMatcher.h('A', 'Z'));
        f29083g = u2;
        f29084h = h2.u(u2).u(d2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InternetDomainName) {
            return this.f29085a.equals(((InternetDomainName) obj).f29085a);
        }
        return false;
    }

    public int hashCode() {
        return this.f29085a.hashCode();
    }

    public String toString() {
        return this.f29085a;
    }
}
