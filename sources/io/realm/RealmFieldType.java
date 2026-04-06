package io.realm;

public enum RealmFieldType {
    INTEGER(0),
    BOOLEAN(1),
    STRING(2),
    BINARY(4),
    DATE(8),
    FLOAT(9),
    DOUBLE(10),
    OBJECT(12),
    DECIMAL128(11),
    OBJECT_ID(15),
    UUID(17),
    MIXED(6),
    TYPED_LINK(16),
    LIST(13),
    LINKING_OBJECTS(14),
    INTEGER_LIST(128),
    BOOLEAN_LIST(129),
    STRING_LIST(130),
    BINARY_LIST(132),
    DATE_LIST(136),
    FLOAT_LIST(137),
    DOUBLE_LIST(138),
    DECIMAL128_LIST(139),
    OBJECT_ID_LIST(143),
    UUID_LIST(145),
    MIXED_LIST(134),
    STRING_TO_INTEGER_MAP(512),
    STRING_TO_BOOLEAN_MAP(513),
    STRING_TO_STRING_MAP(514),
    STRING_TO_BINARY_MAP(516),
    STRING_TO_DATE_MAP(520),
    STRING_TO_FLOAT_MAP(521),
    STRING_TO_DOUBLE_MAP(522),
    STRING_TO_DECIMAL128_MAP(523),
    STRING_TO_OBJECT_ID_MAP(527),
    STRING_TO_UUID_MAP(529),
    STRING_TO_MIXED_MAP(518),
    STRING_TO_LINK_MAP(524),
    INTEGER_SET(256),
    BOOLEAN_SET(257),
    STRING_SET(258),
    BINARY_SET(260),
    DATE_SET(264),
    FLOAT_SET(265),
    DOUBLE_SET(266),
    DECIMAL128_SET(267),
    OBJECT_ID_SET(271),
    UUID_SET(273),
    LINK_SET(268),
    MIXED_SET(262);
    
    private static final RealmFieldType[] basicTypes = null;
    private static final RealmFieldType[] listTypes = null;
    private static final RealmFieldType[] mapTypes = null;
    private static final RealmFieldType[] setTypes = null;
    private final int nativeValue;

    static {
        basicTypes = new RealmFieldType[18];
        listTypes = new RealmFieldType[18];
        mapTypes = new RealmFieldType[18];
        setTypes = new RealmFieldType[18];
        for (RealmFieldType realmFieldType : values()) {
            int i2 = realmFieldType.nativeValue;
            if (i2 < 128) {
                basicTypes[i2] = realmFieldType;
            } else if (i2 < 256) {
                listTypes[i2 - 128] = realmFieldType;
            } else {
                if (i2 < 512) {
                    setTypes[i2 - 256] = realmFieldType;
                } else {
                    mapTypes[i2 - 512] = realmFieldType;
                }
            }
        }
    }

    private RealmFieldType(int i2) {
        this.nativeValue = i2;
    }

    public static RealmFieldType fromNativeValue(int i2) {
        RealmFieldType realmFieldType;
        RealmFieldType realmFieldType2;
        RealmFieldType realmFieldType3;
        RealmFieldType realmFieldType4;
        if (i2 >= 0) {
            RealmFieldType[] realmFieldTypeArr = basicTypes;
            if (i2 < realmFieldTypeArr.length && (realmFieldType4 = realmFieldTypeArr[i2]) != null) {
                return realmFieldType4;
            }
        }
        if (128 <= i2 && i2 < 256) {
            int i3 = i2 - 128;
            RealmFieldType[] realmFieldTypeArr2 = listTypes;
            if (i3 < realmFieldTypeArr2.length && (realmFieldType3 = realmFieldTypeArr2[i3]) != null) {
                return realmFieldType3;
            }
        }
        if (256 <= i2 && i2 < 512) {
            int i4 = i2 - 256;
            RealmFieldType[] realmFieldTypeArr3 = setTypes;
            if (i4 < realmFieldTypeArr3.length && (realmFieldType2 = realmFieldTypeArr3[i4]) != null) {
                return realmFieldType2;
            }
        }
        if (512 <= i2) {
            int i5 = i2 - 512;
            RealmFieldType[] realmFieldTypeArr4 = mapTypes;
            if (i5 < realmFieldTypeArr4.length && (realmFieldType = realmFieldTypeArr4[i5]) != null) {
                return realmFieldType;
            }
        }
        throw new IllegalArgumentException("Invalid native Realm type: " + i2);
    }

    public int getNativeValue() {
        return this.nativeValue;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isValid(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.nativeValue
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0067
            if (r0 == r1) goto L_0x0064
            r3 = 2
            if (r0 == r3) goto L_0x0061
            r3 = 4
            if (r0 == r3) goto L_0x0056
            r1 = 6
            if (r0 == r1) goto L_0x0053
            switch(r0) {
                case 6: goto L_0x0053;
                case 17: goto L_0x0050;
                case 132: goto L_0x004f;
                case 134: goto L_0x004f;
                case 143: goto L_0x004f;
                case 145: goto L_0x004f;
                case 260: goto L_0x004f;
                case 262: goto L_0x004f;
                case 271: goto L_0x004f;
                case 273: goto L_0x004f;
                case 516: goto L_0x004f;
                case 518: goto L_0x004f;
                case 527: goto L_0x004f;
                case 529: goto L_0x004f;
                default: goto L_0x0014;
            }
        L_0x0014:
            switch(r0) {
                case 8: goto L_0x004c;
                case 9: goto L_0x0049;
                case 10: goto L_0x0046;
                case 11: goto L_0x0043;
                case 12: goto L_0x004f;
                case 13: goto L_0x004f;
                case 14: goto L_0x004f;
                case 15: goto L_0x0040;
                default: goto L_0x0017;
            }
        L_0x0017:
            switch(r0) {
                case 128: goto L_0x004f;
                case 129: goto L_0x004f;
                case 130: goto L_0x004f;
                default: goto L_0x001a;
            }
        L_0x001a:
            switch(r0) {
                case 136: goto L_0x004f;
                case 137: goto L_0x004f;
                case 138: goto L_0x004f;
                case 139: goto L_0x004f;
                default: goto L_0x001d;
            }
        L_0x001d:
            switch(r0) {
                case 256: goto L_0x004f;
                case 257: goto L_0x004f;
                case 258: goto L_0x004f;
                default: goto L_0x0020;
            }
        L_0x0020:
            switch(r0) {
                case 264: goto L_0x004f;
                case 265: goto L_0x004f;
                case 266: goto L_0x004f;
                case 267: goto L_0x004f;
                case 268: goto L_0x004f;
                default: goto L_0x0023;
            }
        L_0x0023:
            switch(r0) {
                case 512: goto L_0x004f;
                case 513: goto L_0x004f;
                case 514: goto L_0x004f;
                default: goto L_0x0026;
            }
        L_0x0026:
            switch(r0) {
                case 520: goto L_0x004f;
                case 521: goto L_0x004f;
                case 522: goto L_0x004f;
                case 523: goto L_0x004f;
                case 524: goto L_0x004f;
                default: goto L_0x0029;
            }
        L_0x0029:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported Realm type:  "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0040:
            boolean r5 = r5 instanceof org.bson.types.ObjectId
            return r5
        L_0x0043:
            boolean r5 = r5 instanceof org.bson.types.Decimal128
            return r5
        L_0x0046:
            boolean r5 = r5 instanceof java.lang.Double
            return r5
        L_0x0049:
            boolean r5 = r5 instanceof java.lang.Float
            return r5
        L_0x004c:
            boolean r5 = r5 instanceof java.util.Date
            return r5
        L_0x004f:
            return r2
        L_0x0050:
            boolean r5 = r5 instanceof java.util.UUID
            return r5
        L_0x0053:
            boolean r5 = r5 instanceof io.realm.RealmAny
            return r5
        L_0x0056:
            boolean r0 = r5 instanceof byte[]
            if (r0 != 0) goto L_0x0060
            boolean r5 = r5 instanceof java.nio.ByteBuffer
            if (r5 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r1 = r2
        L_0x0060:
            return r1
        L_0x0061:
            boolean r5 = r5 instanceof java.lang.String
            return r5
        L_0x0064:
            boolean r5 = r5 instanceof java.lang.Boolean
            return r5
        L_0x0067:
            boolean r0 = r5 instanceof java.lang.Long
            if (r0 != 0) goto L_0x0079
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x0079
            boolean r0 = r5 instanceof java.lang.Short
            if (r0 != 0) goto L_0x0079
            boolean r5 = r5 instanceof java.lang.Byte
            if (r5 == 0) goto L_0x0078
            goto L_0x0079
        L_0x0078:
            r1 = r2
        L_0x0079:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.RealmFieldType.isValid(java.lang.Object):boolean");
    }
}
