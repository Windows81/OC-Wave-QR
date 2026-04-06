package io.realm;

import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public class RealmAny {

    /* renamed from: a  reason: collision with root package name */
    public final RealmAnyOperator f39944a;

    public enum Type {
        INTEGER(RealmFieldType.INTEGER, Long.class),
        BOOLEAN(RealmFieldType.BOOLEAN, Boolean.class),
        STRING(RealmFieldType.STRING, String.class),
        BINARY(RealmFieldType.BINARY, Byte[].class),
        DATE(RealmFieldType.DATE, Date.class),
        FLOAT(RealmFieldType.FLOAT, Float.class),
        DOUBLE(RealmFieldType.DOUBLE, Double.class),
        DECIMAL128(RealmFieldType.DECIMAL128, Decimal128.class),
        OBJECT_ID(RealmFieldType.OBJECT_ID, ObjectId.class),
        OBJECT(RealmFieldType.TYPED_LINK, RealmModel.class),
        UUID(RealmFieldType.UUID, UUID.class),
        NULL((String) null, (int) null);
        
        public static final Type[] N = null;

        /* renamed from: A  reason: collision with root package name */
        public final RealmFieldType f39946A;

        /* renamed from: z  reason: collision with root package name */
        public final Class f39947z;

        static {
            int i2;
            N = new Type[19];
            for (Type type : values()) {
                if (type != NULL) {
                    N[type.f39946A.getNativeValue()] = type;
                }
            }
            N[RealmFieldType.OBJECT.getNativeValue()] = OBJECT;
        }

        /* access modifiers changed from: public */
        Type(RealmFieldType realmFieldType, Class cls) {
            this.f39946A = realmFieldType;
            this.f39947z = cls;
        }

        public static Type d(int i2) {
            return i2 == -1 ? NULL : N[i2];
        }

        public Class f() {
            return this.f39947z;
        }
    }

    public RealmAny(RealmAnyOperator realmAnyOperator) {
        this.f39944a = realmAnyOperator;
    }

    public static RealmAny f() {
        return new RealmAny(new NullRealmAnyOperator());
    }

    public static RealmAny g(RealmModel realmModel) {
        return new RealmAny(realmModel == null ? new NullRealmAnyOperator() : new RealmModelOperator(realmModel));
    }

    public static RealmAny h(Boolean bool) {
        return new RealmAny(bool == null ? new NullRealmAnyOperator() : new BooleanRealmAnyOperator(bool));
    }

    public static RealmAny i(Integer num) {
        return new RealmAny(num == null ? new NullRealmAnyOperator() : new IntegerRealmAnyOperator(num));
    }

    public static RealmAny j(String str) {
        return new RealmAny(str == null ? new NullRealmAnyOperator() : new StringRealmAnyOperator(str));
    }

    public RealmModel a(Class cls) {
        return (RealmModel) this.f39944a.h(cls);
    }

    public void b(BaseRealm baseRealm) {
        this.f39944a.a(baseRealm);
    }

    public final long c() {
        return this.f39944a.d();
    }

    public Type d() {
        return this.f39944a.f();
    }

    public Class e() {
        return this.f39944a.g();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RealmAny)) {
            return false;
        }
        return this.f39944a.equals(((RealmAny) obj).f39944a);
    }

    public final int hashCode() {
        return this.f39944a.hashCode();
    }

    public String toString() {
        return this.f39944a.toString();
    }
}
