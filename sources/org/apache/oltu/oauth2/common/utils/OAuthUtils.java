package org.apache.oltu.oauth2.common.utils;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;

public final class OAuthUtils {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f43563a = Pattern.compile("\\s*(\\w*)\\s+(.*)");

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f43564b = Pattern.compile("(\\S*)\\s*\\=\\s*\"([^\"]*)\"");

    public static Map a(String str) {
        String str2;
        String str3;
        HashMap hashMap = new HashMap();
        if (!l(str)) {
            for (String str4 : str.split("\\&")) {
                int indexOf = str4.indexOf(61);
                if (indexOf < 0) {
                    str3 = b(str4);
                    str2 = null;
                } else {
                    String b2 = b(str4.substring(0, indexOf));
                    str2 = b(str4.substring(indexOf + 1));
                    str3 = b2;
                }
                hashMap.put(str3, str2);
            }
        }
        return hashMap;
    }

    public static String b(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2.getMessage(), e2);
        }
    }

    public static String c(String str, String str2) {
        if (str2 == null) {
            str2 = "UTF-8";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static String d(Map map) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Bearer");
        stringBuffer.append(" ");
        for (Map.Entry entry : map.entrySet()) {
            String valueOf = entry.getValue() == null ? null : String.valueOf(entry.getValue());
            if (!l((String) entry.getKey()) && !l(valueOf)) {
                stringBuffer.append(valueOf);
            }
        }
        return stringBuffer.toString();
    }

    public static String e(Map map) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Bearer");
        stringBuffer.append(" ");
        if (map.get("realm") != null) {
            String valueOf = String.valueOf(map.get("realm"));
            if (!l(valueOf)) {
                stringBuffer.append("realm=\"");
                stringBuffer.append(valueOf);
                stringBuffer.append("\",");
            }
            map.remove("realm");
        }
        for (Map.Entry entry : map.entrySet()) {
            String valueOf2 = entry.getValue() == null ? null : String.valueOf(entry.getValue());
            if (!l((String) entry.getKey()) && !l(valueOf2)) {
                stringBuffer.append((String) entry.getKey());
                stringBuffer.append("=\"");
                stringBuffer.append(valueOf2);
                stringBuffer.append("\",");
            }
        }
        return stringBuffer.substring(0, stringBuffer.length() - 1);
    }

    public static String f(Collection collection, String str) {
        StringBuilder sb = new StringBuilder();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String valueOf = entry.getValue() == null ? null : String.valueOf(entry.getValue());
            if (!l((String) entry.getKey()) && !l(valueOf)) {
                String c2 = c((String) entry.getKey(), str);
                String c3 = valueOf != null ? c(valueOf, str) : "";
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append(c2);
                sb.append("=");
                sb.append(c3);
            }
        }
        return sb.toString();
    }

    public static OAuthProblemException g(Set set) {
        StringBuffer stringBuffer = new StringBuffer("Missing parameters: ");
        if (!m(set)) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                stringBuffer.append((String) it.next());
                stringBuffer.append(" ");
            }
        }
        return i(stringBuffer.toString().trim());
    }

    public static OAuthProblemException h(List list) {
        StringBuffer stringBuffer = new StringBuffer("Not allowed parameters: ");
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                stringBuffer.append((String) it.next());
                stringBuffer.append(" ");
            }
        }
        return i(stringBuffer.toString().trim());
    }

    public static OAuthProblemException i(String str) {
        return OAuthProblemException.b("invalid_request").a(str);
    }

    public static boolean j(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return true;
        }
        for (String l2 : strArr) {
            if (l(l2)) {
                return true;
            }
        }
        return false;
    }

    public static Object k(Class cls, Class[] clsArr, Object[] objArr) {
        if (clsArr == null || objArr == null) {
            return cls.newInstance();
        }
        try {
            if (clsArr.length == objArr.length) {
                return (clsArr.length == 0 && objArr.length == 0) ? cls.newInstance() : cls.getConstructor(clsArr).newInstance(objArr);
            }
            throw new IllegalArgumentException("Number of types and values must be equal");
        } catch (NoSuchMethodException e2) {
            throw new OAuthSystemException(e2);
        } catch (InstantiationException e3) {
            throw new OAuthSystemException(e3);
        } catch (IllegalAccessException e4) {
            throw new OAuthSystemException(e4);
        } catch (InvocationTargetException e5) {
            throw new OAuthSystemException(e5);
        }
    }

    public static boolean l(String str) {
        return str == null || "".equals(str);
    }

    public static boolean m(Set set) {
        return set == null || set.size() == 0;
    }

    public static String n(InputStream inputStream) {
        return o(inputStream, "UTF-8");
    }

    /* JADX INFO: finally extract failed */
    public static String o(InputStream inputStream, String str) {
        if (inputStream != null) {
            if (str == null) {
                str = "UTF-8";
            }
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, str);
            StringBuilder sb = new StringBuilder();
            try {
                char[] cArr = new char[4096];
                while (true) {
                    int read = inputStreamReader.read(cArr);
                    if (read != -1) {
                        sb.append(cArr, 0, read);
                    } else {
                        inputStreamReader.close();
                        return sb.toString();
                    }
                }
            } catch (Throwable th) {
                inputStreamReader.close();
                throw th;
            }
        } else {
            throw new IllegalArgumentException("InputStream may not be null");
        }
    }
}
