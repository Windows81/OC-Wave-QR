package com.google.common.collect;

import java.util.Comparator;

public final /* synthetic */ class b implements Comparator {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Comparator f28683z;

    public /* synthetic */ b(Comparator comparator) {
        this.f28683z = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f28683z.compare(((PeekingIterator) obj).peek(), ((PeekingIterator) obj2).peek());
    }
}
