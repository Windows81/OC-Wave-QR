package io.realm.internal;

import io.realm.exceptions.RealmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class ColumnIndices {

    /* renamed from: a  reason: collision with root package name */
    public final Map f40111a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map f40112b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final RealmProxyMediator f40113c;

    /* renamed from: d  reason: collision with root package name */
    public final OsSchemaInfo f40114d;

    public ColumnIndices(RealmProxyMediator realmProxyMediator, OsSchemaInfo osSchemaInfo) {
        this.f40113c = realmProxyMediator;
        this.f40114d = osSchemaInfo;
    }

    public ColumnInfo a(Class cls) {
        ColumnInfo columnInfo = (ColumnInfo) this.f40111a.get(cls);
        if (columnInfo != null) {
            return columnInfo;
        }
        ColumnInfo d2 = this.f40113c.d(cls, this.f40114d);
        this.f40111a.put(cls, d2);
        return d2;
    }

    public ColumnInfo b(String str) {
        ColumnInfo columnInfo = (ColumnInfo) this.f40112b.get(str);
        if (columnInfo == null) {
            Iterator it = this.f40113c.j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Class cls = (Class) it.next();
                if (this.f40113c.l(cls).equals(str)) {
                    columnInfo = a(cls);
                    this.f40112b.put(str, columnInfo);
                    break;
                }
            }
        }
        if (columnInfo != null) {
            return columnInfo;
        }
        throw new RealmException(String.format(Locale.US, "'%s' doesn't exist in current schema.", new Object[]{str}));
    }

    public void c() {
        for (Map.Entry entry : this.f40111a.entrySet()) {
            ((ColumnInfo) entry.getValue()).c(this.f40113c.d((Class) entry.getKey(), this.f40114d));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ColumnIndices[");
        boolean z2 = false;
        for (Map.Entry entry : this.f40111a.entrySet()) {
            if (z2) {
                sb.append(",");
            }
            sb.append(((Class) entry.getKey()).getSimpleName());
            sb.append("->");
            sb.append(entry.getValue());
            z2 = true;
        }
        sb.append("]");
        return sb.toString();
    }
}
