package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class MetaDataStore {

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f30134b = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final FileStore f30135a;

    public MetaDataStore(FileStore fileStore) {
        this.f30135a = fileStore;
    }

    public static Map e(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, o(jSONObject, next));
        }
        return hashMap;
    }

    public static List f(String str) {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String string = jSONArray.getString(i2);
            try {
                arrayList.add(RolloutAssignment.a(string));
            } catch (Exception e2) {
                Logger f2 = Logger.f();
                f2.l("Failed de-serializing rollouts state. " + string, e2);
            }
        }
        return arrayList;
    }

    public static String h(Map map) {
        return new JSONObject(map).toString();
    }

    public static String l(List list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i2 = 0; i2 < list.size(); i2++) {
            try {
                jSONArray.put(new JSONObject(RolloutAssignment.f30158a.b(list.get(i2))));
            } catch (JSONException e2) {
                Logger.f().l("Exception parsing rollout assignment!", e2);
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    public static void m(File file) {
        if (file.exists() && file.delete()) {
            Logger f2 = Logger.f();
            f2.g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    public static String n(String str) {
        return new JSONObject(str) {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f30136a;

            {
                this.f30136a = r2;
                put("userId", r2);
            }
        }.toString();
    }

    public static String o(JSONObject jSONObject, String str) {
        if (!jSONObject.isNull(str)) {
            return jSONObject.optString(str, (String) null);
        }
        return null;
    }

    public File a(String str) {
        return this.f30135a.q(str, "internal-keys");
    }

    public File b(String str) {
        return this.f30135a.q(str, "keys");
    }

    public File c(String str) {
        return this.f30135a.q(str, "rollouts-state");
    }

    public File d(String str) {
        return this.f30135a.q(str, "user-data");
    }

    public final String g(String str) {
        return o(new JSONObject(str), "userId");
    }

    public Map i(String str, boolean z2) {
        Exception e2;
        FileInputStream fileInputStream;
        File a2 = z2 ? a(str) : b(str);
        if (!a2.exists() || a2.length() == 0) {
            m(a2);
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(a2);
            try {
                Map e3 = e(CommonUtils.A(fileInputStream));
                CommonUtils.f(fileInputStream, "Failed to close user metadata file.");
                return e3;
            } catch (Exception e4) {
                e2 = e4;
                try {
                    Logger.f().l("Error deserializing user metadata.", e2);
                    m(a2);
                    CommonUtils.f(fileInputStream, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    CommonUtils.f(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            }
        } catch (Exception e5) {
            Exception exc = e5;
            fileInputStream = null;
            e2 = exc;
            Logger.f().l("Error deserializing user metadata.", e2);
            m(a2);
            CommonUtils.f(fileInputStream, "Failed to close user metadata file.");
            return Collections.emptyMap();
        } catch (Throwable th2) {
            th = th2;
            CommonUtils.f(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public List j(String str) {
        File c2 = c(str);
        if (!c2.exists() || c2.length() == 0) {
            m(c2);
            return Collections.emptyList();
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(c2);
            try {
                List f2 = f(CommonUtils.A(fileInputStream2));
                Logger f3 = Logger.f();
                f3.b("Loaded rollouts state:\n" + f2 + "\nfor session " + str);
                CommonUtils.f(fileInputStream2, "Failed to close rollouts state file.");
                return f2;
            } catch (Exception e2) {
                e = e2;
                fileInputStream = fileInputStream2;
                try {
                    Logger.f().l("Error deserializing rollouts state.", e);
                    m(c2);
                    CommonUtils.f(fileInputStream, "Failed to close rollouts state file.");
                    return Collections.emptyList();
                } catch (Throwable th) {
                    th = th;
                    CommonUtils.f(fileInputStream, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                CommonUtils.f(fileInputStream, "Failed to close rollouts state file.");
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            Logger.f().l("Error deserializing rollouts state.", e);
            m(c2);
            CommonUtils.f(fileInputStream, "Failed to close rollouts state file.");
            return Collections.emptyList();
        }
    }

    public String k(String str) {
        FileInputStream fileInputStream;
        File d2 = d(str);
        FileInputStream fileInputStream2 = null;
        if (!d2.exists() || d2.length() == 0) {
            Logger.f().b("No userId set for session " + str);
            m(d2);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(d2);
            try {
                String g2 = g(CommonUtils.A(fileInputStream));
                Logger.f().b("Loaded userId " + g2 + " for session " + str);
                CommonUtils.f(fileInputStream, "Failed to close user metadata file.");
                return g2;
            } catch (Exception e2) {
                e = e2;
                try {
                    Logger.f().l("Error deserializing user metadata.", e);
                    m(d2);
                    CommonUtils.f(fileInputStream, "Failed to close user metadata file.");
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    CommonUtils.f(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
            Logger.f().l("Error deserializing user metadata.", e);
            m(d2);
            CommonUtils.f(fileInputStream, "Failed to close user metadata file.");
            return null;
        } catch (Throwable th2) {
            th = th2;
            CommonUtils.f(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public void p(String str, Map map) {
        q(str, map, false);
    }

    public void q(String str, Map map, boolean z2) {
        File a2 = z2 ? a(str) : b(str);
        BufferedWriter bufferedWriter = null;
        try {
            String h2 = h(map);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(a2), f30134b));
            try {
                bufferedWriter2.write(h2);
                bufferedWriter2.flush();
                CommonUtils.f(bufferedWriter2, "Failed to close key/value metadata file.");
            } catch (Exception e2) {
                e = e2;
                bufferedWriter = bufferedWriter2;
                try {
                    Logger.f().l("Error serializing key/value metadata.", e);
                    m(a2);
                    CommonUtils.f(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    CommonUtils.f(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                CommonUtils.f(bufferedWriter, "Failed to close key/value metadata file.");
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            Logger.f().l("Error serializing key/value metadata.", e);
            m(a2);
            CommonUtils.f(bufferedWriter, "Failed to close key/value metadata file.");
        }
    }

    public void r(String str, List list) {
        File c2 = c(str);
        if (list.isEmpty()) {
            m(c2);
            return;
        }
        BufferedWriter bufferedWriter = null;
        try {
            String l2 = l(list);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c2), f30134b));
            try {
                bufferedWriter2.write(l2);
                bufferedWriter2.flush();
                CommonUtils.f(bufferedWriter2, "Failed to close rollouts state file.");
            } catch (Exception e2) {
                e = e2;
                bufferedWriter = bufferedWriter2;
                try {
                    Logger.f().l("Error serializing rollouts state.", e);
                    m(c2);
                    CommonUtils.f(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Throwable th) {
                    th = th;
                    CommonUtils.f(bufferedWriter, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                CommonUtils.f(bufferedWriter, "Failed to close rollouts state file.");
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            Logger.f().l("Error serializing rollouts state.", e);
            m(c2);
            CommonUtils.f(bufferedWriter, "Failed to close rollouts state file.");
        }
    }

    public void s(String str, String str2) {
        File d2 = d(str);
        BufferedWriter bufferedWriter = null;
        try {
            String n2 = n(str2);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(d2), f30134b));
            try {
                bufferedWriter2.write(n2);
                bufferedWriter2.flush();
                CommonUtils.f(bufferedWriter2, "Failed to close user metadata file.");
            } catch (Exception e2) {
                e = e2;
                bufferedWriter = bufferedWriter2;
                try {
                    Logger.f().l("Error serializing user metadata.", e);
                    CommonUtils.f(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    CommonUtils.f(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                CommonUtils.f(bufferedWriter, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            Logger.f().l("Error serializing user metadata.", e);
            CommonUtils.f(bufferedWriter, "Failed to close user metadata file.");
        }
    }
}
