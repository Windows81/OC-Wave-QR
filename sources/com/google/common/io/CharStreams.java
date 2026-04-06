package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.Writer;

@ElementTypesAreNonnullByDefault
public final class CharStreams {

    public static final class NullWriter extends Writer {

        /* renamed from: z  reason: collision with root package name */
        public static final NullWriter f29000z = new NullWriter();

        public Writer append(char c2) {
            return this;
        }

        public void close() {
        }

        public void flush() {
        }

        public String toString() {
            return "CharStreams.nullWriter()";
        }

        public void write(int i2) {
        }

        public Writer append(CharSequence charSequence) {
            return this;
        }

        public void write(char[] cArr) {
            Preconditions.q(cArr);
        }

        public void write(char[] cArr, int i2, int i3) {
            Preconditions.v(i2, i3 + i2, cArr.length);
        }

        public void write(String str) {
            Preconditions.q(str);
        }

        public void write(String str, int i2, int i3) {
            Preconditions.v(i2, i3 + i2, str.length());
        }

        public Writer append(CharSequence charSequence, int i2, int i3) {
            Preconditions.v(i2, i3, charSequence == null ? 4 : charSequence.length());
            return this;
        }
    }
}
