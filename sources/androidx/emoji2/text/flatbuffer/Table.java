package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.util.Comparator;

public class Table {

    /* renamed from: a  reason: collision with root package name */
    public int f21388a;

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f21389b;

    /* renamed from: c  reason: collision with root package name */
    public int f21390c;

    /* renamed from: d  reason: collision with root package name */
    public int f21391d;

    /* renamed from: e  reason: collision with root package name */
    public Utf8 f21392e = Utf8.a();

    /* renamed from: androidx.emoji2.text.flatbuffer.Table$1  reason: invalid class name */
    class AnonymousClass1 implements Comparator<Integer> {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ Table f21393A;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ ByteBuffer f21394z;

        /* renamed from: a */
        public int compare(Integer num, Integer num2) {
            return this.f21393A.f(num, num2, this.f21394z);
        }
    }

    public int a(int i2) {
        return i2 + this.f21389b.getInt(i2);
    }

    public int b(int i2) {
        if (i2 < this.f21391d) {
            return this.f21389b.getShort(this.f21390c + i2);
        }
        return 0;
    }

    public void c(int i2, ByteBuffer byteBuffer) {
        this.f21389b = byteBuffer;
        if (byteBuffer != null) {
            this.f21388a = i2;
            int i3 = i2 - byteBuffer.getInt(i2);
            this.f21390c = i3;
            this.f21391d = this.f21389b.getShort(i3);
            return;
        }
        this.f21388a = 0;
        this.f21390c = 0;
        this.f21391d = 0;
    }

    public int d(int i2) {
        int i3 = i2 + this.f21388a;
        return i3 + this.f21389b.getInt(i3) + 4;
    }

    public int e(int i2) {
        int i3 = i2 + this.f21388a;
        return this.f21389b.getInt(i3 + this.f21389b.getInt(i3));
    }

    public int f(Integer num, Integer num2, ByteBuffer byteBuffer) {
        return 0;
    }
}
