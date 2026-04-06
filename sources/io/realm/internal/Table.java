package io.realm.internal;

import io.realm.RealmFieldType;
import io.realm.exceptions.RealmPrimaryKeyConstraintException;

public class Table implements NativeObject {
    public static final String C;
    public static final int D;
    public static final long E = nativeGetFinalizerPtr();

    /* renamed from: A  reason: collision with root package name */
    public final NativeContext f40230A;

    /* renamed from: B  reason: collision with root package name */
    public final OsSharedRealm f40231B;

    /* renamed from: z  reason: collision with root package name */
    public final long f40232z;

    /* renamed from: io.realm.internal.Table$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f40233a;

        /* JADX WARNING: Can't wrap try/catch for region: R(88:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|(3:87|88|90)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(90:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|90) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00fc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0108 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0114 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0120 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x012c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0138 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0144 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0150 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x015c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0168 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0174 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0180 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x018c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0198 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x01a4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x01b0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x01bc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x01c8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x01d4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x01e0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x01ec */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x01f8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x0204 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                io.realm.RealmFieldType[] r0 = io.realm.RealmFieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f40233a = r0
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.INTEGER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BINARY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x003e }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DATE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x0049 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x0054 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x0060 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DECIMAL128     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x006c }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.OBJECT_ID     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x0078 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.MIXED     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x0084 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.UUID     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x0090 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.INTEGER_LIST     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x009c }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BOOLEAN_LIST     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_LIST     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BINARY_LIST     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DATE_LIST     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x00cc }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.FLOAT_LIST     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DOUBLE_LIST     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x00e4 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DECIMAL128_LIST     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x00f0 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.OBJECT_ID_LIST     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x00fc }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.UUID_LIST     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x0108 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.MIXED_LIST     // Catch:{ NoSuchFieldError -> 0x0108 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0108 }
            L_0x0108:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x0114 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_INTEGER_MAP     // Catch:{ NoSuchFieldError -> 0x0114 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0114 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0114 }
            L_0x0114:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x0120 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_BOOLEAN_MAP     // Catch:{ NoSuchFieldError -> 0x0120 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0120 }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0120 }
            L_0x0120:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x012c }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_STRING_MAP     // Catch:{ NoSuchFieldError -> 0x012c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012c }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012c }
            L_0x012c:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x0138 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_BINARY_MAP     // Catch:{ NoSuchFieldError -> 0x0138 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0138 }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0138 }
            L_0x0138:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x0144 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_DATE_MAP     // Catch:{ NoSuchFieldError -> 0x0144 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0144 }
                r2 = 27
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0144 }
            L_0x0144:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x0150 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_FLOAT_MAP     // Catch:{ NoSuchFieldError -> 0x0150 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0150 }
                r2 = 28
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0150 }
            L_0x0150:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x015c }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_DOUBLE_MAP     // Catch:{ NoSuchFieldError -> 0x015c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x015c }
                r2 = 29
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x015c }
            L_0x015c:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x0168 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_DECIMAL128_MAP     // Catch:{ NoSuchFieldError -> 0x0168 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0168 }
                r2 = 30
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0168 }
            L_0x0168:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x0174 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_OBJECT_ID_MAP     // Catch:{ NoSuchFieldError -> 0x0174 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0174 }
                r2 = 31
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0174 }
            L_0x0174:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x0180 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_UUID_MAP     // Catch:{ NoSuchFieldError -> 0x0180 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0180 }
                r2 = 32
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0180 }
            L_0x0180:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x018c }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_MIXED_MAP     // Catch:{ NoSuchFieldError -> 0x018c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x018c }
                r2 = 33
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x018c }
            L_0x018c:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x0198 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.INTEGER_SET     // Catch:{ NoSuchFieldError -> 0x0198 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0198 }
                r2 = 34
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0198 }
            L_0x0198:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x01a4 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BOOLEAN_SET     // Catch:{ NoSuchFieldError -> 0x01a4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a4 }
                r2 = 35
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01a4 }
            L_0x01a4:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x01b0 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_SET     // Catch:{ NoSuchFieldError -> 0x01b0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01b0 }
                r2 = 36
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01b0 }
            L_0x01b0:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x01bc }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BINARY_SET     // Catch:{ NoSuchFieldError -> 0x01bc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01bc }
                r2 = 37
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01bc }
            L_0x01bc:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x01c8 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DATE_SET     // Catch:{ NoSuchFieldError -> 0x01c8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01c8 }
                r2 = 38
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01c8 }
            L_0x01c8:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x01d4 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.FLOAT_SET     // Catch:{ NoSuchFieldError -> 0x01d4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01d4 }
                r2 = 39
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01d4 }
            L_0x01d4:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x01e0 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DOUBLE_SET     // Catch:{ NoSuchFieldError -> 0x01e0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01e0 }
                r2 = 40
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01e0 }
            L_0x01e0:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x01ec }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DECIMAL128_SET     // Catch:{ NoSuchFieldError -> 0x01ec }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ec }
                r2 = 41
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01ec }
            L_0x01ec:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x01f8 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.OBJECT_ID_SET     // Catch:{ NoSuchFieldError -> 0x01f8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01f8 }
                r2 = 42
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01f8 }
            L_0x01f8:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x0204 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.UUID_SET     // Catch:{ NoSuchFieldError -> 0x0204 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0204 }
                r2 = 43
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0204 }
            L_0x0204:
                int[] r0 = f40233a     // Catch:{ NoSuchFieldError -> 0x0210 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.MIXED_SET     // Catch:{ NoSuchFieldError -> 0x0210 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0210 }
                r2 = 44
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0210 }
            L_0x0210:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.realm.internal.Table.AnonymousClass1.<clinit>():void");
        }
    }

    static {
        String e2 = Util.e();
        C = e2;
        D = 63 - e2.length();
    }

    public Table(OsSharedRealm osSharedRealm, long j2) {
        NativeContext nativeContext = osSharedRealm.context;
        this.f40230A = nativeContext;
        this.f40231B = osSharedRealm;
        this.f40232z = j2;
        nativeContext.a(this);
    }

    public static void B(Object obj) {
        throw new RealmPrimaryKeyConstraintException("Value already exists: " + obj);
    }

    public static void C() {
        throw new IllegalStateException("Cannot modify managed objects outside of a write transaction.");
    }

    public static String f(String str) {
        if (str == null) {
            return null;
        }
        String str2 = C;
        return !str.startsWith(str2) ? str : str.substring(str2.length());
    }

    public static native long nativeFindFirstString(long j2, long j3, String str);

    private static native long nativeFreeze(long j2, long j3);

    private native long nativeGetColumnCount(long j2);

    private native long nativeGetColumnKey(long j2, String str);

    private native String nativeGetColumnName(long j2, long j3);

    private native String[] nativeGetColumnNames(long j2);

    private native int nativeGetColumnType(long j2, long j3);

    private static native long nativeGetFinalizerPtr();

    private native long nativeGetLinkTarget(long j2, long j3);

    private native String nativeGetName(long j2);

    private native boolean nativeHasSearchIndex(long j2, long j3);

    private static native boolean nativeIsEmbedded(long j2);

    private native boolean nativeIsValid(long j2);

    private native void nativeMoveLastOver(long j2, long j3);

    private native void nativeRemoveSearchIndex(long j2, long j3);

    public static native void nativeSetBoolean(long j2, long j3, long j4, boolean z2, boolean z3);

    public static native void nativeSetLong(long j2, long j3, long j4, long j5, boolean z2);

    public static native void nativeSetNull(long j2, long j3, long j4, boolean z2);

    public static native void nativeSetString(long j2, long j3, long j4, String str, boolean z2);

    private native long nativeSize(long j2);

    private native long nativeWhere(long j2);

    public static String o(String str) {
        if (str == null) {
            return null;
        }
        return C + str;
    }

    public long A() {
        return nativeSize(this.f40232z);
    }

    public TableQuery D() {
        return new TableQuery(this.f40230A, this, nativeWhere(this.f40232z));
    }

    public void a() {
        if (t()) {
            C();
        }
    }

    public long b(long j2, String str) {
        if (str != null) {
            return nativeFindFirstString(this.f40232z, j2, str);
        }
        throw new IllegalArgumentException("null is not supported");
    }

    public Table c(OsSharedRealm osSharedRealm) {
        if (osSharedRealm.isFrozen()) {
            return new Table(osSharedRealm, nativeFreeze(osSharedRealm.getNativePtr(), this.f40232z));
        }
        throw new IllegalArgumentException("Frozen Realm required");
    }

    public CheckedRow d(long j2) {
        return CheckedRow.e(this.f40230A, this, j2);
    }

    public String e() {
        String f2 = f(m());
        if (!Util.g(f2)) {
            return f2;
        }
        throw new IllegalStateException("This object class is no longer part of the schema for the Realm file. It is therefor not possible to access the schema name.");
    }

    public long g() {
        return nativeGetColumnCount(this.f40232z);
    }

    public long getNativeFinalizerPtr() {
        return E;
    }

    public long getNativePtr() {
        return this.f40232z;
    }

    public long h(String str) {
        if (str != null) {
            return nativeGetColumnKey(this.f40232z, str);
        }
        throw new IllegalArgumentException("Column name can not be null.");
    }

    public String i(long j2) {
        return nativeGetColumnName(this.f40232z, j2);
    }

    public String[] j() {
        return nativeGetColumnNames(this.f40232z);
    }

    public RealmFieldType k(long j2) {
        return RealmFieldType.fromNativeValue(nativeGetColumnType(this.f40232z, j2));
    }

    public Table l(long j2) {
        return new Table(this.f40231B, nativeGetLinkTarget(this.f40232z, j2));
    }

    public String m() {
        return nativeGetName(this.f40232z);
    }

    public OsSharedRealm n() {
        return this.f40231B;
    }

    public native long nativeGetRowPtr(long j2, long j3);

    public UncheckedRow p(long j2) {
        return UncheckedRow.a(this.f40230A, this, j2);
    }

    public UncheckedRow q(long j2) {
        return UncheckedRow.b(this.f40230A, this, j2);
    }

    public boolean r(long j2) {
        return nativeHasSearchIndex(this.f40232z, j2);
    }

    public boolean s() {
        return nativeIsEmbedded(this.f40232z);
    }

    public boolean t() {
        OsSharedRealm osSharedRealm = this.f40231B;
        return osSharedRealm != null && !osSharedRealm.isInTransaction();
    }

    public String toString() {
        long g2 = g();
        String m2 = m();
        StringBuilder sb = new StringBuilder("The Table ");
        if (m2 != null && !m2.isEmpty()) {
            sb.append(m());
            sb.append(" ");
        }
        sb.append("contains ");
        sb.append(g2);
        sb.append(" columns: ");
        String[] j2 = j();
        int length = j2.length;
        boolean z2 = true;
        int i2 = 0;
        while (i2 < length) {
            String str = j2[i2];
            if (!z2) {
                sb.append(", ");
            }
            sb.append(str);
            i2++;
            z2 = false;
        }
        sb.append(".");
        sb.append(" And ");
        sb.append(A());
        sb.append(" rows.");
        return sb.toString();
    }

    public boolean u() {
        long j2 = this.f40232z;
        return j2 != 0 && nativeIsValid(j2);
    }

    public void v(long j2) {
        a();
        nativeMoveLastOver(this.f40232z, j2);
    }

    public void w(long j2) {
        a();
        nativeRemoveSearchIndex(this.f40232z, j2);
    }

    public void x(long j2, long j3, boolean z2, boolean z3) {
        a();
        nativeSetBoolean(this.f40232z, j2, j3, z2, z3);
    }

    public void y(long j2, long j3, long j4, boolean z2) {
        a();
        nativeSetLong(this.f40232z, j2, j3, j4, z2);
    }

    public void z(long j2, long j3, String str, boolean z2) {
        a();
        if (str == null) {
            nativeSetNull(this.f40232z, j2, j3, z2);
        } else {
            nativeSetString(this.f40232z, j2, j3, str, z2);
        }
    }
}
