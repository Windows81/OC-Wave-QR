package com.google.android.gms.common.data;

import com.google.android.gms.common.api.Releasable;
import java.io.Closeable;

public interface DataBuffer<T> extends Iterable<T>, Releasable, Closeable {
    Object get(int i2);

    int getCount();
}
