package androidx.emoji2.text.flatbuffer;

import java.util.Comparator;

public class FlexBuffersBuilder {

    /* renamed from: a  reason: collision with root package name */
    public final ReadWriteBuf f21385a;

    /* renamed from: androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$1  reason: invalid class name */
    public class AnonymousClass1 implements Comparator<Value> {

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ FlexBuffersBuilder f21386z;

        /* renamed from: a */
        public int compare(Value value, Value value2) {
            byte b2;
            byte b3;
            int i2 = value.f21387a;
            int i3 = value2.f21387a;
            do {
                b2 = this.f21386z.f21385a.get(i2);
                b3 = this.f21386z.f21385a.get(i3);
                if (b2 == 0) {
                    return b2 - b3;
                }
                i2++;
                i3++;
            } while (b2 == b3);
            return b2 - b3;
        }
    }

    public static class Value {

        /* renamed from: a  reason: collision with root package name */
        public int f21387a;
    }
}
