package com.google.android.gms.internal.measurement;

public final class zzpw implements zzpt {

    /* renamed from: a  reason: collision with root package name */
    public static final zzir f25801a;

    /* renamed from: b  reason: collision with root package name */
    public static final zzir f25802b;

    static {
        zziz e2 = new zziz(zzio.a("com.google.android.gms.measurement")).f().e();
        e2.d("measurement.dma_consent.client", true);
        e2.d("measurement.dma_consent.client_bow_check2", true);
        e2.d("measurement.dma_consent.separate_service_calls_fix", true);
        e2.d("measurement.dma_consent.service", true);
        f25801a = e2.d("measurement.dma_consent.service_database_update_fix", true);
        e2.d("measurement.dma_consent.service_dcu_event", true);
        f25802b = e2.d("measurement.dma_consent.service_dcu_event2", true);
        e2.d("measurement.dma_consent.service_npa_remote_default", true);
        e2.d("measurement.dma_consent.service_split_batch_on_consent", true);
        e2.d("measurement.dma_consent.set_consent_inline_on_worker", true);
    }

    public final boolean a() {
        return ((Boolean) f25801a.f()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) f25802b.f()).booleanValue();
    }
}
