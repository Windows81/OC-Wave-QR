package io.realm;

import java.util.Locale;

public interface OrderedCollectionChangeSet {

    public static class Range {

        /* renamed from: a  reason: collision with root package name */
        public final int f39910a;

        /* renamed from: b  reason: collision with root package name */
        public final int f39911b;

        public Range(int i2, int i3) {
            this.f39910a = i2;
            this.f39911b = i3;
        }

        public String toString() {
            return String.format(Locale.ENGLISH, "startIndex: %d, length: %d", new Object[]{Integer.valueOf(this.f39910a), Integer.valueOf(this.f39911b)});
        }
    }

    public enum State {
        INITIAL,
        UPDATE,
        ERROR
    }
}
