package com.google.firebase.abt;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FirebaseABTesting {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f29673a;

    /* renamed from: b  reason: collision with root package name */
    public final String f29674b;

    /* renamed from: c  reason: collision with root package name */
    public Integer f29675c = null;

    @Retention(RetentionPolicy.SOURCE)
    public @interface OriginService {
    }

    public FirebaseABTesting(Context context, Provider provider, String str) {
        this.f29673a = provider;
        this.f29674b = str;
    }

    public static List c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbtExperimentInfo.b((Map) it.next()));
        }
        return arrayList;
    }

    public final void a(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        ((AnalyticsConnector) this.f29673a.get()).b(conditionalUserProperty);
    }

    public final void b(List list) {
        ArrayDeque arrayDeque = new ArrayDeque(f());
        int i2 = i();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbtExperimentInfo abtExperimentInfo = (AbtExperimentInfo) it.next();
            while (arrayDeque.size() >= i2) {
                k(((AnalyticsConnector.ConditionalUserProperty) arrayDeque.pollFirst()).f29694b);
            }
            AnalyticsConnector.ConditionalUserProperty f2 = abtExperimentInfo.f(this.f29674b);
            a(f2);
            arrayDeque.offer(f2);
        }
    }

    public final boolean d(List list, AbtExperimentInfo abtExperimentInfo) {
        String c2 = abtExperimentInfo.c();
        String e2 = abtExperimentInfo.e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbtExperimentInfo abtExperimentInfo2 = (AbtExperimentInfo) it.next();
            if (abtExperimentInfo2.c().equals(c2) && abtExperimentInfo2.e().equals(e2)) {
                return true;
            }
        }
        return false;
    }

    public List e() {
        o();
        List<AnalyticsConnector.ConditionalUserProperty> f2 = f();
        ArrayList arrayList = new ArrayList();
        for (AnalyticsConnector.ConditionalUserProperty a2 : f2) {
            arrayList.add(AbtExperimentInfo.a(a2));
        }
        return arrayList;
    }

    public final List f() {
        return ((AnalyticsConnector) this.f29673a.get()).e(this.f29674b, "");
    }

    public final ArrayList g(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbtExperimentInfo abtExperimentInfo = (AbtExperimentInfo) it.next();
            if (!d(list2, abtExperimentInfo)) {
                arrayList.add(abtExperimentInfo);
            }
        }
        return arrayList;
    }

    public final ArrayList h(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbtExperimentInfo abtExperimentInfo = (AbtExperimentInfo) it.next();
            if (!d(list2, abtExperimentInfo)) {
                arrayList.add(abtExperimentInfo.f(this.f29674b));
            }
        }
        return arrayList;
    }

    public final int i() {
        if (this.f29675c == null) {
            this.f29675c = Integer.valueOf(((AnalyticsConnector) this.f29673a.get()).d(this.f29674b));
        }
        return this.f29675c.intValue();
    }

    public void j() {
        o();
        l(f());
    }

    public final void k(String str) {
        ((AnalyticsConnector) this.f29673a.get()).clearConditionalUserProperty(str, (String) null, (Bundle) null);
    }

    public final void l(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            k(((AnalyticsConnector.ConditionalUserProperty) it.next()).f29694b);
        }
    }

    public void m(List list) {
        o();
        if (list != null) {
            n(c(list));
            return;
        }
        throw new IllegalArgumentException("The replacementExperiments list is null.");
    }

    public final void n(List list) {
        if (list.isEmpty()) {
            j();
            return;
        }
        List e2 = e();
        l(h(e2, list));
        b(g(list, e2));
    }

    public final void o() {
        if (this.f29673a.get() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }
}
