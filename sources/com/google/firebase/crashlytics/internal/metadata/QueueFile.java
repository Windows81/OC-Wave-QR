package com.google.firebase.crashlytics.internal.metadata;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

class QueueFile implements Closeable {
    public static final Logger F = Logger.getLogger(QueueFile.class.getName());

    /* renamed from: A  reason: collision with root package name */
    public int f30137A;

    /* renamed from: B  reason: collision with root package name */
    public int f30138B;
    public Element C;
    public Element D;
    public final byte[] E = new byte[16];

    /* renamed from: z  reason: collision with root package name */
    public final RandomAccessFile f30139z;

    public static class Element {

        /* renamed from: c  reason: collision with root package name */
        public static final Element f30143c = new Element(0, 0);

        /* renamed from: a  reason: collision with root package name */
        public final int f30144a;

        /* renamed from: b  reason: collision with root package name */
        public final int f30145b;

        public Element(int i2, int i3) {
            this.f30144a = i2;
            this.f30145b = i3;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f30144a + ", length = " + this.f30145b + "]";
        }
    }

    public final class ElementInputStream extends InputStream {

        /* renamed from: A  reason: collision with root package name */
        public int f30146A;

        /* renamed from: z  reason: collision with root package name */
        public int f30148z;

        public int read(byte[] bArr, int i2, int i3) {
            Object unused = QueueFile.t(bArr, "buffer");
            if ((i2 | i3) < 0 || i3 > bArr.length - i2) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i4 = this.f30146A;
            if (i4 <= 0) {
                return -1;
            }
            if (i3 > i4) {
                i3 = i4;
            }
            QueueFile.this.F(this.f30148z, bArr, i2, i3);
            this.f30148z = QueueFile.this.N(this.f30148z + i3);
            this.f30146A -= i3;
            return i3;
        }

        public ElementInputStream(Element element) {
            this.f30148z = QueueFile.this.N(element.f30144a + 4);
            this.f30146A = element.f30145b;
        }

        public int read() {
            if (this.f30146A == 0) {
                return -1;
            }
            QueueFile.this.f30139z.seek((long) this.f30148z);
            int read = QueueFile.this.f30139z.read();
            this.f30148z = QueueFile.this.N(this.f30148z + 1);
            this.f30146A--;
            return read;
        }
    }

    public interface ElementReader {
        void a(InputStream inputStream, int i2);
    }

    public QueueFile(File file) {
        if (!file.exists()) {
            m(file);
        }
        this.f30139z = x(file);
        A();
    }

    public static int C(byte[] bArr, int i2) {
        return ((bArr[i2] & 255) << 24) + ((bArr[i2 + 1] & 255) << 16) + ((bArr[i2 + 2] & 255) << 8) + (bArr[i2 + 3] & 255);
    }

    public static void Q(byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) (i3 >> 24);
        bArr[i2 + 1] = (byte) (i3 >> 16);
        bArr[i2 + 2] = (byte) (i3 >> 8);
        bArr[i2 + 3] = (byte) i3;
    }

    public static void S(byte[] bArr, int... iArr) {
        int i2 = 0;
        for (int Q : iArr) {
            Q(bArr, i2, Q);
            i2 += 4;
        }
    }

    /* JADX INFO: finally extract failed */
    public static void m(File file) {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile x2 = x(file2);
        try {
            x2.setLength(4096);
            x2.seek(0);
            byte[] bArr = new byte[16];
            S(bArr, 4096, 0, 0, 0);
            x2.write(bArr);
            x2.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            x2.close();
            throw th;
        }
    }

    public static Object t(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static RandomAccessFile x(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    public final void A() {
        this.f30139z.seek(0);
        this.f30139z.readFully(this.E);
        int C2 = C(this.E, 0);
        this.f30137A = C2;
        if (((long) C2) <= this.f30139z.length()) {
            this.f30138B = C(this.E, 4);
            int C3 = C(this.E, 8);
            int C4 = C(this.E, 12);
            this.C = y(C3);
            this.D = y(C4);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f30137A + ", Actual length: " + this.f30139z.length());
    }

    public final int D() {
        return this.f30137A - I();
    }

    public synchronized void E() {
        try {
            if (r()) {
                throw new NoSuchElementException();
            } else if (this.f30138B == 1) {
                j();
            } else {
                Element element = this.C;
                int N = N(element.f30144a + 4 + element.f30145b);
                F(N, this.E, 0, 4);
                int C2 = C(this.E, 0);
                O(this.f30137A, this.f30138B - 1, N, this.D.f30144a);
                this.f30138B--;
                this.C = new Element(N, C2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void F(int i2, byte[] bArr, int i3, int i4) {
        int N = N(i2);
        int i5 = N + i4;
        int i6 = this.f30137A;
        if (i5 <= i6) {
            this.f30139z.seek((long) N);
            this.f30139z.readFully(bArr, i3, i4);
            return;
        }
        int i7 = i6 - N;
        this.f30139z.seek((long) N);
        this.f30139z.readFully(bArr, i3, i7);
        this.f30139z.seek(16);
        this.f30139z.readFully(bArr, i3 + i7, i4 - i7);
    }

    public final void G(int i2, byte[] bArr, int i3, int i4) {
        int N = N(i2);
        int i5 = N + i4;
        int i6 = this.f30137A;
        if (i5 <= i6) {
            this.f30139z.seek((long) N);
            this.f30139z.write(bArr, i3, i4);
            return;
        }
        int i7 = i6 - N;
        this.f30139z.seek((long) N);
        this.f30139z.write(bArr, i3, i7);
        this.f30139z.seek(16);
        this.f30139z.write(bArr, i3 + i7, i4 - i7);
    }

    public final void H(int i2) {
        this.f30139z.setLength((long) i2);
        this.f30139z.getChannel().force(true);
    }

    public int I() {
        if (this.f30138B == 0) {
            return 16;
        }
        Element element = this.D;
        int i2 = element.f30144a;
        int i3 = this.C.f30144a;
        return i2 >= i3 ? (i2 - i3) + 4 + element.f30145b + 16 : (((i2 + 4) + element.f30145b) + this.f30137A) - i3;
    }

    public final int N(int i2) {
        int i3 = this.f30137A;
        return i2 < i3 ? i2 : (i2 + 16) - i3;
    }

    public final void O(int i2, int i3, int i4, int i5) {
        S(this.E, i2, i3, i4, i5);
        this.f30139z.seek(0);
        this.f30139z.write(this.E);
    }

    public synchronized void close() {
        this.f30139z.close();
    }

    public void f(byte[] bArr) {
        g(bArr, 0, bArr.length);
    }

    public synchronized void g(byte[] bArr, int i2, int i3) {
        int i4;
        try {
            t(bArr, "buffer");
            if ((i2 | i3) < 0 || i3 > bArr.length - i2) {
                throw new IndexOutOfBoundsException();
            }
            k(i3);
            boolean r2 = r();
            if (r2) {
                i4 = 16;
            } else {
                Element element = this.D;
                i4 = N(element.f30144a + 4 + element.f30145b);
            }
            Element element2 = new Element(i4, i3);
            Q(this.E, 0, i3);
            G(element2.f30144a, this.E, 0, 4);
            G(element2.f30144a + 4, bArr, i2, i3);
            O(this.f30137A, this.f30138B + 1, r2 ? element2.f30144a : this.C.f30144a, element2.f30144a);
            this.D = element2;
            this.f30138B++;
            if (r2) {
                this.C = element2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void j() {
        try {
            O(4096, 0, 0, 0);
            this.f30138B = 0;
            Element element = Element.f30143c;
            this.C = element;
            this.D = element;
            if (this.f30137A > 4096) {
                H(4096);
            }
            this.f30137A = 4096;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final void k(int i2) {
        int i3 = i2 + 4;
        int D2 = D();
        if (D2 < i3) {
            int i4 = this.f30137A;
            do {
                D2 += i4;
                i4 <<= 1;
            } while (D2 < i3);
            H(i4);
            Element element = this.D;
            int N = N(element.f30144a + 4 + element.f30145b);
            if (N < this.C.f30144a) {
                FileChannel channel = this.f30139z.getChannel();
                channel.position((long) this.f30137A);
                long j2 = (long) (N - 4);
                if (channel.transferTo(16, j2, channel) != j2) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i5 = this.D.f30144a;
            int i6 = this.C.f30144a;
            if (i5 < i6) {
                int i7 = (this.f30137A + i5) - 16;
                O(i4, this.f30138B, i6, i7);
                this.D = new Element(i7, this.D.f30145b);
            } else {
                O(i4, this.f30138B, i6, i5);
            }
            this.f30137A = i4;
        }
    }

    public synchronized void l(ElementReader elementReader) {
        int i2 = this.C.f30144a;
        for (int i3 = 0; i3 < this.f30138B; i3++) {
            Element y2 = y(i2);
            elementReader.a(new ElementInputStream(y2), y2.f30145b);
            i2 = N(y2.f30144a + 4 + y2.f30145b);
        }
    }

    public synchronized boolean r() {
        return this.f30138B == 0;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f30137A);
        sb.append(", size=");
        sb.append(this.f30138B);
        sb.append(", first=");
        sb.append(this.C);
        sb.append(", last=");
        sb.append(this.D);
        sb.append(", element lengths=[");
        try {
            l(new ElementReader() {

                /* renamed from: a  reason: collision with root package name */
                public boolean f30140a = true;

                public void a(InputStream inputStream, int i2) {
                    if (this.f30140a) {
                        this.f30140a = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(i2);
                }
            });
        } catch (IOException e2) {
            F.log(Level.WARNING, "read error", e2);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final Element y(int i2) {
        if (i2 == 0) {
            return Element.f30143c;
        }
        this.f30139z.seek((long) i2);
        return new Element(i2, this.f30139z.readInt());
    }
}
