package com.google.common.base;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@ElementTypesAreNonnullByDefault
final class JdkPattern extends CommonPattern implements Serializable {

    /* renamed from: z  reason: collision with root package name */
    public final Pattern f27726z;

    public static final class JdkMatcher extends CommonMatcher {

        /* renamed from: a  reason: collision with root package name */
        public final Matcher f27727a;

        public JdkMatcher(Matcher matcher) {
            this.f27727a = (Matcher) Preconditions.q(matcher);
        }

        public int a() {
            return this.f27727a.end();
        }

        public boolean b() {
            return this.f27727a.find();
        }

        public boolean c(int i2) {
            return this.f27727a.find(i2);
        }

        public boolean d() {
            return this.f27727a.matches();
        }

        public int e() {
            return this.f27727a.start();
        }
    }

    public JdkPattern(Pattern pattern) {
        this.f27726z = (Pattern) Preconditions.q(pattern);
    }

    public int a() {
        return this.f27726z.flags();
    }

    public CommonMatcher b(CharSequence charSequence) {
        return new JdkMatcher(this.f27726z.matcher(charSequence));
    }

    public String c() {
        return this.f27726z.pattern();
    }

    public String toString() {
        return this.f27726z.toString();
    }
}
