package com.google.common.base;

@ElementTypesAreNonnullByDefault
abstract class CommonPattern {
    public abstract int a();

    public abstract CommonMatcher b(CharSequence charSequence);

    public abstract String c();
}
