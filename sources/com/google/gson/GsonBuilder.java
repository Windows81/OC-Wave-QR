package com.google.gson;

import com.google.gson.internal.Excluder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class GsonBuilder {

    /* renamed from: a  reason: collision with root package name */
    public Excluder f31657a = Excluder.F;

    /* renamed from: b  reason: collision with root package name */
    public LongSerializationPolicy f31658b = LongSerializationPolicy.DEFAULT;

    /* renamed from: c  reason: collision with root package name */
    public FieldNamingStrategy f31659c = FieldNamingPolicy.IDENTITY;

    /* renamed from: d  reason: collision with root package name */
    public final Map f31660d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final List f31661e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final List f31662f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public boolean f31663g = false;

    /* renamed from: h  reason: collision with root package name */
    public String f31664h = Gson.f31626z;

    /* renamed from: i  reason: collision with root package name */
    public int f31665i = 2;

    /* renamed from: j  reason: collision with root package name */
    public int f31666j = 2;

    /* renamed from: k  reason: collision with root package name */
    public boolean f31667k = false;

    /* renamed from: l  reason: collision with root package name */
    public boolean f31668l = false;

    /* renamed from: m  reason: collision with root package name */
    public boolean f31669m = true;

    /* renamed from: n  reason: collision with root package name */
    public boolean f31670n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f31671o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f31672p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f31673q = true;

    /* renamed from: r  reason: collision with root package name */
    public ToNumberStrategy f31674r = Gson.f31625B;

    /* renamed from: s  reason: collision with root package name */
    public ToNumberStrategy f31675s = Gson.C;

    /* renamed from: t  reason: collision with root package name */
    public final LinkedList f31676t = new LinkedList();

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r5, int r6, int r7, java.util.List r8) {
        /*
            r4 = this;
            boolean r0 = com.google.gson.internal.sql.SqlTypesSupport.f31885a
            r1 = 0
            if (r5 == 0) goto L_0x0026
            java.lang.String r2 = r5.trim()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0026
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType r6 = com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType.f31768b
            com.google.gson.TypeAdapterFactory r6 = r6.b(r5)
            if (r0 == 0) goto L_0x0024
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType r7 = com.google.gson.internal.sql.SqlTypesSupport.f31887c
            com.google.gson.TypeAdapterFactory r1 = r7.b(r5)
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType r7 = com.google.gson.internal.sql.SqlTypesSupport.f31886b
            com.google.gson.TypeAdapterFactory r5 = r7.b(r5)
            goto L_0x0045
        L_0x0024:
            r5 = r1
            goto L_0x0045
        L_0x0026:
            r5 = 2
            if (r6 == r5) goto L_0x0050
            if (r7 == r5) goto L_0x0050
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType r5 = com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType.f31768b
            com.google.gson.TypeAdapterFactory r5 = r5.a(r6, r7)
            if (r0 == 0) goto L_0x0043
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType r1 = com.google.gson.internal.sql.SqlTypesSupport.f31887c
            com.google.gson.TypeAdapterFactory r1 = r1.a(r6, r7)
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType r2 = com.google.gson.internal.sql.SqlTypesSupport.f31886b
            com.google.gson.TypeAdapterFactory r6 = r2.a(r6, r7)
            r3 = r6
            r6 = r5
            r5 = r3
            goto L_0x0045
        L_0x0043:
            r6 = r5
            goto L_0x0024
        L_0x0045:
            r8.add(r6)
            if (r0 == 0) goto L_0x0050
            r8.add(r1)
            r8.add(r5)
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.GsonBuilder.a(java.lang.String, int, int, java.util.List):void");
    }

    public Gson b() {
        ArrayList arrayList = r1;
        ArrayList arrayList2 = new ArrayList(this.f31661e.size() + this.f31662f.size() + 3);
        arrayList2.addAll(this.f31661e);
        Collections.reverse(arrayList2);
        ArrayList arrayList3 = new ArrayList(this.f31662f);
        Collections.reverse(arrayList3);
        arrayList2.addAll(arrayList3);
        a(this.f31664h, this.f31665i, this.f31666j, arrayList2);
        Excluder excluder = this.f31657a;
        FieldNamingStrategy fieldNamingStrategy = this.f31659c;
        HashMap hashMap = r5;
        HashMap hashMap2 = new HashMap(this.f31660d);
        boolean z2 = this.f31663g;
        boolean z3 = this.f31667k;
        boolean z4 = this.f31671o;
        boolean z5 = this.f31669m;
        boolean z6 = this.f31670n;
        boolean z7 = this.f31672p;
        boolean z8 = this.f31668l;
        boolean z9 = this.f31673q;
        LongSerializationPolicy longSerializationPolicy = this.f31658b;
        String str = this.f31664h;
        int i2 = this.f31665i;
        int i3 = this.f31666j;
        ArrayList arrayList4 = r1;
        Excluder excluder2 = excluder;
        ArrayList arrayList5 = new ArrayList(this.f31661e);
        ArrayList arrayList6 = r1;
        ArrayList arrayList7 = new ArrayList(this.f31662f);
        ToNumberStrategy toNumberStrategy = this.f31674r;
        ToNumberStrategy toNumberStrategy2 = this.f31675s;
        ArrayList arrayList8 = r1;
        ArrayList arrayList9 = new ArrayList(this.f31676t);
        return new Gson(excluder2, fieldNamingStrategy, hashMap, z2, z3, z4, z5, z6, z7, z8, z9, longSerializationPolicy, str, i2, i3, arrayList4, arrayList6, arrayList, toNumberStrategy, toNumberStrategy2, arrayList8);
    }

    public GsonBuilder c() {
        this.f31669m = false;
        return this;
    }

    public GsonBuilder d() {
        this.f31657a = this.f31657a.i();
        return this;
    }

    public GsonBuilder e() {
        this.f31672p = true;
        return this;
    }

    public GsonBuilder f() {
        this.f31670n = true;
        return this;
    }
}
