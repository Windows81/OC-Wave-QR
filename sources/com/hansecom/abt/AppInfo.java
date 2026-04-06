package com.hansecom.abt;

import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.text.StringsKt;

@Singleton
@Metadata
public final class AppInfo {

    /* renamed from: a  reason: collision with root package name */
    public final int f32870a = 168;

    /* renamed from: b  reason: collision with root package name */
    public final String f32871b = "1.2.5";

    /* renamed from: c  reason: collision with root package name */
    public final String f32872c = StringsKt.b1("1.2.5", '-', (String) null, 2, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    public final boolean f32873d;

    public final String a() {
        return this.f32872c;
    }

    public final boolean b() {
        return this.f32873d;
    }
}
