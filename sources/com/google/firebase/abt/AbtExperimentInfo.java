package com.google.firebase.abt;

import android.text.TextUtils;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

public class AbtExperimentInfo {

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f29665g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h  reason: collision with root package name */
    public static final DateFormat f29666h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a  reason: collision with root package name */
    public final String f29667a;

    /* renamed from: b  reason: collision with root package name */
    public final String f29668b;

    /* renamed from: c  reason: collision with root package name */
    public final String f29669c;

    /* renamed from: d  reason: collision with root package name */
    public final Date f29670d;

    /* renamed from: e  reason: collision with root package name */
    public final long f29671e;

    /* renamed from: f  reason: collision with root package name */
    public final long f29672f;

    public AbtExperimentInfo(String str, String str2, String str3, Date date, long j2, long j3) {
        this.f29667a = str;
        this.f29668b = str2;
        this.f29669c = str3;
        this.f29670d = date;
        this.f29671e = j2;
        this.f29672f = j3;
    }

    public static AbtExperimentInfo a(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        String str = conditionalUserProperty.f29696d;
        if (str == null) {
            str = "";
        }
        return new AbtExperimentInfo(conditionalUserProperty.f29694b, String.valueOf(conditionalUserProperty.f29695c), str, new Date(conditionalUserProperty.f29705m), conditionalUserProperty.f29697e, conditionalUserProperty.f29702j);
    }

    public static AbtExperimentInfo b(Map map) {
        g(map);
        try {
            return new AbtExperimentInfo((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", f29666h.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis")));
        } catch (ParseException e2) {
            throw new AbtException("Could not process experiment: parsing experiment start time failed.", e2);
        } catch (NumberFormatException e3) {
            throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e3);
        }
    }

    public static void g(Map map) {
        ArrayList arrayList = new ArrayList();
        for (String str : f29665g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", new Object[]{arrayList}));
        }
    }

    public String c() {
        return this.f29667a;
    }

    public long d() {
        return this.f29670d.getTime();
    }

    public String e() {
        return this.f29668b;
    }

    public AnalyticsConnector.ConditionalUserProperty f(String str) {
        AnalyticsConnector.ConditionalUserProperty conditionalUserProperty = new AnalyticsConnector.ConditionalUserProperty();
        conditionalUserProperty.f29693a = str;
        conditionalUserProperty.f29705m = d();
        conditionalUserProperty.f29694b = this.f29667a;
        conditionalUserProperty.f29695c = this.f29668b;
        conditionalUserProperty.f29696d = TextUtils.isEmpty(this.f29669c) ? null : this.f29669c;
        conditionalUserProperty.f29697e = this.f29671e;
        conditionalUserProperty.f29702j = this.f29672f;
        return conditionalUserProperty;
    }
}
