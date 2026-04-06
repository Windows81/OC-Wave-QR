package org.bson.json;

class JsonStringBuffer implements JsonBuffer {

    /* renamed from: a  reason: collision with root package name */
    public final String f43944a;

    /* renamed from: b  reason: collision with root package name */
    public int f43945b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f43946c;

    public void a(int i2) {
        if (i2 <= this.f43945b) {
            this.f43945b = i2;
            return;
        }
        throw new IllegalStateException("mark cannot reset ahead of position, only back");
    }

    public void b(int i2) {
    }

    public int c() {
        return this.f43945b;
    }

    public void d(int i2) {
        this.f43946c = false;
        if (i2 != -1 && this.f43944a.charAt(this.f43945b - 1) == i2) {
            this.f43945b--;
        }
    }

    public int getPosition() {
        return this.f43945b;
    }

    public int read() {
        if (this.f43946c) {
            throw new JsonParseException("Trying to read past EOF.");
        } else if (this.f43945b >= this.f43944a.length()) {
            this.f43946c = true;
            return -1;
        } else {
            String str = this.f43944a;
            int i2 = this.f43945b;
            this.f43945b = i2 + 1;
            return str.charAt(i2);
        }
    }
}
