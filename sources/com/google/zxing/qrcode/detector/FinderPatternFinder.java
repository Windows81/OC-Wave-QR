package com.google.zxing.qrcode.detector;

import java.io.Serializable;
import java.util.Comparator;

public class FinderPatternFinder {

    /* renamed from: a  reason: collision with root package name */
    public static final EstimatedModuleComparator f32852a = new EstimatedModuleComparator();

    public static final class EstimatedModuleComparator implements Serializable, Comparator<FinderPattern> {
        public EstimatedModuleComparator() {
        }

        /* renamed from: a */
        public int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
            return Float.compare(finderPattern.a(), finderPattern2.a());
        }
    }
}
