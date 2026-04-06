package org.bson.json;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.bson.AbstractBsonReader;
import org.bson.BsonBinary;
import org.bson.BsonBinarySubType;
import org.bson.BsonContextType;
import org.bson.BsonDbPointer;
import org.bson.BsonInvalidOperationException;
import org.bson.BsonReaderMark;
import org.bson.BsonRegularExpression;
import org.bson.BsonTimestamp;
import org.bson.BsonType;
import org.bson.BsonUndefined;
import org.bson.internal.Base64;
import org.bson.types.Decimal128;
import org.bson.types.MaxKey;
import org.bson.types.MinKey;
import org.bson.types.ObjectId;

public class JsonReader extends AbstractBsonReader {
    public final JsonScanner E;
    public JsonToken F;
    public Object G;

    /* renamed from: org.bson.json.JsonReader$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f43917a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f43918b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f43919c;

        /* JADX WARNING: Can't wrap try/catch for region: R(74:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|63|64|65|66|67|68|69|70|(2:71|72)|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|(3:95|96|98)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(75:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|63|64|65|66|67|68|69|70|(2:71|72)|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|(3:95|96|98)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(76:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|37|38|39|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|63|64|65|66|67|68|69|70|(2:71|72)|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|(3:95|96|98)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(77:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|37|38|39|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|63|64|65|66|67|68|69|70|(2:71|72)|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|(3:95|96|98)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(80:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|37|38|39|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|63|64|65|66|67|68|69|70|71|72|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|(3:95|96|98)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(81:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|37|38|39|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|63|64|65|66|67|68|69|70|71|72|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|(3:95|96|98)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(84:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|37|38|39|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|63|64|65|66|67|68|69|70|71|72|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|98) */
        /* JADX WARNING: Can't wrap try/catch for region: R(86:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|63|64|65|66|67|68|69|70|71|72|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|98) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0101 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x010b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0115 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x011f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x013a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0144 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x014e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x0158 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x0162 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x016c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x0176 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x0180 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x018a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x0194 */
        static {
            /*
                org.bson.BsonType[] r0 = org.bson.BsonType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f43919c = r0
                r1 = 1
                org.bson.BsonType r2 = org.bson.BsonType.ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f43919c     // Catch:{ NoSuchFieldError -> 0x001d }
                org.bson.BsonType r3 = org.bson.BsonType.BINARY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f43919c     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.bson.BsonType r4 = org.bson.BsonType.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f43919c     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.bson.BsonType r5 = org.bson.BsonType.DATE_TIME     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f43919c     // Catch:{ NoSuchFieldError -> 0x003e }
                org.bson.BsonType r6 = org.bson.BsonType.DOCUMENT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f43919c     // Catch:{ NoSuchFieldError -> 0x0049 }
                org.bson.BsonType r7 = org.bson.BsonType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f43919c     // Catch:{ NoSuchFieldError -> 0x0054 }
                org.bson.BsonType r8 = org.bson.BsonType.INT32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f43919c     // Catch:{ NoSuchFieldError -> 0x0060 }
                org.bson.BsonType r9 = org.bson.BsonType.INT64     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = f43919c     // Catch:{ NoSuchFieldError -> 0x006c }
                org.bson.BsonType r10 = org.bson.BsonType.DECIMAL128     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                r9 = 10
                int[] r10 = f43919c     // Catch:{ NoSuchFieldError -> 0x0078 }
                org.bson.BsonType r11 = org.bson.BsonType.JAVASCRIPT     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r10[r11] = r9     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                r10 = 11
                int[] r11 = f43919c     // Catch:{ NoSuchFieldError -> 0x0084 }
                org.bson.BsonType r12 = org.bson.BsonType.JAVASCRIPT_WITH_SCOPE     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11[r12] = r10     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r11 = f43919c     // Catch:{ NoSuchFieldError -> 0x0090 }
                org.bson.BsonType r12 = org.bson.BsonType.MAX_KEY     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r13 = 12
                r11[r12] = r13     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r11 = f43919c     // Catch:{ NoSuchFieldError -> 0x009c }
                org.bson.BsonType r12 = org.bson.BsonType.MIN_KEY     // Catch:{ NoSuchFieldError -> 0x009c }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r13 = 13
                r11[r12] = r13     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r11 = f43919c     // Catch:{ NoSuchFieldError -> 0x00a8 }
                org.bson.BsonType r12 = org.bson.BsonType.NULL     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r13 = 14
                r11[r12] = r13     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r11 = f43919c     // Catch:{ NoSuchFieldError -> 0x00b4 }
                org.bson.BsonType r12 = org.bson.BsonType.OBJECT_ID     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r13 = 15
                r11[r12] = r13     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r11 = f43919c     // Catch:{ NoSuchFieldError -> 0x00c0 }
                org.bson.BsonType r12 = org.bson.BsonType.REGULAR_EXPRESSION     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r13 = 16
                r11[r12] = r13     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r11 = f43919c     // Catch:{ NoSuchFieldError -> 0x00cc }
                org.bson.BsonType r12 = org.bson.BsonType.STRING     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r13 = 17
                r11[r12] = r13     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r11 = f43919c     // Catch:{ NoSuchFieldError -> 0x00d8 }
                org.bson.BsonType r12 = org.bson.BsonType.SYMBOL     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r13 = 18
                r11[r12] = r13     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r11 = f43919c     // Catch:{ NoSuchFieldError -> 0x00e4 }
                org.bson.BsonType r12 = org.bson.BsonType.TIMESTAMP     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r13 = 19
                r11[r12] = r13     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r11 = f43919c     // Catch:{ NoSuchFieldError -> 0x00f0 }
                org.bson.BsonType r12 = org.bson.BsonType.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r13 = 20
                r11[r12] = r13     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                org.bson.BsonContextType[] r11 = org.bson.BsonContextType.values()
                int r11 = r11.length
                int[] r11 = new int[r11]
                f43918b = r11
                org.bson.BsonContextType r12 = org.bson.BsonContextType.DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0101 }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x0101 }
                r11[r12] = r1     // Catch:{ NoSuchFieldError -> 0x0101 }
            L_0x0101:
                int[] r11 = f43918b     // Catch:{ NoSuchFieldError -> 0x010b }
                org.bson.BsonContextType r12 = org.bson.BsonContextType.SCOPE_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x010b }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x010b }
                r11[r12] = r0     // Catch:{ NoSuchFieldError -> 0x010b }
            L_0x010b:
                int[] r11 = f43918b     // Catch:{ NoSuchFieldError -> 0x0115 }
                org.bson.BsonContextType r12 = org.bson.BsonContextType.ARRAY     // Catch:{ NoSuchFieldError -> 0x0115 }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x0115 }
                r11[r12] = r2     // Catch:{ NoSuchFieldError -> 0x0115 }
            L_0x0115:
                int[] r11 = f43918b     // Catch:{ NoSuchFieldError -> 0x011f }
                org.bson.BsonContextType r12 = org.bson.BsonContextType.JAVASCRIPT_WITH_SCOPE     // Catch:{ NoSuchFieldError -> 0x011f }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x011f }
                r11[r12] = r3     // Catch:{ NoSuchFieldError -> 0x011f }
            L_0x011f:
                int[] r11 = f43918b     // Catch:{ NoSuchFieldError -> 0x0129 }
                org.bson.BsonContextType r12 = org.bson.BsonContextType.TOP_LEVEL     // Catch:{ NoSuchFieldError -> 0x0129 }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x0129 }
                r11[r12] = r4     // Catch:{ NoSuchFieldError -> 0x0129 }
            L_0x0129:
                org.bson.json.JsonTokenType[] r11 = org.bson.json.JsonTokenType.values()
                int r11 = r11.length
                int[] r11 = new int[r11]
                f43917a = r11
                org.bson.json.JsonTokenType r12 = org.bson.json.JsonTokenType.STRING     // Catch:{ NoSuchFieldError -> 0x013a }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x013a }
                r11[r12] = r1     // Catch:{ NoSuchFieldError -> 0x013a }
            L_0x013a:
                int[] r1 = f43917a     // Catch:{ NoSuchFieldError -> 0x0144 }
                org.bson.json.JsonTokenType r11 = org.bson.json.JsonTokenType.UNQUOTED_STRING     // Catch:{ NoSuchFieldError -> 0x0144 }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x0144 }
                r1[r11] = r0     // Catch:{ NoSuchFieldError -> 0x0144 }
            L_0x0144:
                int[] r0 = f43917a     // Catch:{ NoSuchFieldError -> 0x014e }
                org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x014e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x014e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x014e }
            L_0x014e:
                int[] r0 = f43917a     // Catch:{ NoSuchFieldError -> 0x0158 }
                org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0158 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0158 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0158 }
            L_0x0158:
                int[] r0 = f43917a     // Catch:{ NoSuchFieldError -> 0x0162 }
                org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0162 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0162 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0162 }
            L_0x0162:
                int[] r0 = f43917a     // Catch:{ NoSuchFieldError -> 0x016c }
                org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x016c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x016c }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x016c }
            L_0x016c:
                int[] r0 = f43917a     // Catch:{ NoSuchFieldError -> 0x0176 }
                org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.END_OF_FILE     // Catch:{ NoSuchFieldError -> 0x0176 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0176 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0176 }
            L_0x0176:
                int[] r0 = f43917a     // Catch:{ NoSuchFieldError -> 0x0180 }
                org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.INT32     // Catch:{ NoSuchFieldError -> 0x0180 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0180 }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x0180 }
            L_0x0180:
                int[] r0 = f43917a     // Catch:{ NoSuchFieldError -> 0x018a }
                org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.INT64     // Catch:{ NoSuchFieldError -> 0x018a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x018a }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x018a }
            L_0x018a:
                int[] r0 = f43917a     // Catch:{ NoSuchFieldError -> 0x0194 }
                org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.REGULAR_EXPRESSION     // Catch:{ NoSuchFieldError -> 0x0194 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0194 }
                r0[r1] = r9     // Catch:{ NoSuchFieldError -> 0x0194 }
            L_0x0194:
                int[] r0 = f43917a     // Catch:{ NoSuchFieldError -> 0x019e }
                org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.COMMA     // Catch:{ NoSuchFieldError -> 0x019e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x019e }
                r0[r1] = r10     // Catch:{ NoSuchFieldError -> 0x019e }
            L_0x019e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bson.json.JsonReader.AnonymousClass1.<clinit>():void");
        }
    }

    public class Context extends AbstractBsonReader.Context {
        public Context(AbstractBsonReader.Context context, BsonContextType bsonContextType) {
            super(context, bsonContextType);
        }

        public BsonContextType c() {
            return super.c();
        }

        public Context e() {
            return (Context) super.d();
        }
    }

    public class Mark extends AbstractBsonReader.Mark {

        /* renamed from: g  reason: collision with root package name */
        public final JsonToken f43921g;

        /* renamed from: h  reason: collision with root package name */
        public final Object f43922h;

        /* renamed from: i  reason: collision with root package name */
        public final int f43923i;

        public Mark() {
            super();
            this.f43921g = JsonReader.this.F;
            this.f43922h = JsonReader.this.G;
            this.f43923i = JsonReader.this.E.b();
        }

        public void b() {
            super.b();
            JsonToken unused = JsonReader.this.F = this.f43921g;
            Object unused2 = JsonReader.this.G = this.f43922h;
            JsonReader.this.E.d(this.f43923i);
            JsonReader jsonReader = JsonReader.this;
            jsonReader.A0(new Context(c(), a()));
        }

        public void d() {
            JsonReader.this.E.a(this.f43923i);
        }
    }

    public static byte[] G1(String str) {
        if (str.length() % 2 == 0) {
            byte[] bArr = new byte[(str.length() / 2)];
            for (int i2 = 0; i2 < str.length(); i2 += 2) {
                int digit = Character.digit(str.charAt(i2), 16);
                int digit2 = Character.digit(str.charAt(i2 + 1), 16);
                if (digit == -1 || digit2 == -1) {
                    throw new IllegalArgumentException("A hex string can only contain the characters 0-9, A-F, a-f: " + str);
                }
                bArr[i2 / 2] = (byte) ((digit * 16) + digit2);
            }
            return bArr;
        }
        throw new IllegalArgumentException("A hex string must contain an even number of characters: " + str);
    }

    public Decimal128 A() {
        return (Decimal128) this.G;
    }

    public double C() {
        return ((Double) this.G).doubleValue();
    }

    public void D() {
        A0(s0().e());
        if (s0().c() == BsonContextType.ARRAY || s0().c() == BsonContextType.DOCUMENT) {
            JsonToken I1 = I1();
            if (I1.a() != JsonTokenType.COMMA) {
                J1(I1);
            }
        }
    }

    public void E() {
        A0(s0().e());
        if (s0() != null && s0().c() == BsonContextType.SCOPE_DOCUMENT) {
            A0(s0().e());
            P1(JsonTokenType.END_OBJECT);
        }
        if (s0() == null) {
            throw new JsonParseException("Unexpected end of document.");
        } else if (s0().c() == BsonContextType.ARRAY || s0().c() == BsonContextType.DOCUMENT) {
            JsonToken I1 = I1();
            if (I1.a() != JsonTokenType.COMMA) {
                J1(I1);
            }
        }
    }

    public int F() {
        return ((Integer) this.G).intValue();
    }

    public long G() {
        return ((Long) this.G).longValue();
    }

    public String H() {
        return (String) this.G;
    }

    /* renamed from: H1 */
    public Context s0() {
        return (Context) super.s0();
    }

    public String I() {
        return (String) this.G;
    }

    public final JsonToken I1() {
        JsonToken jsonToken = this.F;
        if (jsonToken == null) {
            return this.E.c();
        }
        this.F = null;
        return jsonToken;
    }

    public final void J1(JsonToken jsonToken) {
        if (this.F == null) {
            this.F = jsonToken;
            return;
        }
        throw new BsonInvalidOperationException("There is already a pending token.");
    }

    public final byte K1() {
        JsonToken I1 = I1();
        JsonTokenType a2 = I1.a();
        JsonTokenType jsonTokenType = JsonTokenType.STRING;
        if (a2 == jsonTokenType || I1.a() == JsonTokenType.INT32) {
            return I1.a() == jsonTokenType ? (byte) Integer.parseInt((String) I1.c(String.class), 16) : ((Integer) I1.c(Integer.class)).byteValue();
        }
        throw new JsonParseException("JSON reader expected a string or number but found '%s'.", I1.b());
    }

    public final ObjectId L1() {
        P1(JsonTokenType.COLON);
        P1(JsonTokenType.BEGIN_OBJECT);
        Q1(JsonTokenType.STRING, "$oid");
        return q2();
    }

    public final int M1() {
        JsonToken I1 = I1();
        if (I1.a() == JsonTokenType.INT32) {
            return ((Integer) I1.c(Integer.class)).intValue();
        }
        if (I1.a() == JsonTokenType.INT64) {
            return ((Long) I1.c(Long.class)).intValue();
        }
        throw new JsonParseException("JSON reader expected an integer but found '%s'.", I1.b());
    }

    public void N() {
    }

    public final String N1() {
        JsonToken I1 = I1();
        if (I1.a() == JsonTokenType.STRING) {
            return (String) I1.c(String.class);
        }
        throw new JsonParseException("JSON reader expected a string but found '%s'.", I1.b());
    }

    public void O() {
    }

    public final void O1(String str) {
        if (str != null) {
            JsonToken I1 = I1();
            JsonTokenType a2 = I1.a();
            if ((a2 != JsonTokenType.STRING && a2 != JsonTokenType.UNQUOTED_STRING) || !str.equals(I1.b())) {
                throw new JsonParseException("JSON reader expected '%s' but found '%s'.", str, I1.b());
            }
            return;
        }
        throw new IllegalArgumentException("Can't be null");
    }

    public final void P1(JsonTokenType jsonTokenType) {
        JsonToken I1 = I1();
        if (jsonTokenType != I1.a()) {
            throw new JsonParseException("JSON reader expected token type '%s' but found '%s'.", jsonTokenType, I1.b());
        }
    }

    public void Q() {
    }

    public final void Q1(JsonTokenType jsonTokenType, Object obj) {
        JsonToken I1 = I1();
        if (jsonTokenType != I1.a()) {
            throw new JsonParseException("JSON reader expected token type '%s' but found '%s'.", jsonTokenType, I1.b());
        } else if (!obj.equals(I1.b())) {
            throw new JsonParseException("JSON reader expected '%s' but found '%s'.", obj, I1.b());
        }
    }

    public final BsonBinary R1() {
        P1(JsonTokenType.LEFT_PAREN);
        JsonToken I1 = I1();
        if (I1.a() == JsonTokenType.INT32) {
            P1(JsonTokenType.COMMA);
            JsonToken I12 = I1();
            if (I12.a() == JsonTokenType.UNQUOTED_STRING || I12.a() == JsonTokenType.STRING) {
                P1(JsonTokenType.RIGHT_PAREN);
                return new BsonBinary(((Integer) I1.c(Integer.class)).byteValue(), Base64.b((String) I12.c(String.class)));
            }
            throw new JsonParseException("JSON reader expected a string but found '%s'.", I12.b());
        }
        throw new JsonParseException("JSON reader expected a binary subtype but found '%s'.", I1.b());
    }

    public ObjectId S() {
        return (ObjectId) this.G;
    }

    public final BsonBinary S1(String str) {
        byte[] bArr;
        byte b2;
        Mark mark = new Mark();
        try {
            JsonTokenType jsonTokenType = JsonTokenType.COLON;
            P1(jsonTokenType);
            if (!str.equals("$binary")) {
                mark.b();
                BsonBinary d2 = d2(str);
                mark.d();
                return d2;
            } else if (I1().a() == JsonTokenType.BEGIN_OBJECT) {
                String str2 = (String) I1().c(String.class);
                if (str2.equals("base64")) {
                    P1(jsonTokenType);
                    bArr = Base64.b(N1());
                    P1(JsonTokenType.COMMA);
                    O1("subType");
                    P1(jsonTokenType);
                    b2 = K1();
                } else if (str2.equals("subType")) {
                    P1(jsonTokenType);
                    byte K1 = K1();
                    P1(JsonTokenType.COMMA);
                    O1("base64");
                    P1(jsonTokenType);
                    b2 = K1;
                    bArr = Base64.b(N1());
                } else {
                    throw new JsonParseException("Unexpected key for $binary: " + str2);
                }
                JsonTokenType jsonTokenType2 = JsonTokenType.END_OBJECT;
                P1(jsonTokenType2);
                P1(jsonTokenType2);
                BsonBinary bsonBinary = new BsonBinary(b2, bArr);
                mark.d();
                return bsonBinary;
            } else {
                mark.b();
                BsonBinary d22 = d2(str);
                mark.d();
                return d22;
            }
        } catch (Throwable th) {
            mark.d();
            throw th;
        }
    }

    public BsonRegularExpression T() {
        return (BsonRegularExpression) this.G;
    }

    public final BsonDbPointer T1() {
        P1(JsonTokenType.LEFT_PAREN);
        String N1 = N1();
        P1(JsonTokenType.COMMA);
        ObjectId objectId = new ObjectId(N1());
        P1(JsonTokenType.RIGHT_PAREN);
        return new BsonDbPointer(N1, objectId);
    }

    public final long U1() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE MMM dd yyyy HH:mm:ss z", Locale.ENGLISH);
        P1(JsonTokenType.LEFT_PAREN);
        JsonToken I1 = I1();
        JsonTokenType a2 = I1.a();
        JsonTokenType jsonTokenType = JsonTokenType.RIGHT_PAREN;
        if (a2 == jsonTokenType) {
            return new Date().getTime();
        }
        if (I1.a() == JsonTokenType.STRING) {
            P1(jsonTokenType);
            String str = (String) I1.c(String.class);
            ParsePosition parsePosition = new ParsePosition(0);
            Date parse = simpleDateFormat.parse(str, parsePosition);
            if (parse != null && parsePosition.getIndex() == str.length()) {
                return parse.getTime();
            }
            throw new JsonParseException("JSON reader expected a date in 'EEE MMM dd yyyy HH:mm:ss z' format but found '%s'.", str);
        } else if (I1.a() == JsonTokenType.INT32 || I1.a() == JsonTokenType.INT64) {
            long[] jArr = new long[7];
            int i2 = 0;
            while (true) {
                if (i2 < 7) {
                    jArr[i2] = ((Long) I1.c(Long.class)).longValue();
                    i2++;
                }
                JsonToken I12 = I1();
                if (I12.a() == JsonTokenType.RIGHT_PAREN) {
                    if (i2 == 1) {
                        return jArr[0];
                    }
                    if (i2 < 3 || i2 > 7) {
                        throw new JsonParseException("JSON reader expected 1 or 3-7 integers but found %d.", Integer.valueOf(i2));
                    }
                    Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                    instance.set(1, (int) jArr[0]);
                    instance.set(2, (int) jArr[1]);
                    instance.set(5, (int) jArr[2]);
                    instance.set(11, (int) jArr[3]);
                    instance.set(12, (int) jArr[4]);
                    instance.set(13, (int) jArr[5]);
                    instance.set(14, (int) jArr[6]);
                    return instance.getTimeInMillis();
                } else if (I12.a() == JsonTokenType.COMMA) {
                    I1 = I1();
                    if (I1.a() != JsonTokenType.INT32 && I1.a() != JsonTokenType.INT64) {
                        throw new JsonParseException("JSON reader expected an integer but found '%s'.", I1.b());
                    }
                } else {
                    throw new JsonParseException("JSON reader expected a ',' or a ')' but found '%s'.", I12.b());
                }
            }
        } else {
            throw new JsonParseException("JSON reader expected an integer or a string but found '%s'.", I1.b());
        }
    }

    public final String V1() {
        P1(JsonTokenType.LEFT_PAREN);
        JsonToken I1 = I1();
        if (I1.a() != JsonTokenType.RIGHT_PAREN) {
            while (I1.a() != JsonTokenType.END_OF_FILE) {
                I1 = I1();
                if (I1.a() == JsonTokenType.RIGHT_PAREN) {
                    break;
                }
            }
            if (I1.a() != JsonTokenType.RIGHT_PAREN) {
                throw new JsonParseException("JSON reader expected a ')' but found '%s'.", I1.b());
            }
        }
        return new SimpleDateFormat("EEE MMM dd yyyy HH:mm:ss z", Locale.ENGLISH).format(new Date());
    }

    public final long W1() {
        long j2;
        P1(JsonTokenType.COLON);
        JsonToken I1 = I1();
        Class<String> cls = String.class;
        if (I1.a() == JsonTokenType.BEGIN_OBJECT) {
            String str = (String) I1().c(cls);
            if (str.equals("$numberLong")) {
                long longValue = o2().longValue();
                P1(JsonTokenType.END_OBJECT);
                return longValue;
            }
            throw new JsonParseException(String.format("JSON reader expected $numberLong within $date, but found %s", new Object[]{str}));
        }
        if (I1.a() == JsonTokenType.INT32 || I1.a() == JsonTokenType.INT64) {
            j2 = ((Long) I1.c(Long.class)).longValue();
        } else if (I1.a() == JsonTokenType.STRING) {
            try {
                j2 = DateTimeFormatter.c((String) I1.c(cls));
            } catch (IllegalArgumentException e2) {
                throw new JsonParseException("Failed to parse string as a date", e2);
            }
        } else {
            throw new JsonParseException("JSON reader expected an integer or string but found '%s'.", I1.b());
        }
        P1(JsonTokenType.END_OBJECT);
        return j2;
    }

    public void X() {
        A0(new Context(s0(), BsonContextType.ARRAY));
    }

    public final BsonDbPointer X1() {
        ObjectId objectId;
        String str;
        JsonTokenType jsonTokenType = JsonTokenType.COLON;
        P1(jsonTokenType);
        P1(JsonTokenType.BEGIN_OBJECT);
        String N1 = N1();
        if (N1.equals("$ref")) {
            P1(jsonTokenType);
            str = N1();
            P1(JsonTokenType.COMMA);
            O1("$id");
            objectId = L1();
            P1(JsonTokenType.END_OBJECT);
        } else if (N1.equals("$id")) {
            objectId = L1();
            P1(JsonTokenType.COMMA);
            O1("$ref");
            P1(jsonTokenType);
            str = N1();
        } else {
            throw new JsonParseException("Expected $ref and $id fields in $dbPointer document but found " + N1);
        }
        P1(JsonTokenType.END_OBJECT);
        return new BsonDbPointer(str, objectId);
    }

    public final void Y1() {
        JsonToken I1 = I1();
        if (I1.a() == JsonTokenType.LEFT_PAREN) {
            P1(JsonTokenType.RIGHT_PAREN);
        } else {
            J1(I1);
        }
    }

    public final void Z1() {
        JsonToken I1 = I1();
        String str = (String) I1.c(String.class);
        JsonTokenType a2 = I1.a();
        if (a2 == JsonTokenType.STRING || a2 == JsonTokenType.UNQUOTED_STRING) {
            if ("$binary".equals(str) || "$type".equals(str)) {
                BsonBinary S1 = S1(str);
                this.G = S1;
                if (S1 != null) {
                    E0(BsonType.BINARY);
                    return;
                }
            } else if ("$regex".equals(str) || "$options".equals(str)) {
                BsonRegularExpression s2 = s2(str);
                this.G = s2;
                if (s2 != null) {
                    E0(BsonType.REGULAR_EXPRESSION);
                    return;
                }
            } else if ("$code".equals(str)) {
                c2();
                return;
            } else if ("$date".equals(str)) {
                this.G = Long.valueOf(W1());
                E0(BsonType.DATE_TIME);
                return;
            } else if ("$maxKey".equals(str)) {
                this.G = e2();
                E0(BsonType.MAX_KEY);
                return;
            } else if ("$minKey".equals(str)) {
                this.G = f2();
                E0(BsonType.MIN_KEY);
                return;
            } else if ("$oid".equals(str)) {
                this.G = q2();
                E0(BsonType.OBJECT_ID);
                return;
            } else if ("$regularExpression".equals(str)) {
                this.G = h2();
                E0(BsonType.REGULAR_EXPRESSION);
                return;
            } else if ("$symbol".equals(str)) {
                this.G = t2();
                E0(BsonType.SYMBOL);
                return;
            } else if ("$timestamp".equals(str)) {
                this.G = v2();
                E0(BsonType.TIMESTAMP);
                return;
            } else if ("$undefined".equals(str)) {
                this.G = x2();
                E0(BsonType.UNDEFINED);
                return;
            } else if ("$numberLong".equals(str)) {
                this.G = o2();
                E0(BsonType.INT64);
                return;
            } else if ("$numberInt".equals(str)) {
                this.G = m2();
                E0(BsonType.INT32);
                return;
            } else if ("$numberDouble".equals(str)) {
                this.G = k2();
                E0(BsonType.DOUBLE);
                return;
            } else if ("$numberDecimal".equals(str)) {
                this.G = j2();
                E0(BsonType.DECIMAL128);
                return;
            } else if ("$dbPointer".equals(str)) {
                this.G = X1();
                E0(BsonType.DB_POINTER);
                return;
            }
        }
        J1(I1);
        E0(BsonType.DOCUMENT);
    }

    public final BsonBinary a2() {
        P1(JsonTokenType.LEFT_PAREN);
        JsonToken I1 = I1();
        if (I1.a() == JsonTokenType.INT32) {
            P1(JsonTokenType.COMMA);
            String N1 = N1();
            P1(JsonTokenType.RIGHT_PAREN);
            if ((N1.length() & 1) != 0) {
                N1 = "0" + N1;
            }
            for (BsonBinarySubType bsonBinarySubType : BsonBinarySubType.values()) {
                if (bsonBinarySubType.d() == ((Integer) I1.c(Integer.class)).intValue()) {
                    return new BsonBinary(bsonBinarySubType, G1(N1));
                }
            }
            return new BsonBinary(G1(N1));
        }
        throw new JsonParseException("JSON reader expected a binary subtype but found '%s'.", I1.b());
    }

    public final long b2() {
        P1(JsonTokenType.LEFT_PAREN);
        JsonToken I1 = I1();
        JsonTokenType a2 = I1.a();
        JsonTokenType jsonTokenType = JsonTokenType.RIGHT_PAREN;
        if (a2 == jsonTokenType) {
            return new Date().getTime();
        }
        if (I1.a() == JsonTokenType.STRING) {
            P1(jsonTokenType);
            String[] strArr = {"yyyy-MM-dd", "yyyy-MM-dd'T'HH:mm:ssz", "yyyy-MM-dd'T'HH:mm:ss.SSSz"};
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(strArr[0], Locale.ENGLISH);
            ParsePosition parsePosition = new ParsePosition(0);
            String str = (String) I1.c(String.class);
            if (str.endsWith("Z")) {
                str = str.substring(0, str.length() - 1) + "GMT-00:00";
            }
            for (int i2 = 0; i2 < 3; i2++) {
                simpleDateFormat.applyPattern(strArr[i2]);
                simpleDateFormat.setLenient(true);
                parsePosition.setIndex(0);
                Date parse = simpleDateFormat.parse(str, parsePosition);
                if (parse != null && parsePosition.getIndex() == str.length()) {
                    return parse.getTime();
                }
            }
            throw new JsonParseException("Invalid date format.");
        }
        throw new JsonParseException("JSON reader expected a string but found '%s'.", I1.b());
    }

    public void c0() {
        A0(new Context(s0(), BsonContextType.DOCUMENT));
    }

    public final void c2() {
        JsonTokenType jsonTokenType = JsonTokenType.COLON;
        P1(jsonTokenType);
        String N1 = N1();
        JsonToken I1 = I1();
        int i2 = AnonymousClass1.f43917a[I1.a().ordinal()];
        if (i2 == 3) {
            this.G = N1;
            E0(BsonType.JAVASCRIPT);
        } else if (i2 == 11) {
            O1("$scope");
            P1(jsonTokenType);
            H0(AbstractBsonReader.State.VALUE);
            this.G = N1;
            E0(BsonType.JAVASCRIPT_WITH_SCOPE);
            A0(new Context(s0(), BsonContextType.SCOPE_DOCUMENT));
        } else {
            throw new JsonParseException("JSON reader expected ',' or '}' but found '%s'.", I1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005a, code lost:
        r1.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
        r1.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        r1.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002d, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:11:0x0057, B:15:0x005e] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0057 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x005e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.bson.BsonBinary d2(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "$binary"
            org.bson.json.JsonReader$Mark r1 = new org.bson.json.JsonReader$Mark
            r1.<init>()
            r2 = 0
            org.bson.json.JsonTokenType r3 = org.bson.json.JsonTokenType.COLON     // Catch:{ JsonParseException -> 0x005e, NumberFormatException -> 0x0057 }
            r6.P1(r3)     // Catch:{ JsonParseException -> 0x005e, NumberFormatException -> 0x0057 }
            boolean r7 = r7.equals(r0)     // Catch:{ JsonParseException -> 0x005e, NumberFormatException -> 0x0057 }
            if (r7 == 0) goto L_0x002f
            java.lang.String r7 = r6.N1()     // Catch:{ JsonParseException -> 0x005e, NumberFormatException -> 0x0057 }
            byte[] r7 = org.bson.internal.Base64.b(r7)     // Catch:{ JsonParseException -> 0x005e, NumberFormatException -> 0x0057 }
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.COMMA     // Catch:{ JsonParseException -> 0x005e, NumberFormatException -> 0x0057 }
            r6.P1(r0)     // Catch:{ JsonParseException -> 0x005e, NumberFormatException -> 0x0057 }
            java.lang.String r0 = "$type"
            r6.O1(r0)     // Catch:{ JsonParseException -> 0x005e, NumberFormatException -> 0x0057 }
            r6.P1(r3)     // Catch:{ JsonParseException -> 0x005e, NumberFormatException -> 0x0057 }
            byte r0 = r6.K1()     // Catch:{ JsonParseException -> 0x005e, NumberFormatException -> 0x0057 }
            goto L_0x0049
        L_0x002d:
            r7 = move-exception
            goto L_0x0065
        L_0x002f:
            byte r7 = r6.K1()     // Catch:{ JsonParseException -> 0x005e, NumberFormatException -> 0x0057 }
            org.bson.json.JsonTokenType r4 = org.bson.json.JsonTokenType.COMMA     // Catch:{ JsonParseException -> 0x005e, NumberFormatException -> 0x0057 }
            r6.P1(r4)     // Catch:{ JsonParseException -> 0x005e, NumberFormatException -> 0x0057 }
            r6.O1(r0)     // Catch:{ JsonParseException -> 0x005e, NumberFormatException -> 0x0057 }
            r6.P1(r3)     // Catch:{ JsonParseException -> 0x005e, NumberFormatException -> 0x0057 }
            java.lang.String r0 = r6.N1()     // Catch:{ JsonParseException -> 0x005e, NumberFormatException -> 0x0057 }
            byte[] r0 = org.bson.internal.Base64.b(r0)     // Catch:{ JsonParseException -> 0x005e, NumberFormatException -> 0x0057 }
            r5 = r0
            r0 = r7
            r7 = r5
        L_0x0049:
            org.bson.json.JsonTokenType r3 = org.bson.json.JsonTokenType.END_OBJECT     // Catch:{ JsonParseException -> 0x005e, NumberFormatException -> 0x0057 }
            r6.P1(r3)     // Catch:{ JsonParseException -> 0x005e, NumberFormatException -> 0x0057 }
            org.bson.BsonBinary r3 = new org.bson.BsonBinary     // Catch:{ JsonParseException -> 0x005e, NumberFormatException -> 0x0057 }
            r3.<init>((byte) r0, (byte[]) r7)     // Catch:{ JsonParseException -> 0x005e, NumberFormatException -> 0x0057 }
            r1.d()
            return r3
        L_0x0057:
            r1.b()     // Catch:{ all -> 0x002d }
            r1.d()
            return r2
        L_0x005e:
            r1.b()     // Catch:{ all -> 0x002d }
            r1.d()
            return r2
        L_0x0065:
            r1.d()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bson.json.JsonReader.d2(java.lang.String):org.bson.BsonBinary");
    }

    public String e0() {
        return (String) this.G;
    }

    public final MaxKey e2() {
        P1(JsonTokenType.COLON);
        Q1(JsonTokenType.INT32, 1);
        P1(JsonTokenType.END_OBJECT);
        return new MaxKey();
    }

    public String f0() {
        return (String) this.G;
    }

    public final MinKey f2() {
        P1(JsonTokenType.COLON);
        Q1(JsonTokenType.INT32, 1);
        P1(JsonTokenType.END_OBJECT);
        return new MinKey();
    }

    public BsonTimestamp g0() {
        return (BsonTimestamp) this.G;
    }

    public final void g2() {
        JsonToken I1 = I1();
        if (I1.a() == JsonTokenType.UNQUOTED_STRING) {
            String str = (String) I1.c(String.class);
            if ("MinKey".equals(str)) {
                Y1();
                E0(BsonType.MIN_KEY);
                this.G = new MinKey();
            } else if ("MaxKey".equals(str)) {
                Y1();
                E0(BsonType.MAX_KEY);
                this.G = new MaxKey();
            } else if ("BinData".equals(str)) {
                this.G = R1();
                E0(BsonType.BINARY);
            } else if ("Date".equals(str)) {
                this.G = Long.valueOf(U1());
                E0(BsonType.DATE_TIME);
            } else if ("HexData".equals(str)) {
                this.G = a2();
                E0(BsonType.BINARY);
            } else if ("ISODate".equals(str)) {
                this.G = Long.valueOf(b2());
                E0(BsonType.DATE_TIME);
            } else if ("NumberInt".equals(str)) {
                this.G = Integer.valueOf(l2());
                E0(BsonType.INT32);
            } else if ("NumberLong".equals(str)) {
                this.G = Long.valueOf(n2());
                E0(BsonType.INT64);
            } else if ("NumberDecimal".equals(str)) {
                this.G = i2();
                E0(BsonType.DECIMAL128);
            } else if ("ObjectId".equals(str)) {
                this.G = p2();
                E0(BsonType.OBJECT_ID);
            } else if ("RegExp".equals(str)) {
                this.G = r2();
                E0(BsonType.REGULAR_EXPRESSION);
            } else if ("DBPointer".equals(str)) {
                this.G = T1();
                E0(BsonType.DB_POINTER);
            } else if ("UUID".equals(str) || "GUID".equals(str) || "CSUUID".equals(str) || "CSGUID".equals(str) || "JUUID".equals(str) || "JGUID".equals(str) || "PYUUID".equals(str) || "PYGUID".equals(str)) {
                this.G = w2(str);
                E0(BsonType.BINARY);
            } else {
                throw new JsonParseException("JSON reader expected a type name but found '%s'.", str);
            }
        } else {
            throw new JsonParseException("JSON reader expected a type name but found '%s'.", I1.b());
        }
    }

    public final BsonRegularExpression h2() {
        String str;
        String str2;
        JsonTokenType jsonTokenType = JsonTokenType.COLON;
        P1(jsonTokenType);
        P1(JsonTokenType.BEGIN_OBJECT);
        String N1 = N1();
        if (N1.equals("pattern")) {
            P1(jsonTokenType);
            str = N1();
            P1(JsonTokenType.COMMA);
            O1("options");
            P1(jsonTokenType);
            str2 = N1();
        } else if (N1.equals("options")) {
            P1(jsonTokenType);
            String N12 = N1();
            P1(JsonTokenType.COMMA);
            O1("pattern");
            P1(jsonTokenType);
            String str3 = N12;
            str = N1();
            str2 = str3;
        } else {
            throw new JsonParseException("Expected 't' and 'i' fields in $timestamp document but found " + N1);
        }
        JsonTokenType jsonTokenType2 = JsonTokenType.END_OBJECT;
        P1(jsonTokenType2);
        P1(jsonTokenType2);
        return new BsonRegularExpression(str, str2);
    }

    public final Decimal128 i2() {
        Decimal128 decimal128;
        P1(JsonTokenType.LEFT_PAREN);
        JsonToken I1 = I1();
        if (I1.a() == JsonTokenType.INT32 || I1.a() == JsonTokenType.INT64 || I1.a() == JsonTokenType.DOUBLE) {
            decimal128 = (Decimal128) I1.c(Decimal128.class);
        } else if (I1.a() == JsonTokenType.STRING) {
            decimal128 = Decimal128.z((String) I1.c(String.class));
        } else {
            throw new JsonParseException("JSON reader expected a number or a string but found '%s'.", I1.b());
        }
        P1(JsonTokenType.RIGHT_PAREN);
        return decimal128;
    }

    public final Decimal128 j2() {
        P1(JsonTokenType.COLON);
        String N1 = N1();
        try {
            Decimal128 z2 = Decimal128.z(N1);
            P1(JsonTokenType.END_OBJECT);
            return z2;
        } catch (NumberFormatException e2) {
            throw new JsonParseException(String.format("Exception converting value '%s' to type %s", new Object[]{N1, Decimal128.class.getName()}), e2);
        }
    }

    public final Double k2() {
        P1(JsonTokenType.COLON);
        String N1 = N1();
        try {
            Double valueOf = Double.valueOf(N1);
            P1(JsonTokenType.END_OBJECT);
            return valueOf;
        } catch (NumberFormatException e2) {
            throw new JsonParseException(String.format("Exception converting value '%s' to type %s", new Object[]{N1, Double.class.getName()}), e2);
        }
    }

    public int l() {
        return r().p0().length;
    }

    public final int l2() {
        int i2;
        P1(JsonTokenType.LEFT_PAREN);
        JsonToken I1 = I1();
        if (I1.a() == JsonTokenType.INT32) {
            i2 = ((Integer) I1.c(Integer.class)).intValue();
        } else if (I1.a() == JsonTokenType.STRING) {
            i2 = Integer.parseInt((String) I1.c(String.class));
        } else {
            throw new JsonParseException("JSON reader expected an integer or a string but found '%s'.", I1.b());
        }
        P1(JsonTokenType.RIGHT_PAREN);
        return i2;
    }

    public byte m() {
        return r().q0();
    }

    public void m0() {
    }

    public BsonReaderMark m1() {
        return new Mark();
    }

    public final Integer m2() {
        P1(JsonTokenType.COLON);
        String N1 = N1();
        try {
            Integer valueOf = Integer.valueOf(N1);
            P1(JsonTokenType.END_OBJECT);
            return valueOf;
        } catch (NumberFormatException e2) {
            throw new JsonParseException(String.format("Exception converting value '%s' to type %s", new Object[]{N1, Integer.class.getName()}), e2);
        }
    }

    public void n0() {
    }

    public final long n2() {
        long j2;
        P1(JsonTokenType.LEFT_PAREN);
        JsonToken I1 = I1();
        if (I1.a() == JsonTokenType.INT32 || I1.a() == JsonTokenType.INT64) {
            j2 = ((Long) I1.c(Long.class)).longValue();
        } else if (I1.a() == JsonTokenType.STRING) {
            j2 = Long.parseLong((String) I1.c(String.class));
        } else {
            throw new JsonParseException("JSON reader expected an integer or a string but found '%s'.", I1.b());
        }
        P1(JsonTokenType.RIGHT_PAREN);
        return j2;
    }

    public void o0() {
        switch (AnonymousClass1.f43919c[C1().ordinal()]) {
            case 1:
                y0();
                while (t1() != BsonType.END_OF_DOCUMENT) {
                    Y();
                }
                I0();
                return;
            case 2:
                J();
                return;
            case 3:
                readBoolean();
                return;
            case 4:
                r0();
                return;
            case 5:
                Z0();
                while (t1() != BsonType.END_OF_DOCUMENT) {
                    L0();
                    Y();
                }
                T0();
                return;
            case 6:
                readDouble();
                return;
            case 7:
                i();
                return;
            case 8:
                n();
                return;
            case 9:
                K();
                return;
            case 10:
                R0();
                return;
            case 11:
                C0();
                Z0();
                while (t1() != BsonType.END_OF_DOCUMENT) {
                    L0();
                    Y();
                }
                T0();
                return;
            case 12:
                D0();
                return;
            case 13:
                Z();
                return;
            case 14:
                i1();
                return;
            case 15:
                w();
                return;
            case 16:
                f1();
                return;
            case 17:
                h();
                return;
            case 18:
                b0();
                return;
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER:
                W();
                return;
            case 20:
                X0();
                return;
            default:
                return;
        }
    }

    public final Long o2() {
        P1(JsonTokenType.COLON);
        String N1 = N1();
        try {
            Long valueOf = Long.valueOf(N1);
            P1(JsonTokenType.END_OBJECT);
            return valueOf;
        } catch (NumberFormatException e2) {
            throw new JsonParseException(String.format("Exception converting value '%s' to type %s", new Object[]{N1, Long.class.getName()}), e2);
        }
    }

    public final ObjectId p2() {
        P1(JsonTokenType.LEFT_PAREN);
        ObjectId objectId = new ObjectId(N1());
        P1(JsonTokenType.RIGHT_PAREN);
        return objectId;
    }

    public final ObjectId q2() {
        P1(JsonTokenType.COLON);
        ObjectId objectId = new ObjectId(N1());
        P1(JsonTokenType.END_OBJECT);
        return objectId;
    }

    public BsonBinary r() {
        return (BsonBinary) this.G;
    }

    public final BsonRegularExpression r2() {
        String str;
        P1(JsonTokenType.LEFT_PAREN);
        String N1 = N1();
        JsonToken I1 = I1();
        if (I1.a() == JsonTokenType.COMMA) {
            str = N1();
        } else {
            J1(I1);
            str = "";
        }
        P1(JsonTokenType.RIGHT_PAREN);
        return new BsonRegularExpression(N1, str);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:11|12|13|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        r1.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0055, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        r1.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0028, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x004e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.bson.BsonRegularExpression s2(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "$regex"
            org.bson.json.JsonReader$Mark r1 = new org.bson.json.JsonReader$Mark
            r1.<init>()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.COLON     // Catch:{ JsonParseException -> 0x004e }
            r5.P1(r2)     // Catch:{ JsonParseException -> 0x004e }
            boolean r6 = r6.equals(r0)     // Catch:{ JsonParseException -> 0x004e }
            if (r6 == 0) goto L_0x002a
            java.lang.String r6 = r5.N1()     // Catch:{ JsonParseException -> 0x004e }
            org.bson.json.JsonTokenType r0 = org.bson.json.JsonTokenType.COMMA     // Catch:{ JsonParseException -> 0x004e }
            r5.P1(r0)     // Catch:{ JsonParseException -> 0x004e }
            java.lang.String r0 = "$options"
            r5.O1(r0)     // Catch:{ JsonParseException -> 0x004e }
            r5.P1(r2)     // Catch:{ JsonParseException -> 0x004e }
            java.lang.String r0 = r5.N1()     // Catch:{ JsonParseException -> 0x004e }
            goto L_0x0040
        L_0x0028:
            r6 = move-exception
            goto L_0x0056
        L_0x002a:
            java.lang.String r6 = r5.N1()     // Catch:{ JsonParseException -> 0x004e }
            org.bson.json.JsonTokenType r3 = org.bson.json.JsonTokenType.COMMA     // Catch:{ JsonParseException -> 0x004e }
            r5.P1(r3)     // Catch:{ JsonParseException -> 0x004e }
            r5.O1(r0)     // Catch:{ JsonParseException -> 0x004e }
            r5.P1(r2)     // Catch:{ JsonParseException -> 0x004e }
            java.lang.String r0 = r5.N1()     // Catch:{ JsonParseException -> 0x004e }
            r4 = r0
            r0 = r6
            r6 = r4
        L_0x0040:
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.END_OBJECT     // Catch:{ JsonParseException -> 0x004e }
            r5.P1(r2)     // Catch:{ JsonParseException -> 0x004e }
            org.bson.BsonRegularExpression r2 = new org.bson.BsonRegularExpression     // Catch:{ JsonParseException -> 0x004e }
            r2.<init>(r6, r0)     // Catch:{ JsonParseException -> 0x004e }
            r1.d()
            return r2
        L_0x004e:
            r1.b()     // Catch:{ all -> 0x0028 }
            r1.d()
            r6 = 0
            return r6
        L_0x0056:
            r1.d()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bson.json.JsonReader.s2(java.lang.String):org.bson.BsonRegularExpression");
    }

    public boolean t() {
        return ((Boolean) this.G).booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02f6, code lost:
        throw new org.bson.json.JsonParseException("JSON reader was expecting a value but found '%s'.", r0.b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0326, code lost:
        if (H1().c() == r5) goto L_0x0332;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0330, code lost:
        if (H1().c() != r1) goto L_0x0341;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0332, code lost:
        r0 = I1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x033c, code lost:
        if (r0.a() == org.bson.json.JsonTokenType.COMMA) goto L_0x0341;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x033e, code lost:
        J1(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0341, code lost:
        r0 = org.bson.json.JsonReader.AnonymousClass1.f43918b[H1().c().ordinal()];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0351, code lost:
        if (r0 == 3) goto L_0x035f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0354, code lost:
        if (r0 == 4) goto L_0x035f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0357, code lost:
        if (r0 == 5) goto L_0x035f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0359, code lost:
        H0(org.bson.AbstractBsonReader.State.NAME);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x035f, code lost:
        H0(org.bson.AbstractBsonReader.State.VALUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0368, code lost:
        return C1();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.bson.BsonType t1() {
        /*
            r8 = this;
            boolean r0 = r8.isClosed()
            if (r0 != 0) goto L_0x0369
            org.bson.AbstractBsonReader$State r0 = r8.w0()
            org.bson.AbstractBsonReader$State r1 = org.bson.AbstractBsonReader.State.INITIAL
            if (r0 == r1) goto L_0x001e
            org.bson.AbstractBsonReader$State r0 = r8.w0()
            org.bson.AbstractBsonReader$State r1 = org.bson.AbstractBsonReader.State.DONE
            if (r0 == r1) goto L_0x001e
            org.bson.AbstractBsonReader$State r0 = r8.w0()
            org.bson.AbstractBsonReader$State r1 = org.bson.AbstractBsonReader.State.SCOPE_DOCUMENT
            if (r0 != r1) goto L_0x0023
        L_0x001e:
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.TYPE
            r8.H0(r0)
        L_0x0023:
            org.bson.AbstractBsonReader$State r0 = r8.w0()
            org.bson.AbstractBsonReader$State r1 = org.bson.AbstractBsonReader.State.TYPE
            if (r0 == r1) goto L_0x0034
            java.lang.String r0 = "readBSONType"
            org.bson.AbstractBsonReader$State[] r1 = new org.bson.AbstractBsonReader.State[]{r1}
            r8.U0(r0, r1)
        L_0x0034:
            org.bson.json.JsonReader$Context r0 = r8.s0()
            org.bson.BsonContextType r0 = r0.c()
            org.bson.BsonContextType r1 = org.bson.BsonContextType.DOCUMENT
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r3 = 3
            if (r0 != r1) goto L_0x0099
            org.bson.json.JsonToken r0 = r8.I1()
            int[] r4 = org.bson.json.JsonReader.AnonymousClass1.f43917a
            org.bson.json.JsonTokenType r5 = r0.a()
            int r5 = r5.ordinal()
            r4 = r4[r5]
            r5 = 1
            if (r4 == r5) goto L_0x0073
            r5 = 2
            if (r4 == r5) goto L_0x0073
            if (r4 != r3) goto L_0x0063
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.END_OF_DOCUMENT
            r8.H0(r0)
            org.bson.BsonType r0 = org.bson.BsonType.END_OF_DOCUMENT
            return r0
        L_0x0063:
            org.bson.json.JsonParseException r1 = new org.bson.json.JsonParseException
            java.lang.Object r0 = r0.b()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "JSON reader was expecting a name but found '%s'."
            r1.<init>(r2, r0)
            throw r1
        L_0x0073:
            java.lang.Object r0 = r0.c(r2)
            java.lang.String r0 = (java.lang.String) r0
            r8.G0(r0)
            org.bson.json.JsonToken r0 = r8.I1()
            org.bson.json.JsonTokenType r4 = r0.a()
            org.bson.json.JsonTokenType r5 = org.bson.json.JsonTokenType.COLON
            if (r4 != r5) goto L_0x0089
            goto L_0x0099
        L_0x0089:
            org.bson.json.JsonParseException r1 = new org.bson.json.JsonParseException
            java.lang.Object r0 = r0.b()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "JSON reader was expecting ':' but found '%s'."
            r1.<init>(r2, r0)
            throw r1
        L_0x0099:
            org.bson.json.JsonToken r0 = r8.I1()
            org.bson.json.JsonReader$Context r4 = r8.s0()
            org.bson.BsonContextType r4 = r4.c()
            org.bson.BsonContextType r5 = org.bson.BsonContextType.ARRAY
            if (r4 != r5) goto L_0x00b9
            org.bson.json.JsonTokenType r4 = r0.a()
            org.bson.json.JsonTokenType r6 = org.bson.json.JsonTokenType.END_ARRAY
            if (r4 != r6) goto L_0x00b9
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.END_OF_ARRAY
            r8.H0(r0)
            org.bson.BsonType r0 = org.bson.BsonType.END_OF_DOCUMENT
            return r0
        L_0x00b9:
            int[] r4 = org.bson.json.JsonReader.AnonymousClass1.f43917a
            org.bson.json.JsonTokenType r6 = r0.a()
            int r6 = r6.ordinal()
            r4 = r4[r6]
            switch(r4) {
                case 1: goto L_0x0313;
                case 2: goto L_0x0111;
                case 3: goto L_0x00c8;
                case 4: goto L_0x010a;
                case 5: goto L_0x0105;
                case 6: goto L_0x00f8;
                case 7: goto L_0x00f1;
                case 8: goto L_0x00e4;
                case 9: goto L_0x00d7;
                case 10: goto L_0x00ca;
                default: goto L_0x00c8;
            }
        L_0x00c8:
            goto L_0x02e7
        L_0x00ca:
            org.bson.BsonType r2 = org.bson.BsonType.REGULAR_EXPRESSION
            r8.E0(r2)
            java.lang.Object r0 = r0.b()
            r8.G = r0
            goto L_0x031e
        L_0x00d7:
            org.bson.BsonType r2 = org.bson.BsonType.INT64
            r8.E0(r2)
            java.lang.Object r0 = r0.b()
            r8.G = r0
            goto L_0x031e
        L_0x00e4:
            org.bson.BsonType r2 = org.bson.BsonType.INT32
            r8.E0(r2)
            java.lang.Object r0 = r0.b()
            r8.G = r0
            goto L_0x031e
        L_0x00f1:
            org.bson.BsonType r0 = org.bson.BsonType.END_OF_DOCUMENT
            r8.E0(r0)
            goto L_0x031e
        L_0x00f8:
            org.bson.BsonType r2 = org.bson.BsonType.DOUBLE
            r8.E0(r2)
            java.lang.Object r0 = r0.b()
            r8.G = r0
            goto L_0x031e
        L_0x0105:
            r8.Z1()
            goto L_0x031e
        L_0x010a:
            org.bson.BsonType r0 = org.bson.BsonType.ARRAY
            r8.E0(r0)
            goto L_0x031e
        L_0x0111:
            java.lang.Object r2 = r0.c(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = "false"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x0303
            java.lang.String r4 = "true"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0129
            goto L_0x0303
        L_0x0129:
            java.lang.String r4 = "Infinity"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0140
            org.bson.BsonType r0 = org.bson.BsonType.DOUBLE
            r8.E0(r0)
            r6 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            java.lang.Double r0 = java.lang.Double.valueOf(r6)
            r8.G = r0
            goto L_0x031e
        L_0x0140:
            java.lang.String r4 = "NaN"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0157
            org.bson.BsonType r0 = org.bson.BsonType.DOUBLE
            r8.E0(r0)
            r6 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            java.lang.Double r0 = java.lang.Double.valueOf(r6)
            r8.G = r0
            goto L_0x031e
        L_0x0157:
            java.lang.String r4 = "null"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0166
            org.bson.BsonType r0 = org.bson.BsonType.NULL
            r8.E0(r0)
            goto L_0x031e
        L_0x0166:
            java.lang.String r4 = "undefined"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0175
            org.bson.BsonType r0 = org.bson.BsonType.UNDEFINED
            r8.E0(r0)
            goto L_0x031e
        L_0x0175:
            java.lang.String r4 = "MinKey"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x018e
            r8.Y1()
            org.bson.BsonType r0 = org.bson.BsonType.MIN_KEY
            r8.E0(r0)
            org.bson.types.MinKey r0 = new org.bson.types.MinKey
            r0.<init>()
            r8.G = r0
            goto L_0x031e
        L_0x018e:
            java.lang.String r4 = "MaxKey"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x01a7
            r8.Y1()
            org.bson.BsonType r0 = org.bson.BsonType.MAX_KEY
            r8.E0(r0)
            org.bson.types.MaxKey r0 = new org.bson.types.MaxKey
            r0.<init>()
            r8.G = r0
            goto L_0x031e
        L_0x01a7:
            java.lang.String r4 = "BinData"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x01bc
            org.bson.BsonType r0 = org.bson.BsonType.BINARY
            r8.E0(r0)
            org.bson.BsonBinary r0 = r8.R1()
            r8.G = r0
            goto L_0x031e
        L_0x01bc:
            java.lang.String r4 = "Date"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x01d1
            java.lang.String r0 = r8.V1()
            r8.G = r0
            org.bson.BsonType r0 = org.bson.BsonType.STRING
            r8.E0(r0)
            goto L_0x031e
        L_0x01d1:
            java.lang.String r4 = "HexData"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x01e6
            org.bson.BsonType r0 = org.bson.BsonType.BINARY
            r8.E0(r0)
            org.bson.BsonBinary r0 = r8.a2()
            r8.G = r0
            goto L_0x031e
        L_0x01e6:
            java.lang.String r4 = "ISODate"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x01ff
            org.bson.BsonType r0 = org.bson.BsonType.DATE_TIME
            r8.E0(r0)
            long r6 = r8.b2()
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r8.G = r0
            goto L_0x031e
        L_0x01ff:
            java.lang.String r4 = "NumberInt"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0218
            org.bson.BsonType r0 = org.bson.BsonType.INT32
            r8.E0(r0)
            int r0 = r8.l2()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.G = r0
            goto L_0x031e
        L_0x0218:
            java.lang.String r4 = "NumberLong"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0231
            org.bson.BsonType r0 = org.bson.BsonType.INT64
            r8.E0(r0)
            long r6 = r8.n2()
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r8.G = r0
            goto L_0x031e
        L_0x0231:
            java.lang.String r4 = "NumberDecimal"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0246
            org.bson.BsonType r0 = org.bson.BsonType.DECIMAL128
            r8.E0(r0)
            org.bson.types.Decimal128 r0 = r8.i2()
            r8.G = r0
            goto L_0x031e
        L_0x0246:
            java.lang.String r4 = "ObjectId"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x025b
            org.bson.BsonType r0 = org.bson.BsonType.OBJECT_ID
            r8.E0(r0)
            org.bson.types.ObjectId r0 = r8.p2()
            r8.G = r0
            goto L_0x031e
        L_0x025b:
            java.lang.String r4 = "Timestamp"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0270
            org.bson.BsonType r0 = org.bson.BsonType.TIMESTAMP
            r8.E0(r0)
            org.bson.BsonTimestamp r0 = r8.u2()
            r8.G = r0
            goto L_0x031e
        L_0x0270:
            java.lang.String r4 = "RegExp"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0285
            org.bson.BsonType r0 = org.bson.BsonType.REGULAR_EXPRESSION
            r8.E0(r0)
            org.bson.BsonRegularExpression r0 = r8.r2()
            r8.G = r0
            goto L_0x031e
        L_0x0285:
            java.lang.String r4 = "DBPointer"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x029a
            org.bson.BsonType r0 = org.bson.BsonType.DB_POINTER
            r8.E0(r0)
            org.bson.BsonDbPointer r0 = r8.T1()
            r8.G = r0
            goto L_0x031e
        L_0x029a:
            java.lang.String r4 = "UUID"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x02f7
            java.lang.String r4 = "GUID"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x02f7
            java.lang.String r4 = "CSUUID"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x02f7
            java.lang.String r4 = "CSGUID"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x02f7
            java.lang.String r4 = "JUUID"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x02f7
            java.lang.String r4 = "JGUID"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x02f7
            java.lang.String r4 = "PYUUID"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x02f7
            java.lang.String r4 = "PYGUID"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x02db
            goto L_0x02f7
        L_0x02db:
            java.lang.String r4 = "new"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x02e7
            r8.g2()
            goto L_0x031e
        L_0x02e7:
            org.bson.json.JsonParseException r1 = new org.bson.json.JsonParseException
            java.lang.Object r0 = r0.b()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "JSON reader was expecting a value but found '%s'."
            r1.<init>(r2, r0)
            throw r1
        L_0x02f7:
            org.bson.BsonType r0 = org.bson.BsonType.BINARY
            r8.E0(r0)
            org.bson.BsonBinary r0 = r8.w2(r2)
            r8.G = r0
            goto L_0x031e
        L_0x0303:
            org.bson.BsonType r0 = org.bson.BsonType.BOOLEAN
            r8.E0(r0)
            boolean r0 = java.lang.Boolean.parseBoolean(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.G = r0
            goto L_0x031e
        L_0x0313:
            org.bson.BsonType r2 = org.bson.BsonType.STRING
            r8.E0(r2)
            java.lang.Object r0 = r0.b()
            r8.G = r0
        L_0x031e:
            org.bson.json.JsonReader$Context r0 = r8.s0()
            org.bson.BsonContextType r0 = r0.c()
            if (r0 == r5) goto L_0x0332
            org.bson.json.JsonReader$Context r0 = r8.s0()
            org.bson.BsonContextType r0 = r0.c()
            if (r0 != r1) goto L_0x0341
        L_0x0332:
            org.bson.json.JsonToken r0 = r8.I1()
            org.bson.json.JsonTokenType r1 = r0.a()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.COMMA
            if (r1 == r2) goto L_0x0341
            r8.J1(r0)
        L_0x0341:
            int[] r0 = org.bson.json.JsonReader.AnonymousClass1.f43918b
            org.bson.json.JsonReader$Context r1 = r8.s0()
            org.bson.BsonContextType r1 = r1.c()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            if (r0 == r3) goto L_0x035f
            r1 = 4
            if (r0 == r1) goto L_0x035f
            r1 = 5
            if (r0 == r1) goto L_0x035f
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.NAME
            r8.H0(r0)
            goto L_0x0364
        L_0x035f:
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.VALUE
            r8.H0(r0)
        L_0x0364:
            org.bson.BsonType r0 = r8.C1()
            return r0
        L_0x0369:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This instance has been closed"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bson.json.JsonReader.t1():org.bson.BsonType");
    }

    public final String t2() {
        P1(JsonTokenType.COLON);
        String N1 = N1();
        P1(JsonTokenType.END_OBJECT);
        return N1;
    }

    public final BsonTimestamp u2() {
        P1(JsonTokenType.LEFT_PAREN);
        JsonToken I1 = I1();
        JsonTokenType a2 = I1.a();
        JsonTokenType jsonTokenType = JsonTokenType.INT32;
        if (a2 == jsonTokenType) {
            Class<Integer> cls = Integer.class;
            int intValue = ((Integer) I1.c(cls)).intValue();
            P1(JsonTokenType.COMMA);
            JsonToken I12 = I1();
            if (I12.a() == jsonTokenType) {
                int intValue2 = ((Integer) I12.c(cls)).intValue();
                P1(JsonTokenType.RIGHT_PAREN);
                return new BsonTimestamp(intValue, intValue2);
            }
            throw new JsonParseException("JSON reader expected an integer but found '%s'.", I1.b());
        }
        throw new JsonParseException("JSON reader expected an integer but found '%s'.", I1.b());
    }

    public final BsonTimestamp v2() {
        int i2;
        int i3;
        JsonTokenType jsonTokenType = JsonTokenType.COLON;
        P1(jsonTokenType);
        P1(JsonTokenType.BEGIN_OBJECT);
        String N1 = N1();
        if (N1.equals("t")) {
            P1(jsonTokenType);
            i2 = M1();
            P1(JsonTokenType.COMMA);
            O1("i");
            P1(jsonTokenType);
            i3 = M1();
        } else if (N1.equals("i")) {
            P1(jsonTokenType);
            int M1 = M1();
            P1(JsonTokenType.COMMA);
            O1("t");
            P1(jsonTokenType);
            int i4 = M1;
            i2 = M1();
            i3 = i4;
        } else {
            throw new JsonParseException("Expected 't' and 'i' fields in $timestamp document but found " + N1);
        }
        JsonTokenType jsonTokenType2 = JsonTokenType.END_OBJECT;
        P1(jsonTokenType2);
        P1(jsonTokenType2);
        return new BsonTimestamp(i2, i3);
    }

    public final BsonBinary w2(String str) {
        P1(JsonTokenType.LEFT_PAREN);
        String replaceAll = N1().replaceAll("\\{", "").replaceAll("}", "").replaceAll("-", "");
        P1(JsonTokenType.RIGHT_PAREN);
        byte[] G1 = G1(replaceAll);
        BsonBinarySubType bsonBinarySubType = BsonBinarySubType.UUID_STANDARD;
        if (!"UUID".equals(str) || !"GUID".equals(str)) {
            bsonBinarySubType = BsonBinarySubType.UUID_LEGACY;
        }
        return new BsonBinary(bsonBinarySubType, G1);
    }

    public BsonDbPointer x() {
        return (BsonDbPointer) this.G;
    }

    public final BsonUndefined x2() {
        P1(JsonTokenType.COLON);
        JsonToken I1 = I1();
        if (((String) I1.c(String.class)).equals("true")) {
            P1(JsonTokenType.END_OBJECT);
            return new BsonUndefined();
        }
        throw new JsonParseException("JSON reader requires $undefined to have the value of true but found '%s'.", I1.b());
    }

    public long y() {
        return ((Long) this.G).longValue();
    }
}
