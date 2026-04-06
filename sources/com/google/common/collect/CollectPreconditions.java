package com.google.common.collect;

import com.google.common.base.Preconditions;

@ElementTypesAreNonnullByDefault
final class CollectPreconditions {
    public static void a(Object obj, Object obj2) {
        if (obj == null) {
            String valueOf = String.valueOf(obj2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 24);
            sb.append("null key in entry: null=");
            sb.append(valueOf);
            throw new NullPointerException(sb.toString());
        } else if (obj2 == null) {
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 26);
            sb2.append("null value in entry: ");
            sb2.append(valueOf2);
            sb2.append("=null");
            throw new NullPointerException(sb2.toString());
        }
    }

    public static int b(int i2, String str) {
        if (i2 >= 0) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static long c(long j2, String str) {
        if (j2 >= 0) {
            return j2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 49);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(j2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void d(int i2, String str) {
        if (i2 <= 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38);
            sb.append(str);
            sb.append(" must be positive but was: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static void e(boolean z2) {
        Preconditions.x(z2, "no calls to next() since the last call to remove()");
    }
}
