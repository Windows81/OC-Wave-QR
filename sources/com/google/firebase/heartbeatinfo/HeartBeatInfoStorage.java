package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.content.SharedPreferences;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class HeartBeatInfoStorage {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f30762a;

    public HeartBeatInfoStorage(Context context, String str) {
        this.f30762a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public final synchronized void a() {
        try {
            long j2 = this.f30762a.getLong("fire-count", 0);
            String str = "";
            String str2 = null;
            for (Map.Entry next : this.f30762a.getAll().entrySet()) {
                if (next.getValue() instanceof Set) {
                    for (String str3 : (Set) next.getValue()) {
                        if (str2 != null) {
                            if (str2.compareTo(str3) > 0) {
                            }
                        }
                        str = (String) next.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f30762a.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.f30762a.edit().putStringSet(str, hashSet).putLong("fire-count", j2 - 1).commit();
        } finally {
            while (true) {
            }
        }
    }

    public synchronized void b() {
        try {
            SharedPreferences.Editor edit = this.f30762a.edit();
            int i2 = 0;
            for (Map.Entry next : this.f30762a.getAll().entrySet()) {
                if (next.getValue() instanceof Set) {
                    String d2 = d(System.currentTimeMillis());
                    String str = (String) next.getKey();
                    if (((Set) next.getValue()).contains(d2)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(d2);
                        i2++;
                        edit.putStringSet(str, hashSet);
                    } else {
                        edit.remove(str);
                    }
                }
            }
            if (i2 == 0) {
                edit.remove("fire-count");
            } else {
                edit.putLong("fire-count", (long) i2);
            }
            edit.commit();
        } finally {
            while (true) {
            }
        }
    }

    public synchronized List c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry next : this.f30762a.getAll().entrySet()) {
                if (next.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) next.getValue());
                    hashSet.remove(d(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(HeartBeatResult.a((String) next.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            h(System.currentTimeMillis());
        } finally {
            while (true) {
            }
        }
        return arrayList;
    }

    public final synchronized String d(long j2) {
        return new Date(j2).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public final synchronized String e(String str) {
        for (Map.Entry next : this.f30762a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                for (String equals : (Set) next.getValue()) {
                    if (str.equals(equals)) {
                        return (String) next.getKey();
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void f(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = r4.e(r5)     // Catch:{ all -> 0x0030 }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r4)
            return
        L_0x0009:
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0030 }
            android.content.SharedPreferences r2 = r4.f30762a     // Catch:{ all -> 0x0030 }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x0030 }
            r3.<init>()     // Catch:{ all -> 0x0030 }
            java.util.Set r2 = r2.getStringSet(r0, r3)     // Catch:{ all -> 0x0030 }
            r1.<init>(r2)     // Catch:{ all -> 0x0030 }
            r1.remove(r5)     // Catch:{ all -> 0x0030 }
            boolean r5 = r1.isEmpty()     // Catch:{ all -> 0x0030 }
            if (r5 == 0) goto L_0x0032
            android.content.SharedPreferences r5 = r4.f30762a     // Catch:{ all -> 0x0030 }
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch:{ all -> 0x0030 }
            android.content.SharedPreferences$Editor r5 = r5.remove(r0)     // Catch:{ all -> 0x0030 }
            r5.commit()     // Catch:{ all -> 0x0030 }
            goto L_0x003f
        L_0x0030:
            r5 = move-exception
            goto L_0x0041
        L_0x0032:
            android.content.SharedPreferences r5 = r4.f30762a     // Catch:{ all -> 0x0030 }
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch:{ all -> 0x0030 }
            android.content.SharedPreferences$Editor r5 = r5.putStringSet(r0, r1)     // Catch:{ all -> 0x0030 }
            r5.commit()     // Catch:{ all -> 0x0030 }
        L_0x003f:
            monitor-exit(r4)
            return
        L_0x0041:
            monitor-exit(r4)     // Catch:{ all -> 0x0030 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.heartbeatinfo.HeartBeatInfoStorage.f(java.lang.String):void");
    }

    public synchronized void g(long j2, String str) {
        String d2 = d(j2);
        if (this.f30762a.getString("last-used-date", "").equals(d2)) {
            String e2 = e(d2);
            if (e2 != null) {
                if (!e2.equals(str)) {
                    i(str, d2);
                    return;
                }
                return;
            }
            return;
        }
        long j3 = this.f30762a.getLong("fire-count", 0);
        if (j3 + 1 == 30) {
            a();
            j3 = this.f30762a.getLong("fire-count", 0);
        }
        HashSet hashSet = new HashSet(this.f30762a.getStringSet(str, new HashSet()));
        hashSet.add(d2);
        this.f30762a.edit().putStringSet(str, hashSet).putLong("fire-count", j3 + 1).putString("last-used-date", d2).commit();
    }

    public synchronized void h(long j2) {
        this.f30762a.edit().putLong("fire-global", j2).commit();
    }

    public final synchronized void i(String str, String str2) {
        f(str2);
        HashSet hashSet = new HashSet(this.f30762a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f30762a.edit().putStringSet(str, hashSet).commit();
    }
}
