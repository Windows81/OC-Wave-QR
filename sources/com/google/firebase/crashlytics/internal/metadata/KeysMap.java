package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class KeysMap {

    /* renamed from: a  reason: collision with root package name */
    public final Map f30128a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final int f30129b;

    /* renamed from: c  reason: collision with root package name */
    public final int f30130c;

    public KeysMap(int i2, int i3) {
        this.f30129b = i2;
        this.f30130c = i3;
    }

    public static String c(String str, int i2) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.length() > i2 ? trim.substring(0, i2) : trim;
    }

    public synchronized Map a() {
        return Collections.unmodifiableMap(new HashMap(this.f30128a));
    }

    public final String b(String str) {
        if (str != null) {
            return c(str, this.f30130c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public synchronized boolean d(String str, String str2) {
        String b2 = b(str);
        if (this.f30128a.size() >= this.f30129b) {
            if (!this.f30128a.containsKey(b2)) {
                Logger f2 = Logger.f();
                f2.k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f30129b);
                return false;
            }
        }
        String c2 = c(str2, this.f30130c);
        if (CommonUtils.y((String) this.f30128a.get(b2), c2)) {
            return false;
        }
        Map map = this.f30128a;
        if (str2 == null) {
            c2 = "";
        }
        map.put(b2, c2);
        return true;
    }

    public synchronized void e(Map map) {
        try {
            int i2 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String b2 = b((String) entry.getKey());
                if (this.f30128a.size() >= this.f30129b) {
                    if (!this.f30128a.containsKey(b2)) {
                        i2++;
                    }
                }
                String str = (String) entry.getValue();
                this.f30128a.put(b2, str == null ? "" : c(str, this.f30130c));
            }
            if (i2 > 0) {
                Logger f2 = Logger.f();
                f2.k("Ignored " + i2 + " entries when adding custom keys. Maximum allowable: " + this.f30129b);
            }
        } finally {
            while (true) {
            }
        }
    }
}
