package io.realm;

import io.realm.RealmAny;
import io.realm.exceptions.RealmException;
import io.realm.internal.core.NativeRealmAny;

public abstract class RealmAnyOperator {

    /* renamed from: a  reason: collision with root package name */
    public NativeRealmAny f39948a;

    /* renamed from: b  reason: collision with root package name */
    public RealmAny.Type f39949b;

    /* renamed from: io.realm.RealmAnyOperator$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f39950a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                io.realm.RealmAny$Type[] r0 = io.realm.RealmAny.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f39950a = r0
                io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.INTEGER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f39950a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f39950a     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f39950a     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.BINARY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f39950a     // Catch:{ NoSuchFieldError -> 0x003e }
                io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.DATE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f39950a     // Catch:{ NoSuchFieldError -> 0x0049 }
                io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.FLOAT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f39950a     // Catch:{ NoSuchFieldError -> 0x0054 }
                io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f39950a     // Catch:{ NoSuchFieldError -> 0x0060 }
                io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.DECIMAL128     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f39950a     // Catch:{ NoSuchFieldError -> 0x006c }
                io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.OBJECT_ID     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f39950a     // Catch:{ NoSuchFieldError -> 0x0078 }
                io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.UUID     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f39950a     // Catch:{ NoSuchFieldError -> 0x0084 }
                io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.OBJECT     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f39950a     // Catch:{ NoSuchFieldError -> 0x0090 }
                io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.NULL     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.realm.RealmAnyOperator.AnonymousClass1.<clinit>():void");
        }
    }

    public RealmAnyOperator(RealmAny.Type type) {
        this.f39949b = type;
    }

    public static RealmAnyOperator c(BaseRealm baseRealm, NativeRealmAny nativeRealmAny) {
        RealmAny.Type type = nativeRealmAny.getType();
        switch (AnonymousClass1.f39950a[type.ordinal()]) {
            case 1:
                return new IntegerRealmAnyOperator(nativeRealmAny);
            case 2:
                return new BooleanRealmAnyOperator(nativeRealmAny);
            case 3:
                return new StringRealmAnyOperator(nativeRealmAny);
            case 4:
                return new BinaryRealmAnyOperator(nativeRealmAny);
            case 5:
                return new DateRealmAnyOperator(nativeRealmAny);
            case 6:
                return new FloatRealmAnyOperator(nativeRealmAny);
            case 7:
                return new DoubleRealmAnyOperator(nativeRealmAny);
            case 8:
                return new Decimal128RealmAnyOperator(nativeRealmAny);
            case 9:
                return new ObjectIdRealmAnyOperator(nativeRealmAny);
            case 10:
                return new UUIDRealmAnyOperator(nativeRealmAny);
            case 11:
                if (baseRealm instanceof Realm) {
                    try {
                        return new RealmModelOperator(baseRealm, nativeRealmAny, nativeRealmAny.getModelClass(baseRealm.D, baseRealm.f39852B.o()));
                    } catch (RealmException unused) {
                    }
                }
                return new DynamicRealmModelRealmAnyOperator(baseRealm, nativeRealmAny);
            case 12:
                return new NullRealmAnyOperator(nativeRealmAny);
            default:
                throw new ClassCastException("Couldn't cast to " + type);
        }
    }

    public void a(BaseRealm baseRealm) {
    }

    public abstract NativeRealmAny b();

    public long d() {
        return e().getNativePtr();
    }

    public final synchronized NativeRealmAny e() {
        try {
            if (this.f39948a == null) {
                this.f39948a = b();
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.f39948a;
    }

    public RealmAny.Type f() {
        return this.f39949b;
    }

    public Class g() {
        return this.f39949b.f();
    }

    public abstract Object h(Class cls);

    public RealmAnyOperator(RealmAny.Type type, NativeRealmAny nativeRealmAny) {
        this.f39949b = type;
        this.f39948a = nativeRealmAny;
    }
}
