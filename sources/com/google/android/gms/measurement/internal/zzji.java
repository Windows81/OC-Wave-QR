package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdt;

public final class zzji {

    /* renamed from: a  reason: collision with root package name */
    public final Context f26612a;

    /* renamed from: b  reason: collision with root package name */
    public String f26613b;

    /* renamed from: c  reason: collision with root package name */
    public String f26614c;

    /* renamed from: d  reason: collision with root package name */
    public String f26615d;

    /* renamed from: e  reason: collision with root package name */
    public Boolean f26616e;

    /* renamed from: f  reason: collision with root package name */
    public long f26617f;

    /* renamed from: g  reason: collision with root package name */
    public zzdt f26618g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f26619h = true;

    /* renamed from: i  reason: collision with root package name */
    public Long f26620i;

    /* renamed from: j  reason: collision with root package name */
    public String f26621j;

    public zzji(Context context, zzdt zzdt, Long l2) {
        Preconditions.m(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.m(applicationContext);
        this.f26612a = applicationContext;
        this.f26620i = l2;
        if (zzdt != null) {
            this.f26618g = zzdt;
            this.f26613b = zzdt.E;
            this.f26614c = zzdt.D;
            this.f26615d = zzdt.C;
            this.f26619h = zzdt.f25418B;
            this.f26617f = zzdt.f25417A;
            this.f26621j = zzdt.G;
            Bundle bundle = zzdt.F;
            if (bundle != null) {
                this.f26616e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
