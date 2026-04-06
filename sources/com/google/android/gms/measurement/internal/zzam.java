package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzgn;
import com.google.android.gms.internal.measurement.zzlc;
import com.google.android.gms.internal.measurement.zzrw;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzam extends zznr {

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f26186f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f26187g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f26188h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;"};

    /* renamed from: i  reason: collision with root package name */
    public static final String[] f26189i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j  reason: collision with root package name */
    public static final String[] f26190j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: k  reason: collision with root package name */
    public static final String[] f26191k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: l  reason: collision with root package name */
    public static final String[] f26192l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m  reason: collision with root package name */
    public static final String[] f26193m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: n  reason: collision with root package name */
    public static final String[] f26194n = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* renamed from: o  reason: collision with root package name */
    public static final String[] f26195o = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* renamed from: d  reason: collision with root package name */
    public final zzav f26196d = new zzav(this, a(), "google_app_measurement.db");

    /* renamed from: e  reason: collision with root package name */
    public final zznl f26197e = new zznl(b());

    public zzam(zznv zznv) {
        super(zznv);
    }

    public static void T(ContentValues contentValues, String str, Object obj) {
        Preconditions.g(str);
        Preconditions.m(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    public final long A() {
        return G("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    public final long A0(String str) {
        Preconditions.g(str);
        n();
        u();
        return G("select first_open_count from app2 where app_id=?", new String[]{str}, -1);
    }

    public final SQLiteDatabase B() {
        n();
        try {
            return this.f26196d.getWritableDatabase();
        } catch (SQLiteException e2) {
            m().L().b("Error opening database", e2);
            throw e2;
        }
    }

    /* JADX INFO: finally extract failed */
    public final long B0(String str, String str2) {
        Preconditions.g(str);
        Preconditions.g(str2);
        n();
        u();
        SQLiteDatabase B2 = B();
        B2.beginTransaction();
        long j2 = 0;
        try {
            long G = G("select " + str2 + " from app2 where app_id=?", new String[]{str}, -1);
            if (G == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", 0);
                contentValues.put("previous_install_count", 0);
                if (B2.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                    m().G().c("Failed to insert column (got -1). appId", zzgi.v(str), str2);
                    B2.endTransaction();
                    return -1;
                }
                G = 0;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put(str2, Long.valueOf(1 + G));
                if (((long) B2.update("app2", contentValues2, "app_id = ?", new String[]{str})) == 0) {
                    m().G().c("Failed to update column (got 0). appId", zzgi.v(str), str2);
                    B2.endTransaction();
                    return -1;
                }
                B2.setTransactionSuccessful();
                B2.endTransaction();
                return G;
            } catch (SQLiteException e2) {
                long j3 = G;
                e = e2;
                j2 = j3;
                try {
                    m().G().d("Error inserting column. appId", zzgi.v(str), str2, e);
                    B2.endTransaction();
                    return j2;
                } catch (Throwable th) {
                    B2.endTransaction();
                    throw th;
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            m().G().d("Error inserting column. appId", zzgi.v(str), str2, e);
            B2.endTransaction();
            return j2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String C() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.B()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0027, all -> 0x0022 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x001c }
            if (r2 == 0) goto L_0x001e
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x001c }
            r0.close()
            return r1
        L_0x001a:
            r1 = move-exception
            goto L_0x003c
        L_0x001c:
            r2 = move-exception
            goto L_0x0029
        L_0x001e:
            r0.close()
            return r1
        L_0x0022:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x003c
        L_0x0027:
            r2 = move-exception
            r0 = r1
        L_0x0029:
            com.google.android.gms.measurement.internal.zzgi r3 = r6.m()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.zzgk r3 = r3.G()     // Catch:{ all -> 0x001a }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x003b
            r0.close()
        L_0x003b:
            return r1
        L_0x003c:
            if (r0 == 0) goto L_0x0041
            r0.close()
        L_0x0041:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.C():java.lang.String");
    }

    public final long C0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = B().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j2 = cursor.getLong(0);
                cursor.close();
                return j2;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e2) {
            m().G().c("Database error", str, e2);
            throw e2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final int D(String str, String str2) {
        Preconditions.g(str);
        Preconditions.g(str2);
        n();
        u();
        try {
            return B().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            m().G().d("Error deleting conditional property", zzgi.v(str), h().g(str2), e2);
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        r13 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        r13 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0103, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0104, code lost:
        r13 = r22;
        r12 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0120, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0126, code lost:
        r2.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034 A[Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }, ExcHandler: all (th java.lang.Throwable), PHI: r2 
      PHI: (r2v4 android.database.Cursor) = (r2v0 android.database.Cursor), (r2v0 android.database.Cursor), (r2v0 android.database.Cursor), (r2v5 android.database.Cursor), (r2v0 android.database.Cursor) binds: [B:1:0x0011, B:2:?, B:4:0x0019, B:22:0x0099, B:8:0x002b] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0011] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List D0(java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            r22 = this;
            r0 = r25
            com.google.android.gms.common.internal.Preconditions.g(r23)
            r22.n()
            r22.u()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0103, all -> 0x0034 }
            r4 = 3
            r3.<init>(r4)     // Catch:{ SQLiteException -> 0x0103, all -> 0x0034 }
            r12 = r23
            r3.add(r12)     // Catch:{ SQLiteException -> 0x00fd, all -> 0x0034 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00fd, all -> 0x0034 }
            java.lang.String r6 = "app_id=?"
            r5.<init>(r6)     // Catch:{ SQLiteException -> 0x00fd, all -> 0x0034 }
            boolean r6 = android.text.TextUtils.isEmpty(r24)     // Catch:{ SQLiteException -> 0x00fd, all -> 0x0034 }
            if (r6 != 0) goto L_0x003e
            r6 = r24
            r3.add(r6)     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            java.lang.String r7 = " and origin=?"
            r5.append(r7)     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            goto L_0x0040
        L_0x0034:
            r0 = move-exception
            r13 = r22
            goto L_0x0124
        L_0x0039:
            r0 = move-exception
            r13 = r22
            goto L_0x0109
        L_0x003e:
            r6 = r24
        L_0x0040:
            boolean r7 = android.text.TextUtils.isEmpty(r25)     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            if (r7 != 0) goto L_0x005f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            r7.<init>()     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            r7.append(r0)     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            java.lang.String r8 = "*"
            r7.append(r8)     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            java.lang.String r7 = r7.toString()     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            r3.add(r7)     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            java.lang.String r7 = " and name glob ?"
            r5.append(r7)     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
        L_0x005f:
            int r7 = r3.size()     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            java.lang.Object[] r3 = r3.toArray(r7)     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            r17 = r3
            java.lang.String[] r17 = (java.lang.String[]) r17     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            android.database.sqlite.SQLiteDatabase r13 = r22.B()     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            java.lang.String r14 = "user_attributes"
            java.lang.String r3 = "name"
            java.lang.String r7 = "set_timestamp"
            java.lang.String r8 = "value"
            java.lang.String r9 = "origin"
            java.lang.String[] r15 = new java.lang.String[]{r3, r7, r8, r9}     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            java.lang.String r16 = r5.toString()     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            java.lang.String r20 = "rowid"
            java.lang.String r21 = "1001"
            r18 = 0
            r19 = 0
            android.database.Cursor r2 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            if (r3 != 0) goto L_0x0099
            r2.close()
            return r1
        L_0x0099:
            int r3 = r1.size()     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            r5 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r5) goto L_0x00b5
            com.google.android.gms.measurement.internal.zzgi r0 = r22.m()     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            com.google.android.gms.measurement.internal.zzgk r0 = r0.G()     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            java.lang.String r3 = "Read more than the max allowed user properties, ignoring excess"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            r0.b(r3, r4)     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            r13 = r22
            goto L_0x00f5
        L_0x00b5:
            r3 = 0
            java.lang.String r8 = r2.getString(r3)     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            r3 = 1
            long r9 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x0039, all -> 0x0034 }
            r3 = 2
            r13 = r22
            java.lang.Object r11 = r13.M(r2, r3)     // Catch:{ SQLiteException -> 0x00fb }
            java.lang.String r3 = r2.getString(r4)     // Catch:{ SQLiteException -> 0x00fb }
            if (r11 != 0) goto L_0x00e3
            com.google.android.gms.measurement.internal.zzgi r5 = r22.m()     // Catch:{ SQLiteException -> 0x00e0 }
            com.google.android.gms.measurement.internal.zzgk r5 = r5.G()     // Catch:{ SQLiteException -> 0x00e0 }
            java.lang.String r6 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzgi.v(r23)     // Catch:{ SQLiteException -> 0x00e0 }
            r5.d(r6, r7, r3, r0)     // Catch:{ SQLiteException -> 0x00e0 }
            goto L_0x00ef
        L_0x00de:
            r0 = move-exception
            goto L_0x0124
        L_0x00e0:
            r0 = move-exception
            r6 = r3
            goto L_0x0109
        L_0x00e3:
            com.google.android.gms.measurement.internal.zzom r14 = new com.google.android.gms.measurement.internal.zzom     // Catch:{ SQLiteException -> 0x00e0 }
            r5 = r14
            r6 = r23
            r7 = r3
            r5.<init>(r6, r7, r8, r9, r11)     // Catch:{ SQLiteException -> 0x00e0 }
            r1.add(r14)     // Catch:{ SQLiteException -> 0x00e0 }
        L_0x00ef:
            boolean r5 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x00e0 }
            if (r5 != 0) goto L_0x00f9
        L_0x00f5:
            r2.close()
            return r1
        L_0x00f9:
            r6 = r3
            goto L_0x0099
        L_0x00fb:
            r0 = move-exception
            goto L_0x0109
        L_0x00fd:
            r0 = move-exception
            r13 = r22
        L_0x0100:
            r6 = r24
            goto L_0x0109
        L_0x0103:
            r0 = move-exception
            r13 = r22
            r12 = r23
            goto L_0x0100
        L_0x0109:
            com.google.android.gms.measurement.internal.zzgi r1 = r22.m()     // Catch:{ all -> 0x00de }
            com.google.android.gms.measurement.internal.zzgk r1 = r1.G()     // Catch:{ all -> 0x00de }
            java.lang.String r3 = "(2)Error querying user properties"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzgi.v(r23)     // Catch:{ all -> 0x00de }
            r1.d(r3, r4, r6, r0)     // Catch:{ all -> 0x00de }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00de }
            if (r2 == 0) goto L_0x0123
            r2.close()
        L_0x0123:
            return r0
        L_0x0124:
            if (r2 == 0) goto L_0x0129
            r2.close()
        L_0x0129:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.D0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final long E(zzgn.zzk zzk) {
        n();
        u();
        Preconditions.m(zzk);
        Preconditions.g(zzk.C2());
        byte[] m2 = zzk.m();
        long A2 = o().A(m2);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzk.C2());
        contentValues.put("metadata_fingerprint", Long.valueOf(A2));
        contentValues.put("metadata", m2);
        try {
            B().insertWithOnConflict("raw_events_metadata", (String) null, contentValues, 4);
            return A2;
        } catch (SQLiteException e2) {
            m().G().c("Error storing raw event metadata. appId", zzgi.v(zzk.C2()), e2);
            throw e2;
        }
    }

    public final void E0(String str, zzjc zzjc) {
        Preconditions.m(str);
        Preconditions.m(zzjc);
        n();
        u();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzjc.z());
        contentValues.put("consent_source", Integer.valueOf(zzjc.b()));
        a0("consent_settings", "app_id", contentValues);
    }

    public final long F(String str) {
        Preconditions.g(str);
        n();
        u();
        try {
            return (long) B().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, d().y(str, zzbj.f26275q))))});
        } catch (SQLiteException e2) {
            m().G().c("Error deleting over the limit events. appId", zzgi.v(str), e2);
            return 0;
        }
    }

    public final boolean F0(String str, List list) {
        Preconditions.g(str);
        u();
        n();
        SQLiteDatabase B2 = B();
        try {
            long C0 = C0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, d().y(str, zzbj.I)));
            if (C0 <= ((long) max)) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Integer num = (Integer) list.get(i2);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            StringBuilder sb = new StringBuilder("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb.append("(" + TextUtils.join(",", arrayList) + ")");
            sb.append(" order by rowid desc limit -1 offset ?)");
            return B2.delete("audience_filter_values", sb.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e2) {
            m().G().c("Database error querying filters. appId", zzgi.v(str), e2);
            return false;
        }
    }

    public final long G(String str, String[] strArr, long j2) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = B().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j3 = rawQuery.getLong(0);
                rawQuery.close();
                return j3;
            }
            rawQuery.close();
            return j2;
        } catch (SQLiteException e2) {
            m().G().c("Database error", str, e2);
            throw e2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long G0(String str) {
        Preconditions.g(str);
        return G("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair H(java.lang.String r6, java.lang.Long r7) {
        /*
            r5 = this;
            r5.n()
            r5.u()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.B()     // Catch:{ SQLiteException -> 0x0075, all -> 0x0073 }
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            java.lang.String r3 = java.lang.String.valueOf(r7)     // Catch:{ SQLiteException -> 0x0075, all -> 0x0073 }
            java.lang.String[] r3 = new java.lang.String[]{r6, r3}     // Catch:{ SQLiteException -> 0x0075, all -> 0x0073 }
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x0075, all -> 0x0073 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0033 }
            if (r2 != 0) goto L_0x0035
            com.google.android.gms.measurement.internal.zzgi r6 = r5.m()     // Catch:{ SQLiteException -> 0x0033 }
            com.google.android.gms.measurement.internal.zzgk r6 = r6.K()     // Catch:{ SQLiteException -> 0x0033 }
            java.lang.String r7 = "Main event not found"
            r6.a(r7)     // Catch:{ SQLiteException -> 0x0033 }
            r1.close()
            return r0
        L_0x0030:
            r6 = move-exception
            r0 = r1
            goto L_0x008a
        L_0x0033:
            r6 = move-exception
            goto L_0x0077
        L_0x0035:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch:{ SQLiteException -> 0x0033 }
            r3 = 1
            long r3 = r1.getLong(r3)     // Catch:{ SQLiteException -> 0x0033 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x0033 }
            com.google.android.gms.internal.measurement.zzgn$zzf$zza r4 = com.google.android.gms.internal.measurement.zzgn.zzf.W()     // Catch:{ IOException -> 0x005d }
            com.google.android.gms.internal.measurement.zzmk r2 = com.google.android.gms.measurement.internal.zzol.G(r4, r2)     // Catch:{ IOException -> 0x005d }
            com.google.android.gms.internal.measurement.zzgn$zzf$zza r2 = (com.google.android.gms.internal.measurement.zzgn.zzf.zza) r2     // Catch:{ IOException -> 0x005d }
            com.google.android.gms.internal.measurement.zzml r2 = r2.F()     // Catch:{ IOException -> 0x005d }
            com.google.android.gms.internal.measurement.zzlc r2 = (com.google.android.gms.internal.measurement.zzlc) r2     // Catch:{ IOException -> 0x005d }
            com.google.android.gms.internal.measurement.zzgn$zzf r2 = (com.google.android.gms.internal.measurement.zzgn.zzf) r2     // Catch:{ IOException -> 0x005d }
            android.util.Pair r6 = android.util.Pair.create(r2, r3)     // Catch:{ SQLiteException -> 0x0033 }
            r1.close()
            return r6
        L_0x005d:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzgi r3 = r5.m()     // Catch:{ SQLiteException -> 0x0033 }
            com.google.android.gms.measurement.internal.zzgk r3 = r3.G()     // Catch:{ SQLiteException -> 0x0033 }
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzgi.v(r6)     // Catch:{ SQLiteException -> 0x0033 }
            r3.d(r4, r6, r7, r2)     // Catch:{ SQLiteException -> 0x0033 }
            r1.close()
            return r0
        L_0x0073:
            r6 = move-exception
            goto L_0x008a
        L_0x0075:
            r6 = move-exception
            r1 = r0
        L_0x0077:
            com.google.android.gms.measurement.internal.zzgi r7 = r5.m()     // Catch:{ all -> 0x0030 }
            com.google.android.gms.measurement.internal.zzgk r7 = r7.G()     // Catch:{ all -> 0x0030 }
            java.lang.String r2 = "Error selecting main event"
            r7.b(r2, r6)     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x0089
            r1.close()
        L_0x0089:
            return r0
        L_0x008a:
            if (r0 == 0) goto L_0x008f
            r0.close()
        L_0x008f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.H(java.lang.String, java.lang.Long):android.util.Pair");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzaf H0(java.lang.String r27, java.lang.String r28) {
        /*
            r26 = this;
            r7 = r28
            com.google.android.gms.common.internal.Preconditions.g(r27)
            com.google.android.gms.common.internal.Preconditions.g(r28)
            r26.n()
            r26.u()
            r8 = 0
            android.database.sqlite.SQLiteDatabase r9 = r26.B()     // Catch:{ SQLiteException -> 0x00f9, all -> 0x00f7 }
            java.lang.String r10 = "conditional_properties"
            java.lang.String r11 = "origin"
            java.lang.String r12 = "value"
            java.lang.String r13 = "active"
            java.lang.String r14 = "trigger_event_name"
            java.lang.String r15 = "trigger_timeout"
            java.lang.String r16 = "timed_out_event"
            java.lang.String r17 = "creation_timestamp"
            java.lang.String r18 = "triggered_event"
            java.lang.String r19 = "triggered_timestamp"
            java.lang.String r20 = "time_to_live"
            java.lang.String r21 = "expired_event"
            java.lang.String[] r11 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}     // Catch:{ SQLiteException -> 0x00f9, all -> 0x00f7 }
            java.lang.String r12 = "app_id=? and name=?"
            java.lang.String[] r13 = new java.lang.String[]{r27, r28}     // Catch:{ SQLiteException -> 0x00f9, all -> 0x00f7 }
            r15 = 0
            r16 = 0
            r14 = 0
            android.database.Cursor r9 = r9.query(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ SQLiteException -> 0x00f9, all -> 0x00f7 }
            boolean r0 = r9.moveToFirst()     // Catch:{ SQLiteException -> 0x0056 }
            if (r0 != 0) goto L_0x0047
            r9.close()
            return r8
        L_0x0047:
            r0 = 0
            java.lang.String r1 = r9.getString(r0)     // Catch:{ SQLiteException -> 0x0056 }
            if (r1 != 0) goto L_0x0050
            java.lang.String r1 = ""
        L_0x0050:
            r12 = r1
            goto L_0x0059
        L_0x0052:
            r0 = move-exception
            r8 = r9
            goto L_0x011a
        L_0x0056:
            r0 = move-exception
            goto L_0x00fb
        L_0x0059:
            r1 = 1
            r14 = r26
            java.lang.Object r5 = r14.M(r9, r1)     // Catch:{ SQLiteException -> 0x0056 }
            r2 = 2
            int r2 = r9.getInt(r2)     // Catch:{ SQLiteException -> 0x0056 }
            if (r2 == 0) goto L_0x006a
            r16 = r1
            goto L_0x006c
        L_0x006a:
            r16 = r0
        L_0x006c:
            r0 = 3
            java.lang.String r17 = r9.getString(r0)     // Catch:{ SQLiteException -> 0x0056 }
            r0 = 4
            long r19 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x0056 }
            com.google.android.gms.measurement.internal.zzol r0 = r26.o()     // Catch:{ SQLiteException -> 0x0056 }
            r1 = 5
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x0056 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzbh> r2 = com.google.android.gms.measurement.internal.zzbh.CREATOR     // Catch:{ SQLiteException -> 0x0056 }
            android.os.Parcelable r0 = r0.D(r1, r2)     // Catch:{ SQLiteException -> 0x0056 }
            r18 = r0
            com.google.android.gms.measurement.internal.zzbh r18 = (com.google.android.gms.measurement.internal.zzbh) r18     // Catch:{ SQLiteException -> 0x0056 }
            r0 = 6
            long r21 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x0056 }
            com.google.android.gms.measurement.internal.zzol r0 = r26.o()     // Catch:{ SQLiteException -> 0x0056 }
            r1 = 7
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x0056 }
            android.os.Parcelable r0 = r0.D(r1, r2)     // Catch:{ SQLiteException -> 0x0056 }
            com.google.android.gms.measurement.internal.zzbh r0 = (com.google.android.gms.measurement.internal.zzbh) r0     // Catch:{ SQLiteException -> 0x0056 }
            r1 = 8
            long r3 = r9.getLong(r1)     // Catch:{ SQLiteException -> 0x0056 }
            r1 = 9
            long r23 = r9.getLong(r1)     // Catch:{ SQLiteException -> 0x0056 }
            com.google.android.gms.measurement.internal.zzol r1 = r26.o()     // Catch:{ SQLiteException -> 0x0056 }
            r6 = 10
            byte[] r6 = r9.getBlob(r6)     // Catch:{ SQLiteException -> 0x0056 }
            android.os.Parcelable r1 = r1.D(r6, r2)     // Catch:{ SQLiteException -> 0x0056 }
            r25 = r1
            com.google.android.gms.measurement.internal.zzbh r25 = (com.google.android.gms.measurement.internal.zzbh) r25     // Catch:{ SQLiteException -> 0x0056 }
            com.google.android.gms.measurement.internal.zzok r13 = new com.google.android.gms.measurement.internal.zzok     // Catch:{ SQLiteException -> 0x0056 }
            r1 = r13
            r2 = r28
            r6 = r12
            r1.<init>(r2, r3, r5, r6)     // Catch:{ SQLiteException -> 0x0056 }
            com.google.android.gms.measurement.internal.zzaf r1 = new com.google.android.gms.measurement.internal.zzaf     // Catch:{ SQLiteException -> 0x0056 }
            r10 = r1
            r11 = r27
            r14 = r21
            r21 = r0
            r22 = r23
            r24 = r25
            r10.<init>(r11, r12, r13, r14, r16, r17, r18, r19, r21, r22, r24)     // Catch:{ SQLiteException -> 0x0056 }
            boolean r0 = r9.moveToNext()     // Catch:{ SQLiteException -> 0x0056 }
            if (r0 == 0) goto L_0x00f3
            com.google.android.gms.measurement.internal.zzgi r0 = r26.m()     // Catch:{ SQLiteException -> 0x0056 }
            com.google.android.gms.measurement.internal.zzgk r0 = r0.G()     // Catch:{ SQLiteException -> 0x0056 }
            java.lang.String r2 = "Got multiple records for conditional property, expected one"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzgi.v(r27)     // Catch:{ SQLiteException -> 0x0056 }
            com.google.android.gms.measurement.internal.zzgh r4 = r26.h()     // Catch:{ SQLiteException -> 0x0056 }
            java.lang.String r4 = r4.g(r7)     // Catch:{ SQLiteException -> 0x0056 }
            r0.c(r2, r3, r4)     // Catch:{ SQLiteException -> 0x0056 }
        L_0x00f3:
            r9.close()
            return r1
        L_0x00f7:
            r0 = move-exception
            goto L_0x011a
        L_0x00f9:
            r0 = move-exception
            r9 = r8
        L_0x00fb:
            com.google.android.gms.measurement.internal.zzgi r1 = r26.m()     // Catch:{ all -> 0x0052 }
            com.google.android.gms.measurement.internal.zzgk r1 = r1.G()     // Catch:{ all -> 0x0052 }
            java.lang.String r2 = "Error querying conditional property"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzgi.v(r27)     // Catch:{ all -> 0x0052 }
            com.google.android.gms.measurement.internal.zzgh r4 = r26.h()     // Catch:{ all -> 0x0052 }
            java.lang.String r4 = r4.g(r7)     // Catch:{ all -> 0x0052 }
            r1.d(r2, r3, r4, r0)     // Catch:{ all -> 0x0052 }
            if (r9 == 0) goto L_0x0119
            r9.close()
        L_0x0119:
            return r8
        L_0x011a:
            if (r8 == 0) goto L_0x011f
            r8.close()
        L_0x011f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.H0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzaf");
    }

    public final zzar I(long j2, String str, long j3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        Preconditions.g(str);
        n();
        u();
        String[] strArr = {str};
        zzar zzar = new zzar();
        Cursor cursor = null;
        try {
            SQLiteDatabase B2 = B();
            cursor = B2.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                m().L().b("Not updating daily counts, app is not known. appId", zzgi.v(str));
                cursor.close();
                return zzar;
            }
            if (cursor.getLong(0) == j2) {
                zzar.f26207b = cursor.getLong(1);
                zzar.f26206a = cursor.getLong(2);
                zzar.f26208c = cursor.getLong(3);
                zzar.f26209d = cursor.getLong(4);
                zzar.f26210e = cursor.getLong(5);
                zzar.f26211f = cursor.getLong(6);
            }
            if (z2) {
                zzar.f26207b += j3;
            }
            if (z3) {
                zzar.f26206a += j3;
            }
            if (z4) {
                zzar.f26208c += j3;
            }
            if (z5) {
                zzar.f26209d += j3;
            }
            if (z6) {
                zzar.f26210e += j3;
            }
            if (z7) {
                zzar.f26211f += j3;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j2));
            contentValues.put("daily_public_events_count", Long.valueOf(zzar.f26206a));
            contentValues.put("daily_events_count", Long.valueOf(zzar.f26207b));
            contentValues.put("daily_conversions_count", Long.valueOf(zzar.f26208c));
            contentValues.put("daily_error_events_count", Long.valueOf(zzar.f26209d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(zzar.f26210e));
            contentValues.put("daily_realtime_dcu_count", Long.valueOf(zzar.f26211f));
            B2.update("apps", contentValues, "app_id=?", strArr);
            cursor.close();
            return zzar;
        } catch (SQLiteException e2) {
            m().G().c("Error updating daily counts. appId", zzgi.v(str), e2);
            if (cursor != null) {
                cursor.close();
            }
            return zzar;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzbd I0(java.lang.String r29, java.lang.String r30, java.lang.String r31) {
        /*
            r28 = this;
            com.google.android.gms.common.internal.Preconditions.g(r30)
            com.google.android.gms.common.internal.Preconditions.g(r31)
            r28.n()
            r28.u()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r8 = "last_exempt_from_sampling"
            java.lang.String r9 = "current_session_count"
            java.lang.String r1 = "lifetime_count"
            java.lang.String r2 = "current_bundle_count"
            java.lang.String r3 = "last_fire_timestamp"
            java.lang.String r4 = "last_bundled_timestamp"
            java.lang.String r5 = "last_bundled_day"
            java.lang.String r6 = "last_sampled_complex_event_id"
            java.lang.String r7 = "last_sampling_rate"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r28.B()     // Catch:{ SQLiteException -> 0x0107, all -> 0x0105 }
            r10 = 0
            java.lang.String[] r3 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0107, all -> 0x0105 }
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch:{ SQLiteException -> 0x0107, all -> 0x0105 }
            r4 = r0
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ SQLiteException -> 0x0107, all -> 0x0105 }
            java.lang.String r5 = "app_id=? and name=?"
            java.lang.String[] r6 = new java.lang.String[]{r30, r31}     // Catch:{ SQLiteException -> 0x0107, all -> 0x0105 }
            r8 = 0
            r9 = 0
            r7 = 0
            r3 = r29
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0107, all -> 0x0105 }
            boolean r0 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x00cb }
            if (r0 != 0) goto L_0x0053
            r2.close()
            return r1
        L_0x0053:
            long r14 = r2.getLong(r10)     // Catch:{ SQLiteException -> 0x00cb }
            r0 = 1
            long r16 = r2.getLong(r0)     // Catch:{ SQLiteException -> 0x00cb }
            r3 = 2
            long r20 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x00cb }
            r3 = 3
            boolean r4 = r2.isNull(r3)     // Catch:{ SQLiteException -> 0x00cb }
            r5 = 0
            if (r4 == 0) goto L_0x006d
            r22 = r5
            goto L_0x0073
        L_0x006d:
            long r3 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x00cb }
            r22 = r3
        L_0x0073:
            r3 = 4
            boolean r4 = r2.isNull(r3)     // Catch:{ SQLiteException -> 0x00cb }
            if (r4 == 0) goto L_0x007d
            r24 = r1
            goto L_0x0087
        L_0x007d:
            long r3 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x00cb }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x00cb }
            r24 = r3
        L_0x0087:
            r3 = 5
            boolean r4 = r2.isNull(r3)     // Catch:{ SQLiteException -> 0x00cb }
            if (r4 == 0) goto L_0x0091
            r25 = r1
            goto L_0x009b
        L_0x0091:
            long r3 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x00cb }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x00cb }
            r25 = r3
        L_0x009b:
            r3 = 6
            boolean r4 = r2.isNull(r3)     // Catch:{ SQLiteException -> 0x00cb }
            if (r4 == 0) goto L_0x00a5
            r26 = r1
            goto L_0x00af
        L_0x00a5:
            long r3 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x00cb }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x00cb }
            r26 = r3
        L_0x00af:
            r3 = 7
            boolean r4 = r2.isNull(r3)     // Catch:{ SQLiteException -> 0x00cb }
            if (r4 != 0) goto L_0x00cd
            long r3 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x00cb }
            r7 = 1
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x00c1
            r10 = r0
        L_0x00c1:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)     // Catch:{ SQLiteException -> 0x00cb }
            r27 = r0
            goto L_0x00cf
        L_0x00c8:
            r0 = move-exception
            r1 = r2
            goto L_0x012a
        L_0x00cb:
            r0 = move-exception
            goto L_0x0109
        L_0x00cd:
            r27 = r1
        L_0x00cf:
            r0 = 8
            boolean r3 = r2.isNull(r0)     // Catch:{ SQLiteException -> 0x00cb }
            if (r3 == 0) goto L_0x00da
            r18 = r5
            goto L_0x00e0
        L_0x00da:
            long r3 = r2.getLong(r0)     // Catch:{ SQLiteException -> 0x00cb }
            r18 = r3
        L_0x00e0:
            com.google.android.gms.measurement.internal.zzbd r0 = new com.google.android.gms.measurement.internal.zzbd     // Catch:{ SQLiteException -> 0x00cb }
            r11 = r0
            r12 = r30
            r13 = r31
            r11.<init>(r12, r13, r14, r16, r18, r20, r22, r24, r25, r26, r27)     // Catch:{ SQLiteException -> 0x00cb }
            boolean r3 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x00cb }
            if (r3 == 0) goto L_0x0101
            com.google.android.gms.measurement.internal.zzgi r3 = r28.m()     // Catch:{ SQLiteException -> 0x00cb }
            com.google.android.gms.measurement.internal.zzgk r3 = r3.G()     // Catch:{ SQLiteException -> 0x00cb }
            java.lang.String r4 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzgi.v(r30)     // Catch:{ SQLiteException -> 0x00cb }
            r3.b(r4, r5)     // Catch:{ SQLiteException -> 0x00cb }
        L_0x0101:
            r2.close()
            return r0
        L_0x0105:
            r0 = move-exception
            goto L_0x012a
        L_0x0107:
            r0 = move-exception
            r2 = r1
        L_0x0109:
            com.google.android.gms.measurement.internal.zzgi r3 = r28.m()     // Catch:{ all -> 0x00c8 }
            com.google.android.gms.measurement.internal.zzgk r3 = r3.G()     // Catch:{ all -> 0x00c8 }
            java.lang.String r4 = "Error querying events. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzgi.v(r30)     // Catch:{ all -> 0x00c8 }
            com.google.android.gms.measurement.internal.zzgh r6 = r28.h()     // Catch:{ all -> 0x00c8 }
            r7 = r31
            java.lang.String r6 = r6.c(r7)     // Catch:{ all -> 0x00c8 }
            r3.d(r4, r5, r6, r0)     // Catch:{ all -> 0x00c8 }
            if (r2 == 0) goto L_0x0129
            r2.close()
        L_0x0129:
            return r1
        L_0x012a:
            if (r1 == 0) goto L_0x012f
            r1.close()
        L_0x012f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.I0(java.lang.String, java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzbd");
    }

    public final zzar J(long j2, String str, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        return I(j2, str, 1, false, false, z4, false, z6, z7);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle J0(java.lang.String r6) {
        /*
            r5 = this;
            r5.n()
            r5.u()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.B()     // Catch:{ SQLiteException -> 0x006f, all -> 0x006d }
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            java.lang.String[] r3 = new java.lang.String[]{r6}     // Catch:{ SQLiteException -> 0x006f, all -> 0x006d }
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x006f, all -> 0x006d }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x002f }
            if (r2 != 0) goto L_0x0031
            com.google.android.gms.measurement.internal.zzgi r6 = r5.m()     // Catch:{ SQLiteException -> 0x002f }
            com.google.android.gms.measurement.internal.zzgk r6 = r6.K()     // Catch:{ SQLiteException -> 0x002f }
            java.lang.String r2 = "Default event parameters not found"
            r6.a(r2)     // Catch:{ SQLiteException -> 0x002f }
            r1.close()
            return r0
        L_0x002c:
            r6 = move-exception
            r0 = r1
            goto L_0x0084
        L_0x002f:
            r6 = move-exception
            goto L_0x0071
        L_0x0031:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch:{ SQLiteException -> 0x002f }
            com.google.android.gms.internal.measurement.zzgn$zzf$zza r3 = com.google.android.gms.internal.measurement.zzgn.zzf.W()     // Catch:{ IOException -> 0x0057 }
            com.google.android.gms.internal.measurement.zzmk r2 = com.google.android.gms.measurement.internal.zzol.G(r3, r2)     // Catch:{ IOException -> 0x0057 }
            com.google.android.gms.internal.measurement.zzgn$zzf$zza r2 = (com.google.android.gms.internal.measurement.zzgn.zzf.zza) r2     // Catch:{ IOException -> 0x0057 }
            com.google.android.gms.internal.measurement.zzml r2 = r2.F()     // Catch:{ IOException -> 0x0057 }
            com.google.android.gms.internal.measurement.zzlc r2 = (com.google.android.gms.internal.measurement.zzlc) r2     // Catch:{ IOException -> 0x0057 }
            com.google.android.gms.internal.measurement.zzgn$zzf r2 = (com.google.android.gms.internal.measurement.zzgn.zzf) r2     // Catch:{ IOException -> 0x0057 }
            r5.o()     // Catch:{ SQLiteException -> 0x002f }
            java.util.List r6 = r2.Z()     // Catch:{ SQLiteException -> 0x002f }
            android.os.Bundle r6 = com.google.android.gms.measurement.internal.zzol.B(r6)     // Catch:{ SQLiteException -> 0x002f }
            r1.close()
            return r6
        L_0x0057:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzgi r3 = r5.m()     // Catch:{ SQLiteException -> 0x002f }
            com.google.android.gms.measurement.internal.zzgk r3 = r3.G()     // Catch:{ SQLiteException -> 0x002f }
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzgi.v(r6)     // Catch:{ SQLiteException -> 0x002f }
            r3.c(r4, r6, r2)     // Catch:{ SQLiteException -> 0x002f }
            r1.close()
            return r0
        L_0x006d:
            r6 = move-exception
            goto L_0x0084
        L_0x006f:
            r6 = move-exception
            r1 = r0
        L_0x0071:
            com.google.android.gms.measurement.internal.zzgi r2 = r5.m()     // Catch:{ all -> 0x002c }
            com.google.android.gms.measurement.internal.zzgk r2 = r2.G()     // Catch:{ all -> 0x002c }
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r6)     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x0083
            r1.close()
        L_0x0083:
            return r0
        L_0x0084:
            if (r0 == 0) goto L_0x0089
            r0.close()
        L_0x0089:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.J0(java.lang.String):android.os.Bundle");
    }

    public final zzbd K0(String str, String str2) {
        return I0("events", str, str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x030f A[Catch:{ SQLiteException -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0320 A[Catch:{ SQLiteException -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x036a A[Catch:{ SQLiteException -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0396  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0134 A[Catch:{ SQLiteException -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x017f A[Catch:{ SQLiteException -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0183 A[Catch:{ SQLiteException -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01b7 A[Catch:{ SQLiteException -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01d5 A[Catch:{ SQLiteException -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01d8 A[Catch:{ SQLiteException -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01e7 A[Catch:{ SQLiteException -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x023d A[Catch:{ SQLiteException -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02c5 A[Catch:{ SQLiteException -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02c7 A[Catch:{ SQLiteException -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02d3 A[Catch:{ SQLiteException -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02d5 A[Catch:{ SQLiteException -> 0x00b8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzh L0(java.lang.String r51) {
        /*
            r50 = this;
            r1 = r50
            r2 = r51
            com.google.android.gms.common.internal.Preconditions.g(r51)
            r50.n()
            r50.u()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r50.B()     // Catch:{ SQLiteException -> 0x0381, all -> 0x037f }
            java.lang.String r5 = "apps"
            java.lang.String r6 = "app_instance_id"
            java.lang.String r7 = "gmp_app_id"
            java.lang.String r8 = "resettable_device_id_hash"
            java.lang.String r9 = "last_bundle_index"
            java.lang.String r10 = "last_bundle_start_timestamp"
            java.lang.String r11 = "last_bundle_end_timestamp"
            java.lang.String r12 = "app_version"
            java.lang.String r13 = "app_store"
            java.lang.String r14 = "gmp_version"
            java.lang.String r15 = "dev_cert_hash"
            java.lang.String r16 = "measurement_enabled"
            java.lang.String r17 = "day"
            java.lang.String r18 = "daily_public_events_count"
            java.lang.String r19 = "daily_events_count"
            java.lang.String r20 = "daily_conversions_count"
            java.lang.String r21 = "config_fetched_time"
            java.lang.String r22 = "failed_config_fetch_time"
            java.lang.String r23 = "app_version_int"
            java.lang.String r24 = "firebase_instance_id"
            java.lang.String r25 = "daily_error_events_count"
            java.lang.String r26 = "daily_realtime_events_count"
            java.lang.String r27 = "health_monitor_sample"
            java.lang.String r28 = "android_id"
            java.lang.String r29 = "adid_reporting_enabled"
            java.lang.String r30 = "admob_app_id"
            java.lang.String r31 = "dynamite_version"
            java.lang.String r32 = "safelisted_events"
            java.lang.String r33 = "ga_app_id"
            java.lang.String r34 = "session_stitching_token"
            java.lang.String r35 = "sgtm_upload_enabled"
            java.lang.String r36 = "target_os_version"
            java.lang.String r37 = "session_stitching_token_hash"
            java.lang.String r38 = "ad_services_version"
            java.lang.String r39 = "unmatched_first_open_without_ad_id"
            java.lang.String r40 = "npa_metadata_value"
            java.lang.String r41 = "attribution_eligibility_status"
            java.lang.String r42 = "sgtm_preview_key"
            java.lang.String r43 = "dma_consent_state"
            java.lang.String r44 = "daily_realtime_dcu_count"
            java.lang.String r45 = "bundle_delivery_index"
            java.lang.String r46 = "serialized_npa_metadata"
            java.lang.String r47 = "unmatched_pfo"
            java.lang.String r48 = "unmatched_uwa"
            java.lang.String r49 = "ad_campaign_info"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49}     // Catch:{ SQLiteException -> 0x0381, all -> 0x037f }
            java.lang.String r7 = "app_id=?"
            java.lang.String[] r8 = new java.lang.String[]{r51}     // Catch:{ SQLiteException -> 0x0381, all -> 0x037f }
            r10 = 0
            r11 = 0
            r9 = 0
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x0381, all -> 0x037f }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x00b8 }
            if (r0 != 0) goto L_0x0087
            r4.close()
            return r3
        L_0x0087:
            com.google.android.gms.measurement.internal.zzh r0 = new com.google.android.gms.measurement.internal.zzh     // Catch:{ SQLiteException -> 0x00b8 }
            com.google.android.gms.measurement.internal.zznv r5 = r1.f26888b     // Catch:{ SQLiteException -> 0x00b8 }
            com.google.android.gms.measurement.internal.zzhw r5 = r5.t0()     // Catch:{ SQLiteException -> 0x00b8 }
            r0.<init>(r5, r2)     // Catch:{ SQLiteException -> 0x00b8 }
            boolean r5 = com.google.android.gms.internal.measurement.zzpd.a()     // Catch:{ SQLiteException -> 0x00b8 }
            r6 = 0
            if (r5 == 0) goto L_0x00bb
            com.google.android.gms.measurement.internal.zzah r5 = r50.d()     // Catch:{ SQLiteException -> 0x00b8 }
            com.google.android.gms.measurement.internal.zzfz r7 = com.google.android.gms.measurement.internal.zzbj.d1     // Catch:{ SQLiteException -> 0x00b8 }
            boolean r5 = r5.t(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            if (r5 == 0) goto L_0x00bb
            com.google.android.gms.measurement.internal.zznv r5 = r1.f26888b     // Catch:{ SQLiteException -> 0x00b8 }
            com.google.android.gms.measurement.internal.zzjc r5 = r5.U(r2)     // Catch:{ SQLiteException -> 0x00b8 }
            com.google.android.gms.measurement.internal.zzjc$zza r7 = com.google.android.gms.measurement.internal.zzjc.zza.ANALYTICS_STORAGE     // Catch:{ SQLiteException -> 0x00b8 }
            boolean r5 = r5.m(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            if (r5 == 0) goto L_0x00c2
            goto L_0x00bb
        L_0x00b4:
            r0 = move-exception
            r3 = r4
            goto L_0x039a
        L_0x00b8:
            r0 = move-exception
            goto L_0x0383
        L_0x00bb:
            java.lang.String r5 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x00b8 }
            r0.J(r5)     // Catch:{ SQLiteException -> 0x00b8 }
        L_0x00c2:
            r5 = 1
            java.lang.String r7 = r4.getString(r5)     // Catch:{ SQLiteException -> 0x00b8 }
            r0.Z(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            boolean r7 = com.google.android.gms.internal.measurement.zzpd.a()     // Catch:{ SQLiteException -> 0x00b8 }
            if (r7 == 0) goto L_0x00ea
            com.google.android.gms.measurement.internal.zzah r7 = r50.d()     // Catch:{ SQLiteException -> 0x00b8 }
            com.google.android.gms.measurement.internal.zzfz r8 = com.google.android.gms.measurement.internal.zzbj.d1     // Catch:{ SQLiteException -> 0x00b8 }
            boolean r7 = r7.t(r8)     // Catch:{ SQLiteException -> 0x00b8 }
            if (r7 == 0) goto L_0x00ea
            com.google.android.gms.measurement.internal.zznv r7 = r1.f26888b     // Catch:{ SQLiteException -> 0x00b8 }
            com.google.android.gms.measurement.internal.zzjc r7 = r7.U(r2)     // Catch:{ SQLiteException -> 0x00b8 }
            com.google.android.gms.measurement.internal.zzjc$zza r8 = com.google.android.gms.measurement.internal.zzjc.zza.AD_STORAGE     // Catch:{ SQLiteException -> 0x00b8 }
            boolean r7 = r7.m(r8)     // Catch:{ SQLiteException -> 0x00b8 }
            if (r7 == 0) goto L_0x00f2
        L_0x00ea:
            r7 = 2
            java.lang.String r7 = r4.getString(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r0.f0(r7)     // Catch:{ SQLiteException -> 0x00b8 }
        L_0x00f2:
            r7 = 3
            long r7 = r4.getLong(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r0.A0(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r7 = 4
            long r7 = r4.getLong(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r0.C0(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r7 = 5
            long r7 = r4.getLong(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r0.y0(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r7 = 6
            java.lang.String r7 = r4.getString(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r0.S(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r7 = 7
            java.lang.String r7 = r4.getString(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r0.O(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r7 = 8
            long r7 = r4.getLong(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r0.u0(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r7 = 9
            long r7 = r4.getLong(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r0.n0(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r7 = 10
            boolean r8 = r4.isNull(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            if (r8 != 0) goto L_0x013d
            int r7 = r4.getInt(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            if (r7 == 0) goto L_0x013b
            goto L_0x013d
        L_0x013b:
            r7 = r6
            goto L_0x013e
        L_0x013d:
            r7 = r5
        L_0x013e:
            r0.K(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r7 = 11
            long r7 = r4.getLong(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r0.k0(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r7 = 12
            long r7 = r4.getLong(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r0.e0(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r7 = 13
            long r7 = r4.getLong(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r0.b0(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r7 = 14
            long r7 = r4.getLong(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r0.V(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r7 = 15
            long r7 = r4.getLong(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r0.R(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r7 = 16
            long r7 = r4.getLong(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r0.s0(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r7 = 17
            boolean r8 = r4.isNull(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            if (r8 == 0) goto L_0x0183
            r7 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0188
        L_0x0183:
            int r7 = r4.getInt(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            long r7 = (long) r7     // Catch:{ SQLiteException -> 0x00b8 }
        L_0x0188:
            r0.H(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r7 = 18
            java.lang.String r7 = r4.getString(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r0.W(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r7 = 19
            long r7 = r4.getLong(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r0.Y(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r7 = 20
            long r7 = r4.getLong(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r0.h0(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r7 = 21
            java.lang.String r7 = r4.getString(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r0.c0(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r7 = 23
            boolean r8 = r4.isNull(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            if (r8 != 0) goto L_0x01c0
            int r7 = r4.getInt(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            if (r7 == 0) goto L_0x01be
            goto L_0x01c0
        L_0x01be:
            r7 = r6
            goto L_0x01c1
        L_0x01c0:
            r7 = r5
        L_0x01c1:
            r0.h(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r7 = 24
            java.lang.String r7 = r4.getString(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r0.f(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r7 = 25
            boolean r8 = r4.isNull(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            if (r8 == 0) goto L_0x01d8
            r7 = 0
            goto L_0x01dc
        L_0x01d8:
            long r7 = r4.getLong(r7)     // Catch:{ SQLiteException -> 0x00b8 }
        L_0x01dc:
            r0.q0(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r7 = 26
            boolean r8 = r4.isNull(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            if (r8 != 0) goto L_0x01f9
            java.lang.String r7 = r4.getString(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            java.lang.String r8 = ","
            r9 = -1
            java.lang.String[] r7 = r7.split(r8, r9)     // Catch:{ SQLiteException -> 0x00b8 }
            java.util.List r7 = java.util.Arrays.asList(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r0.g(r7)     // Catch:{ SQLiteException -> 0x00b8 }
        L_0x01f9:
            boolean r7 = com.google.android.gms.internal.measurement.zzpd.a()     // Catch:{ SQLiteException -> 0x00b8 }
            if (r7 == 0) goto L_0x0219
            com.google.android.gms.measurement.internal.zzah r7 = r50.d()     // Catch:{ SQLiteException -> 0x00b8 }
            com.google.android.gms.measurement.internal.zzfz r8 = com.google.android.gms.measurement.internal.zzbj.d1     // Catch:{ SQLiteException -> 0x00b8 }
            boolean r7 = r7.t(r8)     // Catch:{ SQLiteException -> 0x00b8 }
            if (r7 == 0) goto L_0x0219
            com.google.android.gms.measurement.internal.zznv r7 = r1.f26888b     // Catch:{ SQLiteException -> 0x00b8 }
            com.google.android.gms.measurement.internal.zzjc r7 = r7.U(r2)     // Catch:{ SQLiteException -> 0x00b8 }
            com.google.android.gms.measurement.internal.zzjc$zza r8 = com.google.android.gms.measurement.internal.zzjc.zza.ANALYTICS_STORAGE     // Catch:{ SQLiteException -> 0x00b8 }
            boolean r7 = r7.m(r8)     // Catch:{ SQLiteException -> 0x00b8 }
            if (r7 == 0) goto L_0x0222
        L_0x0219:
            r7 = 28
            java.lang.String r7 = r4.getString(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r0.l0(r7)     // Catch:{ SQLiteException -> 0x00b8 }
        L_0x0222:
            boolean r7 = com.google.android.gms.internal.measurement.zzrw.a()     // Catch:{ SQLiteException -> 0x00b8 }
            if (r7 == 0) goto L_0x026f
            com.google.android.gms.measurement.internal.zzah r7 = r50.d()     // Catch:{ SQLiteException -> 0x00b8 }
            com.google.android.gms.measurement.internal.zzfz r8 = com.google.android.gms.measurement.internal.zzbj.x0     // Catch:{ SQLiteException -> 0x00b8 }
            boolean r7 = r7.t(r8)     // Catch:{ SQLiteException -> 0x00b8 }
            if (r7 == 0) goto L_0x026f
            r50.j()     // Catch:{ SQLiteException -> 0x00b8 }
            boolean r7 = com.google.android.gms.measurement.internal.zzop.H0(r51)     // Catch:{ SQLiteException -> 0x00b8 }
            if (r7 == 0) goto L_0x026f
            r7 = 29
            boolean r8 = r4.isNull(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            if (r8 != 0) goto L_0x024d
            int r7 = r4.getInt(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            if (r7 == 0) goto L_0x024d
            r7 = r5
            goto L_0x024e
        L_0x024d:
            r7 = r6
        L_0x024e:
            r0.P(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r7 = 39
            long r7 = r4.getLong(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r0.w0(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            com.google.android.gms.measurement.internal.zzah r7 = r50.d()     // Catch:{ SQLiteException -> 0x00b8 }
            com.google.android.gms.measurement.internal.zzfz r8 = com.google.android.gms.measurement.internal.zzbj.y0     // Catch:{ SQLiteException -> 0x00b8 }
            boolean r7 = r7.t(r8)     // Catch:{ SQLiteException -> 0x00b8 }
            if (r7 == 0) goto L_0x026f
            r7 = 36
            java.lang.String r7 = r4.getString(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r0.o0(r7)     // Catch:{ SQLiteException -> 0x00b8 }
        L_0x026f:
            r7 = 30
            long r7 = r4.getLong(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r0.G0(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r7 = 31
            long r7 = r4.getLong(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r0.E0(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            boolean r7 = com.google.android.gms.internal.measurement.zzrl.a()     // Catch:{ SQLiteException -> 0x00b8 }
            if (r7 == 0) goto L_0x02a5
            com.google.android.gms.measurement.internal.zzah r7 = r50.d()     // Catch:{ SQLiteException -> 0x00b8 }
            com.google.android.gms.measurement.internal.zzfz r8 = com.google.android.gms.measurement.internal.zzbj.H0     // Catch:{ SQLiteException -> 0x00b8 }
            boolean r7 = r7.H(r2, r8)     // Catch:{ SQLiteException -> 0x00b8 }
            if (r7 == 0) goto L_0x02a5
            r7 = 32
            int r7 = r4.getInt(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r0.b(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r7 = 35
            long r7 = r4.getLong(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            r0.N(r7)     // Catch:{ SQLiteException -> 0x00b8 }
        L_0x02a5:
            boolean r7 = com.google.android.gms.internal.measurement.zzpo.a()     // Catch:{ SQLiteException -> 0x00b8 }
            if (r7 == 0) goto L_0x02cb
            com.google.android.gms.measurement.internal.zzah r7 = r50.d()     // Catch:{ SQLiteException -> 0x00b8 }
            com.google.android.gms.measurement.internal.zzfz r8 = com.google.android.gms.measurement.internal.zzbj.S0     // Catch:{ SQLiteException -> 0x00b8 }
            boolean r7 = r7.H(r2, r8)     // Catch:{ SQLiteException -> 0x00b8 }
            if (r7 == 0) goto L_0x02cb
            r7 = 33
            boolean r8 = r4.isNull(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            if (r8 != 0) goto L_0x02c7
            int r7 = r4.getInt(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            if (r7 == 0) goto L_0x02c7
            r7 = r5
            goto L_0x02c8
        L_0x02c7:
            r7 = r6
        L_0x02c8:
            r0.T(r7)     // Catch:{ SQLiteException -> 0x00b8 }
        L_0x02cb:
            r7 = 34
            boolean r8 = r4.isNull(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            if (r8 == 0) goto L_0x02d5
            r5 = r3
            goto L_0x02e0
        L_0x02d5:
            int r7 = r4.getInt(r7)     // Catch:{ SQLiteException -> 0x00b8 }
            if (r7 == 0) goto L_0x02dc
            r6 = r5
        L_0x02dc:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)     // Catch:{ SQLiteException -> 0x00b8 }
        L_0x02e0:
            r0.d(r5)     // Catch:{ SQLiteException -> 0x00b8 }
            r5 = 37
            int r5 = r4.getInt(r5)     // Catch:{ SQLiteException -> 0x00b8 }
            r0.M(r5)     // Catch:{ SQLiteException -> 0x00b8 }
            r5 = 38
            int r5 = r4.getInt(r5)     // Catch:{ SQLiteException -> 0x00b8 }
            r0.G(r5)     // Catch:{ SQLiteException -> 0x00b8 }
            boolean r5 = com.google.android.gms.internal.measurement.zzox.a()     // Catch:{ SQLiteException -> 0x00b8 }
            if (r5 == 0) goto L_0x0314
            com.google.android.gms.measurement.internal.zzah r5 = r50.d()     // Catch:{ SQLiteException -> 0x00b8 }
            com.google.android.gms.measurement.internal.zzfz r6 = com.google.android.gms.measurement.internal.zzbj.X0     // Catch:{ SQLiteException -> 0x00b8 }
            boolean r5 = r5.H(r2, r6)     // Catch:{ SQLiteException -> 0x00b8 }
            if (r5 == 0) goto L_0x0314
            r5 = 40
            java.lang.String r5 = r4.getString(r5)     // Catch:{ SQLiteException -> 0x00b8 }
            if (r5 != 0) goto L_0x0311
            java.lang.String r5 = ""
        L_0x0311:
            r0.i0(r5)     // Catch:{ SQLiteException -> 0x00b8 }
        L_0x0314:
            com.google.android.gms.measurement.internal.zzah r5 = r50.d()     // Catch:{ SQLiteException -> 0x00b8 }
            com.google.android.gms.measurement.internal.zzfz r6 = com.google.android.gms.measurement.internal.zzbj.a1     // Catch:{ SQLiteException -> 0x00b8 }
            boolean r5 = r5.t(r6)     // Catch:{ SQLiteException -> 0x00b8 }
            if (r5 == 0) goto L_0x0346
            r5 = 41
            boolean r6 = r4.isNull(r5)     // Catch:{ SQLiteException -> 0x00b8 }
            if (r6 != 0) goto L_0x0333
            long r5 = r4.getLong(r5)     // Catch:{ SQLiteException -> 0x00b8 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ SQLiteException -> 0x00b8 }
            r0.e(r5)     // Catch:{ SQLiteException -> 0x00b8 }
        L_0x0333:
            r5 = 42
            boolean r6 = r4.isNull(r5)     // Catch:{ SQLiteException -> 0x00b8 }
            if (r6 != 0) goto L_0x0346
            long r5 = r4.getLong(r5)     // Catch:{ SQLiteException -> 0x00b8 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ SQLiteException -> 0x00b8 }
            r0.I(r5)     // Catch:{ SQLiteException -> 0x00b8 }
        L_0x0346:
            boolean r5 = com.google.android.gms.internal.measurement.zzqn.a()     // Catch:{ SQLiteException -> 0x00b8 }
            if (r5 == 0) goto L_0x0361
            com.google.android.gms.measurement.internal.zzah r5 = r50.d()     // Catch:{ SQLiteException -> 0x00b8 }
            com.google.android.gms.measurement.internal.zzfz r6 = com.google.android.gms.measurement.internal.zzbj.U0     // Catch:{ SQLiteException -> 0x00b8 }
            boolean r5 = r5.H(r2, r6)     // Catch:{ SQLiteException -> 0x00b8 }
            if (r5 == 0) goto L_0x0361
            r5 = 43
            byte[] r5 = r4.getBlob(r5)     // Catch:{ SQLiteException -> 0x00b8 }
            r0.i(r5)     // Catch:{ SQLiteException -> 0x00b8 }
        L_0x0361:
            r0.x()     // Catch:{ SQLiteException -> 0x00b8 }
            boolean r5 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x00b8 }
            if (r5 == 0) goto L_0x037b
            com.google.android.gms.measurement.internal.zzgi r5 = r50.m()     // Catch:{ SQLiteException -> 0x00b8 }
            com.google.android.gms.measurement.internal.zzgk r5 = r5.G()     // Catch:{ SQLiteException -> 0x00b8 }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzgi.v(r51)     // Catch:{ SQLiteException -> 0x00b8 }
            r5.b(r6, r7)     // Catch:{ SQLiteException -> 0x00b8 }
        L_0x037b:
            r4.close()
            return r0
        L_0x037f:
            r0 = move-exception
            goto L_0x039a
        L_0x0381:
            r0 = move-exception
            r4 = r3
        L_0x0383:
            com.google.android.gms.measurement.internal.zzgi r5 = r50.m()     // Catch:{ all -> 0x00b4 }
            com.google.android.gms.measurement.internal.zzgk r5 = r5.G()     // Catch:{ all -> 0x00b4 }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzgi.v(r51)     // Catch:{ all -> 0x00b4 }
            r5.c(r6, r2, r0)     // Catch:{ all -> 0x00b4 }
            if (r4 == 0) goto L_0x0399
            r4.close()
        L_0x0399:
            return r3
        L_0x039a:
            if (r3 == 0) goto L_0x039f
            r3.close()
        L_0x039f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.L0(java.lang.String):com.google.android.gms.measurement.internal.zzh");
    }

    public final Object M(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 0) {
            m().G().a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i2));
            }
            if (type == 3) {
                return cursor.getString(i2);
            }
            if (type != 4) {
                m().G().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            m().G().a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzom M0(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            com.google.android.gms.common.internal.Preconditions.g(r11)
            com.google.android.gms.common.internal.Preconditions.g(r12)
            r10.n()
            r10.u()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.B()     // Catch:{ SQLiteException -> 0x0074, all -> 0x0072 }
            java.lang.String r2 = "user_attributes"
            java.lang.String r3 = "set_timestamp"
            java.lang.String r4 = "value"
            java.lang.String r5 = "origin"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5}     // Catch:{ SQLiteException -> 0x0074, all -> 0x0072 }
            java.lang.String r4 = "app_id=? and name=?"
            java.lang.String[] r5 = new java.lang.String[]{r11, r12}     // Catch:{ SQLiteException -> 0x0074, all -> 0x0072 }
            r7 = 0
            r8 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0074, all -> 0x0072 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x006c }
            if (r2 != 0) goto L_0x0034
            r1.close()
            return r0
        L_0x0034:
            r2 = 0
            long r7 = r1.getLong(r2)     // Catch:{ SQLiteException -> 0x006c }
            r2 = 1
            java.lang.Object r9 = r10.M(r1, r2)     // Catch:{ SQLiteException -> 0x006c }
            if (r9 != 0) goto L_0x0044
            r1.close()
            return r0
        L_0x0044:
            r2 = 2
            java.lang.String r5 = r1.getString(r2)     // Catch:{ SQLiteException -> 0x006c }
            com.google.android.gms.measurement.internal.zzom r2 = new com.google.android.gms.measurement.internal.zzom     // Catch:{ SQLiteException -> 0x006c }
            r3 = r2
            r4 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r9)     // Catch:{ SQLiteException -> 0x006c }
            boolean r3 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x006c }
            if (r3 == 0) goto L_0x006e
            com.google.android.gms.measurement.internal.zzgi r3 = r10.m()     // Catch:{ SQLiteException -> 0x006c }
            com.google.android.gms.measurement.internal.zzgk r3 = r3.G()     // Catch:{ SQLiteException -> 0x006c }
            java.lang.String r4 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzgi.v(r11)     // Catch:{ SQLiteException -> 0x006c }
            r3.b(r4, r5)     // Catch:{ SQLiteException -> 0x006c }
            goto L_0x006e
        L_0x0069:
            r11 = move-exception
            r0 = r1
            goto L_0x0095
        L_0x006c:
            r2 = move-exception
            goto L_0x0076
        L_0x006e:
            r1.close()
            return r2
        L_0x0072:
            r11 = move-exception
            goto L_0x0095
        L_0x0074:
            r2 = move-exception
            r1 = r0
        L_0x0076:
            com.google.android.gms.measurement.internal.zzgi r3 = r10.m()     // Catch:{ all -> 0x0069 }
            com.google.android.gms.measurement.internal.zzgk r3 = r3.G()     // Catch:{ all -> 0x0069 }
            java.lang.String r4 = "Error querying user property. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzgi.v(r11)     // Catch:{ all -> 0x0069 }
            com.google.android.gms.measurement.internal.zzgh r5 = r10.h()     // Catch:{ all -> 0x0069 }
            java.lang.String r12 = r5.g(r12)     // Catch:{ all -> 0x0069 }
            r3.d(r4, r11, r12, r2)     // Catch:{ all -> 0x0069 }
            if (r1 == 0) goto L_0x0094
            r1.close()
        L_0x0094:
            return r0
        L_0x0095:
            if (r0 == 0) goto L_0x009a
            r0.close()
        L_0x009a:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.M0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzom");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object N(java.lang.String r3, java.lang.String[] r4, com.google.android.gms.measurement.internal.zzas r5) {
        /*
            r2 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r2.B()     // Catch:{ SQLiteException -> 0x002f, all -> 0x002d }
            android.database.Cursor r3 = r1.rawQuery(r3, r4)     // Catch:{ SQLiteException -> 0x002f, all -> 0x002d }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0023 }
            if (r4 != 0) goto L_0x0025
            com.google.android.gms.measurement.internal.zzgi r4 = r2.m()     // Catch:{ SQLiteException -> 0x0023 }
            com.google.android.gms.measurement.internal.zzgk r4 = r4.K()     // Catch:{ SQLiteException -> 0x0023 }
            java.lang.String r5 = "No data found"
            r4.a(r5)     // Catch:{ SQLiteException -> 0x0023 }
            r3.close()
            return r0
        L_0x0020:
            r4 = move-exception
            r0 = r3
            goto L_0x0044
        L_0x0023:
            r4 = move-exception
            goto L_0x0031
        L_0x0025:
            java.lang.Object r4 = r5.a(r3)     // Catch:{ SQLiteException -> 0x0023 }
            r3.close()
            return r4
        L_0x002d:
            r4 = move-exception
            goto L_0x0044
        L_0x002f:
            r4 = move-exception
            r3 = r0
        L_0x0031:
            com.google.android.gms.measurement.internal.zzgi r5 = r2.m()     // Catch:{ all -> 0x0020 }
            com.google.android.gms.measurement.internal.zzgk r5 = r5.G()     // Catch:{ all -> 0x0020 }
            java.lang.String r1 = "Error querying database."
            r5.b(r1, r4)     // Catch:{ all -> 0x0020 }
            if (r3 == 0) goto L_0x0043
            r3.close()
        L_0x0043:
            return r0
        L_0x0044:
            if (r0 == 0) goto L_0x0049
            r0.close()
        L_0x0049:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.N(java.lang.String, java.lang.String[], com.google.android.gms.measurement.internal.zzas):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzao N0(java.lang.String r10) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.Preconditions.g(r10)
            r9.n()
            r9.u()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r9.B()     // Catch:{ SQLiteException -> 0x006e, all -> 0x006c }
            java.lang.String r2 = "apps"
            java.lang.String r3 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String r5 = "e_tag"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5}     // Catch:{ SQLiteException -> 0x006e, all -> 0x006c }
            java.lang.String r4 = "app_id=?"
            java.lang.String[] r5 = new java.lang.String[]{r10}     // Catch:{ SQLiteException -> 0x006e, all -> 0x006c }
            r7 = 0
            r8 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x006e, all -> 0x006c }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x005b }
            if (r2 != 0) goto L_0x0031
            r1.close()
            return r0
        L_0x0031:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch:{ SQLiteException -> 0x005b }
            r3 = 1
            java.lang.String r3 = r1.getString(r3)     // Catch:{ SQLiteException -> 0x005b }
            r4 = 2
            java.lang.String r4 = r1.getString(r4)     // Catch:{ SQLiteException -> 0x005b }
            boolean r5 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x005b }
            if (r5 == 0) goto L_0x005d
            com.google.android.gms.measurement.internal.zzgi r5 = r9.m()     // Catch:{ SQLiteException -> 0x005b }
            com.google.android.gms.measurement.internal.zzgk r5 = r5.G()     // Catch:{ SQLiteException -> 0x005b }
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzgi.v(r10)     // Catch:{ SQLiteException -> 0x005b }
            r5.b(r6, r7)     // Catch:{ SQLiteException -> 0x005b }
            goto L_0x005d
        L_0x0058:
            r10 = move-exception
            r0 = r1
            goto L_0x0087
        L_0x005b:
            r2 = move-exception
            goto L_0x0070
        L_0x005d:
            if (r2 != 0) goto L_0x0063
            r1.close()
            return r0
        L_0x0063:
            com.google.android.gms.measurement.internal.zzao r5 = new com.google.android.gms.measurement.internal.zzao     // Catch:{ SQLiteException -> 0x005b }
            r5.<init>(r2, r3, r4)     // Catch:{ SQLiteException -> 0x005b }
            r1.close()
            return r5
        L_0x006c:
            r10 = move-exception
            goto L_0x0087
        L_0x006e:
            r2 = move-exception
            r1 = r0
        L_0x0070:
            com.google.android.gms.measurement.internal.zzgi r3 = r9.m()     // Catch:{ all -> 0x0058 }
            com.google.android.gms.measurement.internal.zzgk r3 = r3.G()     // Catch:{ all -> 0x0058 }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.zzgi.v(r10)     // Catch:{ all -> 0x0058 }
            r3.c(r4, r10, r2)     // Catch:{ all -> 0x0058 }
            if (r1 == 0) goto L_0x0086
            r1.close()
        L_0x0086:
            return r0
        L_0x0087:
            if (r0 == 0) goto L_0x008c
            r0.close()
        L_0x008c:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.N0(java.lang.String):com.google.android.gms.measurement.internal.zzao");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String O(long r4) {
        /*
            r3 = this;
            r3.n()
            r3.u()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r3.B()     // Catch:{ SQLiteException -> 0x0040, all -> 0x003e }
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ SQLiteException -> 0x0040, all -> 0x003e }
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch:{ SQLiteException -> 0x0040, all -> 0x003e }
            android.database.Cursor r4 = r1.rawQuery(r2, r4)     // Catch:{ SQLiteException -> 0x0040, all -> 0x003e }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0033 }
            if (r5 != 0) goto L_0x0035
            com.google.android.gms.measurement.internal.zzgi r5 = r3.m()     // Catch:{ SQLiteException -> 0x0033 }
            com.google.android.gms.measurement.internal.zzgk r5 = r5.K()     // Catch:{ SQLiteException -> 0x0033 }
            java.lang.String r1 = "No expired configs for apps with pending events"
            r5.a(r1)     // Catch:{ SQLiteException -> 0x0033 }
            r4.close()
            return r0
        L_0x0030:
            r5 = move-exception
            r0 = r4
            goto L_0x0055
        L_0x0033:
            r5 = move-exception
            goto L_0x0042
        L_0x0035:
            r5 = 0
            java.lang.String r5 = r4.getString(r5)     // Catch:{ SQLiteException -> 0x0033 }
            r4.close()
            return r5
        L_0x003e:
            r5 = move-exception
            goto L_0x0055
        L_0x0040:
            r5 = move-exception
            r4 = r0
        L_0x0042:
            com.google.android.gms.measurement.internal.zzgi r1 = r3.m()     // Catch:{ all -> 0x0030 }
            com.google.android.gms.measurement.internal.zzgk r1 = r1.G()     // Catch:{ all -> 0x0030 }
            java.lang.String r2 = "Error selecting expired configs"
            r1.b(r2, r5)     // Catch:{ all -> 0x0030 }
            if (r4 == 0) goto L_0x0054
            r4.close()
        L_0x0054:
            return r0
        L_0x0055:
            if (r0 == 0) goto L_0x005a
            r0.close()
        L_0x005a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.O(long):java.lang.String");
    }

    public final Map O0(String str, String str2) {
        u();
        n();
        Preconditions.g(str);
        Preconditions.g(str2);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            cursor = B().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                Map emptyMap = Collections.emptyMap();
                cursor.close();
                return emptyMap;
            }
            do {
                try {
                    zzfn.zzb zzb = (zzfn.zzb) ((zzlc) ((zzfn.zzb.zza) zzol.G(zzfn.zzb.N(), cursor.getBlob(1))).F());
                    int i2 = cursor.getInt(0);
                    List list = (List) arrayMap.get(Integer.valueOf(i2));
                    if (list == null) {
                        list = new ArrayList();
                        arrayMap.put(Integer.valueOf(i2), list);
                    }
                    list.add(zzb);
                } catch (IOException e2) {
                    m().G().c("Failed to merge filter. appId", zzgi.v(str), e2);
                }
            } while (cursor.moveToNext());
            cursor.close();
            return arrayMap;
        } catch (SQLiteException e3) {
            m().G().c("Database error querying filters. appId", zzgi.v(str), e3);
            Map emptyMap2 = Collections.emptyMap();
            if (cursor != null) {
                cursor.close();
            }
            return emptyMap2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final String P(String str, String[] strArr, String str2) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = B().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                String string = rawQuery.getString(0);
                rawQuery.close();
                return string;
            }
            rawQuery.close();
            return str2;
        } catch (SQLiteException e2) {
            m().G().c("Database error", str, e2);
            throw e2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final zzaz P0(String str) {
        Preconditions.m(str);
        n();
        u();
        return zzaz.d(P("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final List Q(String str, int i2, int i3) {
        long j2;
        long j3;
        int i4 = i3;
        n();
        u();
        int i5 = 1;
        Preconditions.a(i2 > 0);
        Preconditions.a(i4 > 0);
        Preconditions.g(str);
        Cursor cursor = null;
        try {
            cursor = B().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", String.valueOf(i2));
            if (!cursor.moveToFirst()) {
                List emptyList = Collections.emptyList();
                cursor.close();
                return emptyList;
            }
            ArrayList arrayList = new ArrayList();
            int i6 = 0;
            while (true) {
                long j4 = cursor.getLong(0);
                try {
                    byte[] l0 = o().l0(cursor.getBlob(i5));
                    if (!arrayList.isEmpty() && l0.length + i6 > i4) {
                        break;
                    }
                    try {
                        zzgn.zzk.zza zza = (zzgn.zzk.zza) zzol.G(zzgn.zzk.z2(), l0);
                        if (!arrayList.isEmpty()) {
                            zzgn.zzk zzk = (zzgn.zzk) ((Pair) arrayList.get(0)).first;
                            zzgn.zzk zzk2 = (zzgn.zzk) ((zzlc) zza.F());
                            if (!zzk.c0().equals(zzk2.c0()) || !zzk.b0().equals(zzk2.b0()) || zzk.s0() != zzk2.s0() || !zzk.d0().equals(zzk2.d0())) {
                                break;
                            }
                            Iterator it = zzk.q0().iterator();
                            while (true) {
                                j2 = -1;
                                if (!it.hasNext()) {
                                    j3 = -1;
                                    break;
                                }
                                zzgn.zzo zzo = (zzgn.zzo) it.next();
                                if ("_npa".equals(zzo.Y())) {
                                    j3 = zzo.T();
                                    break;
                                }
                            }
                            Iterator it2 = zzk2.q0().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                zzgn.zzo zzo2 = (zzgn.zzo) it2.next();
                                if ("_npa".equals(zzo2.Y())) {
                                    j2 = zzo2.T();
                                    break;
                                }
                            }
                            if (j3 != j2) {
                                break;
                            }
                        }
                        if (!cursor.isNull(2)) {
                            zza.M0(cursor.getInt(2));
                        }
                        i6 += l0.length;
                        arrayList.add(Pair.create((zzgn.zzk) ((zzlc) zza.F()), Long.valueOf(j4)));
                    } catch (IOException e2) {
                        m().G().c("Failed to merge queued bundle. appId", zzgi.v(str), e2);
                    }
                    if (!cursor.moveToNext() || i6 > i4) {
                        break;
                    }
                    i5 = 1;
                } catch (IOException e3) {
                    m().G().c("Failed to unzip queued bundle. appId", zzgi.v(str), e3);
                }
            }
            cursor.close();
            return arrayList;
        } catch (SQLiteException e4) {
            m().G().c("Error querying bundles. appId", zzgi.v(str), e4);
            List emptyList2 = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final Map Q0(String str, String str2) {
        u();
        n();
        Preconditions.g(str);
        Preconditions.g(str2);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            cursor = B().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                Map emptyMap = Collections.emptyMap();
                cursor.close();
                return emptyMap;
            }
            do {
                try {
                    zzfn.zze zze = (zzfn.zze) ((zzlc) ((zzfn.zze.zza) zzol.G(zzfn.zze.L(), cursor.getBlob(1))).F());
                    int i2 = cursor.getInt(0);
                    List list = (List) arrayMap.get(Integer.valueOf(i2));
                    if (list == null) {
                        list = new ArrayList();
                        arrayMap.put(Integer.valueOf(i2), list);
                    }
                    list.add(zze);
                } catch (IOException e2) {
                    m().G().c("Failed to merge filter", zzgi.v(str), e2);
                }
            } while (cursor.moveToNext());
            cursor.close();
            return arrayMap;
        } catch (SQLiteException e3) {
            m().G().c("Database error querying filters. appId", zzgi.v(str), e3);
            Map emptyMap2 = Collections.emptyMap();
            if (cursor != null) {
                cursor.close();
            }
            return emptyMap2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List R(String str, String str2, String str3) {
        Preconditions.g(str);
        n();
        u();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb.append(" and name glob ?");
        }
        return S(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final zzjc R0(String str) {
        Preconditions.m(str);
        n();
        u();
        return zzjc.q(P("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final List S(String str, String[] strArr) {
        n();
        u();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = B().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, (String) null, (String) null, "rowid", "1001");
            if (!cursor.moveToFirst()) {
                cursor.close();
                return arrayList;
            }
            while (true) {
                if (arrayList.size() < 1000) {
                    boolean z2 = false;
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    String string3 = cursor.getString(2);
                    Object M = M(cursor, 3);
                    if (cursor.getInt(4) != 0) {
                        z2 = true;
                    }
                    String string4 = cursor.getString(5);
                    long j2 = cursor.getLong(6);
                    zzol o2 = o();
                    byte[] blob = cursor.getBlob(7);
                    Parcelable.Creator<zzbh> creator = zzbh.CREATOR;
                    boolean z3 = z2;
                    zzaf zzaf = r3;
                    zzaf zzaf2 = new zzaf(string, string2, new zzok(string3, cursor.getLong(10), M, string2), cursor.getLong(8), z3, string4, (zzbh) o2.D(blob, creator), j2, (zzbh) o().D(cursor.getBlob(9), creator), cursor.getLong(11), (zzbh) o().D(cursor.getBlob(12), creator));
                    arrayList.add(zzaf);
                    if (!cursor.moveToNext()) {
                        break;
                    }
                } else {
                    m().G().b("Read more than the max allowed conditional properties, ignoring extra", 1000);
                    break;
                }
            }
            cursor.close();
            return arrayList;
        } catch (SQLiteException e2) {
            m().G().b("Error querying conditional user property value", e2);
            List emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void S0(String str, String str2) {
        Preconditions.g(str);
        Preconditions.g(str2);
        n();
        u();
        try {
            B().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            m().G().d("Error deleting user property. appId", zzgi.v(str), h().g(str2), e2);
        }
    }

    public final zzjc T0(String str) {
        Preconditions.m(str);
        n();
        u();
        zzjc zzjc = (zzjc) N("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str}, new zzap());
        return zzjc == null ? zzjc.f26593c : zzjc;
    }

    public final void U(zzbd zzbd) {
        Y("events", zzbd);
    }

    public final void U0(String str, String str2) {
        Preconditions.g(str2);
        n();
        u();
        try {
            B().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e2) {
            m().G().c("Error deleting snapshot. appId", zzgi.v(str2), e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0043, code lost:
        if (r7.f26888b.U(r0).m(com.google.android.gms.measurement.internal.zzjc.zza.ANALYTICS_STORAGE) != false) goto L_0x0045;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x034a A[Catch:{ SQLiteException -> 0x035c }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void V(com.google.android.gms.measurement.internal.zzh r8, boolean r9, boolean r10) {
        /*
            r7 = this;
            java.lang.String r10 = "apps"
            com.google.android.gms.common.internal.Preconditions.m(r8)
            r7.n()
            r7.u()
            java.lang.String r0 = r8.l()
            com.google.android.gms.common.internal.Preconditions.m(r0)
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>()
            java.lang.String r2 = "app_id"
            r1.put(r2, r0)
            boolean r2 = com.google.android.gms.internal.measurement.zzpd.a()
            java.lang.String r3 = "app_instance_id"
            r4 = 0
            if (r2 == 0) goto L_0x0045
            com.google.android.gms.measurement.internal.zzah r2 = r7.d()
            com.google.android.gms.measurement.internal.zzfz r5 = com.google.android.gms.measurement.internal.zzbj.d1
            boolean r2 = r2.t(r5)
            if (r2 == 0) goto L_0x0045
            if (r9 == 0) goto L_0x0037
            r1.put(r3, r4)
            goto L_0x004c
        L_0x0037:
            com.google.android.gms.measurement.internal.zznv r9 = r7.f26888b
            com.google.android.gms.measurement.internal.zzjc r9 = r9.U(r0)
            com.google.android.gms.measurement.internal.zzjc$zza r2 = com.google.android.gms.measurement.internal.zzjc.zza.ANALYTICS_STORAGE
            boolean r9 = r9.m(r2)
            if (r9 == 0) goto L_0x004c
        L_0x0045:
            java.lang.String r9 = r8.m()
            r1.put(r3, r9)
        L_0x004c:
            java.lang.String r9 = "gmp_app_id"
            java.lang.String r2 = r8.q()
            r1.put(r9, r2)
            boolean r9 = com.google.android.gms.internal.measurement.zzpd.a()
            if (r9 == 0) goto L_0x0075
            com.google.android.gms.measurement.internal.zzah r9 = r7.d()
            com.google.android.gms.measurement.internal.zzfz r2 = com.google.android.gms.measurement.internal.zzbj.d1
            boolean r9 = r9.t(r2)
            if (r9 == 0) goto L_0x0075
            com.google.android.gms.measurement.internal.zznv r9 = r7.f26888b
            com.google.android.gms.measurement.internal.zzjc r9 = r9.U(r0)
            com.google.android.gms.measurement.internal.zzjc$zza r2 = com.google.android.gms.measurement.internal.zzjc.zza.AD_STORAGE
            boolean r9 = r9.m(r2)
            if (r9 == 0) goto L_0x007e
        L_0x0075:
            java.lang.String r9 = "resettable_device_id_hash"
            java.lang.String r2 = r8.s()
            r1.put(r9, r2)
        L_0x007e:
            long r2 = r8.F0()
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "last_bundle_index"
            r1.put(r2, r9)
            long r2 = r8.H0()
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "last_bundle_start_timestamp"
            r1.put(r2, r9)
            long r2 = r8.D0()
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "last_bundle_end_timestamp"
            r1.put(r2, r9)
            java.lang.String r9 = "app_version"
            java.lang.String r2 = r8.o()
            r1.put(r9, r2)
            java.lang.String r9 = "app_store"
            java.lang.String r2 = r8.n()
            r1.put(r9, r2)
            long r2 = r8.z0()
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "gmp_version"
            r1.put(r2, r9)
            long r2 = r8.t0()
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "dev_cert_hash"
            r1.put(r2, r9)
            boolean r9 = r8.A()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            java.lang.String r2 = "measurement_enabled"
            r1.put(r2, r9)
            long r2 = r8.r0()
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "day"
            r1.put(r2, r9)
            long r2 = r8.m0()
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "daily_public_events_count"
            r1.put(r2, r9)
            long r2 = r8.j0()
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "daily_events_count"
            r1.put(r2, r9)
            long r2 = r8.d0()
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "daily_conversions_count"
            r1.put(r2, r9)
            long r2 = r8.a0()
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "config_fetched_time"
            r1.put(r2, r9)
            long r2 = r8.x0()
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "failed_config_fetch_time"
            r1.put(r2, r9)
            long r2 = r8.U()
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "app_version_int"
            r1.put(r2, r9)
            java.lang.String r9 = "firebase_instance_id"
            java.lang.String r2 = r8.p()
            r1.put(r9, r2)
            long r2 = r8.g0()
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "daily_error_events_count"
            r1.put(r2, r9)
            long r2 = r8.p0()
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "daily_realtime_events_count"
            r1.put(r2, r9)
            java.lang.String r9 = "health_monitor_sample"
            java.lang.String r2 = r8.r()
            r1.put(r9, r2)
            long r2 = r8.Q()
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "android_id"
            r1.put(r2, r9)
            boolean r9 = r8.z()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            java.lang.String r2 = "adid_reporting_enabled"
            r1.put(r2, r9)
            java.lang.String r9 = "admob_app_id"
            java.lang.String r2 = r8.j()
            r1.put(r9, r2)
            long r2 = r8.v0()
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "dynamite_version"
            r1.put(r2, r9)
            boolean r9 = com.google.android.gms.internal.measurement.zzpd.a()
            if (r9 == 0) goto L_0x01b5
            com.google.android.gms.measurement.internal.zzah r9 = r7.d()
            com.google.android.gms.measurement.internal.zzfz r2 = com.google.android.gms.measurement.internal.zzbj.d1
            boolean r9 = r9.t(r2)
            if (r9 == 0) goto L_0x01b5
            com.google.android.gms.measurement.internal.zznv r9 = r7.f26888b
            com.google.android.gms.measurement.internal.zzjc r9 = r9.U(r0)
            com.google.android.gms.measurement.internal.zzjc$zza r2 = com.google.android.gms.measurement.internal.zzjc.zza.ANALYTICS_STORAGE
            boolean r9 = r9.m(r2)
            if (r9 == 0) goto L_0x01be
        L_0x01b5:
            java.lang.String r9 = "session_stitching_token"
            java.lang.String r2 = r8.u()
            r1.put(r9, r2)
        L_0x01be:
            boolean r9 = r8.C()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            java.lang.String r2 = "sgtm_upload_enabled"
            r1.put(r2, r9)
            long r2 = r8.J0()
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "target_os_version"
            r1.put(r2, r9)
            long r2 = r8.I0()
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "session_stitching_token_hash"
            r1.put(r2, r9)
            boolean r9 = com.google.android.gms.internal.measurement.zzrl.a()
            if (r9 == 0) goto L_0x0211
            com.google.android.gms.measurement.internal.zzah r9 = r7.d()
            com.google.android.gms.measurement.internal.zzfz r2 = com.google.android.gms.measurement.internal.zzbj.H0
            boolean r9 = r9.H(r0, r2)
            if (r9 == 0) goto L_0x0211
            int r9 = r8.a()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r2 = "ad_services_version"
            r1.put(r2, r9)
            long r2 = r8.X()
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "attribution_eligibility_status"
            r1.put(r2, r9)
        L_0x0211:
            boolean r9 = com.google.android.gms.internal.measurement.zzpo.a()
            if (r9 == 0) goto L_0x0230
            com.google.android.gms.measurement.internal.zzah r9 = r7.d()
            com.google.android.gms.measurement.internal.zzfz r2 = com.google.android.gms.measurement.internal.zzbj.S0
            boolean r9 = r9.H(r0, r2)
            if (r9 == 0) goto L_0x0230
            boolean r9 = r8.D()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            java.lang.String r2 = "unmatched_first_open_without_ad_id"
            r1.put(r2, r9)
        L_0x0230:
            java.lang.String r9 = "npa_metadata_value"
            java.lang.Boolean r2 = r8.K0()
            r1.put(r9, r2)
            boolean r9 = com.google.android.gms.internal.measurement.zzrw.a()
            if (r9 == 0) goto L_0x0261
            com.google.android.gms.measurement.internal.zzah r9 = r7.d()
            com.google.android.gms.measurement.internal.zzfz r2 = com.google.android.gms.measurement.internal.zzbj.x0
            boolean r9 = r9.H(r0, r2)
            if (r9 == 0) goto L_0x0261
            r7.j()
            boolean r9 = com.google.android.gms.measurement.internal.zzop.H0(r0)
            if (r9 == 0) goto L_0x0261
            long r2 = r8.B0()
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "bundle_delivery_index"
            r1.put(r2, r9)
        L_0x0261:
            boolean r9 = com.google.android.gms.internal.measurement.zzrw.a()
            if (r9 == 0) goto L_0x027c
            com.google.android.gms.measurement.internal.zzah r9 = r7.d()
            com.google.android.gms.measurement.internal.zzfz r2 = com.google.android.gms.measurement.internal.zzbj.y0
            boolean r9 = r9.H(r0, r2)
            if (r9 == 0) goto L_0x027c
            java.lang.String r9 = "sgtm_preview_key"
            java.lang.String r2 = r8.v()
            r1.put(r9, r2)
        L_0x027c:
            int r9 = r8.L()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r2 = "dma_consent_state"
            r1.put(r2, r9)
            int r9 = r8.F()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r2 = "daily_realtime_dcu_count"
            r1.put(r2, r9)
            boolean r9 = com.google.android.gms.internal.measurement.zzox.a()
            if (r9 == 0) goto L_0x02b1
            com.google.android.gms.measurement.internal.zzah r9 = r7.d()
            com.google.android.gms.measurement.internal.zzfz r2 = com.google.android.gms.measurement.internal.zzbj.X0
            boolean r9 = r9.H(r0, r2)
            if (r9 == 0) goto L_0x02b1
            java.lang.String r9 = "serialized_npa_metadata"
            java.lang.String r2 = r8.t()
            r1.put(r9, r2)
        L_0x02b1:
            java.util.List r9 = r8.w()
            java.lang.String r2 = "safelisted_events"
            if (r9 == 0) goto L_0x02d6
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L_0x02cd
            com.google.android.gms.measurement.internal.zzgi r9 = r7.m()
            com.google.android.gms.measurement.internal.zzgk r9 = r9.L()
            java.lang.String r3 = "Safelisted events should not be an empty list. appId"
            r9.b(r3, r0)
            goto L_0x02d6
        L_0x02cd:
            java.lang.String r3 = ","
            java.lang.String r9 = android.text.TextUtils.join(r3, r9)
            r1.put(r2, r9)
        L_0x02d6:
            boolean r9 = com.google.android.gms.internal.measurement.zzpv.a()
            if (r9 == 0) goto L_0x02f1
            com.google.android.gms.measurement.internal.zzah r9 = r7.d()
            com.google.android.gms.measurement.internal.zzfz r3 = com.google.android.gms.measurement.internal.zzbj.u0
            boolean r9 = r9.t(r3)
            if (r9 == 0) goto L_0x02f1
            boolean r9 = r1.containsKey(r2)
            if (r9 != 0) goto L_0x02f1
            r1.put(r2, r4)
        L_0x02f1:
            com.google.android.gms.measurement.internal.zzah r9 = r7.d()
            com.google.android.gms.measurement.internal.zzfz r2 = com.google.android.gms.measurement.internal.zzbj.a1
            boolean r9 = r9.t(r2)
            if (r9 == 0) goto L_0x030f
            java.lang.String r9 = "unmatched_pfo"
            java.lang.Long r2 = r8.L0()
            r1.put(r9, r2)
            java.lang.String r9 = "unmatched_uwa"
            java.lang.Long r2 = r8.M0()
            r1.put(r9, r2)
        L_0x030f:
            boolean r9 = com.google.android.gms.internal.measurement.zzqn.a()
            if (r9 == 0) goto L_0x032a
            com.google.android.gms.measurement.internal.zzah r9 = r7.d()
            com.google.android.gms.measurement.internal.zzfz r2 = com.google.android.gms.measurement.internal.zzbj.U0
            boolean r9 = r9.H(r0, r2)
            if (r9 == 0) goto L_0x032a
            java.lang.String r9 = "ad_campaign_info"
            byte[] r8 = r8.E()
            r1.put(r9, r8)
        L_0x032a:
            android.database.sqlite.SQLiteDatabase r8 = r7.B()     // Catch:{ SQLiteException -> 0x035c }
            java.lang.String r9 = "app_id = ?"
            java.lang.String[] r2 = new java.lang.String[]{r0}     // Catch:{ SQLiteException -> 0x035c }
            int r9 = r8.update(r10, r1, r9, r2)     // Catch:{ SQLiteException -> 0x035c }
            long r2 = (long) r9     // Catch:{ SQLiteException -> 0x035c }
            r5 = 0
            int r9 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x035e
            r9 = 5
            long r8 = r8.insertWithOnConflict(r10, r4, r1, r9)     // Catch:{ SQLiteException -> 0x035c }
            r1 = -1
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 != 0) goto L_0x035e
            com.google.android.gms.measurement.internal.zzgi r8 = r7.m()     // Catch:{ SQLiteException -> 0x035c }
            com.google.android.gms.measurement.internal.zzgk r8 = r8.G()     // Catch:{ SQLiteException -> 0x035c }
            java.lang.String r9 = "Failed to insert/update app (got -1). appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.zzgi.v(r0)     // Catch:{ SQLiteException -> 0x035c }
            r8.b(r9, r10)     // Catch:{ SQLiteException -> 0x035c }
            goto L_0x035e
        L_0x035c:
            r8 = move-exception
            goto L_0x035f
        L_0x035e:
            return
        L_0x035f:
            com.google.android.gms.measurement.internal.zzgi r9 = r7.m()
            com.google.android.gms.measurement.internal.zzgk r9 = r9.G()
            java.lang.String r10 = "Error storing app. appId"
            java.lang.Object r0 = com.google.android.gms.measurement.internal.zzgi.v(r0)
            r9.c(r10, r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.V(com.google.android.gms.measurement.internal.zzh, boolean, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e6 A[Catch:{ IOException -> 0x0097 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0171  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzog V0(java.lang.String r15) {
        /*
            r14 = this;
            com.google.android.gms.common.internal.Preconditions.g(r15)
            r14.n()
            r14.u()
            boolean r0 = com.google.android.gms.internal.measurement.zzrw.a()
            r1 = 0
            if (r0 == 0) goto L_0x001d
            com.google.android.gms.measurement.internal.zzah r0 = r14.d()
            com.google.android.gms.measurement.internal.zzfz r2 = com.google.android.gms.measurement.internal.zzbj.A0
            boolean r0 = r0.t(r2)
            if (r0 != 0) goto L_0x001d
            return r1
        L_0x001d:
            android.database.sqlite.SQLiteDatabase r2 = r14.B()     // Catch:{ SQLiteException -> 0x015a, all -> 0x0158 }
            java.lang.String r3 = "upload_queue"
            java.lang.String r4 = "rowId"
            java.lang.String r5 = "app_id"
            java.lang.String r6 = "measurement_batch"
            java.lang.String r7 = "upload_uri"
            java.lang.String r8 = "upload_headers"
            java.lang.String r9 = "upload_type"
            java.lang.String r10 = "retry_count"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7, r8, r9, r10}     // Catch:{ SQLiteException -> 0x015a, all -> 0x0158 }
            java.lang.String r5 = r14.z0()     // Catch:{ SQLiteException -> 0x015a, all -> 0x0158 }
            java.lang.String[] r6 = new java.lang.String[]{r15}     // Catch:{ SQLiteException -> 0x015a, all -> 0x0158 }
            java.lang.String r9 = "creation_timestamp ASC"
            java.lang.String r10 = "1"
            r7 = 0
            r8 = 0
            android.database.Cursor r0 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x015a, all -> 0x0158 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x0071 }
            if (r2 != 0) goto L_0x0051
            r0.close()
            return r1
        L_0x0051:
            r2 = 3
            java.lang.String r2 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x0071 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ SQLiteException -> 0x0071 }
            if (r3 == 0) goto L_0x0074
            com.google.android.gms.measurement.internal.zzgi r2 = r14.m()     // Catch:{ SQLiteException -> 0x0071 }
            com.google.android.gms.measurement.internal.zzgk r2 = r2.F()     // Catch:{ SQLiteException -> 0x0071 }
            java.lang.String r3 = "Upload uri is null or empty. Destination is unknown. Dropping batch. "
            r2.a(r3)     // Catch:{ SQLiteException -> 0x0071 }
            r0.close()
            return r1
        L_0x006d:
            r15 = move-exception
            r1 = r0
            goto L_0x016f
        L_0x0071:
            r2 = move-exception
            goto L_0x015c
        L_0x0074:
            com.google.android.gms.internal.measurement.zzgn$zzj$zza r3 = com.google.android.gms.internal.measurement.zzgn.zzj.O()     // Catch:{ IOException -> 0x0097 }
            r4 = 2
            byte[] r5 = r0.getBlob(r4)     // Catch:{ IOException -> 0x0097 }
            com.google.android.gms.internal.measurement.zzmk r3 = com.google.android.gms.measurement.internal.zzol.G(r3, r5)     // Catch:{ IOException -> 0x0097 }
            com.google.android.gms.internal.measurement.zzgn$zzj$zza r3 = (com.google.android.gms.internal.measurement.zzgn.zzj.zza) r3     // Catch:{ IOException -> 0x0097 }
            com.google.android.gms.measurement.internal.zznt[] r5 = com.google.android.gms.measurement.internal.zznt.values()     // Catch:{ IOException -> 0x0097 }
            r6 = 5
            int r6 = r0.getInt(r6)     // Catch:{ IOException -> 0x0097 }
            r5 = r5[r6]     // Catch:{ IOException -> 0x0097 }
            com.google.android.gms.measurement.internal.zznt r6 = com.google.android.gms.measurement.internal.zznt.SGTM     // Catch:{ IOException -> 0x0097 }
            if (r5 == r6) goto L_0x009a
            com.google.android.gms.measurement.internal.zznt r6 = com.google.android.gms.measurement.internal.zznt.GOOGLE_ANALYTICS     // Catch:{ IOException -> 0x0097 }
            if (r5 != r6) goto L_0x00d9
            goto L_0x009a
        L_0x0097:
            r2 = move-exception
            goto L_0x0147
        L_0x009a:
            r6 = 6
            int r7 = r0.getInt(r6)     // Catch:{ IOException -> 0x0097 }
            if (r7 <= 0) goto L_0x00d9
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ IOException -> 0x0097 }
            r7.<init>()     // Catch:{ IOException -> 0x0097 }
            java.util.List r8 = r3.L()     // Catch:{ IOException -> 0x0097 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ IOException -> 0x0097 }
        L_0x00ae:
            boolean r9 = r8.hasNext()     // Catch:{ IOException -> 0x0097 }
            if (r9 == 0) goto L_0x00d3
            java.lang.Object r9 = r8.next()     // Catch:{ IOException -> 0x0097 }
            com.google.android.gms.internal.measurement.zzgn$zzk r9 = (com.google.android.gms.internal.measurement.zzgn.zzk) r9     // Catch:{ IOException -> 0x0097 }
            com.google.android.gms.internal.measurement.zzlc$zzb r9 = r9.z()     // Catch:{ IOException -> 0x0097 }
            com.google.android.gms.internal.measurement.zzgn$zzk$zza r9 = (com.google.android.gms.internal.measurement.zzgn.zzk.zza) r9     // Catch:{ IOException -> 0x0097 }
            int r10 = r0.getInt(r6)     // Catch:{ IOException -> 0x0097 }
            r9.M0(r10)     // Catch:{ IOException -> 0x0097 }
            com.google.android.gms.internal.measurement.zzml r9 = r9.F()     // Catch:{ IOException -> 0x0097 }
            com.google.android.gms.internal.measurement.zzlc r9 = (com.google.android.gms.internal.measurement.zzlc) r9     // Catch:{ IOException -> 0x0097 }
            com.google.android.gms.internal.measurement.zzgn$zzk r9 = (com.google.android.gms.internal.measurement.zzgn.zzk) r9     // Catch:{ IOException -> 0x0097 }
            r7.add(r9)     // Catch:{ IOException -> 0x0097 }
            goto L_0x00ae
        L_0x00d3:
            r3.I()     // Catch:{ IOException -> 0x0097 }
            r3.B(r7)     // Catch:{ IOException -> 0x0097 }
        L_0x00d9:
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ IOException -> 0x0097 }
            r6.<init>()     // Catch:{ IOException -> 0x0097 }
            r7 = 4
            java.lang.String r7 = r0.getString(r7)     // Catch:{ IOException -> 0x0097 }
            r8 = 0
            if (r7 == 0) goto L_0x011a
            java.lang.String r9 = "\r\n"
            java.lang.String[] r7 = r7.split(r9)     // Catch:{ IOException -> 0x0097 }
            int r9 = r7.length     // Catch:{ IOException -> 0x0097 }
            r10 = r8
        L_0x00ee:
            if (r10 >= r9) goto L_0x011a
            r11 = r7[r10]     // Catch:{ IOException -> 0x0097 }
            boolean r12 = r11.isEmpty()     // Catch:{ IOException -> 0x0097 }
            if (r12 != 0) goto L_0x011a
            java.lang.String r12 = "="
            java.lang.String[] r12 = r11.split(r12, r4)     // Catch:{ IOException -> 0x0097 }
            int r13 = r12.length     // Catch:{ IOException -> 0x0097 }
            if (r13 == r4) goto L_0x010f
            com.google.android.gms.measurement.internal.zzgi r4 = r14.m()     // Catch:{ IOException -> 0x0097 }
            com.google.android.gms.measurement.internal.zzgk r4 = r4.G()     // Catch:{ IOException -> 0x0097 }
            java.lang.String r7 = "Invalid upload header: "
            r4.b(r7, r11)     // Catch:{ IOException -> 0x0097 }
            goto L_0x011a
        L_0x010f:
            r11 = r12[r8]     // Catch:{ IOException -> 0x0097 }
            r13 = 1
            r12 = r12[r13]     // Catch:{ IOException -> 0x0097 }
            r6.put(r11, r12)     // Catch:{ IOException -> 0x0097 }
            int r10 = r10 + 1
            goto L_0x00ee
        L_0x011a:
            com.google.android.gms.measurement.internal.zzoj r4 = new com.google.android.gms.measurement.internal.zzoj     // Catch:{ IOException -> 0x0097 }
            r4.<init>()     // Catch:{ IOException -> 0x0097 }
            long r7 = r0.getLong(r8)     // Catch:{ IOException -> 0x0097 }
            com.google.android.gms.measurement.internal.zzoj r4 = r4.b(r7)     // Catch:{ IOException -> 0x0097 }
            com.google.android.gms.internal.measurement.zzml r3 = r3.F()     // Catch:{ IOException -> 0x0097 }
            com.google.android.gms.internal.measurement.zzlc r3 = (com.google.android.gms.internal.measurement.zzlc) r3     // Catch:{ IOException -> 0x0097 }
            com.google.android.gms.internal.measurement.zzgn$zzj r3 = (com.google.android.gms.internal.measurement.zzgn.zzj) r3     // Catch:{ IOException -> 0x0097 }
            com.google.android.gms.measurement.internal.zzoj r3 = r4.c(r3)     // Catch:{ IOException -> 0x0097 }
            com.google.android.gms.measurement.internal.zzoj r2 = r3.e(r2)     // Catch:{ IOException -> 0x0097 }
            com.google.android.gms.measurement.internal.zzoj r2 = r2.f(r6)     // Catch:{ IOException -> 0x0097 }
            com.google.android.gms.measurement.internal.zzoj r2 = r2.d(r5)     // Catch:{ IOException -> 0x0097 }
            com.google.android.gms.measurement.internal.zzog r15 = r2.a()     // Catch:{ IOException -> 0x0097 }
            r0.close()
            return r15
        L_0x0147:
            com.google.android.gms.measurement.internal.zzgi r3 = r14.m()     // Catch:{ SQLiteException -> 0x0071 }
            com.google.android.gms.measurement.internal.zzgk r3 = r3.G()     // Catch:{ SQLiteException -> 0x0071 }
            java.lang.String r4 = "Failed to queued MeasurementBatch from upload_queue. appId"
            r3.c(r4, r15, r2)     // Catch:{ SQLiteException -> 0x0071 }
            r0.close()
            return r1
        L_0x0158:
            r15 = move-exception
            goto L_0x016f
        L_0x015a:
            r2 = move-exception
            r0 = r1
        L_0x015c:
            com.google.android.gms.measurement.internal.zzgi r3 = r14.m()     // Catch:{ all -> 0x006d }
            com.google.android.gms.measurement.internal.zzgk r3 = r3.G()     // Catch:{ all -> 0x006d }
            java.lang.String r4 = "Error to querying MeasurementBatch from upload_queue. appId"
            r3.c(r4, r15, r2)     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x016e
            r0.close()
        L_0x016e:
            return r1
        L_0x016f:
            if (r1 == 0) goto L_0x0174
            r1.close()
        L_0x0174:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.V0(java.lang.String):com.google.android.gms.measurement.internal.zzog");
    }

    public final void W(Long l2) {
        n();
        u();
        Preconditions.m(l2);
        if ((!zzrw.a() || d().t(zzbj.A0)) && o0()) {
            if (C0("SELECT COUNT(1) FROM upload_queue WHERE rowid = " + l2 + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) > 0) {
                m().L().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase B2 = B();
                B2.execSQL("UPDATE upload_queue SET retry_count = retry_count + 1 WHERE rowid = " + l2 + " AND retry_count < 2147483647");
            } catch (SQLiteException e2) {
                m().G().b("Error incrementing retry count. error", e2);
            }
        }
    }

    public final List W0(String str) {
        Preconditions.g(str);
        n();
        u();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = B().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", (String) null);
            if (!cursor.moveToFirst()) {
                cursor.close();
                return arrayList;
            }
            do {
                String string = cursor.getString(0);
                if (string == null) {
                    string = "";
                }
                arrayList.add(new zznk(string, cursor.getLong(1), cursor.getInt(2)));
            } while (cursor.moveToNext());
            cursor.close();
            return arrayList;
        } catch (SQLiteException e2) {
            m().G().c("Error querying trigger uris. appId", zzgi.v(str), e2);
            List emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void X(String str, zzaz zzaz) {
        zzjc zzjc;
        Preconditions.m(str);
        Preconditions.m(zzaz);
        n();
        u();
        if (d().t(zzbj.R0) && T0(str) == (zzjc = zzjc.f26593c)) {
            E0(str, zzjc);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", zzaz.j());
        a0("consent_settings", "app_id", contentValues);
    }

    public final List X0(String str) {
        Preconditions.g(str);
        n();
        u();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = B().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", "1000");
            if (!cursor.moveToFirst()) {
                cursor.close();
                return arrayList;
            }
            do {
                String string = cursor.getString(0);
                String string2 = cursor.getString(1);
                if (string2 == null) {
                    string2 = "";
                }
                String str2 = string2;
                long j2 = cursor.getLong(2);
                Object M = M(cursor, 3);
                if (M == null) {
                    m().G().b("Read invalid user property value, ignoring it. appId", zzgi.v(str));
                } else {
                    arrayList.add(new zzom(str, str2, string, j2, M));
                }
            } while (cursor.moveToNext());
            cursor.close();
            return arrayList;
        } catch (SQLiteException e2) {
            m().G().c("Error querying user properties. appId", zzgi.v(str), e2);
            List emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void Y(String str, zzbd zzbd) {
        Preconditions.m(zzbd);
        n();
        u();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzbd.f26241a);
        contentValues.put("name", zzbd.f26242b);
        contentValues.put("lifetime_count", Long.valueOf(zzbd.f26243c));
        contentValues.put("current_bundle_count", Long.valueOf(zzbd.f26244d));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzbd.f26246f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzbd.f26247g));
        contentValues.put("last_bundled_day", zzbd.f26248h);
        contentValues.put("last_sampled_complex_event_id", zzbd.f26249i);
        contentValues.put("last_sampling_rate", zzbd.f26250j);
        contentValues.put("current_session_count", Long.valueOf(zzbd.f26245e));
        Boolean bool = zzbd.f26251k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (B().insertWithOnConflict(str, (String) null, contentValues, 5) == -1) {
                m().G().b("Failed to insert/update event aggregates (got -1). appId", zzgi.v(zzbd.f26241a));
            }
        } catch (SQLiteException e2) {
            m().G().c("Error storing event aggregates. appId", zzgi.v(zzbd.f26241a), e2);
        }
    }

    public final Map Y0(String str) {
        u();
        n();
        Preconditions.g(str);
        Cursor cursor = null;
        try {
            cursor = B().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                Map emptyMap = Collections.emptyMap();
                cursor.close();
                return emptyMap;
            }
            ArrayMap arrayMap = new ArrayMap();
            do {
                int i2 = cursor.getInt(0);
                try {
                    arrayMap.put(Integer.valueOf(i2), (zzgn.zzm) ((zzlc) ((zzgn.zzm.zza) zzol.G(zzgn.zzm.V(), cursor.getBlob(1))).F()));
                } catch (IOException e2) {
                    m().G().d("Failed to merge filter results. appId, audienceId, error", zzgi.v(str), Integer.valueOf(i2), e2);
                }
            } while (cursor.moveToNext());
            cursor.close();
            return arrayMap;
        } catch (SQLiteException e3) {
            m().G().c("Database error querying filter results. appId", zzgi.v(str), e3);
            Map emptyMap2 = Collections.emptyMap();
            if (cursor != null) {
                cursor.close();
            }
            return emptyMap2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void Z(String str, zzjc zzjc) {
        Preconditions.m(str);
        Preconditions.m(zzjc);
        n();
        u();
        E0(str, T0(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", zzjc.z());
        a0("consent_settings", "app_id", contentValues);
    }

    public final Map Z0(String str) {
        Preconditions.g(str);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            cursor = B().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                Map emptyMap = Collections.emptyMap();
                cursor.close();
                return emptyMap;
            }
            do {
                try {
                    zzfn.zzb zzb = (zzfn.zzb) ((zzlc) ((zzfn.zzb.zza) zzol.G(zzfn.zzb.N(), cursor.getBlob(1))).F());
                    if (zzb.W()) {
                        int i2 = cursor.getInt(0);
                        List list = (List) arrayMap.get(Integer.valueOf(i2));
                        if (list == null) {
                            list = new ArrayList();
                            arrayMap.put(Integer.valueOf(i2), list);
                        }
                        list.add(zzb);
                    }
                } catch (IOException e2) {
                    m().G().c("Failed to merge filter. appId", zzgi.v(str), e2);
                }
            } while (cursor.moveToNext());
            cursor.close();
            return arrayMap;
        } catch (SQLiteException e3) {
            m().G().c("Database error querying filters. appId", zzgi.v(str), e3);
            Map emptyMap2 = Collections.emptyMap();
            if (cursor != null) {
                cursor.close();
            }
            return emptyMap2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void a0(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase B2 = B();
            String asString = contentValues.getAsString(str2);
            if (asString == null) {
                m().H().b("Value of the primary key is not set.", zzgi.v(str2));
                return;
            }
            if (((long) B2.update(str, contentValues, str2 + " = ?", new String[]{asString})) == 0 && B2.insertWithOnConflict(str, (String) null, contentValues, 5) == -1) {
                m().G().c("Failed to insert/update table (got -1). key", zzgi.v(str), zzgi.v(str2));
            }
        } catch (SQLiteException e2) {
            m().G().d("Error storing into table. key", zzgi.v(str), zzgi.v(str2), e2);
        }
    }

    public final Map a1(String str) {
        u();
        n();
        Preconditions.g(str);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            cursor = B().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str, str});
            if (!cursor.moveToFirst()) {
                Map emptyMap = Collections.emptyMap();
                cursor.close();
                return emptyMap;
            }
            do {
                int i2 = cursor.getInt(0);
                List list = (List) arrayMap.get(Integer.valueOf(i2));
                if (list == null) {
                    list = new ArrayList();
                    arrayMap.put(Integer.valueOf(i2), list);
                }
                list.add(Integer.valueOf(cursor.getInt(1)));
            } while (cursor.moveToNext());
            cursor.close();
            return arrayMap;
        } catch (SQLiteException e2) {
            m().G().c("Database error querying scoped filters. appId", zzgi.v(str), e2);
            Map emptyMap2 = Collections.emptyMap();
            if (cursor != null) {
                cursor.close();
            }
            return emptyMap2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void b0(String str, List list) {
        boolean z2;
        boolean z3;
        String str2 = str;
        List list2 = list;
        Preconditions.m(list);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzfn.zza.C0000zza zza = (zzfn.zza.C0000zza) ((zzfn.zza) list2.get(i2)).z();
            if (zza.y() != 0) {
                for (int i3 = 0; i3 < zza.y(); i3++) {
                    zzfn.zzb.zza zza2 = (zzfn.zzb.zza) zza.G(i3).z();
                    zzfn.zzb.zza zza3 = (zzfn.zzb.zza) ((zzlc.zzb) zza2.clone());
                    String b2 = zzjf.b(zza2.H());
                    if (b2 != null) {
                        zza3.B(b2);
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    for (int i4 = 0; i4 < zza2.y(); i4++) {
                        zzfn.zzc G = zza2.G(i4);
                        String a2 = zzje.a(G.O());
                        if (a2 != null) {
                            zza3.z(i4, (zzfn.zzc) ((zzlc) ((zzfn.zzc.zza) G.z()).y(a2).F()));
                            z3 = true;
                        }
                    }
                    if (z3) {
                        zzfn.zza.C0000zza z4 = zza.z(i3, zza3);
                        list2.set(i2, (zzfn.zza) ((zzlc) z4.F()));
                        zza = z4;
                    }
                }
            }
            if (zza.H() != 0) {
                for (int i5 = 0; i5 < zza.H(); i5++) {
                    zzfn.zze I = zza.I(i5);
                    String a3 = zzjh.a(I.N());
                    if (a3 != null) {
                        zza = zza.B(i5, ((zzfn.zze.zza) I.z()).y(a3));
                        list2.set(i2, (zzfn.zza) ((zzlc) zza.F()));
                    }
                }
            }
        }
        u();
        n();
        Preconditions.g(str);
        Preconditions.m(list);
        SQLiteDatabase B2 = B();
        B2.beginTransaction();
        try {
            u();
            n();
            Preconditions.g(str);
            SQLiteDatabase B3 = B();
            B3.delete("property_filters", "app_id=?", new String[]{str});
            B3.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzfn.zza zza4 = (zzfn.zza) it.next();
                u();
                n();
                Preconditions.g(str);
                Preconditions.m(zza4);
                if (!zza4.T()) {
                    m().L().b("Audience with no ID. appId", zzgi.v(str));
                } else {
                    int n2 = zza4.n();
                    Iterator it2 = zza4.R().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!((zzfn.zzb) it2.next()).X()) {
                                m().L().c("Event filter with no ID. Audience definition ignored. appId, audienceId", zzgi.v(str), Integer.valueOf(n2));
                                break;
                            }
                        } else {
                            Iterator it3 = zza4.S().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (!((zzfn.zze) it3.next()).S()) {
                                        m().L().c("Property filter with no ID. Audience definition ignored. appId, audienceId", zzgi.v(str), Integer.valueOf(n2));
                                        break;
                                    }
                                } else {
                                    Iterator it4 = zza4.R().iterator();
                                    while (true) {
                                        if (it4.hasNext()) {
                                            if (!i0(str2, n2, (zzfn.zzb) it4.next())) {
                                                z2 = false;
                                                break;
                                            }
                                        } else {
                                            z2 = true;
                                            break;
                                        }
                                    }
                                    if (z2) {
                                        Iterator it5 = zza4.S().iterator();
                                        while (true) {
                                            if (it5.hasNext()) {
                                                if (!j0(str2, n2, (zzfn.zze) it5.next())) {
                                                    z2 = false;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z2) {
                                        u();
                                        n();
                                        Preconditions.g(str);
                                        SQLiteDatabase B4 = B();
                                        B4.delete("property_filters", "app_id=? and audience_id=?", new String[]{str2, String.valueOf(n2)});
                                        B4.delete("event_filters", "app_id=? and audience_id=?", new String[]{str2, String.valueOf(n2)});
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                zzfn.zza zza5 = (zzfn.zza) it6.next();
                arrayList.add(zza5.T() ? Integer.valueOf(zza5.n()) : null);
            }
            F0(str2, arrayList);
            B2.setTransactionSuccessful();
            B2.endTransaction();
        } catch (Throwable th) {
            B2.endTransaction();
            throw th;
        }
    }

    public final void b1() {
        u();
        B().beginTransaction();
    }

    public final void c0(List list) {
        n();
        u();
        Preconditions.m(list);
        Preconditions.o(list.size());
        if (o0()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (C0("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) > 0) {
                m().L().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                B().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e2) {
                m().G().b("Error incrementing retry count. error", e2);
            }
        }
    }

    public final void c1(String str) {
        n();
        u();
        try {
            B().execSQL("delete from default_event_params where app_id=?", new String[]{str});
        } catch (SQLiteException e2) {
            m().G().b("Error clearing default event params", e2);
        }
    }

    public final boolean d0(long j2, zzba zzba, long j3, boolean z2) {
        n();
        u();
        Preconditions.m(zzba);
        Preconditions.g(zzba.f26229a);
        byte[] m2 = o().E(zzba).m();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzba.f26229a);
        contentValues.put("name", zzba.f26230b);
        contentValues.put("timestamp", Long.valueOf(zzba.f26232d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j3));
        contentValues.put("data", m2);
        contentValues.put("realtime", Integer.valueOf(z2 ? 1 : 0));
        try {
            long update = (long) B().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j2)});
            if (update == 1) {
                return true;
            }
            m().G().c("Failed to update raw event. appId, updatedRows", zzgi.v(zzba.f26229a), Long.valueOf(update));
            return false;
        } catch (SQLiteException e2) {
            m().G().c("Error updating raw event. appId", zzgi.v(zzba.f26229a), e2);
            return false;
        }
    }

    public final void d1(String str) {
        zzbd K0;
        U0("events_snapshot", str);
        Cursor cursor = null;
        try {
            cursor = B().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                cursor.close();
                return;
            }
            do {
                String string = cursor.getString(0);
                if (!(string == null || (K0 = K0(str, string)) == null)) {
                    Y("events_snapshot", K0);
                }
            } while (cursor.moveToNext());
            cursor.close();
        } catch (SQLiteException e2) {
            m().G().c("Error creating snapshot. appId", zzgi.v(str), e2);
            if (cursor != null) {
                cursor.close();
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final boolean e0(zzgn.zzk zzk, boolean z2) {
        n();
        u();
        Preconditions.m(zzk);
        Preconditions.g(zzk.C2());
        Preconditions.q(zzk.Q0());
        h1();
        long a2 = b().a();
        if (zzk.h2() < a2 - zzah.T() || zzk.h2() > zzah.T() + a2) {
            m().L().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzgi.v(zzk.C2()), Long.valueOf(a2), Long.valueOf(zzk.h2()));
        }
        try {
            byte[] i0 = o().i0(zzk.m());
            m().K().b("Saving bundle, size", Integer.valueOf(i0.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzk.C2());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzk.h2()));
            contentValues.put("data", i0);
            contentValues.put("has_realtime", Integer.valueOf(z2 ? 1 : 0));
            if (zzk.X0()) {
                contentValues.put("retry_count", Integer.valueOf(zzk.G1()));
            }
            try {
                if (B().insert("queue", (String) null, contentValues) != -1) {
                    return true;
                }
                m().G().b("Failed to insert bundle (got -1). appId", zzgi.v(zzk.C2()));
                return false;
            } catch (SQLiteException e2) {
                m().G().c("Error storing bundle. appId", zzgi.v(zzk.C2()), e2);
                return false;
            }
        } catch (IOException e3) {
            m().G().c("Data loss. Failed to serialize bundle. appId", zzgi.v(zzk.C2()), e3);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009f, code lost:
        if ("_v".equals(r0) != false) goto L_0x00a1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ff A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e1(java.lang.String r20) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            java.lang.String r3 = "events_snapshot"
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r4 = "name"
            java.lang.String r5 = "lifetime_count"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}
            java.util.List r4 = java.util.Arrays.asList(r4)
            r0.<init>(r4)
            java.lang.String r4 = "_f"
            com.google.android.gms.measurement.internal.zzbd r5 = r1.K0(r2, r4)
            java.lang.String r6 = "_v"
            com.google.android.gms.measurement.internal.zzbd r7 = r1.K0(r2, r6)
            java.lang.String r8 = "events"
            r1.U0(r8, r2)
            r9 = 0
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.B()     // Catch:{ SQLiteException -> 0x00cc, all -> 0x00c9 }
            java.lang.String r12 = "events_snapshot"
            java.lang.String[] r13 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x00cc, all -> 0x00c9 }
            java.lang.Object[] r0 = r0.toArray(r13)     // Catch:{ SQLiteException -> 0x00cc, all -> 0x00c9 }
            r13 = r0
            java.lang.String[] r13 = (java.lang.String[]) r13     // Catch:{ SQLiteException -> 0x00cc, all -> 0x00c9 }
            java.lang.String r14 = "app_id=?"
            java.lang.String[] r15 = new java.lang.String[]{r20}     // Catch:{ SQLiteException -> 0x00cc, all -> 0x00c9 }
            r17 = 0
            r18 = 0
            r16 = 0
            android.database.Cursor r10 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x00cc, all -> 0x00c9 }
            boolean r0 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x00cc, all -> 0x00c9 }
            if (r0 != 0) goto L_0x0061
            r10.close()
            if (r5 == 0) goto L_0x0058
            r1.Y(r8, r5)
            goto L_0x005d
        L_0x0058:
            if (r7 == 0) goto L_0x005d
            r1.Y(r8, r7)
        L_0x005d:
            r1.U0(r3, r2)
            return
        L_0x0061:
            r11 = r9
            r12 = r11
        L_0x0063:
            java.lang.String r0 = r10.getString(r9)     // Catch:{ SQLiteException -> 0x0091, all -> 0x008d }
            com.google.android.gms.measurement.internal.zzah r13 = r19.d()     // Catch:{ SQLiteException -> 0x0091, all -> 0x008d }
            com.google.android.gms.measurement.internal.zzfz r14 = com.google.android.gms.measurement.internal.zzbj.f1     // Catch:{ SQLiteException -> 0x0091, all -> 0x008d }
            boolean r13 = r13.t(r14)     // Catch:{ SQLiteException -> 0x0091, all -> 0x008d }
            r14 = 1
            if (r13 == 0) goto L_0x0094
            long r15 = r10.getLong(r14)     // Catch:{ SQLiteException -> 0x0091, all -> 0x008d }
            r17 = 1
            int r13 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r13 < 0) goto L_0x00a2
            boolean r13 = r4.equals(r0)     // Catch:{ SQLiteException -> 0x0091, all -> 0x008d }
            if (r13 == 0) goto L_0x0086
        L_0x0084:
            r11 = r14
            goto L_0x00a2
        L_0x0086:
            boolean r13 = r6.equals(r0)     // Catch:{ SQLiteException -> 0x0091, all -> 0x008d }
            if (r13 == 0) goto L_0x00a2
            goto L_0x00a1
        L_0x008d:
            r0 = move-exception
            r9 = r11
            goto L_0x00f8
        L_0x0091:
            r0 = move-exception
            r9 = r11
            goto L_0x00ce
        L_0x0094:
            boolean r13 = r4.equals(r0)     // Catch:{ SQLiteException -> 0x0091, all -> 0x008d }
            if (r13 == 0) goto L_0x009b
            goto L_0x0084
        L_0x009b:
            boolean r13 = r6.equals(r0)     // Catch:{ SQLiteException -> 0x0091, all -> 0x008d }
            if (r13 == 0) goto L_0x00a2
        L_0x00a1:
            r12 = r14
        L_0x00a2:
            if (r0 == 0) goto L_0x00ad
            com.google.android.gms.measurement.internal.zzbd r0 = r1.I0(r3, r2, r0)     // Catch:{ SQLiteException -> 0x0091, all -> 0x008d }
            if (r0 == 0) goto L_0x00ad
            r1.Y(r8, r0)     // Catch:{ SQLiteException -> 0x0091, all -> 0x008d }
        L_0x00ad:
            boolean r0 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x0091, all -> 0x008d }
            if (r0 != 0) goto L_0x0063
            r10.close()
            if (r11 != 0) goto L_0x00be
            if (r5 == 0) goto L_0x00be
            r1.Y(r8, r5)
            goto L_0x00c5
        L_0x00be:
            if (r12 != 0) goto L_0x00c5
            if (r7 == 0) goto L_0x00c5
            r1.Y(r8, r7)
        L_0x00c5:
            r1.U0(r3, r2)
            return
        L_0x00c9:
            r0 = move-exception
            r12 = r9
            goto L_0x00f8
        L_0x00cc:
            r0 = move-exception
            r12 = r9
        L_0x00ce:
            com.google.android.gms.measurement.internal.zzgi r4 = r19.m()     // Catch:{ all -> 0x00f7 }
            com.google.android.gms.measurement.internal.zzgk r4 = r4.G()     // Catch:{ all -> 0x00f7 }
            java.lang.String r6 = "Error querying snapshot. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzgi.v(r20)     // Catch:{ all -> 0x00f7 }
            r4.c(r6, r11, r0)     // Catch:{ all -> 0x00f7 }
            if (r10 == 0) goto L_0x00e4
            r10.close()
        L_0x00e4:
            if (r9 != 0) goto L_0x00ec
            if (r5 == 0) goto L_0x00ec
            r1.Y(r8, r5)
            goto L_0x00f3
        L_0x00ec:
            if (r12 != 0) goto L_0x00f3
            if (r7 == 0) goto L_0x00f3
            r1.Y(r8, r7)
        L_0x00f3:
            r1.U0(r3, r2)
            return
        L_0x00f7:
            r0 = move-exception
        L_0x00f8:
            if (r10 == 0) goto L_0x00fd
            r10.close()
        L_0x00fd:
            if (r9 != 0) goto L_0x0106
            if (r5 != 0) goto L_0x0102
            goto L_0x0106
        L_0x0102:
            r1.Y(r8, r5)
            goto L_0x010d
        L_0x0106:
            if (r12 != 0) goto L_0x010d
            if (r7 == 0) goto L_0x010d
            r1.Y(r8, r7)
        L_0x010d:
            r1.U0(r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.e1(java.lang.String):void");
    }

    public final boolean f0(zzaf zzaf) {
        Preconditions.m(zzaf);
        n();
        u();
        String str = zzaf.f26176z;
        Preconditions.m(str);
        if (M0(str, zzaf.f26175B.f26959A) == null && C0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzaf.f26174A);
        contentValues.put("name", zzaf.f26175B.f26959A);
        T(contentValues, "value", Preconditions.m(zzaf.f26175B.H()));
        contentValues.put("active", Boolean.valueOf(zzaf.D));
        contentValues.put("trigger_event_name", zzaf.E);
        contentValues.put("trigger_timeout", Long.valueOf(zzaf.G));
        j();
        contentValues.put("timed_out_event", zzop.q0(zzaf.F));
        contentValues.put("creation_timestamp", Long.valueOf(zzaf.C));
        j();
        contentValues.put("triggered_event", zzop.q0(zzaf.H));
        contentValues.put("triggered_timestamp", Long.valueOf(zzaf.f26175B.f26960B));
        contentValues.put("time_to_live", Long.valueOf(zzaf.I));
        j();
        contentValues.put("expired_event", zzop.q0(zzaf.J));
        try {
            if (B().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) != -1) {
                return true;
            }
            m().G().b("Failed to insert/update conditional user property (got -1)", zzgi.v(str));
            return true;
        } catch (SQLiteException e2) {
            m().G().c("Error storing conditional user property", zzgi.v(str), e2);
            return true;
        }
    }

    public final boolean f1(String str) {
        if (zzrw.a() && !d().t(zzbj.A0)) {
            return false;
        }
        String z0 = z0();
        StringBuilder sb = new StringBuilder("SELECT COUNT(1) > 0 FROM upload_queue WHERE ");
        sb.append(z0);
        return C0(sb.toString(), new String[]{str}) != 0;
    }

    public final boolean g0(zzba zzba, long j2, boolean z2) {
        n();
        u();
        Preconditions.m(zzba);
        Preconditions.g(zzba.f26229a);
        byte[] m2 = o().E(zzba).m();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzba.f26229a);
        contentValues.put("name", zzba.f26230b);
        contentValues.put("timestamp", Long.valueOf(zzba.f26232d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j2));
        contentValues.put("data", m2);
        contentValues.put("realtime", Integer.valueOf(z2 ? 1 : 0));
        try {
            if (B().insert("raw_events", (String) null, contentValues) != -1) {
                return true;
            }
            m().G().b("Failed to insert raw event (got -1). appId", zzgi.v(zzba.f26229a));
            return false;
        } catch (SQLiteException e2) {
            m().G().c("Error storing raw event. appId", zzgi.v(zzba.f26229a), e2);
            return false;
        }
    }

    public final void g1() {
        u();
        B().endTransaction();
    }

    public final boolean h0(zzom zzom) {
        Preconditions.m(zzom);
        n();
        u();
        if (M0(zzom.f26962a, zzom.f26964c) == null) {
            if (zzop.L0(zzom.f26964c)) {
                if (C0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zzom.f26962a}) >= ((long) d().q(zzom.f26962a, zzbj.J, 25, 100))) {
                    return false;
                }
            } else if (!"_npa".equals(zzom.f26964c) && C0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzom.f26962a, zzom.f26963b}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzom.f26962a);
        contentValues.put("origin", zzom.f26963b);
        contentValues.put("name", zzom.f26964c);
        contentValues.put("set_timestamp", Long.valueOf(zzom.f26965d));
        T(contentValues, "value", zzom.f26966e);
        try {
            if (B().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) != -1) {
                return true;
            }
            m().G().b("Failed to insert/update user property (got -1). appId", zzgi.v(zzom.f26962a));
            return true;
        } catch (SQLiteException e2) {
            m().G().c("Error storing user property. appId", zzgi.v(zzom.f26962a), e2);
            return true;
        }
    }

    public final void h1() {
        int delete;
        n();
        u();
        if (o0()) {
            long a2 = s().f26835e.a();
            long c2 = b().c();
            if (Math.abs(c2 - a2) > zzah.U()) {
                s().f26835e.b(c2);
                n();
                u();
                if (o0() && (delete = B().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(b().a()), String.valueOf(zzah.T())})) > 0) {
                    m().K().b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                }
            }
        }
    }

    public final boolean i0(String str, int i2, zzfn.zzb zzb) {
        u();
        n();
        Preconditions.g(str);
        Preconditions.m(zzb);
        Integer num = null;
        if (zzb.R().isEmpty()) {
            zzgk L = m().L();
            Object v2 = zzgi.v(str);
            Integer valueOf = Integer.valueOf(i2);
            if (zzb.X()) {
                num = Integer.valueOf(zzb.M());
            }
            L.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", v2, valueOf, String.valueOf(num));
            return false;
        }
        byte[] m2 = zzb.m();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        contentValues.put("filter_id", zzb.X() ? Integer.valueOf(zzb.M()) : null);
        contentValues.put("event_name", zzb.R());
        contentValues.put("session_scoped", zzb.Y() ? Boolean.valueOf(zzb.V()) : null);
        contentValues.put("data", m2);
        try {
            if (B().insertWithOnConflict("event_filters", (String) null, contentValues, 5) != -1) {
                return true;
            }
            m().G().b("Failed to insert event filter (got -1). appId", zzgi.v(str));
            return true;
        } catch (SQLiteException e2) {
            m().G().c("Error storing event filter. appId", zzgi.v(str), e2);
            return false;
        }
    }

    public final void i1() {
        u();
        B().setTransactionSuccessful();
    }

    public final boolean j0(String str, int i2, zzfn.zze zze) {
        u();
        n();
        Preconditions.g(str);
        Preconditions.m(zze);
        Integer num = null;
        if (zze.N().isEmpty()) {
            zzgk L = m().L();
            Object v2 = zzgi.v(str);
            Integer valueOf = Integer.valueOf(i2);
            if (zze.S()) {
                num = Integer.valueOf(zze.n());
            }
            L.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", v2, valueOf, String.valueOf(num));
            return false;
        }
        byte[] m2 = zze.m();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        contentValues.put("filter_id", zze.S() ? Integer.valueOf(zze.n()) : null);
        contentValues.put("property_name", zze.N());
        contentValues.put("session_scoped", zze.T() ? Boolean.valueOf(zze.R()) : null);
        contentValues.put("data", m2);
        try {
            if (B().insertWithOnConflict("property_filters", (String) null, contentValues, 5) != -1) {
                return true;
            }
            m().G().b("Failed to insert property filter (got -1). appId", zzgi.v(str));
            return false;
        } catch (SQLiteException e2) {
            m().G().c("Error storing property filter. appId", zzgi.v(str), e2);
            return false;
        }
    }

    public final boolean j1() {
        return C0("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    public final boolean k0(String str, Bundle bundle) {
        n();
        u();
        byte[] m2 = o().E(new zzba(this.f26587a, "", str, "dep", 0, 0, bundle)).m();
        m().K().c("Saving default event parameters, appId, data size", h().c(str), Integer.valueOf(m2.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", m2);
        try {
            if (B().insertWithOnConflict("default_event_params", (String) null, contentValues, 5) != -1) {
                return true;
            }
            m().G().b("Failed to insert default event parameters (got -1). appId", zzgi.v(str));
            return false;
        } catch (SQLiteException e2) {
            m().G().c("Error storing default event parameters. appId", zzgi.v(str), e2);
            return false;
        }
    }

    public final boolean k1() {
        return C0("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    public final boolean l0(String str, zzgn.zzj zzj, String str2, Map map, zznt zznt) {
        n();
        u();
        Preconditions.m(zzj);
        Preconditions.g(str);
        if (zzrw.a() && !d().t(zzbj.A0)) {
            return false;
        }
        n();
        u();
        if (o0()) {
            long a2 = s().f26836f.a();
            long c2 = b().c();
            if (Math.abs(c2 - a2) > zzah.U()) {
                s().f26836f.b(c2);
                n();
                u();
                if (o0()) {
                    SQLiteDatabase B2 = B();
                    b().a();
                    zznt zznt2 = zznt.GOOGLE_SIGNAL;
                    zznt2.a();
                    zzah.R();
                    zznt2.a();
                    zzah.T();
                    int delete = B2.delete("upload_queue", "ABS(creation_timestamp - ?) > CAST(? as integer)", new String[0]);
                    if (delete > 0) {
                        m().K().b("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(((String) entry.getKey()) + "=" + ((String) entry.getValue()));
        }
        byte[] m2 = zzj.m();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", m2);
        contentValues.put("upload_uri", str2);
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        if (size > 0) {
            sb.append((CharSequence) arrayList.get(0));
            int i2 = 1;
            while (i2 < size) {
                sb.append("\r\n");
                Object obj = arrayList.get(i2);
                i2++;
                sb.append((CharSequence) obj);
            }
        }
        contentValues.put("upload_headers", sb.toString());
        contentValues.put("upload_type", Integer.valueOf(zznt.a()));
        contentValues.put("creation_timestamp", Long.valueOf(b().a()));
        contentValues.put("retry_count", 0);
        try {
            if (B().insert("upload_queue", (String) null, contentValues) != -1) {
                return true;
            }
            m().G().b("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
            return false;
        } catch (SQLiteException e2) {
            m().G().c("Error storing MeasurementBatch to upload_queue. appId", str, e2);
            return false;
        }
    }

    public final boolean l1() {
        return C0("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    public final boolean m0(String str, zznk zznk) {
        n();
        u();
        Preconditions.m(zznk);
        Preconditions.g(str);
        long a2 = b().a();
        if (zznk.f26880A < a2 - zzah.T() || zznk.f26880A > zzah.T() + a2) {
            m().L().d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", zzgi.v(str), Long.valueOf(a2), Long.valueOf(zznk.f26880A));
        }
        m().K().a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", zznk.f26882z);
        contentValues.put("source", Integer.valueOf(zznk.f26881B));
        contentValues.put("timestamp_millis", Long.valueOf(zznk.f26880A));
        try {
            if (B().insert("trigger_uris", (String) null, contentValues) != -1) {
                return true;
            }
            m().G().b("Failed to insert trigger URI (got -1). appId", zzgi.v(str));
            return false;
        } catch (SQLiteException e2) {
            m().G().c("Error storing trigger URI. appId", zzgi.v(str), e2);
            return false;
        }
    }

    public final boolean n0(String str, Long l2, long j2, zzgn.zzf zzf) {
        n();
        u();
        Preconditions.m(zzf);
        Preconditions.g(str);
        Preconditions.m(l2);
        byte[] m2 = zzf.m();
        m().K().c("Saving complex main event, appId, data size", h().c(str), Integer.valueOf(m2.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", m2);
        try {
            if (B().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) != -1) {
                return true;
            }
            m().G().b("Failed to insert complex main event (got -1). appId", zzgi.v(str));
            return false;
        } catch (SQLiteException e2) {
            m().G().c("Error storing complex main event. appId", zzgi.v(str), e2);
            return false;
        }
    }

    public final boolean o0() {
        return a().getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean x() {
        return false;
    }

    public final long y() {
        Cursor cursor = null;
        try {
            cursor = B().rawQuery("select rowid from raw_events order by rowid desc limit 1;", (String[]) null);
            if (!cursor.moveToFirst()) {
                cursor.close();
                return -1;
            }
            long j2 = cursor.getLong(0);
            cursor.close();
            return j2;
        } catch (SQLiteException e2) {
            m().G().b("Error querying raw events", e2);
            if (cursor != null) {
                cursor.close();
            }
            return -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long z() {
        return G("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    public final String z0() {
        long a2 = b().a();
        zznt zznt = zznt.GOOGLE_SIGNAL;
        return "app_id=? AND (" + ("(upload_type = " + zznt.a() + " AND (ABS(creation_timestamp - " + a2 + ") <= CAST(" + zzah.R() + " AS INTEGER)))") + " OR" + ("(upload_type != " + zznt.a() + " AND (ABS(creation_timestamp - " + a2 + ") <= CAST(" + zzah.T() + " AS INTEGER)))") + ")";
    }
}
