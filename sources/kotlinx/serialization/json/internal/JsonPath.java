package kotlinx.serialization.json.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.StructureKind;

@Metadata
public final class JsonPath {

    /* renamed from: a  reason: collision with root package name */
    public Object[] f42395a = new Object[8];

    /* renamed from: b  reason: collision with root package name */
    public int[] f42396b;

    /* renamed from: c  reason: collision with root package name */
    public int f42397c;

    @Metadata
    public static final class Tombstone {

        /* renamed from: a  reason: collision with root package name */
        public static final Tombstone f42398a = new Tombstone();
    }

    public JsonPath() {
        int[] iArr = new int[8];
        for (int i2 = 0; i2 < 8; i2++) {
            iArr[i2] = -1;
        }
        this.f42396b = iArr;
        this.f42397c = -1;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append("$");
        int i2 = this.f42397c + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = this.f42395a[i3];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (!Intrinsics.d(serialDescriptor.e(), StructureKind.LIST.f42059a)) {
                    int i4 = this.f42396b[i3];
                    if (i4 >= 0) {
                        sb.append(".");
                        sb.append(serialDescriptor.g(i4));
                    }
                } else if (this.f42396b[i3] != -1) {
                    sb.append("[");
                    sb.append(this.f42396b[i3]);
                    sb.append("]");
                }
            } else if (obj != Tombstone.f42398a) {
                sb.append("[");
                sb.append("'");
                sb.append(obj);
                sb.append("'");
                sb.append("]");
            }
        }
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "toString(...)");
        return sb2;
    }

    public final void b() {
        int i2 = this.f42397c;
        int[] iArr = this.f42396b;
        if (iArr[i2] == -2) {
            iArr[i2] = -1;
            this.f42397c = i2 - 1;
        }
        int i3 = this.f42397c;
        if (i3 != -1) {
            this.f42397c = i3 - 1;
        }
    }

    public final void c(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "sd");
        int i2 = this.f42397c + 1;
        this.f42397c = i2;
        if (i2 == this.f42395a.length) {
            e();
        }
        this.f42395a[i2] = serialDescriptor;
    }

    public final void d() {
        int[] iArr = this.f42396b;
        int i2 = this.f42397c;
        if (iArr[i2] == -2) {
            this.f42395a[i2] = Tombstone.f42398a;
        }
    }

    public final void e() {
        int i2 = this.f42397c * 2;
        Object[] copyOf = Arrays.copyOf(this.f42395a, i2);
        Intrinsics.h(copyOf, "copyOf(...)");
        this.f42395a = copyOf;
        int[] copyOf2 = Arrays.copyOf(this.f42396b, i2);
        Intrinsics.h(copyOf2, "copyOf(...)");
        this.f42396b = copyOf2;
    }

    public final void f(Object obj) {
        int[] iArr = this.f42396b;
        int i2 = this.f42397c;
        if (iArr[i2] != -2) {
            int i3 = i2 + 1;
            this.f42397c = i3;
            if (i3 == this.f42395a.length) {
                e();
            }
        }
        Object[] objArr = this.f42395a;
        int i4 = this.f42397c;
        objArr[i4] = obj;
        this.f42396b[i4] = -2;
    }

    public final void g(int i2) {
        this.f42396b[this.f42397c] = i2;
    }

    public String toString() {
        return a();
    }
}
