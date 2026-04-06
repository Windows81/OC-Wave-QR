package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Objects {

    public static final class ToStringHelper {

        /* renamed from: a  reason: collision with root package name */
        public final List f24900a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final Object f24901b;

        public /* synthetic */ ToStringHelper(Object obj, zzai zzai) {
            Preconditions.m(obj);
            this.f24901b = obj;
        }

        public ToStringHelper a(String str, Object obj) {
            Preconditions.m(str);
            String valueOf = String.valueOf(obj);
            this.f24900a.add(str + "=" + valueOf);
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f24901b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f24900a.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append((String) this.f24900a.get(i2));
                if (i2 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static ToStringHelper c(Object obj) {
        return new ToStringHelper(obj, (zzai) null);
    }
}
