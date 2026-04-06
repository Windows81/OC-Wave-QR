package io.realm;

import io.realm.internal.ColumnInfo;
import io.realm.internal.Table;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public abstract class RealmObjectSchema {

    /* renamed from: e  reason: collision with root package name */
    public static final Map f40036e;

    /* renamed from: f  reason: collision with root package name */
    public static final Map f40037f;

    /* renamed from: g  reason: collision with root package name */
    public static final Map f40038g;

    /* renamed from: h  reason: collision with root package name */
    public static final Map f40039h;

    /* renamed from: a  reason: collision with root package name */
    public final RealmSchema f40040a;

    /* renamed from: b  reason: collision with root package name */
    public final BaseRealm f40041b;

    /* renamed from: c  reason: collision with root package name */
    public final Table f40042c;

    /* renamed from: d  reason: collision with root package name */
    public final ColumnInfo f40043d;

    public static final class DynamicColumnIndices extends ColumnInfo {

        /* renamed from: e  reason: collision with root package name */
        public final Table f40044e;

        public DynamicColumnIndices(Table table) {
            super((ColumnInfo) null, false);
            this.f40044e = table;
        }

        public void b(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            throw new UnsupportedOperationException("DynamicColumnIndices cannot copy");
        }

        public void c(ColumnInfo columnInfo) {
            throw new UnsupportedOperationException("DynamicColumnIndices cannot be copied");
        }
    }

    public static final class FieldMetaData {

        /* renamed from: a  reason: collision with root package name */
        public final RealmFieldType f40045a;

        /* renamed from: b  reason: collision with root package name */
        public final RealmFieldType f40046b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f40047c;

        public FieldMetaData(RealmFieldType realmFieldType, RealmFieldType realmFieldType2, boolean z2) {
            this.f40045a = realmFieldType;
            this.f40046b = realmFieldType2;
            this.f40047c = z2;
        }
    }

    public interface Function {
    }

    static {
        HashMap hashMap = new HashMap();
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        Class<String> cls = String.class;
        hashMap.put(cls, new FieldMetaData(realmFieldType, RealmFieldType.STRING_LIST, true));
        Class cls2 = Short.TYPE;
        RealmFieldType realmFieldType2 = RealmFieldType.INTEGER;
        RealmFieldType realmFieldType3 = RealmFieldType.INTEGER_LIST;
        hashMap.put(cls2, new FieldMetaData(realmFieldType2, realmFieldType3, false));
        Class<Short> cls3 = Short.class;
        hashMap.put(cls3, new FieldMetaData(realmFieldType2, realmFieldType3, true));
        Class cls4 = Integer.TYPE;
        hashMap.put(cls4, new FieldMetaData(realmFieldType2, realmFieldType3, false));
        Class<Integer> cls5 = Integer.class;
        hashMap.put(cls5, new FieldMetaData(realmFieldType2, realmFieldType3, true));
        Class cls6 = Long.TYPE;
        hashMap.put(cls6, new FieldMetaData(realmFieldType2, realmFieldType3, false));
        Class<Long> cls7 = Long.class;
        hashMap.put(cls7, new FieldMetaData(realmFieldType2, realmFieldType3, true));
        Class cls8 = Float.TYPE;
        RealmFieldType realmFieldType4 = RealmFieldType.FLOAT;
        RealmFieldType realmFieldType5 = RealmFieldType.FLOAT_LIST;
        hashMap.put(cls8, new FieldMetaData(realmFieldType4, realmFieldType5, false));
        FieldMetaData fieldMetaData = new FieldMetaData(realmFieldType4, realmFieldType5, true);
        Class<Float> cls9 = Float.class;
        hashMap.put(cls9, fieldMetaData);
        Class cls10 = Double.TYPE;
        Class<Float> cls11 = cls9;
        RealmFieldType realmFieldType6 = RealmFieldType.DOUBLE;
        Class cls12 = cls8;
        RealmFieldType realmFieldType7 = RealmFieldType.DOUBLE_LIST;
        RealmFieldType realmFieldType8 = realmFieldType4;
        hashMap.put(cls10, new FieldMetaData(realmFieldType6, realmFieldType7, false));
        FieldMetaData fieldMetaData2 = new FieldMetaData(realmFieldType6, realmFieldType7, true);
        Class<Double> cls13 = Double.class;
        hashMap.put(cls13, fieldMetaData2);
        Class cls14 = Boolean.TYPE;
        Class<Double> cls15 = cls13;
        RealmFieldType realmFieldType9 = RealmFieldType.BOOLEAN;
        Class cls16 = cls10;
        RealmFieldType realmFieldType10 = RealmFieldType.BOOLEAN_LIST;
        RealmFieldType realmFieldType11 = realmFieldType6;
        hashMap.put(cls14, new FieldMetaData(realmFieldType9, realmFieldType10, false));
        FieldMetaData fieldMetaData3 = new FieldMetaData(realmFieldType9, realmFieldType10, true);
        Class<Boolean> cls17 = Boolean.class;
        hashMap.put(cls17, fieldMetaData3);
        Class cls18 = Byte.TYPE;
        Class<Boolean> cls19 = cls17;
        hashMap.put(cls18, new FieldMetaData(realmFieldType2, realmFieldType3, false));
        FieldMetaData fieldMetaData4 = new FieldMetaData(realmFieldType2, realmFieldType3, true);
        Class<Byte> cls20 = Byte.class;
        hashMap.put(cls20, fieldMetaData4);
        Class<Byte> cls21 = cls20;
        RealmFieldType realmFieldType12 = RealmFieldType.BINARY;
        Class cls22 = cls18;
        Class<byte[]> cls23 = byte[].class;
        hashMap.put(cls23, new FieldMetaData(realmFieldType12, RealmFieldType.BINARY_LIST, true));
        Class<byte[]> cls24 = cls23;
        RealmFieldType realmFieldType13 = RealmFieldType.DATE;
        RealmFieldType realmFieldType14 = realmFieldType12;
        Class<Date> cls25 = Date.class;
        hashMap.put(cls25, new FieldMetaData(realmFieldType13, RealmFieldType.DATE_LIST, true));
        Class<Date> cls26 = cls25;
        RealmFieldType realmFieldType15 = RealmFieldType.OBJECT_ID;
        RealmFieldType realmFieldType16 = realmFieldType13;
        Class<ObjectId> cls27 = ObjectId.class;
        hashMap.put(cls27, new FieldMetaData(realmFieldType15, RealmFieldType.OBJECT_ID_LIST, true));
        Class<ObjectId> cls28 = cls27;
        RealmFieldType realmFieldType17 = RealmFieldType.DECIMAL128;
        RealmFieldType realmFieldType18 = realmFieldType15;
        Class<Decimal128> cls29 = Decimal128.class;
        hashMap.put(cls29, new FieldMetaData(realmFieldType17, RealmFieldType.DECIMAL128_LIST, true));
        Class<Decimal128> cls30 = cls29;
        RealmFieldType realmFieldType19 = RealmFieldType.UUID;
        RealmFieldType realmFieldType20 = realmFieldType17;
        Class<UUID> cls31 = UUID.class;
        hashMap.put(cls31, new FieldMetaData(realmFieldType19, RealmFieldType.UUID_LIST, true));
        Class<UUID> cls32 = cls31;
        RealmFieldType realmFieldType21 = RealmFieldType.MIXED;
        RealmFieldType realmFieldType22 = realmFieldType19;
        Class<RealmAny> cls33 = RealmAny.class;
        hashMap.put(cls33, new FieldMetaData(realmFieldType21, RealmFieldType.MIXED_LIST, true));
        f40036e = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        Class<RealmAny> cls34 = cls33;
        hashMap2.put(cls, new FieldMetaData(realmFieldType, RealmFieldType.STRING_TO_STRING_MAP, true));
        RealmFieldType realmFieldType23 = RealmFieldType.STRING_TO_INTEGER_MAP;
        hashMap2.put(cls2, new FieldMetaData(realmFieldType2, realmFieldType23, false));
        hashMap2.put(cls3, new FieldMetaData(realmFieldType2, realmFieldType23, true));
        hashMap2.put(cls4, new FieldMetaData(realmFieldType2, realmFieldType23, false));
        hashMap2.put(cls5, new FieldMetaData(realmFieldType2, realmFieldType23, true));
        hashMap2.put(cls6, new FieldMetaData(realmFieldType2, realmFieldType23, false));
        hashMap2.put(cls7, new FieldMetaData(realmFieldType2, realmFieldType23, true));
        RealmFieldType realmFieldType24 = RealmFieldType.STRING_TO_FLOAT_MAP;
        Class<Long> cls35 = cls7;
        RealmFieldType realmFieldType25 = realmFieldType8;
        Class cls36 = cls6;
        RealmFieldType realmFieldType26 = realmFieldType25;
        hashMap2.put(cls12, new FieldMetaData(realmFieldType26, realmFieldType24, false));
        hashMap2.put(cls11, new FieldMetaData(realmFieldType26, realmFieldType24, true));
        RealmFieldType realmFieldType27 = RealmFieldType.STRING_TO_DOUBLE_MAP;
        RealmFieldType realmFieldType28 = realmFieldType11;
        RealmFieldType realmFieldType29 = realmFieldType26;
        RealmFieldType realmFieldType30 = realmFieldType28;
        hashMap2.put(cls16, new FieldMetaData(realmFieldType30, realmFieldType27, false));
        hashMap2.put(cls15, new FieldMetaData(realmFieldType30, realmFieldType27, true));
        RealmFieldType realmFieldType31 = RealmFieldType.STRING_TO_BOOLEAN_MAP;
        hashMap2.put(cls14, new FieldMetaData(realmFieldType9, realmFieldType31, false));
        hashMap2.put(cls19, new FieldMetaData(realmFieldType9, realmFieldType31, true));
        hashMap2.put(cls22, new FieldMetaData(realmFieldType2, realmFieldType23, false));
        hashMap2.put(cls21, new FieldMetaData(realmFieldType2, realmFieldType23, true));
        hashMap2.put(cls24, new FieldMetaData(realmFieldType14, RealmFieldType.STRING_TO_BINARY_MAP, true));
        hashMap2.put(cls26, new FieldMetaData(realmFieldType16, RealmFieldType.STRING_TO_DATE_MAP, true));
        hashMap2.put(cls28, new FieldMetaData(realmFieldType18, RealmFieldType.STRING_TO_OBJECT_ID_MAP, true));
        hashMap2.put(cls30, new FieldMetaData(realmFieldType20, RealmFieldType.STRING_TO_DECIMAL128_MAP, true));
        RealmFieldType realmFieldType32 = realmFieldType22;
        hashMap2.put(cls32, new FieldMetaData(realmFieldType32, RealmFieldType.STRING_TO_UUID_MAP, true));
        hashMap2.put(cls34, new FieldMetaData(realmFieldType21, RealmFieldType.STRING_TO_MIXED_MAP, true));
        f40037f = Collections.unmodifiableMap(hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(cls, new FieldMetaData(realmFieldType, RealmFieldType.STRING_SET, true));
        RealmFieldType realmFieldType33 = RealmFieldType.INTEGER_SET;
        hashMap3.put(cls2, new FieldMetaData(realmFieldType2, realmFieldType33, false));
        hashMap3.put(cls3, new FieldMetaData(realmFieldType2, realmFieldType33, true));
        hashMap3.put(cls4, new FieldMetaData(realmFieldType2, realmFieldType33, false));
        hashMap3.put(cls5, new FieldMetaData(realmFieldType2, realmFieldType33, true));
        hashMap3.put(cls36, new FieldMetaData(realmFieldType2, realmFieldType33, false));
        hashMap3.put(cls35, new FieldMetaData(realmFieldType2, realmFieldType33, true));
        RealmFieldType realmFieldType34 = RealmFieldType.FLOAT_SET;
        RealmFieldType realmFieldType35 = realmFieldType29;
        hashMap3.put(cls12, new FieldMetaData(realmFieldType35, realmFieldType34, false));
        hashMap3.put(cls11, new FieldMetaData(realmFieldType35, realmFieldType34, true));
        RealmFieldType realmFieldType36 = RealmFieldType.DOUBLE_SET;
        hashMap3.put(cls16, new FieldMetaData(realmFieldType30, realmFieldType36, false));
        hashMap3.put(cls15, new FieldMetaData(realmFieldType30, realmFieldType36, true));
        RealmFieldType realmFieldType37 = RealmFieldType.BOOLEAN_SET;
        hashMap3.put(cls14, new FieldMetaData(realmFieldType9, realmFieldType37, false));
        hashMap3.put(cls19, new FieldMetaData(realmFieldType9, realmFieldType37, true));
        hashMap3.put(cls22, new FieldMetaData(realmFieldType2, realmFieldType33, false));
        hashMap3.put(cls21, new FieldMetaData(realmFieldType2, realmFieldType33, true));
        hashMap3.put(cls24, new FieldMetaData(realmFieldType14, RealmFieldType.BINARY_SET, true));
        hashMap3.put(cls26, new FieldMetaData(realmFieldType16, RealmFieldType.DATE_SET, true));
        hashMap3.put(cls28, new FieldMetaData(realmFieldType18, RealmFieldType.OBJECT_ID_SET, true));
        hashMap3.put(cls30, new FieldMetaData(realmFieldType20, RealmFieldType.DECIMAL128_SET, true));
        hashMap3.put(cls32, new FieldMetaData(realmFieldType32, RealmFieldType.UUID_SET, true));
        hashMap3.put(cls34, new FieldMetaData(realmFieldType21, RealmFieldType.MIXED_SET, true));
        f40038g = Collections.unmodifiableMap(hashMap3);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(RealmObject.class, new FieldMetaData(RealmFieldType.OBJECT, (RealmFieldType) null, false));
        hashMap4.put(RealmList.class, new FieldMetaData(RealmFieldType.LIST, (RealmFieldType) null, false));
        hashMap4.put(RealmDictionary.class, new FieldMetaData(RealmFieldType.STRING_TO_LINK_MAP, (RealmFieldType) null, false));
        hashMap4.put(RealmSet.class, new FieldMetaData(RealmFieldType.LINK_SET, (RealmFieldType) null, false));
        f40039h = Collections.unmodifiableMap(hashMap4);
    }

    public RealmObjectSchema(BaseRealm baseRealm, RealmSchema realmSchema, Table table, ColumnInfo columnInfo) {
        this.f40040a = realmSchema;
        this.f40041b = baseRealm;
        this.f40042c = table;
        this.f40043d = columnInfo;
    }

    public static void b(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Field name can not be null or empty");
        } else if (str.contains(".")) {
            throw new IllegalArgumentException("Field name can not contain '.'");
        } else if (str.length() > 63) {
            throw new IllegalArgumentException("Field name is currently limited to max 63 characters.");
        }
    }

    public void a(String str) {
        if (this.f40042c.h(str) == -1) {
            throw new IllegalArgumentException("Field name doesn't exist on object '" + c() + "': " + str);
        }
    }

    public String c() {
        return this.f40042c.e();
    }

    public long d(String str) {
        long h2 = this.f40042c.h(str);
        if (h2 != -1) {
            return h2;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Field name '%s' does not exist on schema for '%s'", new Object[]{str, c()}));
    }

    public Table e() {
        return this.f40042c;
    }

    public boolean f() {
        return this.f40042c.s();
    }

    public abstract RealmObjectSchema g(String str);
}
