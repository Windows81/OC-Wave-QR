package com.google.zxing.multi.qrcode.detector;

import com.google.zxing.qrcode.detector.FinderPattern;
import com.google.zxing.qrcode.detector.FinderPatternFinder;
import com.google.zxing.qrcode.detector.FinderPatternInfo;
import java.io.Serializable;
import java.util.Comparator;

public final class MultiFinderPatternFinder extends FinderPatternFinder {

    /* renamed from: b  reason: collision with root package name */
    public static final FinderPatternInfo[] f32697b = new FinderPatternInfo[0];

    /* renamed from: c  reason: collision with root package name */
    public static final FinderPattern[] f32698c = new FinderPattern[0];

    /* renamed from: d  reason: collision with root package name */
    public static final FinderPattern[][] f32699d = new FinderPattern[0][];

    public static final class ModuleSizeComparator implements Serializable, Comparator<FinderPattern> {
        /* renamed from: a */
        public int compare(FinderPattern finderPattern, FinderPattern finderPattern2) {
            double a2 = (double) (finderPattern2.a() - finderPattern.a());
            if (a2 < 0.0d) {
                return -1;
            }
            return a2 > 0.0d ? 1 : 0;
        }
    }
}
