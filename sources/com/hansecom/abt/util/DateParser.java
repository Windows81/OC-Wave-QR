package com.hansecom.abt.util;

import kotlin.Metadata;

@Metadata
public final class DateParser {

    /* renamed from: a  reason: collision with root package name */
    public static final DateParser f39003a = new DateParser();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        r2 = timber.log.Timber.f44337a;
        r1 = r1.getMessage();
        r2.b("parseDate: Error parsing date: " + r6 + "\n{" + r1 + "}", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        return java.time.ZonedDateTime.parse(r6 + "Z", java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.time.ZonedDateTime a(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L_0x0054
            int r1 = r6.length()
            if (r1 != 0) goto L_0x000a
            goto L_0x0054
        L_0x000a:
            java.time.format.DateTimeFormatter r1 = java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME     // Catch:{ Exception -> 0x0011 }
            java.time.ZonedDateTime r6 = java.time.ZonedDateTime.parse(r6, r1)     // Catch:{ Exception -> 0x0011 }
            return r6
        L_0x0011:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0029 }
            r1.<init>()     // Catch:{ Exception -> 0x0029 }
            r1.append(r6)     // Catch:{ Exception -> 0x0029 }
            java.lang.String r2 = "Z"
            r1.append(r2)     // Catch:{ Exception -> 0x0029 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0029 }
            java.time.format.DateTimeFormatter r2 = java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME     // Catch:{ Exception -> 0x0029 }
            java.time.ZonedDateTime r6 = java.time.ZonedDateTime.parse(r1, r2)     // Catch:{ Exception -> 0x0029 }
            return r6
        L_0x0029:
            r1 = move-exception
            timber.log.Timber$Forest r2 = timber.log.Timber.f44337a
            java.lang.String r1 = r1.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "parseDate: Error parsing date: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r6 = "\n{"
            r3.append(r6)
            r3.append(r1)
            java.lang.String r6 = "}"
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2.b(r6, r1)
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.util.DateParser.a(java.lang.String):java.time.ZonedDateTime");
    }
}
