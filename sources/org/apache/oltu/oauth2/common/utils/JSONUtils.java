package org.apache.oltu.oauth2.common.utils;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONStringer;
import org.json.JSONTokener;

public final class JSONUtils {
    public static String a(Map map) {
        JSONStringer jSONStringer = new JSONStringer();
        jSONStringer.object();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && !"".equals(entry.getKey()) && entry.getValue() != null && !"".equals(entry.getValue())) {
                jSONStringer.key((String) entry.getKey()).value(entry.getValue());
            }
        }
        return jSONStringer.endObject().toString();
    }

    public static Map b(String str) {
        HashMap hashMap = new HashMap();
        JSONTokener jSONTokener = new JSONTokener(str);
        if (jSONTokener.nextClean() == '{') {
            while (true) {
                char nextClean = jSONTokener.nextClean();
                if (nextClean == 0) {
                    throw new IllegalArgumentException(String.format("String '%s' is not a valid JSON object representation, a JSON object text must end with '}'", new Object[]{str}));
                } else if (nextClean == '}') {
                    return hashMap;
                } else {
                    jSONTokener.back();
                    String obj = jSONTokener.nextValue().toString();
                    char nextClean2 = jSONTokener.nextClean();
                    if (nextClean2 == '=') {
                        if (jSONTokener.next() != '>') {
                            jSONTokener.back();
                        }
                    } else if (nextClean2 != ':') {
                        throw new IllegalArgumentException(String.format("String '%s' is not a valid JSON object representation, expected a ':' after the key '%s'", new Object[]{str, obj}));
                    }
                    Object nextValue = jSONTokener.nextValue();
                    if (nextValue != null) {
                        if (nextValue instanceof JSONArray) {
                            JSONArray jSONArray = (JSONArray) nextValue;
                            Object[] objArr = new Object[jSONArray.length()];
                            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                objArr[i2] = jSONArray.get(i2);
                            }
                            nextValue = objArr;
                        }
                        hashMap.put(obj, nextValue);
                    }
                    char nextClean3 = jSONTokener.nextClean();
                    if (nextClean3 == ',' || nextClean3 == ';') {
                        if (jSONTokener.nextClean() == '}') {
                            return hashMap;
                        }
                        jSONTokener.back();
                    } else if (nextClean3 == '}') {
                        return hashMap;
                    } else {
                        throw new IllegalArgumentException("Expected a ',' or '}'");
                    }
                }
            }
        } else {
            throw new IllegalArgumentException(String.format("String '%s' is not a valid JSON object representation, a JSON object text must begin with '{'", new Object[]{str}));
        }
    }
}
