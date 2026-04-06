package io.realm;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.api.Service;
import com.google.protobuf.DescriptorProtos;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import java.util.Arrays;
import java.util.Locale;

public class DynamicRealmObject extends RealmObject implements RealmObjectProxy {

    /* renamed from: z  reason: collision with root package name */
    public final ProxyState f39881z;

    /* renamed from: io.realm.DynamicRealmObject$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f39882a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f39883b;

        /* JADX WARNING: Can't wrap try/catch for region: R(104:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|(3:109|110|112)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(106:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|112) */
        /* JADX WARNING: Can't wrap try/catch for region: R(107:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|112) */
        /* JADX WARNING: Can't wrap try/catch for region: R(108:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|112) */
        /* JADX WARNING: Can't wrap try/catch for region: R(109:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|112) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x0235 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x0241 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:105:0x024d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x0259 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:109:0x0265 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0079 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0085 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0091 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x009d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00b5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00c1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00cd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00d9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00e5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00f1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x0109 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0115 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0121 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x012d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x0139 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0145 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0151 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x015d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x0169 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0175 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x0181 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x018d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0199 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x01a5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x01b1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x01bd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x01c9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x01d5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x01e1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x01ed */
        /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x01f9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x0205 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x0211 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x021d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x0229 */
        static {
            /*
                io.realm.DynamicRealmObject$CollectionType[] r0 = io.realm.DynamicRealmObject.CollectionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f39883b = r0
                r1 = 1
                io.realm.DynamicRealmObject$CollectionType r2 = io.realm.DynamicRealmObject.CollectionType.SET     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f39883b     // Catch:{ NoSuchFieldError -> 0x001d }
                io.realm.DynamicRealmObject$CollectionType r3 = io.realm.DynamicRealmObject.CollectionType.DICTIONARY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f39883b     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.realm.DynamicRealmObject$CollectionType r4 = io.realm.DynamicRealmObject.CollectionType.LIST     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                io.realm.RealmFieldType[] r3 = io.realm.RealmFieldType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f39882a = r3
                io.realm.RealmFieldType r4 = io.realm.RealmFieldType.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f39882a     // Catch:{ NoSuchFieldError -> 0x0043 }
                io.realm.RealmFieldType r3 = io.realm.RealmFieldType.INTEGER     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x004d }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x0058 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x0063 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x006e }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BINARY     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x0079 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DATE     // Catch:{ NoSuchFieldError -> 0x0079 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0079 }
            L_0x0079:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x0085 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DECIMAL128     // Catch:{ NoSuchFieldError -> 0x0085 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0085 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0085 }
            L_0x0085:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x0091 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.OBJECT_ID     // Catch:{ NoSuchFieldError -> 0x0091 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0091 }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0091 }
            L_0x0091:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x009d }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.MIXED     // Catch:{ NoSuchFieldError -> 0x009d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009d }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009d }
            L_0x009d:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x00a9 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.UUID     // Catch:{ NoSuchFieldError -> 0x00a9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a9 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a9 }
            L_0x00a9:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x00b5 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.OBJECT     // Catch:{ NoSuchFieldError -> 0x00b5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b5 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b5 }
            L_0x00b5:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x00c1 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.LIST     // Catch:{ NoSuchFieldError -> 0x00c1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c1 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c1 }
            L_0x00c1:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x00cd }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_INTEGER_MAP     // Catch:{ NoSuchFieldError -> 0x00cd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cd }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cd }
            L_0x00cd:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x00d9 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_BOOLEAN_MAP     // Catch:{ NoSuchFieldError -> 0x00d9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d9 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d9 }
            L_0x00d9:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x00e5 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_STRING_MAP     // Catch:{ NoSuchFieldError -> 0x00e5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e5 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e5 }
            L_0x00e5:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x00f1 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_BINARY_MAP     // Catch:{ NoSuchFieldError -> 0x00f1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f1 }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f1 }
            L_0x00f1:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x00fd }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_DATE_MAP     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x0109 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_FLOAT_MAP     // Catch:{ NoSuchFieldError -> 0x0109 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0109 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0109 }
            L_0x0109:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x0115 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_DOUBLE_MAP     // Catch:{ NoSuchFieldError -> 0x0115 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0115 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0115 }
            L_0x0115:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x0121 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_DECIMAL128_MAP     // Catch:{ NoSuchFieldError -> 0x0121 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0121 }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0121 }
            L_0x0121:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x012d }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_OBJECT_ID_MAP     // Catch:{ NoSuchFieldError -> 0x012d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012d }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012d }
            L_0x012d:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x0139 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_UUID_MAP     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x0145 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_MIXED_MAP     // Catch:{ NoSuchFieldError -> 0x0145 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0145 }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0145 }
            L_0x0145:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x0151 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_TO_LINK_MAP     // Catch:{ NoSuchFieldError -> 0x0151 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0151 }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0151 }
            L_0x0151:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x015d }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.INTEGER_SET     // Catch:{ NoSuchFieldError -> 0x015d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x015d }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x015d }
            L_0x015d:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x0169 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BOOLEAN_SET     // Catch:{ NoSuchFieldError -> 0x0169 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0169 }
                r2 = 27
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0169 }
            L_0x0169:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x0175 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_SET     // Catch:{ NoSuchFieldError -> 0x0175 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0175 }
                r2 = 28
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0175 }
            L_0x0175:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x0181 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BINARY_SET     // Catch:{ NoSuchFieldError -> 0x0181 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0181 }
                r2 = 29
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0181 }
            L_0x0181:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x018d }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DATE_SET     // Catch:{ NoSuchFieldError -> 0x018d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x018d }
                r2 = 30
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x018d }
            L_0x018d:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x0199 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.FLOAT_SET     // Catch:{ NoSuchFieldError -> 0x0199 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0199 }
                r2 = 31
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0199 }
            L_0x0199:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x01a5 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DOUBLE_SET     // Catch:{ NoSuchFieldError -> 0x01a5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a5 }
                r2 = 32
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01a5 }
            L_0x01a5:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x01b1 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DECIMAL128_SET     // Catch:{ NoSuchFieldError -> 0x01b1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01b1 }
                r2 = 33
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01b1 }
            L_0x01b1:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x01bd }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.OBJECT_ID_SET     // Catch:{ NoSuchFieldError -> 0x01bd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01bd }
                r2 = 34
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01bd }
            L_0x01bd:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x01c9 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.UUID_SET     // Catch:{ NoSuchFieldError -> 0x01c9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01c9 }
                r2 = 35
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01c9 }
            L_0x01c9:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x01d5 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.LINK_SET     // Catch:{ NoSuchFieldError -> 0x01d5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01d5 }
                r2 = 36
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01d5 }
            L_0x01d5:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x01e1 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.MIXED_SET     // Catch:{ NoSuchFieldError -> 0x01e1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01e1 }
                r2 = 37
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01e1 }
            L_0x01e1:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x01ed }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.LINKING_OBJECTS     // Catch:{ NoSuchFieldError -> 0x01ed }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ed }
                r2 = 38
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01ed }
            L_0x01ed:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x01f9 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.INTEGER_LIST     // Catch:{ NoSuchFieldError -> 0x01f9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01f9 }
                r2 = 39
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01f9 }
            L_0x01f9:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x0205 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BOOLEAN_LIST     // Catch:{ NoSuchFieldError -> 0x0205 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0205 }
                r2 = 40
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0205 }
            L_0x0205:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x0211 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.STRING_LIST     // Catch:{ NoSuchFieldError -> 0x0211 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0211 }
                r2 = 41
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0211 }
            L_0x0211:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x021d }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.BINARY_LIST     // Catch:{ NoSuchFieldError -> 0x021d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x021d }
                r2 = 42
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x021d }
            L_0x021d:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x0229 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DATE_LIST     // Catch:{ NoSuchFieldError -> 0x0229 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0229 }
                r2 = 43
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0229 }
            L_0x0229:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x0235 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.FLOAT_LIST     // Catch:{ NoSuchFieldError -> 0x0235 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0235 }
                r2 = 44
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0235 }
            L_0x0235:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x0241 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DOUBLE_LIST     // Catch:{ NoSuchFieldError -> 0x0241 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0241 }
                r2 = 45
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0241 }
            L_0x0241:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x024d }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DECIMAL128_LIST     // Catch:{ NoSuchFieldError -> 0x024d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x024d }
                r2 = 46
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x024d }
            L_0x024d:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x0259 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.OBJECT_ID_LIST     // Catch:{ NoSuchFieldError -> 0x0259 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0259 }
                r2 = 47
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0259 }
            L_0x0259:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x0265 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.UUID_LIST     // Catch:{ NoSuchFieldError -> 0x0265 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0265 }
                r2 = 48
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0265 }
            L_0x0265:
                int[] r0 = f39882a     // Catch:{ NoSuchFieldError -> 0x0271 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.MIXED_LIST     // Catch:{ NoSuchFieldError -> 0x0271 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0271 }
                r2 = 49
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0271 }
            L_0x0271:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.realm.DynamicRealmObject.AnonymousClass1.<clinit>():void");
        }
    }

    public enum CollectionType {
        LIST,
        DICTIONARY,
        SET
    }

    public DynamicRealmObject(BaseRealm baseRealm, Row row) {
        ProxyState proxyState = new ProxyState(this);
        this.f39881z = proxyState;
        proxyState.p(baseRealm);
        proxyState.q(row);
        proxyState.n();
    }

    public void a() {
    }

    public ProxyState b() {
        return this.f39881z;
    }

    public String[] c() {
        this.f39881z.d().j();
        return this.f39881z.e().getColumnNames();
    }

    public final RealmAny d(long j2) {
        return new RealmAny(RealmAnyOperator.c(this.f39881z.d(), this.f39881z.e().C(j2)));
    }

    public String e() {
        this.f39881z.d().j();
        return this.f39881z.e().j().e();
    }

    public boolean equals(Object obj) {
        this.f39881z.d().j();
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DynamicRealmObject dynamicRealmObject = (DynamicRealmObject) obj;
        String F = this.f39881z.d().F();
        String F2 = dynamicRealmObject.f39881z.d().F();
        if (F == null ? F2 != null : !F.equals(F2)) {
            return false;
        }
        String m2 = this.f39881z.e().j().m();
        String m3 = dynamicRealmObject.f39881z.e().j().m();
        if (m2 == null ? m3 == null : m2.equals(m3)) {
            return this.f39881z.e().S() == dynamicRealmObject.f39881z.e().S();
        }
        return false;
    }

    public int hashCode() {
        this.f39881z.d().j();
        String F = this.f39881z.d().F();
        String m2 = this.f39881z.e().j().m();
        long S = this.f39881z.e().S();
        int i2 = 0;
        int hashCode = (527 + (F != null ? F.hashCode() : 0)) * 31;
        if (m2 != null) {
            i2 = m2.hashCode();
        }
        return ((hashCode + i2) * 31) + ((int) ((S >>> 32) ^ S));
    }

    public String toString() {
        this.f39881z.d().j();
        if (!this.f39881z.e().d()) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder(this.f39881z.e().j().e() + " = dynamic[");
        for (String str : c()) {
            long z2 = this.f39881z.e().z(str);
            RealmFieldType Q = this.f39881z.e().Q(z2);
            sb.append("{");
            sb.append(str);
            sb.append(":");
            Object obj = "null";
            switch (AnonymousClass1.f39882a[Q.ordinal()]) {
                case 1:
                    Object obj2 = obj;
                    if (!this.f39881z.e().y(z2)) {
                        obj2 = Boolean.valueOf(this.f39881z.e().o(z2));
                    }
                    sb.append(obj2);
                    break;
                case 2:
                    Object obj3 = obj;
                    if (!this.f39881z.e().y(z2)) {
                        obj3 = Long.valueOf(this.f39881z.e().p(z2));
                    }
                    sb.append(obj3);
                    break;
                case 3:
                    Object obj4 = obj;
                    if (!this.f39881z.e().y(z2)) {
                        obj4 = Float.valueOf(this.f39881z.e().H(z2));
                    }
                    sb.append(obj4);
                    break;
                case 4:
                    Object obj5 = obj;
                    if (!this.f39881z.e().y(z2)) {
                        obj5 = Double.valueOf(this.f39881z.e().G(z2));
                    }
                    sb.append(obj5);
                    break;
                case 5:
                    sb.append(this.f39881z.e().I(z2));
                    break;
                case 6:
                    sb.append(Arrays.toString(this.f39881z.e().E(z2)));
                    break;
                case 7:
                    Object obj6 = obj;
                    if (!this.f39881z.e().y(z2)) {
                        obj6 = this.f39881z.e().x(z2);
                    }
                    sb.append(obj6);
                    break;
                case 8:
                    Object obj7 = obj;
                    if (!this.f39881z.e().y(z2)) {
                        obj7 = this.f39881z.e().f(z2);
                    }
                    sb.append(obj7);
                    break;
                case 9:
                    Object obj8 = obj;
                    if (!this.f39881z.e().y(z2)) {
                        obj8 = this.f39881z.e().m(z2);
                    }
                    sb.append(obj8);
                    break;
                case 10:
                    Object obj9 = obj;
                    if (!this.f39881z.e().y(z2)) {
                        obj9 = d(z2);
                    }
                    sb.append(obj9);
                    break;
                case 11:
                    Object obj10 = obj;
                    if (!this.f39881z.e().y(z2)) {
                        obj10 = this.f39881z.e().n(z2);
                    }
                    sb.append(obj10);
                    break;
                case 12:
                    String str2 = obj;
                    if (!this.f39881z.e().D(z2)) {
                        str2 = this.f39881z.e().j().l(z2).e();
                    }
                    sb.append(str2);
                    break;
                case 13:
                    sb.append(String.format(Locale.US, "RealmList<%s>[%s]", new Object[]{this.f39881z.e().j().l(z2).e(), Long.valueOf(this.f39881z.e().r(z2).a0())}));
                    break;
                case 14:
                    sb.append(String.format(Locale.US, "RealmDictionary<Long>[%s]", new Object[]{Long.valueOf(this.f39881z.e().N(z2, Q).q())}));
                    break;
                case 15:
                    sb.append(String.format(Locale.US, "RealmDictionary<Boolean>[%s]", new Object[]{Long.valueOf(this.f39881z.e().N(z2, Q).q())}));
                    break;
                case 16:
                    sb.append(String.format(Locale.US, "RealmDictionary<String>[%s]", new Object[]{Long.valueOf(this.f39881z.e().N(z2, Q).q())}));
                    break;
                case 17:
                    sb.append(String.format(Locale.US, "RealmDictionary<byte[]>[%s]", new Object[]{Long.valueOf(this.f39881z.e().N(z2, Q).q())}));
                    break;
                case 18:
                    sb.append(String.format(Locale.US, "RealmDictionary<Date>[%s]", new Object[]{Long.valueOf(this.f39881z.e().N(z2, Q).q())}));
                    break;
                case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER:
                    sb.append(String.format(Locale.US, "RealmDictionary<Float>[%s]", new Object[]{Long.valueOf(this.f39881z.e().N(z2, Q).q())}));
                    break;
                case 20:
                    sb.append(String.format(Locale.US, "RealmDictionary<Double>[%s]", new Object[]{Long.valueOf(this.f39881z.e().N(z2, Q).q())}));
                    break;
                case 21:
                    sb.append(String.format(Locale.US, "RealmDictionary<Decimal128>[%s]", new Object[]{Long.valueOf(this.f39881z.e().N(z2, Q).q())}));
                    break;
                case 22:
                    sb.append(String.format(Locale.US, "RealmDictionary<ObjectId>[%s]", new Object[]{Long.valueOf(this.f39881z.e().N(z2, Q).q())}));
                    break;
                case 23:
                    sb.append(String.format(Locale.US, "RealmDictionary<UUID>[%s]", new Object[]{Long.valueOf(this.f39881z.e().N(z2, Q).q())}));
                    break;
                case Service.METRICS_FIELD_NUMBER:
                    sb.append(String.format(Locale.US, "RealmDictionary<RealmAny>[%s]", new Object[]{Long.valueOf(this.f39881z.e().N(z2, Q).q())}));
                    break;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER:
                    sb.append(String.format(Locale.US, "RealmDictionary<%s>[%s]", new Object[]{this.f39881z.e().j().l(z2).e(), Long.valueOf(this.f39881z.e().A(z2).q())}));
                    break;
                case Service.BILLING_FIELD_NUMBER:
                    sb.append(String.format(Locale.US, "RealmSet<Long>[%s]", new Object[]{Long.valueOf(this.f39881z.e().B(z2, Q).a0())}));
                    break;
                case 27:
                    sb.append(String.format(Locale.US, "RealmSet<Boolean>[%s]", new Object[]{Long.valueOf(this.f39881z.e().B(z2, Q).a0())}));
                    break;
                case Service.MONITORING_FIELD_NUMBER:
                    sb.append(String.format(Locale.US, "RealmSet<String>[%s]", new Object[]{Long.valueOf(this.f39881z.e().B(z2, Q).a0())}));
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER:
                    sb.append(String.format(Locale.US, "RealmSet<byte[]>[%s]", new Object[]{Long.valueOf(this.f39881z.e().B(z2, Q).a0())}));
                    break;
                case 30:
                    sb.append(String.format(Locale.US, "RealmSet<Date>[%s]", new Object[]{Long.valueOf(this.f39881z.e().B(z2, Q).a0())}));
                    break;
                case 31:
                    sb.append(String.format(Locale.US, "RealmSet<Float>[%s]", new Object[]{Long.valueOf(this.f39881z.e().B(z2, Q).a0())}));
                    break;
                case 32:
                    sb.append(String.format(Locale.US, "RealmSet<Double>[%s]", new Object[]{Long.valueOf(this.f39881z.e().B(z2, Q).a0())}));
                    break;
                case 33:
                    sb.append(String.format(Locale.US, "RealmSet<Decimal128>[%s]", new Object[]{Long.valueOf(this.f39881z.e().B(z2, Q).a0())}));
                    break;
                case 34:
                    sb.append(String.format(Locale.US, "RealmSet<ObjectId>[%s]", new Object[]{Long.valueOf(this.f39881z.e().B(z2, Q).a0())}));
                    break;
                case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER:
                    sb.append(String.format(Locale.US, "RealmSet<UUID>[%s]", new Object[]{Long.valueOf(this.f39881z.e().B(z2, Q).a0())}));
                    break;
                case 36:
                    sb.append(String.format(Locale.US, "RealmSet<%s>[%s]", new Object[]{this.f39881z.e().j().l(z2).e(), Long.valueOf(this.f39881z.e().l(z2).a0())}));
                    break;
                case 37:
                    sb.append(String.format(Locale.US, "RealmSet<RealmAny>[%s]", new Object[]{Long.valueOf(this.f39881z.e().B(z2, Q).a0())}));
                    break;
                case 39:
                    sb.append(String.format(Locale.US, "RealmList<Long>[%s]", new Object[]{Long.valueOf(this.f39881z.e().M(z2, Q).a0())}));
                    break;
                case 40:
                    sb.append(String.format(Locale.US, "RealmList<Boolean>[%s]", new Object[]{Long.valueOf(this.f39881z.e().M(z2, Q).a0())}));
                    break;
                case 41:
                    sb.append(String.format(Locale.US, "RealmList<String>[%s]", new Object[]{Long.valueOf(this.f39881z.e().M(z2, Q).a0())}));
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER:
                    sb.append(String.format(Locale.US, "RealmList<byte[]>[%s]", new Object[]{Long.valueOf(this.f39881z.e().M(z2, Q).a0())}));
                    break;
                case 43:
                    sb.append(String.format(Locale.US, "RealmList<Date>[%s]", new Object[]{Long.valueOf(this.f39881z.e().M(z2, Q).a0())}));
                    break;
                case 44:
                    sb.append(String.format(Locale.US, "RealmList<Float>[%s]", new Object[]{Long.valueOf(this.f39881z.e().M(z2, Q).a0())}));
                    break;
                case 45:
                    sb.append(String.format(Locale.US, "RealmList<Double>[%s]", new Object[]{Long.valueOf(this.f39881z.e().M(z2, Q).a0())}));
                    break;
                case 46:
                    sb.append(String.format(Locale.US, "RealmList<Decimal128>[%s]", new Object[]{Long.valueOf(this.f39881z.e().M(z2, Q).a0())}));
                    break;
                case 47:
                    sb.append(String.format(Locale.US, "RealmList<ObjectId>[%s]", new Object[]{Long.valueOf(this.f39881z.e().M(z2, Q).a0())}));
                    break;
                case 48:
                    sb.append(String.format(Locale.US, "RealmList<UUID>[%s]", new Object[]{Long.valueOf(this.f39881z.e().M(z2, Q).a0())}));
                    break;
                case 49:
                    sb.append(String.format(Locale.US, "RealmList<RealmAny>[%s]", new Object[]{Long.valueOf(this.f39881z.e().M(z2, Q).a0())}));
                    break;
                default:
                    sb.append("?");
                    break;
            }
            sb.append("},");
        }
        sb.replace(sb.length() - 1, sb.length(), "");
        sb.append("]");
        return sb.toString();
    }
}
