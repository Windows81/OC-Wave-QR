package io.realm.internal;

import io.realm.RealmFieldType;
import java.util.HashMap;
import java.util.Map;

public abstract class ColumnInfo {

    /* renamed from: a  reason: collision with root package name */
    public final Map f40115a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f40116b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f40117c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f40118d;

    public ColumnInfo(int i2) {
        this(i2, true);
    }

    public final long a(String str, String str2, OsObjectSchemaInfo osObjectSchemaInfo) {
        Property c2 = osObjectSchemaInfo.c(str2);
        ColumnDetails columnDetails = new ColumnDetails(c2);
        this.f40115a.put(str, columnDetails);
        this.f40116b.put(str2, columnDetails);
        this.f40117c.put(str, str2);
        return c2.c();
    }

    public abstract void b(ColumnInfo columnInfo, ColumnInfo columnInfo2);

    public void c(ColumnInfo columnInfo) {
        if (!this.f40118d) {
            throw new UnsupportedOperationException("Attempt to modify an immutable ColumnInfo");
        } else if (columnInfo != null) {
            this.f40115a.clear();
            this.f40115a.putAll(columnInfo.f40115a);
            this.f40116b.clear();
            this.f40116b.putAll(columnInfo.f40116b);
            this.f40117c.clear();
            this.f40117c.putAll(columnInfo.f40117c);
            b(columnInfo, this);
        } else {
            throw new NullPointerException("Attempt to copy null ColumnInfo");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ColumnInfo[");
        sb.append("mutable=" + this.f40118d);
        sb.append(",");
        boolean z2 = false;
        if (this.f40115a != null) {
            sb.append("JavaFieldNames=[");
            boolean z3 = false;
            for (Map.Entry entry : this.f40115a.entrySet()) {
                if (z3) {
                    sb.append(",");
                }
                sb.append((String) entry.getKey());
                sb.append("->");
                sb.append(entry.getValue());
                z3 = true;
            }
            sb.append("]");
        }
        if (this.f40116b != null) {
            sb.append(", InternalFieldNames=[");
            for (Map.Entry entry2 : this.f40116b.entrySet()) {
                if (z2) {
                    sb.append(",");
                }
                sb.append((String) entry2.getKey());
                sb.append("->");
                sb.append(entry2.getValue());
                z2 = true;
            }
            sb.append("]");
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ColumnInfo(ColumnInfo columnInfo, boolean z2) {
        this(columnInfo == null ? 0 : columnInfo.f40115a.size(), z2);
        if (columnInfo != null) {
            this.f40115a.putAll(columnInfo.f40115a);
        }
    }

    public static final class ColumnDetails {

        /* renamed from: a  reason: collision with root package name */
        public final long f40119a;

        /* renamed from: b  reason: collision with root package name */
        public final RealmFieldType f40120b;

        /* renamed from: c  reason: collision with root package name */
        public final String f40121c;

        public ColumnDetails(long j2, RealmFieldType realmFieldType, String str) {
            this.f40119a = j2;
            this.f40120b = realmFieldType;
            this.f40121c = str;
        }

        public String toString() {
            return "ColumnDetails[" + this.f40119a + ", " + this.f40120b + ", " + this.f40121c + "]";
        }

        public ColumnDetails(Property property) {
            this(property.c(), property.e(), property.d());
        }
    }

    public ColumnInfo(int i2, boolean z2) {
        this.f40115a = new HashMap(i2);
        this.f40116b = new HashMap(i2);
        this.f40117c = new HashMap(i2);
        this.f40118d = z2;
    }
}
