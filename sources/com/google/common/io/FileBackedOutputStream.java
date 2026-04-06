package com.google.common.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

@ElementTypesAreNonnullByDefault
public final class FileBackedOutputStream extends OutputStream {

    /* renamed from: A  reason: collision with root package name */
    public final boolean f29010A;

    /* renamed from: B  reason: collision with root package name */
    public final File f29011B;
    public OutputStream C;
    public MemoryOutput D;
    public File E;

    /* renamed from: z  reason: collision with root package name */
    public final int f29012z;

    /* renamed from: com.google.common.io.FileBackedOutputStream$1  reason: invalid class name */
    class AnonymousClass1 extends ByteSource {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FileBackedOutputStream f29013a;

        public InputStream a() {
            return this.f29013a.b();
        }

        public void finalize() {
            try {
                this.f29013a.c();
            } catch (Throwable th) {
                th.printStackTrace(System.err);
            }
        }
    }

    /* renamed from: com.google.common.io.FileBackedOutputStream$2  reason: invalid class name */
    class AnonymousClass2 extends ByteSource {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FileBackedOutputStream f29014a;

        public InputStream a() {
            return this.f29014a.b();
        }
    }

    public static class MemoryOutput extends ByteArrayOutputStream {
        public MemoryOutput() {
        }

        public byte[] a() {
            return this.buf;
        }

        public int getCount() {
            return this.count;
        }

        public /* synthetic */ MemoryOutput(AnonymousClass1 r1) {
            this();
        }
    }

    public final synchronized InputStream b() {
        if (this.E != null) {
            return new FileInputStream(this.E);
        }
        Objects.requireNonNull(this.D);
        return new ByteArrayInputStream(this.D.a(), 0, this.D.getCount());
    }

    public synchronized void c() {
        try {
            close();
            MemoryOutput memoryOutput = this.D;
            if (memoryOutput == null) {
                this.D = new MemoryOutput((AnonymousClass1) null);
            } else {
                memoryOutput.reset();
            }
            this.C = this.D;
            File file = this.E;
            if (file != null) {
                this.E = null;
                if (!file.delete()) {
                    String valueOf = String.valueOf(file);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 18);
                    sb.append("Could not delete: ");
                    sb.append(valueOf);
                    throw new IOException(sb.toString());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void close() {
        this.C.close();
    }

    public final void d(int i2) {
        MemoryOutput memoryOutput = this.D;
        if (memoryOutput != null && memoryOutput.getCount() + i2 > this.f29012z) {
            File createTempFile = File.createTempFile("FileBackedOutputStream", (String) null, this.f29011B);
            if (this.f29010A) {
                createTempFile.deleteOnExit();
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                fileOutputStream.write(this.D.a(), 0, this.D.getCount());
                fileOutputStream.flush();
                this.C = fileOutputStream;
                this.E = createTempFile;
                this.D = null;
            } catch (IOException e2) {
                createTempFile.delete();
                throw e2;
            }
        }
    }

    public synchronized void flush() {
        this.C.flush();
    }

    public synchronized void write(int i2) {
        d(1);
        this.C.write(i2);
    }

    public synchronized void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public synchronized void write(byte[] bArr, int i2, int i3) {
        d(i3);
        this.C.write(bArr, i2, i3);
    }
}
