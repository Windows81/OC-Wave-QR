package com.google.firebase.perf.metrics;

import android.util.SparseIntArray;

public class FrameMetricsCalculator {

    public static class PerfFrameMetrics {

        /* renamed from: a  reason: collision with root package name */
        public int f30983a;

        /* renamed from: b  reason: collision with root package name */
        public int f30984b;

        /* renamed from: c  reason: collision with root package name */
        public int f30985c;

        public PerfFrameMetrics(int i2, int i3, int i4) {
            this.f30983a = i2;
            this.f30984b = i3;
            this.f30985c = i4;
        }

        public PerfFrameMetrics a(PerfFrameMetrics perfFrameMetrics) {
            return new PerfFrameMetrics(this.f30983a - perfFrameMetrics.d(), this.f30984b - perfFrameMetrics.c(), this.f30985c - perfFrameMetrics.b());
        }

        public int b() {
            return this.f30985c;
        }

        public int c() {
            return this.f30984b;
        }

        public int d() {
            return this.f30983a;
        }
    }

    public static PerfFrameMetrics a(SparseIntArray[] sparseIntArrayArr) {
        int i2;
        int i3;
        SparseIntArray sparseIntArray;
        int i4 = 0;
        if (sparseIntArrayArr == null || (sparseIntArray = sparseIntArrayArr[0]) == null) {
            i3 = 0;
            i2 = 0;
        } else {
            int i5 = 0;
            i3 = 0;
            i2 = 0;
            while (i4 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i4);
                int valueAt = sparseIntArray.valueAt(i4);
                i5 += valueAt;
                if (keyAt > 700) {
                    i2 += valueAt;
                }
                if (keyAt > 16) {
                    i3 += valueAt;
                }
                i4++;
            }
            i4 = i5;
        }
        return new PerfFrameMetrics(i4, i3, i2);
    }
}
