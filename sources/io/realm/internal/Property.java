package io.realm.internal;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.api.Service;
import com.google.protobuf.DescriptorProtos;
import io.realm.RealmFieldType;
import java.util.Locale;

public class Property implements NativeObject {

    /* renamed from: A  reason: collision with root package name */
    public static final long f40219A = nativeGetFinalizerPtr();

    /* renamed from: z  reason: collision with root package name */
    public long f40220z;

    /* renamed from: io.realm.internal.Property$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f40221a;

        /* JADX WARNING: Can't wrap try/catch for region: R(100:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|100) */
        /* JADX WARNING: Can't wrap try/catch for region: R(98:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|(3:97|98|100)) */
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
        /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x0210 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x021c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x0228 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x0234 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x0240 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                io.realm.RealmFieldType[] r0 = io.realm.RealmFieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f40221a = r0
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.OBJECT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.LIST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.LINKING_OBJECTS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.INTEGER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x003e }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x0049 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x0054 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BINARY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x0060 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DATE     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x006c }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x0078 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DECIMAL128     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x0084 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.OBJECT_ID     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x0090 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.UUID     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x009c }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.MIXED     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.INTEGER_LIST     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BOOLEAN_LIST     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x00cc }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_LIST     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BINARY_LIST     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x00e4 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DATE_LIST     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x00f0 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.FLOAT_LIST     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x00fc }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DECIMAL128_LIST     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x0108 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.OBJECT_ID_LIST     // Catch:{ NoSuchFieldError -> 0x0108 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0108 }
            L_0x0108:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x0114 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.UUID_LIST     // Catch:{ NoSuchFieldError -> 0x0114 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0114 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0114 }
            L_0x0114:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x0120 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DOUBLE_LIST     // Catch:{ NoSuchFieldError -> 0x0120 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0120 }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0120 }
            L_0x0120:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x012c }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.MIXED_LIST     // Catch:{ NoSuchFieldError -> 0x012c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012c }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012c }
            L_0x012c:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x0138 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_MIXED_MAP     // Catch:{ NoSuchFieldError -> 0x0138 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0138 }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0138 }
            L_0x0138:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x0144 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_BOOLEAN_MAP     // Catch:{ NoSuchFieldError -> 0x0144 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0144 }
                r2 = 27
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0144 }
            L_0x0144:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x0150 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_STRING_MAP     // Catch:{ NoSuchFieldError -> 0x0150 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0150 }
                r2 = 28
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0150 }
            L_0x0150:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x015c }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_INTEGER_MAP     // Catch:{ NoSuchFieldError -> 0x015c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x015c }
                r2 = 29
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x015c }
            L_0x015c:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x0168 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_FLOAT_MAP     // Catch:{ NoSuchFieldError -> 0x0168 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0168 }
                r2 = 30
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0168 }
            L_0x0168:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x0174 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_DOUBLE_MAP     // Catch:{ NoSuchFieldError -> 0x0174 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0174 }
                r2 = 31
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0174 }
            L_0x0174:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x0180 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_BINARY_MAP     // Catch:{ NoSuchFieldError -> 0x0180 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0180 }
                r2 = 32
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0180 }
            L_0x0180:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x018c }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_DATE_MAP     // Catch:{ NoSuchFieldError -> 0x018c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x018c }
                r2 = 33
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x018c }
            L_0x018c:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x0198 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_DECIMAL128_MAP     // Catch:{ NoSuchFieldError -> 0x0198 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0198 }
                r2 = 34
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0198 }
            L_0x0198:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x01a4 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_OBJECT_ID_MAP     // Catch:{ NoSuchFieldError -> 0x01a4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a4 }
                r2 = 35
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01a4 }
            L_0x01a4:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x01b0 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_UUID_MAP     // Catch:{ NoSuchFieldError -> 0x01b0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01b0 }
                r2 = 36
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01b0 }
            L_0x01b0:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x01bc }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_LINK_MAP     // Catch:{ NoSuchFieldError -> 0x01bc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01bc }
                r2 = 37
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01bc }
            L_0x01bc:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x01c8 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BOOLEAN_SET     // Catch:{ NoSuchFieldError -> 0x01c8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01c8 }
                r2 = 38
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01c8 }
            L_0x01c8:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x01d4 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_SET     // Catch:{ NoSuchFieldError -> 0x01d4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01d4 }
                r2 = 39
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01d4 }
            L_0x01d4:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x01e0 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.INTEGER_SET     // Catch:{ NoSuchFieldError -> 0x01e0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01e0 }
                r2 = 40
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01e0 }
            L_0x01e0:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x01ec }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.FLOAT_SET     // Catch:{ NoSuchFieldError -> 0x01ec }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ec }
                r2 = 41
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01ec }
            L_0x01ec:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x01f8 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DOUBLE_SET     // Catch:{ NoSuchFieldError -> 0x01f8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01f8 }
                r2 = 42
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01f8 }
            L_0x01f8:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x0204 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BINARY_SET     // Catch:{ NoSuchFieldError -> 0x0204 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0204 }
                r2 = 43
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0204 }
            L_0x0204:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x0210 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DATE_SET     // Catch:{ NoSuchFieldError -> 0x0210 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0210 }
                r2 = 44
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0210 }
            L_0x0210:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x021c }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DECIMAL128_SET     // Catch:{ NoSuchFieldError -> 0x021c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x021c }
                r2 = 45
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x021c }
            L_0x021c:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x0228 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.OBJECT_ID_SET     // Catch:{ NoSuchFieldError -> 0x0228 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0228 }
                r2 = 46
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0228 }
            L_0x0228:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x0234 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.UUID_SET     // Catch:{ NoSuchFieldError -> 0x0234 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0234 }
                r2 = 47
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0234 }
            L_0x0234:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x0240 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.LINK_SET     // Catch:{ NoSuchFieldError -> 0x0240 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0240 }
                r2 = 48
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0240 }
            L_0x0240:
                int[] r0 = f40221a     // Catch:{ NoSuchFieldError -> 0x024c }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.MIXED_SET     // Catch:{ NoSuchFieldError -> 0x024c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x024c }
                r2 = 49
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x024c }
            L_0x024c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.realm.internal.Property.AnonymousClass1.<clinit>():void");
        }
    }

    public Property(long j2) {
        this.f40220z = j2;
        NativeContext.f40128c.a(this);
    }

    public static int a(RealmFieldType realmFieldType, boolean z2) {
        int i2;
        int i3 = 0;
        switch (AnonymousClass1.f40221a[realmFieldType.ordinal()]) {
            case 1:
                return 71;
            case 2:
                return 135;
            case 3:
                return 136;
            case 4:
                i2 = 0;
                break;
            case 5:
                i2 = 1;
                break;
            case 6:
                i2 = 2;
                break;
            case 7:
                i2 = 3;
                break;
            case 8:
                i2 = 4;
                break;
            case 9:
                i2 = 5;
                break;
            case 10:
                i2 = 11;
                break;
            case 11:
                i2 = 10;
                break;
            case 12:
                i2 = 12;
                break;
            case 13:
                i2 = 9;
                break;
            case 14:
                i2 = 6;
                break;
            case 15:
                i2 = 128;
                break;
            case 16:
                i2 = 129;
                break;
            case 17:
                i2 = 130;
                break;
            case 18:
                i2 = 131;
                break;
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER:
                i2 = 132;
                break;
            case 20:
                i2 = 133;
                break;
            case 21:
                i2 = 139;
                break;
            case 22:
                i2 = 138;
                break;
            case 23:
                i2 = 140;
                break;
            case Service.METRICS_FIELD_NUMBER:
                i2 = 134;
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER:
                i2 = 137;
                break;
            case Service.BILLING_FIELD_NUMBER:
                i2 = 521;
                break;
            case 27:
                i2 = 513;
                break;
            case Service.MONITORING_FIELD_NUMBER:
                i2 = 514;
                break;
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER:
                i2 = 512;
                break;
            case 30:
                i2 = 517;
                break;
            case 31:
                i2 = 518;
                break;
            case 32:
                i2 = 515;
                break;
            case 33:
                i2 = 516;
                break;
            case 34:
                i2 = 523;
                break;
            case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER:
                i2 = 522;
                break;
            case 36:
                i2 = 524;
                break;
            case 37:
                i2 = 519;
                break;
            case 38:
                i2 = 257;
                break;
            case 39:
                i2 = 258;
                break;
            case 40:
                i2 = 256;
                break;
            case 41:
                i2 = 261;
                break;
            case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER:
                i2 = 262;
                break;
            case 43:
                i2 = 259;
                break;
            case 44:
                i2 = 260;
                break;
            case 45:
                i2 = 267;
                break;
            case 46:
                i2 = 266;
                break;
            case 47:
                i2 = 268;
                break;
            case 48:
                return 263;
            case 49:
                i2 = 265;
                break;
            default:
                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported filed type: '%s'.", new Object[]{realmFieldType.name()}));
        }
        if (!z2) {
            i3 = 64;
        }
        return i2 | i3;
    }

    public static RealmFieldType b(int i2) {
        int i3 = i2 & -65;
        switch (i3) {
            case 0:
                return RealmFieldType.INTEGER;
            case 1:
                return RealmFieldType.BOOLEAN;
            case 2:
                return RealmFieldType.STRING;
            case 3:
                return RealmFieldType.BINARY;
            case 4:
                return RealmFieldType.DATE;
            case 5:
                return RealmFieldType.FLOAT;
            case 6:
                return RealmFieldType.DOUBLE;
            case 7:
                return RealmFieldType.OBJECT;
            default:
                switch (i3) {
                    case 9:
                        return RealmFieldType.MIXED;
                    case 10:
                        return RealmFieldType.OBJECT_ID;
                    case 11:
                        return RealmFieldType.DECIMAL128;
                    case 12:
                        return RealmFieldType.UUID;
                    default:
                        switch (i3) {
                            case 128:
                                return RealmFieldType.INTEGER_LIST;
                            case 129:
                                return RealmFieldType.BOOLEAN_LIST;
                            case 130:
                                return RealmFieldType.STRING_LIST;
                            case 131:
                                return RealmFieldType.BINARY_LIST;
                            case 132:
                                return RealmFieldType.DATE_LIST;
                            case 133:
                                return RealmFieldType.FLOAT_LIST;
                            case 134:
                                return RealmFieldType.DOUBLE_LIST;
                            case 135:
                                return RealmFieldType.LIST;
                            case 136:
                                return RealmFieldType.LINKING_OBJECTS;
                            case 137:
                                return RealmFieldType.MIXED_LIST;
                            case 138:
                                return RealmFieldType.OBJECT_ID_LIST;
                            case 139:
                                return RealmFieldType.DECIMAL128_LIST;
                            case 140:
                                return RealmFieldType.UUID_LIST;
                            default:
                                switch (i3) {
                                    case 256:
                                        return RealmFieldType.INTEGER_SET;
                                    case 257:
                                        return RealmFieldType.BOOLEAN_SET;
                                    case 258:
                                        return RealmFieldType.STRING_SET;
                                    case 259:
                                        return RealmFieldType.BINARY_SET;
                                    case 260:
                                        return RealmFieldType.DATE_SET;
                                    case 261:
                                        return RealmFieldType.FLOAT_SET;
                                    case 262:
                                        return RealmFieldType.DOUBLE_SET;
                                    case 263:
                                        return RealmFieldType.LINK_SET;
                                    default:
                                        switch (i3) {
                                            case 265:
                                                return RealmFieldType.MIXED_SET;
                                            case 266:
                                                return RealmFieldType.OBJECT_ID_SET;
                                            case 267:
                                                return RealmFieldType.DECIMAL128_SET;
                                            case 268:
                                                return RealmFieldType.UUID_SET;
                                            default:
                                                switch (i3) {
                                                    case 512:
                                                        return RealmFieldType.STRING_TO_INTEGER_MAP;
                                                    case 513:
                                                        return RealmFieldType.STRING_TO_BOOLEAN_MAP;
                                                    case 514:
                                                        return RealmFieldType.STRING_TO_STRING_MAP;
                                                    case 515:
                                                        return RealmFieldType.STRING_TO_BINARY_MAP;
                                                    case 516:
                                                        return RealmFieldType.STRING_TO_DATE_MAP;
                                                    case 517:
                                                        return RealmFieldType.STRING_TO_FLOAT_MAP;
                                                    case 518:
                                                        return RealmFieldType.STRING_TO_DOUBLE_MAP;
                                                    case 519:
                                                        return RealmFieldType.STRING_TO_LINK_MAP;
                                                    default:
                                                        switch (i3) {
                                                            case 521:
                                                                return RealmFieldType.STRING_TO_MIXED_MAP;
                                                            case 522:
                                                                return RealmFieldType.STRING_TO_OBJECT_ID_MAP;
                                                            case 523:
                                                                return RealmFieldType.STRING_TO_DECIMAL128_MAP;
                                                            case 524:
                                                                return RealmFieldType.STRING_TO_UUID_MAP;
                                                            default:
                                                                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported property type: '%d'", new Object[]{Integer.valueOf(i2)}));
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public static native long nativeCreatePersistedProperty(String str, String str2, int i2, boolean z2, boolean z3);

    private static native long nativeGetColumnKey(long j2);

    private static native long nativeGetFinalizerPtr();

    private static native String nativeGetLinkedObjectName(long j2);

    private static native int nativeGetType(long j2);

    public long c() {
        return nativeGetColumnKey(this.f40220z);
    }

    public String d() {
        return nativeGetLinkedObjectName(this.f40220z);
    }

    public RealmFieldType e() {
        return b(nativeGetType(this.f40220z));
    }

    public long getNativeFinalizerPtr() {
        return f40219A;
    }

    public long getNativePtr() {
        return this.f40220z;
    }
}
