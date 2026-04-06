package com.google.firebase.perf.util;

public class Constants {

    public enum CounterNames {
        TRACE_EVENT_RATE_LIMITED("_fstec"),
        NETWORK_TRACE_EVENT_RATE_LIMITED("_fsntc"),
        TRACE_STARTED_NOT_STOPPED("_tsns"),
        FRAMES_TOTAL("_fr_tot"),
        FRAMES_SLOW("_fr_slo"),
        FRAMES_FROZEN("_fr_fzn");
        

        /* renamed from: z  reason: collision with root package name */
        public String f31112z;

        /* access modifiers changed from: public */
        CounterNames(String str) {
            this.f31112z = str;
        }

        public String toString() {
            return this.f31112z;
        }
    }

    public enum TraceNames {
        APP_START_TRACE_NAME("_as"),
        ON_CREATE_TRACE_NAME("_astui"),
        ON_START_TRACE_NAME("_astfd"),
        ON_RESUME_TRACE_NAME("_asti"),
        FOREGROUND_TRACE_NAME("_fs"),
        BACKGROUND_TRACE_NAME("_bs");
        

        /* renamed from: z  reason: collision with root package name */
        public String f31115z;

        /* access modifiers changed from: public */
        TraceNames(String str) {
            this.f31115z = str;
        }

        public String toString() {
            return this.f31115z;
        }
    }
}
