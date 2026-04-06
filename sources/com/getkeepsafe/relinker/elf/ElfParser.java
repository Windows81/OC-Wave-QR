package com.getkeepsafe.relinker.elf;

import com.getkeepsafe.relinker.elf.Elf;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ElfParser implements Closeable, Elf {

    /* renamed from: A  reason: collision with root package name */
    public final FileChannel f23808A;

    /* renamed from: z  reason: collision with root package name */
    public final int f23809z = 1179403647;

    public ElfParser(File file) {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f23808A = new FileInputStream(file).getChannel();
    }

    public final long a(Elf.Header header, long j2, long j3) {
        for (long j4 = 0; j4 < j2; j4++) {
            Elf.ProgramHeader b2 = header.b(j4);
            if (b2.f23801a == 1) {
                long j5 = b2.f23803c;
                if (j5 <= j3 && j3 <= b2.f23804d + j5) {
                    return (j3 - j5) + b2.f23802b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    public Elf.Header b() {
        this.f23808A.position(0);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (l(allocate, 0) == 1179403647) {
            short f2 = f(allocate, 4);
            boolean z2 = f(allocate, 5) == 2;
            if (f2 == 1) {
                return new Elf32Header(z2, this);
            }
            if (f2 == 2) {
                return new Elf64Header(z2, this);
            }
            throw new IllegalStateException("Invalid class type!");
        }
        throw new IllegalArgumentException("Invalid ELF Magic!");
    }

    public List c() {
        long j2;
        this.f23808A.position(0);
        ArrayList arrayList = new ArrayList();
        Elf.Header b2 = b();
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(b2.f23792a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j3 = (long) b2.f23797f;
        int i2 = 0;
        if (j3 == 65535) {
            j3 = b2.c(0).f23805a;
        }
        long j4 = 0;
        while (true) {
            if (j4 >= j3) {
                j2 = 0;
                break;
            }
            Elf.ProgramHeader b3 = b2.b(j4);
            if (b3.f23801a == 2) {
                j2 = b3.f23802b;
                break;
            }
            j4++;
        }
        if (j2 == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList<Long> arrayList2 = new ArrayList<>();
        long j5 = 0;
        while (true) {
            Elf.DynamicStructure a2 = b2.a(j2, i2);
            long j6 = a2.f23790a;
            if (j6 == 1) {
                arrayList2.add(Long.valueOf(a2.f23791b));
            } else if (j6 == 5) {
                j5 = a2.f23791b;
            }
            i2++;
            if (a2.f23790a == 0) {
                break;
            }
        }
        if (j5 != 0) {
            long a3 = a(b2, j3, j5);
            for (Long longValue : arrayList2) {
                arrayList.add(k(allocate, longValue.longValue() + a3));
            }
            return arrayList;
        }
        throw new IllegalStateException("String table offset not found!");
    }

    public void close() {
        this.f23808A.close();
    }

    public void d(ByteBuffer byteBuffer, long j2, int i2) {
        byteBuffer.position(0);
        byteBuffer.limit(i2);
        long j3 = 0;
        while (j3 < ((long) i2)) {
            int read = this.f23808A.read(byteBuffer, j2 + j3);
            if (read != -1) {
                j3 += (long) read;
            } else {
                throw new EOFException();
            }
        }
        byteBuffer.position(0);
    }

    public short f(ByteBuffer byteBuffer, long j2) {
        d(byteBuffer, j2, 1);
        return (short) (byteBuffer.get() & 255);
    }

    public int g(ByteBuffer byteBuffer, long j2) {
        d(byteBuffer, j2, 2);
        return byteBuffer.getShort() & 65535;
    }

    public long j(ByteBuffer byteBuffer, long j2) {
        d(byteBuffer, j2, 8);
        return byteBuffer.getLong();
    }

    public String k(ByteBuffer byteBuffer, long j2) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j3 = 1 + j2;
            short f2 = f(byteBuffer, j2);
            if (f2 == 0) {
                return sb.toString();
            }
            sb.append((char) f2);
            j2 = j3;
        }
    }

    public long l(ByteBuffer byteBuffer, long j2) {
        d(byteBuffer, j2, 4);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }
}
