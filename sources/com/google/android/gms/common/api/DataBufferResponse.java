package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataBuffer;
import java.util.Iterator;

public class DataBufferResponse<T, R extends AbstractDataBuffer<T> & Result> extends Response<R> implements DataBuffer<T> {
    public final void close() {
        ((AbstractDataBuffer) m()).close();
    }

    public final void g() {
        ((AbstractDataBuffer) m()).g();
    }

    public final Object get(int i2) {
        return ((AbstractDataBuffer) m()).get(i2);
    }

    public final int getCount() {
        return ((AbstractDataBuffer) m()).getCount();
    }

    public final Iterator iterator() {
        return ((AbstractDataBuffer) m()).iterator();
    }
}
