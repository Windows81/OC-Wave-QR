package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.List;

final class ListFieldSchemaLite implements ListFieldSchema {
    public static Internal.ProtobufList d(Object obj, long j2) {
        return (Internal.ProtobufList) UnsafeUtil.H(obj, j2);
    }

    public void a(Object obj, Object obj2, long j2) {
        Internal.ProtobufList d2 = d(obj, j2);
        Internal.ProtobufList d3 = d(obj2, j2);
        int size = d2.size();
        int size2 = d3.size();
        if (size > 0 && size2 > 0) {
            if (!d2.I()) {
                d2 = d2.f(size2 + size);
            }
            d2.addAll(d3);
        }
        if (size > 0) {
            d3 = d2;
        }
        UnsafeUtil.Y(obj, j2, d3);
    }

    public void b(Object obj, long j2) {
        d(obj, j2).r();
    }

    public List c(Object obj, long j2) {
        Internal.ProtobufList d2 = d(obj, j2);
        if (d2.I()) {
            return d2;
        }
        int size = d2.size();
        Internal.ProtobufList f2 = d2.f(size == 0 ? 10 : size * 2);
        UnsafeUtil.Y(obj, j2, f2);
        return f2;
    }
}
