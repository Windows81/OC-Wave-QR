package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.Reader;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
class MultiReader extends Reader {

    /* renamed from: A  reason: collision with root package name */
    public Reader f29027A;

    /* renamed from: z  reason: collision with root package name */
    public final Iterator f29028z;

    public MultiReader(Iterator it) {
        this.f29028z = it;
        a();
    }

    public final void a() {
        close();
        if (this.f29028z.hasNext()) {
            this.f29027A = ((CharSource) this.f29028z.next()).a();
        }
    }

    public void close() {
        Reader reader = this.f29027A;
        if (reader != null) {
            try {
                reader.close();
            } finally {
                this.f29027A = null;
            }
        }
    }

    public int read(char[] cArr, int i2, int i3) {
        Preconditions.q(cArr);
        Reader reader = this.f29027A;
        if (reader == null) {
            return -1;
        }
        int read = reader.read(cArr, i2, i3);
        if (read != -1) {
            return read;
        }
        a();
        return read(cArr, i2, i3);
    }

    public boolean ready() {
        Reader reader = this.f29027A;
        return reader != null && reader.ready();
    }

    public long skip(long j2) {
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        Preconditions.e(i2 >= 0, "n is negative");
        if (i2 > 0) {
            while (true) {
                Reader reader = this.f29027A;
                if (reader == null) {
                    break;
                }
                long skip = reader.skip(j2);
                if (skip > 0) {
                    return skip;
                }
                a();
            }
        }
        return 0;
    }
}
