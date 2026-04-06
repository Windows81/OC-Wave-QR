package org.bson.json;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

class JsonStreamBuffer implements JsonBuffer {

    /* renamed from: a  reason: collision with root package name */
    public final Reader f43934a;

    /* renamed from: b  reason: collision with root package name */
    public final List f43935b;

    /* renamed from: c  reason: collision with root package name */
    public final int f43936c;

    /* renamed from: d  reason: collision with root package name */
    public int f43937d;

    /* renamed from: e  reason: collision with root package name */
    public int f43938e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f43939f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f43940g;

    /* renamed from: h  reason: collision with root package name */
    public char[] f43941h;

    /* renamed from: i  reason: collision with root package name */
    public int f43942i;

    /* renamed from: j  reason: collision with root package name */
    public int f43943j;

    public void a(int i2) {
        if (i2 <= this.f43937d) {
            int indexOf = this.f43935b.indexOf(Integer.valueOf(i2));
            if (indexOf != -1) {
                if (i2 != this.f43937d) {
                    this.f43939f = false;
                }
                List list = this.f43935b;
                list.subList(indexOf, list.size()).clear();
                this.f43937d = i2;
                return;
            }
            throw new IllegalArgumentException("mark invalidated");
        }
        throw new IllegalStateException("mark cannot reset ahead of position, only back");
    }

    public void b(int i2) {
        int indexOf = this.f43935b.indexOf(Integer.valueOf(i2));
        if (indexOf != -1) {
            List list = this.f43935b;
            list.subList(indexOf, list.size()).clear();
        }
    }

    public int c() {
        if (this.f43943j == 0) {
            this.f43942i = this.f43937d;
        }
        if (!this.f43935b.contains(Integer.valueOf(this.f43937d))) {
            this.f43935b.add(Integer.valueOf(this.f43937d));
        }
        return this.f43937d;
    }

    public void d(int i2) {
        this.f43940g = false;
        if (i2 != -1 && this.f43938e == i2) {
            this.f43939f = true;
            this.f43937d--;
        }
    }

    public final void e(char c2) {
        if (!this.f43935b.isEmpty()) {
            int i2 = this.f43943j;
            char[] cArr = this.f43941h;
            if (i2 == cArr.length) {
                char[] cArr2 = new char[(cArr.length * 2)];
                System.arraycopy(cArr, 0, cArr2, 0, i2);
                this.f43941h = cArr2;
            }
            char[] cArr3 = this.f43941h;
            int i3 = this.f43943j;
            cArr3[i3] = c2;
            this.f43943j = i3 + 1;
        }
    }

    public final void f() {
        this.f43942i = -1;
        this.f43943j = 0;
        this.f43941h = new char[this.f43936c];
    }

    public int getPosition() {
        return this.f43937d;
    }

    public int read() {
        if (this.f43940g) {
            throw new JsonParseException("Trying to read past EOF.");
        } else if (this.f43939f) {
            this.f43939f = false;
            int i2 = this.f43938e;
            this.f43938e = -1;
            this.f43937d++;
            return i2;
        } else {
            int i3 = this.f43937d;
            int i4 = this.f43942i;
            if (i3 - i4 < this.f43943j) {
                char c2 = this.f43941h[i3 - i4];
                this.f43938e = c2;
                this.f43937d = i3 + 1;
                return c2;
            }
            if (this.f43935b.isEmpty()) {
                f();
            }
            try {
                int read = this.f43934a.read();
                if (read != -1) {
                    this.f43938e = read;
                    e((char) read);
                }
                this.f43937d++;
                if (read == -1) {
                    this.f43940g = true;
                }
                return read;
            } catch (IOException e2) {
                throw new JsonParseException((Throwable) e2);
            }
        }
    }
}
