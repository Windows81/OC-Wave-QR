package com.google.android.gms.internal.common;

import java.io.IOException;
import java.util.Iterator;

final class zzv implements Iterable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzx f25295A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CharSequence f25296z;

    public final Iterator iterator() {
        return this.f25295A.d(this.f25296z);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                sb.append(zzq.a(it.next(), ", "));
                while (it.hasNext()) {
                    sb.append(", ");
                    sb.append(zzq.a(it.next(), ", "));
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
