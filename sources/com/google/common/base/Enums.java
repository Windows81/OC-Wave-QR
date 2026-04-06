package com.google.common.base;

import java.io.Serializable;
import java.util.Map;
import java.util.WeakHashMap;

@ElementTypesAreNonnullByDefault
public final class Enums {

    /* renamed from: a  reason: collision with root package name */
    public static final Map f27700a = new WeakHashMap();

    public static final class StringConverter<T extends Enum<T>> extends Converter<String, T> implements Serializable {

        /* renamed from: A  reason: collision with root package name */
        public final Class f27701A;

        public boolean equals(Object obj) {
            if (obj instanceof StringConverter) {
                return this.f27701A.equals(((StringConverter) obj).f27701A);
            }
            return false;
        }

        /* renamed from: h */
        public String d(Enum enumR) {
            return enumR.name();
        }

        public int hashCode() {
            return this.f27701A.hashCode();
        }

        /* renamed from: i */
        public Enum e(String str) {
            return Enum.valueOf(this.f27701A, str);
        }

        public String toString() {
            String name = this.f27701A.getName();
            StringBuilder sb = new StringBuilder(name.length() + 29);
            sb.append("Enums.stringConverter(");
            sb.append(name);
            sb.append(".class)");
            return sb.toString();
        }
    }
}
