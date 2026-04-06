package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

@ElementTypesAreNonnullByDefault
class AppendableWriter extends Writer {

    /* renamed from: A  reason: collision with root package name */
    public boolean f28937A;

    /* renamed from: z  reason: collision with root package name */
    public final Appendable f28938z;

    public final void a() {
        if (this.f28937A) {
            throw new IOException("Cannot write to a closed writer.");
        }
    }

    public void close() {
        this.f28937A = true;
        Appendable appendable = this.f28938z;
        if (appendable instanceof Closeable) {
            ((Closeable) appendable).close();
        }
    }

    public void flush() {
        a();
        Appendable appendable = this.f28938z;
        if (appendable instanceof Flushable) {
            ((Flushable) appendable).flush();
        }
    }

    public void write(char[] cArr, int i2, int i3) {
        a();
        this.f28938z.append(new String(cArr, i2, i3));
    }

    public void write(int i2) {
        a();
        this.f28938z.append((char) i2);
    }

    public Writer append(char c2) {
        a();
        this.f28938z.append(c2);
        return this;
    }

    public void write(String str) {
        Preconditions.q(str);
        a();
        this.f28938z.append(str);
    }

    public Writer append(CharSequence charSequence) {
        a();
        this.f28938z.append(charSequence);
        return this;
    }

    public Writer append(CharSequence charSequence, int i2, int i3) {
        a();
        this.f28938z.append(charSequence, i2, i3);
        return this;
    }

    public void write(String str, int i2, int i3) {
        Preconditions.q(str);
        a();
        this.f28938z.append(str, i2, i3 + i2);
    }
}
