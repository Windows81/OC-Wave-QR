package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

class ActivityChooserModel extends DataSetObservable {

    /* renamed from: n  reason: collision with root package name */
    public static final String f1013n = "ActivityChooserModel";

    /* renamed from: o  reason: collision with root package name */
    public static final Object f1014o = new Object();

    /* renamed from: p  reason: collision with root package name */
    public static final Map f1015p = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Object f1016a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final List f1017b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final List f1018c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final Context f1019d;

    /* renamed from: e  reason: collision with root package name */
    public final String f1020e;

    /* renamed from: f  reason: collision with root package name */
    public Intent f1021f;

    /* renamed from: g  reason: collision with root package name */
    public ActivitySorter f1022g = new DefaultSorter();

    /* renamed from: h  reason: collision with root package name */
    public int f1023h = 50;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1024i = true;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1025j = false;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1026k = true;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1027l = false;

    /* renamed from: m  reason: collision with root package name */
    public OnChooseActivityListener f1028m;

    public interface ActivityChooserModelClient {
    }

    public static final class ActivityResolveInfo implements Comparable<ActivityResolveInfo> {

        /* renamed from: A  reason: collision with root package name */
        public float f1029A;

        /* renamed from: z  reason: collision with root package name */
        public final ResolveInfo f1030z;

        public ActivityResolveInfo(ResolveInfo resolveInfo) {
            this.f1030z = resolveInfo;
        }

        /* renamed from: d */
        public int compareTo(ActivityResolveInfo activityResolveInfo) {
            return Float.floatToIntBits(activityResolveInfo.f1029A) - Float.floatToIntBits(this.f1029A);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && ActivityResolveInfo.class == obj.getClass() && Float.floatToIntBits(this.f1029A) == Float.floatToIntBits(((ActivityResolveInfo) obj).f1029A);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f1029A) + 31;
        }

        public String toString() {
            return "[" + "resolveInfo:" + this.f1030z.toString() + "; weight:" + new BigDecimal((double) this.f1029A) + "]";
        }
    }

    public interface ActivitySorter {
        void a(Intent intent, List list, List list2);
    }

    public static final class DefaultSorter implements ActivitySorter {

        /* renamed from: a  reason: collision with root package name */
        public final Map f1031a = new HashMap();

        public void a(Intent intent, List list, List list2) {
            Map map = this.f1031a;
            map.clear();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ActivityResolveInfo activityResolveInfo = (ActivityResolveInfo) list.get(i2);
                activityResolveInfo.f1029A = 0.0f;
                ActivityInfo activityInfo = activityResolveInfo.f1030z.activityInfo;
                map.put(new ComponentName(activityInfo.packageName, activityInfo.name), activityResolveInfo);
            }
            float f2 = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                HistoricalRecord historicalRecord = (HistoricalRecord) list2.get(size2);
                ActivityResolveInfo activityResolveInfo2 = (ActivityResolveInfo) map.get(historicalRecord.f1032a);
                if (activityResolveInfo2 != null) {
                    activityResolveInfo2.f1029A += historicalRecord.f1034c * f2;
                    f2 *= 0.95f;
                }
            }
            Collections.sort(list);
        }
    }

    public static final class HistoricalRecord {

        /* renamed from: a  reason: collision with root package name */
        public final ComponentName f1032a;

        /* renamed from: b  reason: collision with root package name */
        public final long f1033b;

        /* renamed from: c  reason: collision with root package name */
        public final float f1034c;

        public HistoricalRecord(String str, long j2, float f2) {
            this(ComponentName.unflattenFromString(str), j2, f2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || HistoricalRecord.class != obj.getClass()) {
                return false;
            }
            HistoricalRecord historicalRecord = (HistoricalRecord) obj;
            ComponentName componentName = this.f1032a;
            if (componentName == null) {
                if (historicalRecord.f1032a != null) {
                    return false;
                }
            } else if (!componentName.equals(historicalRecord.f1032a)) {
                return false;
            }
            return this.f1033b == historicalRecord.f1033b && Float.floatToIntBits(this.f1034c) == Float.floatToIntBits(historicalRecord.f1034c);
        }

        public int hashCode() {
            ComponentName componentName = this.f1032a;
            int hashCode = componentName == null ? 0 : componentName.hashCode();
            long j2 = this.f1033b;
            return ((((hashCode + 31) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Float.floatToIntBits(this.f1034c);
        }

        public String toString() {
            return "[" + "; activity:" + this.f1032a + "; time:" + this.f1033b + "; weight:" + new BigDecimal((double) this.f1034c) + "]";
        }

        public HistoricalRecord(ComponentName componentName, long j2, float f2) {
            this.f1032a = componentName;
            this.f1033b = j2;
            this.f1034c = f2;
        }
    }

    public interface OnChooseActivityListener {
        boolean a(ActivityChooserModel activityChooserModel, Intent intent);
    }

    public final class PersistHistoryAsyncTask extends AsyncTask<Object, Void, Void> {
        public PersistHistoryAsyncTask() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0074, code lost:
            if (r15 != null) goto L_0x0076;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r15.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0096, code lost:
            if (r15 == null) goto L_0x00d7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b5, code lost:
            if (r15 == null) goto L_0x00d7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d4, code lost:
            if (r15 == null) goto L_0x00d7;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.Object... r15) {
            /*
                r14 = this;
                java.lang.String r0 = "historical-record"
                java.lang.String r1 = "historical-records"
                java.lang.String r2 = "Error writing historical record file: "
                r3 = 0
                r4 = r15[r3]
                java.util.List r4 = (java.util.List) r4
                r5 = 1
                r15 = r15[r5]
                java.lang.String r15 = (java.lang.String) r15
                r6 = 0
                androidx.appcompat.widget.ActivityChooserModel r7 = androidx.appcompat.widget.ActivityChooserModel.this     // Catch:{ FileNotFoundException -> 0x00e2 }
                android.content.Context r7 = r7.f1019d     // Catch:{ FileNotFoundException -> 0x00e2 }
                java.io.FileOutputStream r15 = r7.openFileOutput(r15, r3)     // Catch:{ FileNotFoundException -> 0x00e2 }
                org.xmlpull.v1.XmlSerializer r7 = android.util.Xml.newSerializer()
                r7.setOutput(r15, r6)     // Catch:{ IllegalArgumentException -> 0x0068, IllegalStateException -> 0x0066, IOException -> 0x0064 }
                java.lang.String r8 = "UTF-8"
                java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch:{ IllegalArgumentException -> 0x0068, IllegalStateException -> 0x0066, IOException -> 0x0064 }
                r7.startDocument(r8, r9)     // Catch:{ IllegalArgumentException -> 0x0068, IllegalStateException -> 0x0066, IOException -> 0x0064 }
                r7.startTag(r6, r1)     // Catch:{ IllegalArgumentException -> 0x0068, IllegalStateException -> 0x0066, IOException -> 0x0064 }
                int r8 = r4.size()     // Catch:{ IllegalArgumentException -> 0x0068, IllegalStateException -> 0x0066, IOException -> 0x0064 }
                r9 = r3
            L_0x002f:
                if (r9 >= r8) goto L_0x006a
                java.lang.Object r10 = r4.remove(r3)     // Catch:{ IllegalArgumentException -> 0x0068, IllegalStateException -> 0x0066, IOException -> 0x0064 }
                androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord r10 = (androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord) r10     // Catch:{ IllegalArgumentException -> 0x0068, IllegalStateException -> 0x0066, IOException -> 0x0064 }
                r7.startTag(r6, r0)     // Catch:{ IllegalArgumentException -> 0x0068, IllegalStateException -> 0x0066, IOException -> 0x0064 }
                java.lang.String r11 = "activity"
                android.content.ComponentName r12 = r10.f1032a     // Catch:{ IllegalArgumentException -> 0x0068, IllegalStateException -> 0x0066, IOException -> 0x0064 }
                java.lang.String r12 = r12.flattenToString()     // Catch:{ IllegalArgumentException -> 0x0068, IllegalStateException -> 0x0066, IOException -> 0x0064 }
                r7.attribute(r6, r11, r12)     // Catch:{ IllegalArgumentException -> 0x0068, IllegalStateException -> 0x0066, IOException -> 0x0064 }
                java.lang.String r11 = "time"
                long r12 = r10.f1033b     // Catch:{ IllegalArgumentException -> 0x0068, IllegalStateException -> 0x0066, IOException -> 0x0064 }
                java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ IllegalArgumentException -> 0x0068, IllegalStateException -> 0x0066, IOException -> 0x0064 }
                r7.attribute(r6, r11, r12)     // Catch:{ IllegalArgumentException -> 0x0068, IllegalStateException -> 0x0066, IOException -> 0x0064 }
                java.lang.String r11 = "weight"
                float r10 = r10.f1034c     // Catch:{ IllegalArgumentException -> 0x0068, IllegalStateException -> 0x0066, IOException -> 0x0064 }
                java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ IllegalArgumentException -> 0x0068, IllegalStateException -> 0x0066, IOException -> 0x0064 }
                r7.attribute(r6, r11, r10)     // Catch:{ IllegalArgumentException -> 0x0068, IllegalStateException -> 0x0066, IOException -> 0x0064 }
                r7.endTag(r6, r0)     // Catch:{ IllegalArgumentException -> 0x0068, IllegalStateException -> 0x0066, IOException -> 0x0064 }
                int r9 = r9 + 1
                goto L_0x002f
            L_0x0061:
                r0 = move-exception
                goto L_0x00d8
            L_0x0064:
                r0 = move-exception
                goto L_0x007a
            L_0x0066:
                r0 = move-exception
                goto L_0x0099
            L_0x0068:
                r0 = move-exception
                goto L_0x00b8
            L_0x006a:
                r7.endTag(r6, r1)     // Catch:{ IllegalArgumentException -> 0x0068, IllegalStateException -> 0x0066, IOException -> 0x0064 }
                r7.endDocument()     // Catch:{ IllegalArgumentException -> 0x0068, IllegalStateException -> 0x0066, IOException -> 0x0064 }
                androidx.appcompat.widget.ActivityChooserModel r0 = androidx.appcompat.widget.ActivityChooserModel.this
                r0.f1024i = r5
                if (r15 == 0) goto L_0x00d7
            L_0x0076:
                r15.close()     // Catch:{ IOException -> 0x00d7 }
                goto L_0x00d7
            L_0x007a:
                java.lang.String r1 = androidx.appcompat.widget.ActivityChooserModel.f1013n     // Catch:{ all -> 0x0061 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
                r3.<init>()     // Catch:{ all -> 0x0061 }
                r3.append(r2)     // Catch:{ all -> 0x0061 }
                androidx.appcompat.widget.ActivityChooserModel r2 = androidx.appcompat.widget.ActivityChooserModel.this     // Catch:{ all -> 0x0061 }
                java.lang.String r2 = r2.f1020e     // Catch:{ all -> 0x0061 }
                r3.append(r2)     // Catch:{ all -> 0x0061 }
                java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0061 }
                android.util.Log.e(r1, r2, r0)     // Catch:{ all -> 0x0061 }
                androidx.appcompat.widget.ActivityChooserModel r0 = androidx.appcompat.widget.ActivityChooserModel.this
                r0.f1024i = r5
                if (r15 == 0) goto L_0x00d7
                goto L_0x0076
            L_0x0099:
                java.lang.String r1 = androidx.appcompat.widget.ActivityChooserModel.f1013n     // Catch:{ all -> 0x0061 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
                r3.<init>()     // Catch:{ all -> 0x0061 }
                r3.append(r2)     // Catch:{ all -> 0x0061 }
                androidx.appcompat.widget.ActivityChooserModel r2 = androidx.appcompat.widget.ActivityChooserModel.this     // Catch:{ all -> 0x0061 }
                java.lang.String r2 = r2.f1020e     // Catch:{ all -> 0x0061 }
                r3.append(r2)     // Catch:{ all -> 0x0061 }
                java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0061 }
                android.util.Log.e(r1, r2, r0)     // Catch:{ all -> 0x0061 }
                androidx.appcompat.widget.ActivityChooserModel r0 = androidx.appcompat.widget.ActivityChooserModel.this
                r0.f1024i = r5
                if (r15 == 0) goto L_0x00d7
                goto L_0x0076
            L_0x00b8:
                java.lang.String r1 = androidx.appcompat.widget.ActivityChooserModel.f1013n     // Catch:{ all -> 0x0061 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
                r3.<init>()     // Catch:{ all -> 0x0061 }
                r3.append(r2)     // Catch:{ all -> 0x0061 }
                androidx.appcompat.widget.ActivityChooserModel r2 = androidx.appcompat.widget.ActivityChooserModel.this     // Catch:{ all -> 0x0061 }
                java.lang.String r2 = r2.f1020e     // Catch:{ all -> 0x0061 }
                r3.append(r2)     // Catch:{ all -> 0x0061 }
                java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0061 }
                android.util.Log.e(r1, r2, r0)     // Catch:{ all -> 0x0061 }
                androidx.appcompat.widget.ActivityChooserModel r0 = androidx.appcompat.widget.ActivityChooserModel.this
                r0.f1024i = r5
                if (r15 == 0) goto L_0x00d7
                goto L_0x0076
            L_0x00d7:
                return r6
            L_0x00d8:
                androidx.appcompat.widget.ActivityChooserModel r1 = androidx.appcompat.widget.ActivityChooserModel.this
                r1.f1024i = r5
                if (r15 == 0) goto L_0x00e1
                r15.close()     // Catch:{ IOException -> 0x00e1 }
            L_0x00e1:
                throw r0
            L_0x00e2:
                r0 = move-exception
                java.lang.String r1 = androidx.appcompat.widget.ActivityChooserModel.f1013n
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r2)
                r3.append(r15)
                java.lang.String r15 = r3.toString()
                android.util.Log.e(r1, r15, r0)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActivityChooserModel.PersistHistoryAsyncTask.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }

    public ActivityChooserModel(Context context, String str) {
        this.f1019d = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(".xml")) {
            this.f1020e = str;
            return;
        }
        this.f1020e = str + ".xml";
    }

    public static ActivityChooserModel d(Context context, String str) {
        ActivityChooserModel activityChooserModel;
        synchronized (f1014o) {
            try {
                Map map = f1015p;
                activityChooserModel = (ActivityChooserModel) map.get(str);
                if (activityChooserModel == null) {
                    activityChooserModel = new ActivityChooserModel(context, str);
                    map.put(str, activityChooserModel);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return activityChooserModel;
    }

    public final boolean a(HistoricalRecord historicalRecord) {
        boolean add = this.f1018c.add(historicalRecord);
        if (add) {
            this.f1026k = true;
            l();
            k();
            p();
            notifyChanged();
        }
        return add;
    }

    public Intent b(int i2) {
        synchronized (this.f1016a) {
            try {
                if (this.f1021f == null) {
                    return null;
                }
                c();
                ActivityInfo activityInfo = ((ActivityResolveInfo) this.f1017b.get(i2)).f1030z.activityInfo;
                ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                Intent intent = new Intent(this.f1021f);
                intent.setComponent(componentName);
                if (this.f1028m != null) {
                    if (this.f1028m.a(this, new Intent(intent))) {
                        return null;
                    }
                }
                a(new HistoricalRecord(componentName, System.currentTimeMillis(), 1.0f));
                return intent;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        boolean j2 = j() | m();
        l();
        if (j2) {
            p();
            notifyChanged();
        }
    }

    public ResolveInfo e(int i2) {
        ResolveInfo resolveInfo;
        synchronized (this.f1016a) {
            c();
            resolveInfo = ((ActivityResolveInfo) this.f1017b.get(i2)).f1030z;
        }
        return resolveInfo;
    }

    public int f() {
        int size;
        synchronized (this.f1016a) {
            c();
            size = this.f1017b.size();
        }
        return size;
    }

    public int g(ResolveInfo resolveInfo) {
        synchronized (this.f1016a) {
            try {
                c();
                List list = this.f1017b;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (((ActivityResolveInfo) list.get(i2)).f1030z == resolveInfo) {
                        return i2;
                    }
                }
                return -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ResolveInfo h() {
        synchronized (this.f1016a) {
            try {
                c();
                if (this.f1017b.isEmpty()) {
                    return null;
                }
                ResolveInfo resolveInfo = ((ActivityResolveInfo) this.f1017b.get(0)).f1030z;
                return resolveInfo;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int i() {
        int size;
        synchronized (this.f1016a) {
            c();
            size = this.f1018c.size();
        }
        return size;
    }

    public final boolean j() {
        if (!this.f1027l || this.f1021f == null) {
            return false;
        }
        this.f1027l = false;
        this.f1017b.clear();
        List<ResolveInfo> queryIntentActivities = this.f1019d.getPackageManager().queryIntentActivities(this.f1021f, 0);
        int size = queryIntentActivities.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f1017b.add(new ActivityResolveInfo(queryIntentActivities.get(i2)));
        }
        return true;
    }

    public final void k() {
        if (!this.f1025j) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        } else if (this.f1026k) {
            this.f1026k = false;
            if (!TextUtils.isEmpty(this.f1020e)) {
                new PersistHistoryAsyncTask().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[]{new ArrayList(this.f1018c), this.f1020e});
            }
        }
    }

    public final void l() {
        int size = this.f1018c.size() - this.f1023h;
        if (size > 0) {
            this.f1026k = true;
            for (int i2 = 0; i2 < size; i2++) {
                HistoricalRecord historicalRecord = (HistoricalRecord) this.f1018c.remove(0);
            }
        }
    }

    public final boolean m() {
        if (!this.f1024i || !this.f1026k || TextUtils.isEmpty(this.f1020e)) {
            return false;
        }
        this.f1024i = false;
        this.f1025j = true;
        n();
        return true;
    }

    public final void n() {
        try {
            FileInputStream openFileInput = this.f1019d.openFileInput(this.f1020e);
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                newPullParser.setInput(openFileInput, "UTF-8");
                int i2 = 0;
                while (i2 != 1 && i2 != 2) {
                    i2 = newPullParser.next();
                }
                if ("historical-records".equals(newPullParser.getName())) {
                    List list = this.f1018c;
                    list.clear();
                    while (true) {
                        int next = newPullParser.next();
                        if (next == 1) {
                            if (openFileInput == null) {
                                return;
                            }
                        } else if (!(next == 3 || next == 4)) {
                            if ("historical-record".equals(newPullParser.getName())) {
                                list.add(new HistoricalRecord(newPullParser.getAttributeValue((String) null, "activity"), Long.parseLong(newPullParser.getAttributeValue((String) null, "time")), Float.parseFloat(newPullParser.getAttributeValue((String) null, "weight"))));
                            } else {
                                throw new XmlPullParserException("Share records file not well-formed.");
                            }
                        }
                    }
                    try {
                        openFileInput.close();
                    } catch (IOException unused) {
                    }
                } else {
                    throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                }
            } catch (XmlPullParserException e2) {
                String str = f1013n;
                Log.e(str, "Error reading historical recrod file: " + this.f1020e, e2);
                if (openFileInput == null) {
                }
            } catch (IOException e3) {
                String str2 = f1013n;
                Log.e(str2, "Error reading historical recrod file: " + this.f1020e, e3);
                if (openFileInput == null) {
                }
            } catch (Throwable th) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused3) {
        }
    }

    public void o(int i2) {
        synchronized (this.f1016a) {
            try {
                c();
                ActivityResolveInfo activityResolveInfo = (ActivityResolveInfo) this.f1017b.get(i2);
                ActivityResolveInfo activityResolveInfo2 = (ActivityResolveInfo) this.f1017b.get(0);
                float f2 = activityResolveInfo2 != null ? (activityResolveInfo2.f1029A - activityResolveInfo.f1029A) + 5.0f : 1.0f;
                ActivityInfo activityInfo = activityResolveInfo.f1030z.activityInfo;
                a(new HistoricalRecord(new ComponentName(activityInfo.packageName, activityInfo.name), System.currentTimeMillis(), f2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean p() {
        if (this.f1022g == null || this.f1021f == null || this.f1017b.isEmpty() || this.f1018c.isEmpty()) {
            return false;
        }
        this.f1022g.a(this.f1021f, this.f1017b, Collections.unmodifiableList(this.f1018c));
        return true;
    }
}
