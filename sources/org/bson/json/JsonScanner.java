package org.bson.json;

import org.bson.BsonRegularExpression;

class JsonScanner {

    /* renamed from: a  reason: collision with root package name */
    public final JsonBuffer f43925a;

    /* renamed from: org.bson.json.JsonScanner$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f43926a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f43927b;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|(2:29|30)|31|33|34|35|36|37|38|39|40|(3:41|42|44)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|(2:29|30)|31|33|34|35|36|37|38|39|40|(3:41|42|44)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|33|34|35|36|37|38|39|40|(3:41|42|44)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|33|34|35|36|37|38|39|40|41|42|44) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|33|34|35|36|37|38|39|40|41|42|44) */
        /* JADX WARNING: Can't wrap try/catch for region: R(39:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|33|34|35|36|37|38|39|40|41|42|44) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0095 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x009f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00a9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00b3 */
        static {
            /*
                org.bson.json.JsonScanner$NumberState[] r0 = org.bson.json.JsonScanner.NumberState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f43927b = r0
                r1 = 1
                org.bson.json.JsonScanner$NumberState r2 = org.bson.json.JsonScanner.NumberState.SAW_LEADING_MINUS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f43927b     // Catch:{ NoSuchFieldError -> 0x001d }
                org.bson.json.JsonScanner$NumberState r3 = org.bson.json.JsonScanner.NumberState.SAW_LEADING_ZERO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f43927b     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.bson.json.JsonScanner$NumberState r4 = org.bson.json.JsonScanner.NumberState.SAW_INTEGER_DIGITS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f43927b     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.bson.json.JsonScanner$NumberState r5 = org.bson.json.JsonScanner.NumberState.SAW_DECIMAL_POINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f43927b     // Catch:{ NoSuchFieldError -> 0x003e }
                org.bson.json.JsonScanner$NumberState r6 = org.bson.json.JsonScanner.NumberState.SAW_FRACTION_DIGITS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r5 = f43927b     // Catch:{ NoSuchFieldError -> 0x0049 }
                org.bson.json.JsonScanner$NumberState r6 = org.bson.json.JsonScanner.NumberState.SAW_EXPONENT_LETTER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r7 = 6
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r5 = f43927b     // Catch:{ NoSuchFieldError -> 0x0054 }
                org.bson.json.JsonScanner$NumberState r6 = org.bson.json.JsonScanner.NumberState.SAW_EXPONENT_SIGN     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7 = 7
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r5 = f43927b     // Catch:{ NoSuchFieldError -> 0x0060 }
                org.bson.json.JsonScanner$NumberState r6 = org.bson.json.JsonScanner.NumberState.SAW_EXPONENT_DIGITS     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r7 = 8
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r5 = f43927b     // Catch:{ NoSuchFieldError -> 0x006c }
                org.bson.json.JsonScanner$NumberState r6 = org.bson.json.JsonScanner.NumberState.SAW_MINUS_I     // Catch:{ NoSuchFieldError -> 0x006c }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r7 = 9
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r5 = f43927b     // Catch:{ NoSuchFieldError -> 0x0078 }
                org.bson.json.JsonScanner$NumberState r6 = org.bson.json.JsonScanner.NumberState.INVALID     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r7 = 10
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r5 = f43927b     // Catch:{ NoSuchFieldError -> 0x0084 }
                org.bson.json.JsonScanner$NumberState r6 = org.bson.json.JsonScanner.NumberState.DONE     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r7 = 11
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                org.bson.json.JsonScanner$RegularExpressionState[] r5 = org.bson.json.JsonScanner.RegularExpressionState.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f43926a = r5
                org.bson.json.JsonScanner$RegularExpressionState r6 = org.bson.json.JsonScanner.RegularExpressionState.IN_PATTERN     // Catch:{ NoSuchFieldError -> 0x0095 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0095 }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x0095 }
            L_0x0095:
                int[] r1 = f43926a     // Catch:{ NoSuchFieldError -> 0x009f }
                org.bson.json.JsonScanner$RegularExpressionState r5 = org.bson.json.JsonScanner.RegularExpressionState.IN_ESCAPE_SEQUENCE     // Catch:{ NoSuchFieldError -> 0x009f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x009f }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x009f }
            L_0x009f:
                int[] r0 = f43926a     // Catch:{ NoSuchFieldError -> 0x00a9 }
                org.bson.json.JsonScanner$RegularExpressionState r1 = org.bson.json.JsonScanner.RegularExpressionState.IN_OPTIONS     // Catch:{ NoSuchFieldError -> 0x00a9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a9 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a9 }
            L_0x00a9:
                int[] r0 = f43926a     // Catch:{ NoSuchFieldError -> 0x00b3 }
                org.bson.json.JsonScanner$RegularExpressionState r1 = org.bson.json.JsonScanner.RegularExpressionState.DONE     // Catch:{ NoSuchFieldError -> 0x00b3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b3 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00b3 }
            L_0x00b3:
                int[] r0 = f43926a     // Catch:{ NoSuchFieldError -> 0x00bd }
                org.bson.json.JsonScanner$RegularExpressionState r1 = org.bson.json.JsonScanner.RegularExpressionState.INVALID     // Catch:{ NoSuchFieldError -> 0x00bd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00bd }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x00bd }
            L_0x00bd:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bson.json.JsonScanner.AnonymousClass1.<clinit>():void");
        }
    }

    public enum NumberState {
        SAW_LEADING_MINUS,
        SAW_LEADING_ZERO,
        SAW_INTEGER_DIGITS,
        SAW_DECIMAL_POINT,
        SAW_FRACTION_DIGITS,
        SAW_EXPONENT_LETTER,
        SAW_EXPONENT_SIGN,
        SAW_EXPONENT_DIGITS,
        SAW_MINUS_I,
        DONE,
        INVALID
    }

    public enum RegularExpressionState {
        IN_PATTERN,
        IN_ESCAPE_SEQUENCE,
        IN_OPTIONS,
        DONE,
        INVALID
    }

    public void a(int i2) {
        this.f43925a.b(i2);
    }

    public int b() {
        return this.f43925a.c();
    }

    public JsonToken c() {
        int read = this.f43925a.read();
        while (read != -1 && Character.isWhitespace(read)) {
            read = this.f43925a.read();
        }
        if (read == -1) {
            return new JsonToken(JsonTokenType.END_OF_FILE, "<eof>");
        }
        if (read != 34) {
            if (read == 44) {
                return new JsonToken(JsonTokenType.COMMA, ",");
            }
            if (read == 47) {
                return f();
            }
            if (read == 58) {
                return new JsonToken(JsonTokenType.COLON, ":");
            }
            if (read == 91) {
                return new JsonToken(JsonTokenType.BEGIN_ARRAY, "[");
            }
            if (read == 93) {
                return new JsonToken(JsonTokenType.END_ARRAY, "]");
            }
            if (read == 123) {
                return new JsonToken(JsonTokenType.BEGIN_OBJECT, "{");
            }
            if (read == 125) {
                return new JsonToken(JsonTokenType.END_OBJECT, "}");
            }
            switch (read) {
                case 39:
                    break;
                case 40:
                    return new JsonToken(JsonTokenType.LEFT_PAREN, "(");
                case 41:
                    return new JsonToken(JsonTokenType.RIGHT_PAREN, ")");
                default:
                    if (read == 45 || Character.isDigit(read)) {
                        return e((char) read);
                    }
                    if (read == 36 || read == 95 || Character.isLetter(read)) {
                        return h((char) read);
                    }
                    int position = this.f43925a.getPosition();
                    this.f43925a.d(read);
                    throw new JsonParseException("Invalid JSON input. Position: %d. Character: '%c'.", Integer.valueOf(position), Integer.valueOf(read));
            }
        }
        return g((char) read);
    }

    public void d(int i2) {
        this.f43925a.a(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
        r1 = '0';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x017e, code lost:
        r8 = org.bson.json.JsonScanner.AnonymousClass1.f43927b[r4.ordinal()];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0188, code lost:
        if (r8 == 10) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x018c, code lost:
        if (r8 == 11) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0199, code lost:
        r0.f43925a.d(r7);
        r1 = r3.toString();
        r2 = org.bson.json.JsonTokenType.DOUBLE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01a4, code lost:
        if (r6 != r2) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01b3, code lost:
        return new org.bson.json.JsonToken(r2, java.lang.Double.valueOf(java.lang.Double.parseDouble(r1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01b4, code lost:
        r1 = java.lang.Long.parseLong(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01bd, code lost:
        if (r1 < -2147483648L) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01c4, code lost:
        if (r1 <= 2147483647L) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01d3, code lost:
        return new org.bson.json.JsonToken(org.bson.json.JsonTokenType.INT32, java.lang.Integer.valueOf((int) r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01df, code lost:
        return new org.bson.json.JsonToken(org.bson.json.JsonTokenType.INT64, java.lang.Long.valueOf(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01e7, code lost:
        throw new org.bson.json.JsonParseException("Invalid JSON number");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0074, code lost:
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003f, code lost:
        r4 = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.bson.json.JsonToken e(char r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r4 = 48
            r5 = 45
            if (r1 == r5) goto L_0x001b
            if (r1 == r4) goto L_0x0018
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.SAW_INTEGER_DIGITS
            goto L_0x001d
        L_0x0018:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.SAW_LEADING_ZERO
            goto L_0x001d
        L_0x001b:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.SAW_LEADING_MINUS
        L_0x001d:
            org.bson.json.JsonTokenType r6 = org.bson.json.JsonTokenType.INT64
        L_0x001f:
            org.bson.json.JsonBuffer r7 = r0.f43925a
            int r7 = r7.read()
            int[] r8 = org.bson.json.JsonScanner.AnonymousClass1.f43927b
            int r9 = r1.ordinal()
            r8 = r8[r9]
            r9 = 46
            r10 = 101(0x65, float:1.42E-43)
            r11 = 69
            r12 = -1
            r13 = 125(0x7d, float:1.75E-43)
            r14 = 93
            r15 = 44
            r4 = 41
            switch(r8) {
                case 1: goto L_0x0165;
                case 2: goto L_0x0131;
                case 3: goto L_0x00fd;
                case 4: goto L_0x00ed;
                case 5: goto L_0x00bf;
                case 6: goto L_0x00a8;
                case 7: goto L_0x009c;
                case 8: goto L_0x007c;
                case 9: goto L_0x0044;
                default: goto L_0x003f;
            }
        L_0x003f:
            r4 = r1
        L_0x0040:
            r1 = 48
            goto L_0x017e
        L_0x0044:
            char[] r1 = new char[r2]
            r1 = {110, 102, 105, 110, 105, 116, 121} // fill-array
            r8 = 0
        L_0x004a:
            if (r8 >= r2) goto L_0x0060
            char r9 = r1[r8]
            if (r7 == r9) goto L_0x0053
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.INVALID
            goto L_0x003f
        L_0x0053:
            char r7 = (char) r7
            r3.append(r7)
            org.bson.json.JsonBuffer r7 = r0.f43925a
            int r7 = r7.read()
            int r8 = r8 + 1
            goto L_0x004a
        L_0x0060:
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.DOUBLE
            if (r7 == r12) goto L_0x0079
            if (r7 == r4) goto L_0x0079
            if (r7 == r15) goto L_0x0079
            if (r7 == r14) goto L_0x0079
            if (r7 == r13) goto L_0x0079
            boolean r4 = java.lang.Character.isWhitespace(r7)
            if (r4 == 0) goto L_0x0076
            org.bson.json.JsonScanner$NumberState r4 = org.bson.json.JsonScanner.NumberState.DONE
        L_0x0074:
            r6 = r1
            goto L_0x0040
        L_0x0076:
            org.bson.json.JsonScanner$NumberState r4 = org.bson.json.JsonScanner.NumberState.INVALID
            goto L_0x0074
        L_0x0079:
            org.bson.json.JsonScanner$NumberState r4 = org.bson.json.JsonScanner.NumberState.DONE
            goto L_0x0074
        L_0x007c:
            if (r7 == r4) goto L_0x0099
            if (r7 == r15) goto L_0x0099
            if (r7 == r14) goto L_0x0099
            if (r7 == r13) goto L_0x0099
            boolean r1 = java.lang.Character.isDigit(r7)
            if (r1 == 0) goto L_0x008d
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.SAW_EXPONENT_DIGITS
            goto L_0x003f
        L_0x008d:
            boolean r1 = java.lang.Character.isWhitespace(r7)
            if (r1 == 0) goto L_0x0096
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.DONE
            goto L_0x003f
        L_0x0096:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.INVALID
            goto L_0x003f
        L_0x0099:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.DONE
            goto L_0x003f
        L_0x009c:
            boolean r1 = java.lang.Character.isDigit(r7)
            if (r1 == 0) goto L_0x00a5
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.SAW_EXPONENT_DIGITS
            goto L_0x003f
        L_0x00a5:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.INVALID
            goto L_0x003f
        L_0x00a8:
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.DOUBLE
            r4 = 43
            if (r7 == r4) goto L_0x00bc
            if (r7 == r5) goto L_0x00bc
            boolean r4 = java.lang.Character.isDigit(r7)
            if (r4 == 0) goto L_0x00b9
            org.bson.json.JsonScanner$NumberState r4 = org.bson.json.JsonScanner.NumberState.SAW_EXPONENT_DIGITS
            goto L_0x0074
        L_0x00b9:
            org.bson.json.JsonScanner$NumberState r4 = org.bson.json.JsonScanner.NumberState.INVALID
            goto L_0x0074
        L_0x00bc:
            org.bson.json.JsonScanner$NumberState r4 = org.bson.json.JsonScanner.NumberState.SAW_EXPONENT_SIGN
            goto L_0x0074
        L_0x00bf:
            if (r7 == r12) goto L_0x00e9
            if (r7 == r4) goto L_0x00e9
            if (r7 == r15) goto L_0x00e9
            if (r7 == r11) goto L_0x00e5
            if (r7 == r14) goto L_0x00e9
            if (r7 == r10) goto L_0x00e5
            if (r7 == r13) goto L_0x00e9
            boolean r1 = java.lang.Character.isDigit(r7)
            if (r1 == 0) goto L_0x00d7
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.SAW_FRACTION_DIGITS
            goto L_0x003f
        L_0x00d7:
            boolean r1 = java.lang.Character.isWhitespace(r7)
            if (r1 == 0) goto L_0x00e1
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.DONE
            goto L_0x003f
        L_0x00e1:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.INVALID
            goto L_0x003f
        L_0x00e5:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.SAW_EXPONENT_LETTER
            goto L_0x003f
        L_0x00e9:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.DONE
            goto L_0x003f
        L_0x00ed:
            org.bson.json.JsonTokenType r1 = org.bson.json.JsonTokenType.DOUBLE
            boolean r4 = java.lang.Character.isDigit(r7)
            if (r4 == 0) goto L_0x00f9
            org.bson.json.JsonScanner$NumberState r4 = org.bson.json.JsonScanner.NumberState.SAW_FRACTION_DIGITS
            goto L_0x0074
        L_0x00f9:
            org.bson.json.JsonScanner$NumberState r4 = org.bson.json.JsonScanner.NumberState.INVALID
            goto L_0x0074
        L_0x00fd:
            if (r7 == r12) goto L_0x012d
            if (r7 == r4) goto L_0x012d
            if (r7 == r15) goto L_0x012d
            if (r7 == r9) goto L_0x0129
            if (r7 == r11) goto L_0x0125
            if (r7 == r14) goto L_0x012d
            if (r7 == r10) goto L_0x0125
            if (r7 == r13) goto L_0x012d
            boolean r1 = java.lang.Character.isDigit(r7)
            if (r1 == 0) goto L_0x0117
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.SAW_INTEGER_DIGITS
            goto L_0x003f
        L_0x0117:
            boolean r1 = java.lang.Character.isWhitespace(r7)
            if (r1 == 0) goto L_0x0121
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.DONE
            goto L_0x003f
        L_0x0121:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.INVALID
            goto L_0x003f
        L_0x0125:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.SAW_EXPONENT_LETTER
            goto L_0x003f
        L_0x0129:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.SAW_DECIMAL_POINT
            goto L_0x003f
        L_0x012d:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.DONE
            goto L_0x003f
        L_0x0131:
            if (r7 == r12) goto L_0x0161
            if (r7 == r4) goto L_0x0161
            if (r7 == r15) goto L_0x0161
            if (r7 == r9) goto L_0x015d
            if (r7 == r11) goto L_0x0159
            if (r7 == r14) goto L_0x0161
            if (r7 == r10) goto L_0x0159
            if (r7 == r13) goto L_0x0161
            boolean r1 = java.lang.Character.isDigit(r7)
            if (r1 == 0) goto L_0x014b
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.SAW_INTEGER_DIGITS
            goto L_0x003f
        L_0x014b:
            boolean r1 = java.lang.Character.isWhitespace(r7)
            if (r1 == 0) goto L_0x0155
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.DONE
            goto L_0x003f
        L_0x0155:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.INVALID
            goto L_0x003f
        L_0x0159:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.SAW_EXPONENT_LETTER
            goto L_0x003f
        L_0x015d:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.SAW_DECIMAL_POINT
            goto L_0x003f
        L_0x0161:
            org.bson.json.JsonScanner$NumberState r1 = org.bson.json.JsonScanner.NumberState.DONE
            goto L_0x003f
        L_0x0165:
            r1 = 48
            if (r7 == r1) goto L_0x017c
            r4 = 73
            if (r7 == r4) goto L_0x0179
            boolean r4 = java.lang.Character.isDigit(r7)
            if (r4 == 0) goto L_0x0176
            org.bson.json.JsonScanner$NumberState r4 = org.bson.json.JsonScanner.NumberState.SAW_INTEGER_DIGITS
            goto L_0x017e
        L_0x0176:
            org.bson.json.JsonScanner$NumberState r4 = org.bson.json.JsonScanner.NumberState.INVALID
            goto L_0x017e
        L_0x0179:
            org.bson.json.JsonScanner$NumberState r4 = org.bson.json.JsonScanner.NumberState.SAW_MINUS_I
            goto L_0x017e
        L_0x017c:
            org.bson.json.JsonScanner$NumberState r4 = org.bson.json.JsonScanner.NumberState.SAW_LEADING_ZERO
        L_0x017e:
            int[] r8 = org.bson.json.JsonScanner.AnonymousClass1.f43927b
            int r9 = r4.ordinal()
            r8 = r8[r9]
            r9 = 10
            if (r8 == r9) goto L_0x01e0
            r9 = 11
            if (r8 == r9) goto L_0x0199
            char r7 = (char) r7
            r3.append(r7)
            r16 = r4
            r4 = r1
            r1 = r16
            goto L_0x001f
        L_0x0199:
            org.bson.json.JsonBuffer r1 = r0.f43925a
            r1.d(r7)
            java.lang.String r1 = r3.toString()
            org.bson.json.JsonTokenType r2 = org.bson.json.JsonTokenType.DOUBLE
            if (r6 != r2) goto L_0x01b4
            org.bson.json.JsonToken r3 = new org.bson.json.JsonToken
            double r4 = java.lang.Double.parseDouble(r1)
            java.lang.Double r1 = java.lang.Double.valueOf(r4)
            r3.<init>(r2, r1)
            return r3
        L_0x01b4:
            long r1 = java.lang.Long.parseLong(r1)
            r3 = -2147483648(0xffffffff80000000, double:NaN)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x01d4
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x01c7
            goto L_0x01d4
        L_0x01c7:
            org.bson.json.JsonToken r3 = new org.bson.json.JsonToken
            org.bson.json.JsonTokenType r4 = org.bson.json.JsonTokenType.INT32
            int r1 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.<init>(r4, r1)
            return r3
        L_0x01d4:
            org.bson.json.JsonToken r3 = new org.bson.json.JsonToken
            org.bson.json.JsonTokenType r4 = org.bson.json.JsonTokenType.INT64
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r3.<init>(r4, r1)
            return r3
        L_0x01e0:
            org.bson.json.JsonParseException r1 = new org.bson.json.JsonParseException
            java.lang.String r2 = "Invalid JSON number"
            r1.<init>((java.lang.String) r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bson.json.JsonScanner.e(char):org.bson.json.JsonToken");
    }

    public final JsonToken f() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        RegularExpressionState regularExpressionState = RegularExpressionState.IN_PATTERN;
        while (true) {
            int read = this.f43925a.read();
            int[] iArr = AnonymousClass1.f43926a;
            int i2 = iArr[regularExpressionState.ordinal()];
            if (i2 == 1) {
                regularExpressionState = read != -1 ? read != 47 ? read != 92 ? RegularExpressionState.IN_PATTERN : RegularExpressionState.IN_ESCAPE_SEQUENCE : RegularExpressionState.IN_OPTIONS : RegularExpressionState.INVALID;
            } else if (i2 == 2) {
                regularExpressionState = RegularExpressionState.IN_PATTERN;
            } else if (i2 == 3) {
                if (!(read == -1 || read == 41 || read == 44 || read == 93)) {
                    if (read == 105 || read == 109 || read == 115 || read == 120) {
                        regularExpressionState = RegularExpressionState.IN_OPTIONS;
                    } else if (read != 125) {
                        regularExpressionState = Character.isWhitespace(read) ? RegularExpressionState.DONE : RegularExpressionState.INVALID;
                    }
                }
                regularExpressionState = RegularExpressionState.DONE;
            }
            int i3 = iArr[regularExpressionState.ordinal()];
            if (i3 == 4) {
                this.f43925a.d(read);
                return new JsonToken(JsonTokenType.REGULAR_EXPRESSION, new BsonRegularExpression(sb.toString(), sb2.toString()));
            } else if (i3 == 5) {
                throw new JsonParseException("Invalid JSON regular expression. Position: %d.", Integer.valueOf(this.f43925a.getPosition()));
            } else if (iArr[regularExpressionState.ordinal()] != 3) {
                sb.append((char) read);
            } else if (read != 47) {
                sb2.append((char) read);
            }
        }
    }

    public final JsonToken g(char c2) {
        int read;
        StringBuilder sb = new StringBuilder();
        do {
            read = this.f43925a.read();
            if (read == 92) {
                read = this.f43925a.read();
                if (read == 34) {
                    sb.append('\"');
                    continue;
                } else if (read == 39) {
                    sb.append('\'');
                    continue;
                } else if (read == 47) {
                    sb.append('/');
                    continue;
                } else if (read == 92) {
                    sb.append('\\');
                    continue;
                } else if (read == 98) {
                    sb.append(8);
                    continue;
                } else if (read == 102) {
                    sb.append(12);
                    continue;
                } else if (read == 110) {
                    sb.append(10);
                    continue;
                } else if (read == 114) {
                    sb.append(13);
                    continue;
                } else if (read == 116) {
                    sb.append(9);
                    continue;
                } else if (read == 117) {
                    int read2 = this.f43925a.read();
                    int read3 = this.f43925a.read();
                    int read4 = this.f43925a.read();
                    int read5 = this.f43925a.read();
                    if (read5 != -1) {
                        sb.append((char) Integer.parseInt(new String(new char[]{(char) read2, (char) read3, (char) read4, (char) read5}), 16));
                        continue;
                    } else {
                        continue;
                    }
                } else {
                    throw new JsonParseException("Invalid escape sequence in JSON string '\\%c'.", Integer.valueOf(read));
                }
            } else if (read == c2) {
                return new JsonToken(JsonTokenType.STRING, sb.toString());
            } else {
                if (read != -1) {
                    sb.append((char) read);
                    continue;
                } else {
                    continue;
                }
            }
        } while (read != -1);
        throw new JsonParseException("End of file in JSON string.");
    }

    public final JsonToken h(char c2) {
        StringBuilder sb = new StringBuilder();
        sb.append(c2);
        int read = this.f43925a.read();
        while (true) {
            if (read == 36 || read == 95 || Character.isLetterOrDigit(read)) {
                sb.append((char) read);
                read = this.f43925a.read();
            } else {
                this.f43925a.d(read);
                return new JsonToken(JsonTokenType.UNQUOTED_STRING, sb.toString());
            }
        }
    }
}
