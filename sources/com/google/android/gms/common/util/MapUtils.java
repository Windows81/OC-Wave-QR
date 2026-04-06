package com.google.android.gms.common.util;

import java.util.HashMap;

public class MapUtils {
    public static void a(StringBuilder sb, HashMap hashMap) {
        sb.append("{");
        boolean z2 = true;
        for (String str : hashMap.keySet()) {
            if (!z2) {
                sb.append(",");
            }
            String str2 = (String) hashMap.get(str);
            sb.append("\"");
            sb.append(str);
            sb.append("\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(str2);
                sb.append("\"");
            }
            z2 = false;
        }
        sb.append("}");
    }
}
