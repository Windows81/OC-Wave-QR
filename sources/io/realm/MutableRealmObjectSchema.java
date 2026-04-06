package io.realm;

import io.realm.RealmObjectSchema;
import io.realm.internal.Table;

class MutableRealmObjectSchema extends RealmObjectSchema {

    /* renamed from: io.realm.MutableRealmObjectSchema$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f39909a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.realm.RealmFieldType[] r0 = io.realm.RealmFieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f39909a = r0
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f39909a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DATE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.realm.MutableRealmObjectSchema.AnonymousClass1.<clinit>():void");
        }
    }

    public MutableRealmObjectSchema(BaseRealm baseRealm, RealmSchema realmSchema, Table table) {
        super(baseRealm, realmSchema, table, new RealmObjectSchema.DynamicColumnIndices(table));
    }

    public RealmObjectSchema g(String str) {
        this.f40041b.l();
        RealmObjectSchema.b(str);
        a(str);
        long d2 = d(str);
        if (this.f40042c.r(d2)) {
            this.f40042c.w(d2);
            return this;
        }
        throw new IllegalStateException("Field is not indexed: " + str);
    }
}
